// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: niffler-currency.proto

package guru.qa.grpc.niffler.grpc;

/**
 * Protobuf type {@code guru.qa.grpc.niffler.CalculateResponse}
 */
public final class CalculateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:guru.qa.grpc.niffler.CalculateResponse)
    CalculateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculateResponse.newBuilder() to construct.
  private CalculateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalculateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalculateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return guru.qa.grpc.niffler.grpc.NifflerCurrencyProto.internal_static_guru_qa_grpc_niffler_CalculateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return guru.qa.grpc.niffler.grpc.NifflerCurrencyProto.internal_static_guru_qa_grpc_niffler_CalculateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            guru.qa.grpc.niffler.grpc.CalculateResponse.class, guru.qa.grpc.niffler.grpc.CalculateResponse.Builder.class);
  }

  public static final int CALCULATEDAMOUNT_FIELD_NUMBER = 1;
  private double calculatedAmount_ = 0D;
  /**
   * <code>double calculatedAmount = 1;</code>
   * @return The calculatedAmount.
   */
  @java.lang.Override
  public double getCalculatedAmount() {
    return calculatedAmount_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (java.lang.Double.doubleToRawLongBits(calculatedAmount_) != 0) {
      output.writeDouble(1, calculatedAmount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(calculatedAmount_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, calculatedAmount_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof guru.qa.grpc.niffler.grpc.CalculateResponse)) {
      return super.equals(obj);
    }
    guru.qa.grpc.niffler.grpc.CalculateResponse other = (guru.qa.grpc.niffler.grpc.CalculateResponse) obj;

    if (java.lang.Double.doubleToLongBits(getCalculatedAmount())
        != java.lang.Double.doubleToLongBits(
            other.getCalculatedAmount())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CALCULATEDAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getCalculatedAmount()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static guru.qa.grpc.niffler.grpc.CalculateResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(guru.qa.grpc.niffler.grpc.CalculateResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code guru.qa.grpc.niffler.CalculateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:guru.qa.grpc.niffler.CalculateResponse)
      guru.qa.grpc.niffler.grpc.CalculateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return guru.qa.grpc.niffler.grpc.NifflerCurrencyProto.internal_static_guru_qa_grpc_niffler_CalculateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return guru.qa.grpc.niffler.grpc.NifflerCurrencyProto.internal_static_guru_qa_grpc_niffler_CalculateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              guru.qa.grpc.niffler.grpc.CalculateResponse.class, guru.qa.grpc.niffler.grpc.CalculateResponse.Builder.class);
    }

    // Construct using guru.qa.grpc.niffler.grpc.CalculateResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      calculatedAmount_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return guru.qa.grpc.niffler.grpc.NifflerCurrencyProto.internal_static_guru_qa_grpc_niffler_CalculateResponse_descriptor;
    }

    @java.lang.Override
    public guru.qa.grpc.niffler.grpc.CalculateResponse getDefaultInstanceForType() {
      return guru.qa.grpc.niffler.grpc.CalculateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public guru.qa.grpc.niffler.grpc.CalculateResponse build() {
      guru.qa.grpc.niffler.grpc.CalculateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public guru.qa.grpc.niffler.grpc.CalculateResponse buildPartial() {
      guru.qa.grpc.niffler.grpc.CalculateResponse result = new guru.qa.grpc.niffler.grpc.CalculateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(guru.qa.grpc.niffler.grpc.CalculateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.calculatedAmount_ = calculatedAmount_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof guru.qa.grpc.niffler.grpc.CalculateResponse) {
        return mergeFrom((guru.qa.grpc.niffler.grpc.CalculateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(guru.qa.grpc.niffler.grpc.CalculateResponse other) {
      if (other == guru.qa.grpc.niffler.grpc.CalculateResponse.getDefaultInstance()) return this;
      if (other.getCalculatedAmount() != 0D) {
        setCalculatedAmount(other.getCalculatedAmount());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {
              calculatedAmount_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private double calculatedAmount_ ;
    /**
     * <code>double calculatedAmount = 1;</code>
     * @return The calculatedAmount.
     */
    @java.lang.Override
    public double getCalculatedAmount() {
      return calculatedAmount_;
    }
    /**
     * <code>double calculatedAmount = 1;</code>
     * @param value The calculatedAmount to set.
     * @return This builder for chaining.
     */
    public Builder setCalculatedAmount(double value) {

      calculatedAmount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>double calculatedAmount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCalculatedAmount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      calculatedAmount_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:guru.qa.grpc.niffler.CalculateResponse)
  }

  // @@protoc_insertion_point(class_scope:guru.qa.grpc.niffler.CalculateResponse)
  private static final guru.qa.grpc.niffler.grpc.CalculateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new guru.qa.grpc.niffler.grpc.CalculateResponse();
  }

  public static guru.qa.grpc.niffler.grpc.CalculateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculateResponse>
      PARSER = new com.google.protobuf.AbstractParser<CalculateResponse>() {
    @java.lang.Override
    public CalculateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CalculateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public guru.qa.grpc.niffler.grpc.CalculateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

