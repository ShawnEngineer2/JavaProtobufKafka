// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orderstatus.proto

package poc.protobuf.protos;

/**
 * Protobuf type {@code poc.protobuf.OrderStatusUpdate}
 */
public final class OrderStatusUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:poc.protobuf.OrderStatusUpdate)
    OrderStatusUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderStatusUpdate.newBuilder() to construct.
  private OrderStatusUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderStatusUpdate() {
    orderStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderStatusUpdate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return poc.protobuf.protos.OrderStatusUpdateProtos.internal_static_poc_protobuf_OrderStatusUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return poc.protobuf.protos.OrderStatusUpdateProtos.internal_static_poc_protobuf_OrderStatusUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            poc.protobuf.protos.OrderStatusUpdate.class, poc.protobuf.protos.OrderStatusUpdate.Builder.class);
  }

  /**
   * Protobuf enum {@code poc.protobuf.OrderStatusUpdate.OrderStatus}
   */
  public enum OrderStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ORDER_RECEIVED = 0;</code>
     */
    ORDER_RECEIVED(0),
    /**
     * <code>PROCESSING = 1;</code>
     */
    PROCESSING(1),
    /**
     * <code>SHIPPED = 2;</code>
     */
    SHIPPED(2),
    /**
     * <code>DELIVERED = 3;</code>
     */
    DELIVERED(3),
    /**
     * <code>READY_FOR_PICKUP = 4;</code>
     */
    READY_FOR_PICKUP(4),
    /**
     * <code>CUST_PICKUP_COMPLETE = 5;</code>
     */
    CUST_PICKUP_COMPLETE(5),
    ;

    /**
     * <code>ORDER_RECEIVED = 0;</code>
     */
    public static final int ORDER_RECEIVED_VALUE = 0;
    /**
     * <code>PROCESSING = 1;</code>
     */
    public static final int PROCESSING_VALUE = 1;
    /**
     * <code>SHIPPED = 2;</code>
     */
    public static final int SHIPPED_VALUE = 2;
    /**
     * <code>DELIVERED = 3;</code>
     */
    public static final int DELIVERED_VALUE = 3;
    /**
     * <code>READY_FOR_PICKUP = 4;</code>
     */
    public static final int READY_FOR_PICKUP_VALUE = 4;
    /**
     * <code>CUST_PICKUP_COMPLETE = 5;</code>
     */
    public static final int CUST_PICKUP_COMPLETE_VALUE = 5;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OrderStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OrderStatus forNumber(int value) {
      switch (value) {
        case 0: return ORDER_RECEIVED;
        case 1: return PROCESSING;
        case 2: return SHIPPED;
        case 3: return DELIVERED;
        case 4: return READY_FOR_PICKUP;
        case 5: return CUST_PICKUP_COMPLETE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OrderStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OrderStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OrderStatus>() {
            public OrderStatus findValueByNumber(int number) {
              return OrderStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return poc.protobuf.protos.OrderStatusUpdate.getDescriptor().getEnumTypes().get(0);
    }

    private static final OrderStatus[] VALUES = values();

    public static OrderStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OrderStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:poc.protobuf.OrderStatusUpdate.OrderStatus)
  }

  private int bitField0_;
  public static final int ORDERID_FIELD_NUMBER = 1;
  private int orderId_;
  /**
   * <code>optional int32 orderId = 1;</code>
   * @return Whether the orderId field is set.
   */
  @java.lang.Override
  public boolean hasOrderId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 orderId = 1;</code>
   * @return The orderId.
   */
  @java.lang.Override
  public int getOrderId() {
    return orderId_;
  }

  public static final int ORDERSTATUS_FIELD_NUMBER = 2;
  private int orderStatus_;
  /**
   * <code>optional .poc.protobuf.OrderStatusUpdate.OrderStatus orderStatus = 2;</code>
   * @return Whether the orderStatus field is set.
   */
  @java.lang.Override public boolean hasOrderStatus() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .poc.protobuf.OrderStatusUpdate.OrderStatus orderStatus = 2;</code>
   * @return The orderStatus.
   */
  @java.lang.Override public poc.protobuf.protos.OrderStatusUpdate.OrderStatus getOrderStatus() {
    @SuppressWarnings("deprecation")
    poc.protobuf.protos.OrderStatusUpdate.OrderStatus result = poc.protobuf.protos.OrderStatusUpdate.OrderStatus.valueOf(orderStatus_);
    return result == null ? poc.protobuf.protos.OrderStatusUpdate.OrderStatus.ORDER_RECEIVED : result;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, orderId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, orderStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, orderId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, orderStatus_);
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
    if (!(obj instanceof poc.protobuf.protos.OrderStatusUpdate)) {
      return super.equals(obj);
    }
    poc.protobuf.protos.OrderStatusUpdate other = (poc.protobuf.protos.OrderStatusUpdate) obj;

    if (hasOrderId() != other.hasOrderId()) return false;
    if (hasOrderId()) {
      if (getOrderId()
          != other.getOrderId()) return false;
    }
    if (hasOrderStatus() != other.hasOrderStatus()) return false;
    if (hasOrderStatus()) {
      if (orderStatus_ != other.orderStatus_) return false;
    }
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
    if (hasOrderId()) {
      hash = (37 * hash) + ORDERID_FIELD_NUMBER;
      hash = (53 * hash) + getOrderId();
    }
    if (hasOrderStatus()) {
      hash = (37 * hash) + ORDERSTATUS_FIELD_NUMBER;
      hash = (53 * hash) + orderStatus_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static poc.protobuf.protos.OrderStatusUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static poc.protobuf.protos.OrderStatusUpdate parseFrom(
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
  public static Builder newBuilder(poc.protobuf.protos.OrderStatusUpdate prototype) {
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
   * Protobuf type {@code poc.protobuf.OrderStatusUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:poc.protobuf.OrderStatusUpdate)
      poc.protobuf.protos.OrderStatusUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return poc.protobuf.protos.OrderStatusUpdateProtos.internal_static_poc_protobuf_OrderStatusUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return poc.protobuf.protos.OrderStatusUpdateProtos.internal_static_poc_protobuf_OrderStatusUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              poc.protobuf.protos.OrderStatusUpdate.class, poc.protobuf.protos.OrderStatusUpdate.Builder.class);
    }

    // Construct using poc.protobuf.protos.OrderStatusUpdate.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      orderId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      orderStatus_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return poc.protobuf.protos.OrderStatusUpdateProtos.internal_static_poc_protobuf_OrderStatusUpdate_descriptor;
    }

    @java.lang.Override
    public poc.protobuf.protos.OrderStatusUpdate getDefaultInstanceForType() {
      return poc.protobuf.protos.OrderStatusUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public poc.protobuf.protos.OrderStatusUpdate build() {
      poc.protobuf.protos.OrderStatusUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public poc.protobuf.protos.OrderStatusUpdate buildPartial() {
      poc.protobuf.protos.OrderStatusUpdate result = new poc.protobuf.protos.OrderStatusUpdate(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orderId_ = orderId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.orderStatus_ = orderStatus_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
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
      if (other instanceof poc.protobuf.protos.OrderStatusUpdate) {
        return mergeFrom((poc.protobuf.protos.OrderStatusUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(poc.protobuf.protos.OrderStatusUpdate other) {
      if (other == poc.protobuf.protos.OrderStatusUpdate.getDefaultInstance()) return this;
      if (other.hasOrderId()) {
        setOrderId(other.getOrderId());
      }
      if (other.hasOrderStatus()) {
        setOrderStatus(other.getOrderStatus());
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
            case 8: {
              orderId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              int tmpRaw = input.readEnum();
              poc.protobuf.protos.OrderStatusUpdate.OrderStatus tmpValue =
                  poc.protobuf.protos.OrderStatusUpdate.OrderStatus.forNumber(tmpRaw);
              if (tmpValue == null) {
                mergeUnknownVarintField(2, tmpRaw);
              } else {
                orderStatus_ = tmpRaw;
                bitField0_ |= 0x00000002;
              }
              break;
            } // case 16
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

    private int orderId_ ;
    /**
     * <code>optional int32 orderId = 1;</code>
     * @return Whether the orderId field is set.
     */
    @java.lang.Override
    public boolean hasOrderId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 orderId = 1;</code>
     * @return The orderId.
     */
    @java.lang.Override
    public int getOrderId() {
      return orderId_;
    }
    /**
     * <code>optional int32 orderId = 1;</code>
     * @param value The orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderId(int value) {
      bitField0_ |= 0x00000001;
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 orderId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      orderId_ = 0;
      onChanged();
      return this;
    }

    private int orderStatus_ = 0;
    /**
     * <code>optional .poc.protobuf.OrderStatusUpdate.OrderStatus orderStatus = 2;</code>
     * @return Whether the orderStatus field is set.
     */
    @java.lang.Override public boolean hasOrderStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .poc.protobuf.OrderStatusUpdate.OrderStatus orderStatus = 2;</code>
     * @return The orderStatus.
     */
    @java.lang.Override
    public poc.protobuf.protos.OrderStatusUpdate.OrderStatus getOrderStatus() {
      @SuppressWarnings("deprecation")
      poc.protobuf.protos.OrderStatusUpdate.OrderStatus result = poc.protobuf.protos.OrderStatusUpdate.OrderStatus.valueOf(orderStatus_);
      return result == null ? poc.protobuf.protos.OrderStatusUpdate.OrderStatus.ORDER_RECEIVED : result;
    }
    /**
     * <code>optional .poc.protobuf.OrderStatusUpdate.OrderStatus orderStatus = 2;</code>
     * @param value The orderStatus to set.
     * @return This builder for chaining.
     */
    public Builder setOrderStatus(poc.protobuf.protos.OrderStatusUpdate.OrderStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      orderStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .poc.protobuf.OrderStatusUpdate.OrderStatus orderStatus = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      orderStatus_ = 0;
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


    // @@protoc_insertion_point(builder_scope:poc.protobuf.OrderStatusUpdate)
  }

  // @@protoc_insertion_point(class_scope:poc.protobuf.OrderStatusUpdate)
  private static final poc.protobuf.protos.OrderStatusUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new poc.protobuf.protos.OrderStatusUpdate();
  }

  public static poc.protobuf.protos.OrderStatusUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<OrderStatusUpdate>
      PARSER = new com.google.protobuf.AbstractParser<OrderStatusUpdate>() {
    @java.lang.Override
    public OrderStatusUpdate parsePartialFrom(
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

  public static com.google.protobuf.Parser<OrderStatusUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderStatusUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public poc.protobuf.protos.OrderStatusUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
