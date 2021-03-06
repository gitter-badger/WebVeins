package com.xiongbeer.webveins.service;
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProcessData.proto

public final class ProcessDataProto {
  private ProcessDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ProcessDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ProcessData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string urlFilePath = 1;</code>
     */
    boolean hasUrlFilePath();
    /**
     * <code>optional string urlFilePath = 1;</code>
     */
    java.lang.String getUrlFilePath();
    /**
     * <code>optional string urlFilePath = 1;</code>
     */
    com.google.protobuf.ByteString
        getUrlFilePathBytes();

    /**
     * <code>optional string urlFileName = 2;</code>
     */
    boolean hasUrlFileName();
    /**
     * <code>optional string urlFileName = 2;</code>
     */
    java.lang.String getUrlFileName();
    /**
     * <code>optional string urlFileName = 2;</code>
     */
    com.google.protobuf.ByteString
        getUrlFileNameBytes();

    /**
     * <code>optional .ProcessData.Status status = 3 [default = NULL];</code>
     */
    boolean hasStatus();
    /**
     * <code>optional .ProcessData.Status status = 3 [default = NULL];</code>
     */
    ProcessDataProto.ProcessData.Status getStatus();

    /**
     * <code>optional string command = 4;</code>
     */
    boolean hasCommand();
    /**
     * <code>optional string command = 4;</code>
     */
    java.lang.String getCommand();
    /**
     * <code>optional string command = 4;</code>
     */
    com.google.protobuf.ByteString
        getCommandBytes();

