// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: heartbeat.proto

package proto;

public final class HeartbeatPB {
  private HeartbeatPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017heartbeat.proto\022\005proto\"4\n\013PingRequest\022" +
      "\022\n\nendpointId\030\001 \001(\t\022\021\n\tsignature\030\002 \001(\t\"!" +
      "\n\014PingResponse\022\021\n\tsignature\030\001 \001(\t2\177\n\rHea" +
      "lthChecker\0225\n\004Ping\022\022.proto.PingRequest\032\023" +
      ".proto.PingResponse\"\000(\0010\001\0227\n\nSimplePing\022" +
      "\022.proto.PingRequest\032\023.proto.PingResponse" +
      "\"\000B\026\n\005protoB\013HeartbeatPBP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_PingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_PingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PingRequest_descriptor,
        new java.lang.String[] { "EndpointId", "Signature", });
    internal_static_proto_PingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_PingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PingResponse_descriptor,
        new java.lang.String[] { "Signature", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
