package com.xiongbeer.webveins.service.local;

import com.xiongbeer.webveins.service.ProcessDataProto;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by shaoxiong on 17-4-23.
 */
public class Client {
    private static Channel channel;
    private Logger logger = LoggerFactory.getLogger(Client.class);
    private Action action;

    public static void setChannel(Channel channel){
        Client.channel = channel;
    }
    public static Channel getChannel(){return channel;}

    public void sentData(ProcessDataProto.ProcessData data){
        channel.pipeline().writeAndFlush(data);
    }
    public void connect(String host, int port) {
        if(action == null){
            logger.error("Connect failed, action is null");
            return;
        }

        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group).channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChildChannelHandler());
            ChannelFuture f = b.connect(host, port).sync();
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully();
        }
    }

    private class ChildChannelHandler extends ChannelInitializer<SocketChannel>{

        @Override
        protected void initChannel(SocketChannel socketChannel) throws Exception {
            /* 处理半包 */
            socketChannel.pipeline().addLast(
                    new ProtobufVarint32FrameDecoder());

            /* Protobuf 解码器 */
            socketChannel.pipeline().addLast(new ProtobufDecoder(
                    ProcessDataProto
                            .ProcessData
                            .getDefaultInstance()));

            socketChannel.pipeline().addLast(
                    new ProtobufVarint32LengthFieldPrepender());

            socketChannel.pipeline().addLast(new ProtobufEncoder());

            socketChannel.pipeline().addLast(new ClientHandler(action));
        }
    }

    public void setAction(Action action){
        this.action = action;
    }

    public void disconnect(){
            channel.close();
    }
}
