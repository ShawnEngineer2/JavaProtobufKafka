// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ordercreated.proto

package poc.protobuf.protos;

public final class OrderCreatedProtos {
  private OrderCreatedProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_poc_protobuf_OrderCreated_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_poc_protobuf_OrderCreated_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022ordercreated.proto\022\014poc.protobuf\"\304\001\n\014O" +
      "rderCreated\022\017\n\007orderId\030\001 \001(\005\0227\n\torderTyp" +
      "e\030\002 \001(\0162$.poc.protobuf.OrderCreated.Orde" +
      "rType\022\022\n\ncustomerId\030\003 \001(\005\022\021\n\tproductId\030\004" +
      " \001(\005\022\020\n\010quantity\030\005 \001(\005\"1\n\tOrderType\022\n\n\006D" +
      "IRECT\020\000\022\n\n\006PICKUP\020\001\022\014\n\010DELIVERY\020\002B+\n\023poc" +
      ".protobuf.protosB\022OrderCreatedProtosP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_poc_protobuf_OrderCreated_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_poc_protobuf_OrderCreated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_poc_protobuf_OrderCreated_descriptor,
        new java.lang.String[] { "OrderId", "OrderType", "CustomerId", "ProductId", "Quantity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}