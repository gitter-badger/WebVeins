package com.xiongbeer.webveins.zk.task;

import com.xiongbeer.webveins.utils.Tracker;
import com.xiongbeer.webveins.ZnodeInfo;

import org.apache.zookeeper.*;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by shaoxiong on 17-4-10.
 */
public class TaskWorker extends Task{

    //TODO 构建优先级队列时候可以用到
    private static List<String> waitingList = new LinkedList<String>();
    /* 任务黑名单 */
    private static List<String> blackList = new LinkedList<String>();
    public TaskWorker(ZooKeeper zk) {
        super(zk);
    }

    /**
     * 接管任务
     */
    public String takeTask(){
        Tracker tracker = new Tracker();
        String task = null;
        checkTasks();
        /* 抢夺未被领取的任务 */
        Iterator<Entry<String, Epoch>> iterator = super.tasksInfo.entrySet().iterator();
        while(iterator.hasNext()){
            @SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry)iterator.next();
            String key = (String) entry.getKey();
            Epoch value = (Epoch) entry.getValue();
            if(!blackList.contains(value) && value.getStatus().equals(WAITING)){
                if(setRunningTask(ZnodeInfo.TASKS_PATH + "/" + key,
                        value.getDataVersion())) {
                    task = key;
                    break;
                }
            }
        }

        /* 如果task不为null就说明拿到了任务 */
        return task;
    }

    /**
     * 执行失败，放弃任务
     *
     * @param taskPath
     *
     */
    public void discardTask(String taskPath){
        try {
            client.setData(taskPath, WAITING.getBytes(), -1);
        } catch (KeeperException.ConnectionLossException e) {
            discardTask(taskPath);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }

    /**
     * 清空任务黑名单
     */
    public void clearTaskBlackList(){
        blackList.clear();
    }

    /**
     * 从任务黑名单中移除某个任务
     */
    public void removeTaskBlakListElement(String taskName){
        blackList.remove(taskName);
    }

    /**
     * 完成任务
     *
     * @param taskPath
     */
    public void finishTask(String taskPath){
        try {
            client.setData(taskPath, FINISHED.getBytes(), -1);
        } catch (KeeperException.ConnectionLossException e) {
            discardTask(taskPath);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }


    /**
     * 尝试将一个task节点置为running状态
     * 若成功即拿到了该任务
     *
     * @param path
     * @param version
     * @return
     */
    private boolean setRunningTask(String path, int version){
        boolean result = false;
        try {
            client.setData(path, RUNNING.getBytes(), version);
            result = true;
        } catch (KeeperException.ConnectionLossException e) {
            setRunningTask(path, version);
        } catch (KeeperException.NoNodeException e){
            super.tasksInfo.remove(path);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
        return result;
    }
}