    /**
     * <code>optional string commandReasult = 5;</code>
     */
    boolean hasCommandReasult();
    /**
     * <code>optional string commandReasult = 5;</code>
     */
    java.lang.String getCommandReasult();
    /**
     * <code>optional string commandReasult = 5;</code>
     */
    com.google.protobuf.ByteString
        getCommandReasultBytes();
  }
  /**
   * Protobuf type {@code ProcessData}
   */
  public static final class ProcessData extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ProcessData)
      ProcessDataOrBuilder {
    // Use ProcessData.newBuilder() to construct.
    private ProcessData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ProcessData(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ProcessData defaultInstance;
    public static ProcessData getDefaultInstance() {
      return defaultInstance;
    }

    public ProcessData getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ProcessData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              urlFilePath_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              urlFileName_ = bs;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              ProcessDataProto.ProcessData.Status value = ProcessDataProto.ProcessData.Status.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                status_ = value;
              }
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              command_ = bs;
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              commandReasult_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProcessDataProto.internal_static_ProcessData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProcessDataProto.internal_static_ProcessData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProcessDataProto.ProcessData.class, ProcessDataProto.ProcessData.Builder.class);
    }

    public static com.google.protobuf.Parser<ProcessData> PARSER =
        new com.google.protobuf.AbstractParser<ProcessData>() {
      public ProcessData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProcessData(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ProcessData> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code ProcessData.Status}
     */
    public enum Status
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NULL = 0;</code>
       */
      NULL(0, 0),
      /**
       * <code>WAITING = 1;</code>
       */
      WAITING(1, 1),
      /**
       * <code>RUNNING = 2;</code>
       */
      RUNNING(2, 2),
      /**
       * <code>FINNISHED = 3;</code>
       */
      FINNISHED(3, 3),
      /**
       * <code>READY = 4;</code>
       */
      READY(4, 4),
      ;

      /**
       * <code>NULL = 0;</code>
       */
      public static final int NULL_VALUE = 0;
      /**
       * <code>WAITING = 1;</code>
       */
      public static final int WAITING_VALUE = 1;
      /**
       * <code>RUNNING = 2;</code>
       */
      public static final int RUNNING_VALUE = 2;
      /**
       * <code>FINNISHED = 3;</code>
       */
      public static final int FINNISHED_VALUE = 3;
      /**
       * <code>READY = 4;</code>
       */
      public static final int READY_VALUE = 4;


      public final int getNumber() { return value; }

      public static Status valueOf(int value) {
        switch (value) {
          case 0: return NULL;
          case 1: return WAITING;
          case 2: return RUNNING;
          case 3: return FINNISHED;
          case 4: return READY;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Status>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Status>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Status>() {
              public Status findValueByNumber(int number) {
                return Status.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return ProcessDataProto.ProcessData.getDescriptor().getEnumTypes().get(0);
      }

      private static final Status[] VALUES = values();

      public static Status valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Status(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ProcessData.Status)
    }

    private int bitField0_;
    public static final int URLFILEPATH_FIELD_NUMBER = 1;
    private java.lang.Object urlFilePath_;
    /**
     * <code>optional string urlFilePath = 1;</code>
     */
    public boolean hasUrlFilePath() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string urlFilePath = 1;</code>
     */
    public java.lang.String getUrlFilePath() {
      java.lang.Object ref = urlFilePath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          urlFilePath_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string urlFilePath = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUrlFilePathBytes() {
      java.lang.Object ref = urlFilePath_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        urlFilePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int URLFILENAME_FIELD_NUMBER = 2;
    private java.lang.Object urlFileName_;
    /**
     * <code>optional string urlFileName = 2;</code>
     */
    public boolean hasUrlFileName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string urlFileName = 2;</code>
     */
    public java.lang.String getUrlFileName() {
      java.lang.Object ref = urlFileName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          urlFileName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string urlFileName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUrlFileNameBytes() {
      java.lang.Object ref = urlFileName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        urlFileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private ProcessDataProto.ProcessData.Status status_;
    /**
     * <code>optional .ProcessData.Status status = 3 [default = NULL];</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .ProcessData.Status status = 3 [default = NULL];</code>
     */
    public ProcessDataProto.ProcessData.Status getStatus() {
      return status_;
    }

    public static final int COMMAND_FIELD_NUMBER = 4;
    private java.lang.Object command_;
    /**
     * <code>optional string command = 4;</code>
     */
    public boolean hasCommand() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string command = 4;</code>
     */
    public java.lang.String getCommand() {
      java.lang.Object ref = command_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          command_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string command = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCommandBytes() {
      java.lang.Object ref = command_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        command_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COMMANDREASULT_FIELD_NUMBER = 5;
    private java.lang.Object commandReasult_;
    /**
     * <code>optional string commandReasult = 5;</code>
     */
    public boolean hasCommandReasult() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string commandReasult = 5;</code>
     */
    public java.lang.String getCommandReasult() {
      java.lang.Object ref = commandReasult_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          commandReasult_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string commandReasult = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCommandReasultBytes() {
      java.lang.Object ref = commandReasult_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        commandReasult_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      urlFilePath_ = "";
      urlFileName_ = "";
      status_ = ProcessDataProto.ProcessData.Status.NULL;
      command_ = "";
      commandReasult_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getUrlFilePathBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getUrlFileNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, status_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getCommandBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getCommandReasultBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getUrlFilePathBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getUrlFileNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, status_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getCommandBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getCommandReasultBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ProcessDataProto.ProcessData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProcessDataProto.ProcessData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProcessDataProto.ProcessData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProcessDataProto.ProcessData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProcessDataProto.ProcessData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ProcessDataProto.ProcessData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ProcessDataProto.ProcessData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ProcessDataProto.ProcessData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ProcessDataProto.ProcessData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ProcessDataProto.ProcessData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ProcessDataProto.ProcessData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ProcessData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ProcessData)
        ProcessDataProto.ProcessDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ProcessDataProto.internal_static_ProcessData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ProcessDataProto.internal_static_ProcessData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ProcessDataProto.ProcessData.class, ProcessDataProto.ProcessData.Builder.class);
      }

      // Construct using ProcessDataProto.ProcessData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        urlFilePath_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        urlFileName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        status_ = ProcessDataProto.ProcessData.Status.NULL;
        bitField0_ = (bitField0_ & ~0x00000004);
        command_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        commandReasult_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ProcessDataProto.internal_static_ProcessData_descriptor;
      }

      public ProcessDataProto.ProcessData getDefaultInstanceForType() {
        return ProcessDataProto.ProcessData.getDefaultInstance();
      }

      public ProcessDataProto.ProcessData build() {
        ProcessDataProto.ProcessData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ProcessDataProto.ProcessData buildPartial() {
        ProcessDataProto.ProcessData result = new ProcessDataProto.ProcessData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.urlFilePath_ = urlFilePath_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.urlFileName_ = urlFileName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.command_ = command_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.commandReasult_ = commandReasult_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ProcessDataProto.ProcessData) {
          return mergeFrom((ProcessDataProto.ProcessData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ProcessDataProto.ProcessData other) {
        if (other == ProcessDataProto.ProcessData.getDefaultInstance()) return this;
        if (other.hasUrlFilePath()) {
          bitField0_ |= 0x00000001;
          urlFilePath_ = other.urlFilePath_;
          onChanged();
        }
        if (other.hasUrlFileName()) {
          bitField0_ |= 0x00000002;
          urlFileName_ = other.urlFileName_;
          onChanged();
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasCommand()) {
          bitField0_ |= 0x00000008;
          command_ = other.command_;
          onChanged();
        }
        if (other.hasCommandReasult()) {
          bitField0_ |= 0x00000010;
          commandReasult_ = other.commandReasult_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ProcessDataProto.ProcessData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ProcessDataProto.ProcessData) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object urlFilePath_ = "";
      /**
       * <code>optional string urlFilePath = 1;</code>
       */
      public boolean hasUrlFilePath() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string urlFilePath = 1;</code>
       */
      public java.lang.String getUrlFilePath() {
        java.lang.Object ref = urlFilePath_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            urlFilePath_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string urlFilePath = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUrlFilePathBytes() {
        java.lang.Object ref = urlFilePath_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          urlFilePath_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string urlFilePath = 1;</code>
       */
      public Builder setUrlFilePath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        urlFilePath_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string urlFilePath = 1;</code>
       */
      public Builder clearUrlFilePath() {
        bitField0_ = (bitField0_ & ~0x00000001);
        urlFilePath_ = getDefaultInstance().getUrlFilePath();
        onChanged();
        return this;
      }
      /**
       * <code>optional string urlFilePath = 1;</code>
       */
      public Builder setUrlFilePathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        urlFilePath_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object urlFileName_ = "";
      /**
       * <code>optional string urlFileName = 2;</code>
       */
      public boolean hasUrlFileName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string urlFileName = 2;</code>
       */
      public java.lang.String getUrlFileName() {
        java.lang.Object ref = urlFileName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            urlFileName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string urlFileName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUrlFileNameBytes() {
        java.lang.Object ref = urlFileName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          urlFileName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string urlFileName = 2;</code>
       */
      public Builder setUrlFileName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        urlFileName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string urlFileName = 2;</code>
       */
      public Builder clearUrlFileName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        urlFileName_ = getDefaultInstance().getUrlFileName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string urlFileName = 2;</code>
       */
      public Builder setUrlFileNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        urlFileName_ = value;
        onChanged();
        return this;
      }

      private ProcessDataProto.ProcessData.Status status_ = ProcessDataProto.ProcessData.Status.NULL;
      /**
       * <code>optional .ProcessData.Status status = 3 [default = NULL];</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .ProcessData.Status status = 3 [default = NULL];</code>
       */
      public ProcessDataProto.ProcessData.Status getStatus() {
        return status_;
      }
      /**
       * <code>optional .ProcessData.Status status = 3 [default = NULL];</code>
       */
      public Builder setStatus(ProcessDataProto.ProcessData.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .ProcessData.Status status = 3 [default = NULL];</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000004);
        status_ = ProcessDataProto.ProcessData.Status.NULL;
        onChanged();
        return this;
      }

      private java.lang.Object command_ = "";
      /**
       * <code>optional string command = 4;</code>
       */
      public boolean hasCommand() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string command = 4;</code>
       */
      public java.lang.String getCommand() {
        java.lang.Object ref = command_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            command_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string command = 4;</code>
       */
      public com.google.protobuf.ByteString
          getCommandBytes() {
        java.lang.Object ref = command_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          command_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string command = 4;</code>
       */
      public Builder setCommand(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        command_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string command = 4;</code>
       */
      public Builder clearCommand() {
        bitField0_ = (bitField0_ & ~0x00000008);
        command_ = getDefaultInstance().getCommand();
        onChanged();
        return this;
      }
      /**
       * <code>optional string command = 4;</code>
       */
      public Builder setCommandBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        command_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object commandReasult_ = "";
      /**
       * <code>optional string commandReasult = 5;</code>
       */
      public boolean hasCommandReasult() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string commandReasult = 5;</code>
       */
      public java.lang.String getCommandReasult() {
        java.lang.Object ref = commandReasult_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            commandReasult_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string commandReasult = 5;</code>
       */
      public com.google.protobuf.ByteString
          getCommandReasultBytes() {
        java.lang.Object ref = commandReasult_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          commandReasult_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string commandReasult = 5;</code>
       */
      public Builder setCommandReasult(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        commandReasult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string commandReasult = 5;</code>
       */
      public Builder clearCommandReasult() {
        bitField0_ = (bitField0_ & ~0x00000010);
        commandReasult_ = getDefaultInstance().getCommandReasult();
        onChanged();
        return this;
      }
      /**
       * <code>optional string commandReasult = 5;</code>
       */
      public Builder setCommandReasultBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        commandReasult_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ProcessData)
    }

    static {
      defaultInstance = new ProcessData(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ProcessData)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProcessData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ProcessData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ProcessData.proto\"\323\001\n\013ProcessData\022\023\n\013u" +
      "rlFilePath\030\001 \001(\t\022\023\n\013urlFileName\030\002 \001(\t\022)\n" +
      "\006status\030\003 \001(\0162\023.ProcessData.Status:\004NULL" +
      "\022\017\n\007command\030\004 \001(\t\022\026\n\016commandReasult\030\005 \001(" +
      "\t\"F\n\006Status\022\010\n\004NULL\020\000\022\013\n\007WAITING\020\001\022\013\n\007RU" +
      "NNING\020\002\022\r\n\tFINNISHED\020\003\022\t\n\005READY\020\004B\022B\020Pro" +
      "cessDataProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ProcessData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProcessData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ProcessData_descriptor,
        new java.lang.String[] { "UrlFilePath", "UrlFileName", "Status", "Command", "CommandReasult", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
