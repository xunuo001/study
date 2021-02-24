package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: heartbeat.proto")
public final class HealthCheckerGrpc {

  private HealthCheckerGrpc() {}

  public static final String SERVICE_NAME = "proto.HealthChecker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.PingRequest,
      proto.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = proto.PingRequest.class,
      responseType = proto.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<proto.PingRequest,
      proto.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<proto.PingRequest, proto.PingResponse> getPingMethod;
    if ((getPingMethod = HealthCheckerGrpc.getPingMethod) == null) {
      synchronized (HealthCheckerGrpc.class) {
        if ((getPingMethod = HealthCheckerGrpc.getPingMethod) == null) {
          HealthCheckerGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<proto.PingRequest, proto.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HealthCheckerMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.PingRequest,
      proto.PingResponse> getSimplePingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimplePing",
      requestType = proto.PingRequest.class,
      responseType = proto.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.PingRequest,
      proto.PingResponse> getSimplePingMethod() {
    io.grpc.MethodDescriptor<proto.PingRequest, proto.PingResponse> getSimplePingMethod;
    if ((getSimplePingMethod = HealthCheckerGrpc.getSimplePingMethod) == null) {
      synchronized (HealthCheckerGrpc.class) {
        if ((getSimplePingMethod = HealthCheckerGrpc.getSimplePingMethod) == null) {
          HealthCheckerGrpc.getSimplePingMethod = getSimplePingMethod =
              io.grpc.MethodDescriptor.<proto.PingRequest, proto.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimplePing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HealthCheckerMethodDescriptorSupplier("SimplePing"))
              .build();
        }
      }
    }
    return getSimplePingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthCheckerStub newStub(io.grpc.Channel channel) {
    return new HealthCheckerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthCheckerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HealthCheckerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthCheckerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HealthCheckerFutureStub(channel);
  }

  /**
   */
  public static abstract class HealthCheckerImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<proto.PingRequest> ping(
        io.grpc.stub.StreamObserver<proto.PingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void simplePing(proto.PingRequest request,
        io.grpc.stub.StreamObserver<proto.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSimplePingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                proto.PingRequest,
                proto.PingResponse>(
                  this, METHODID_PING)))
          .addMethod(
            getSimplePingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.PingRequest,
                proto.PingResponse>(
                  this, METHODID_SIMPLE_PING)))
          .build();
    }
  }

  /**
   */
  public static final class HealthCheckerStub extends io.grpc.stub.AbstractStub<HealthCheckerStub> {
    private HealthCheckerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthCheckerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthCheckerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthCheckerStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.PingRequest> ping(
        io.grpc.stub.StreamObserver<proto.PingResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void simplePing(proto.PingRequest request,
        io.grpc.stub.StreamObserver<proto.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimplePingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HealthCheckerBlockingStub extends io.grpc.stub.AbstractStub<HealthCheckerBlockingStub> {
    private HealthCheckerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthCheckerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthCheckerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthCheckerBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.PingResponse simplePing(proto.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getSimplePingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HealthCheckerFutureStub extends io.grpc.stub.AbstractStub<HealthCheckerFutureStub> {
    private HealthCheckerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthCheckerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthCheckerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthCheckerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.PingResponse> simplePing(
        proto.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSimplePingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMPLE_PING = 0;
  private static final int METHODID_PING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HealthCheckerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HealthCheckerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIMPLE_PING:
          serviceImpl.simplePing((proto.PingRequest) request,
              (io.grpc.stub.StreamObserver<proto.PingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.ping(
              (io.grpc.stub.StreamObserver<proto.PingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HealthCheckerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HealthCheckerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.HeartbeatPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HealthChecker");
    }
  }

  private static final class HealthCheckerFileDescriptorSupplier
      extends HealthCheckerBaseDescriptorSupplier {
    HealthCheckerFileDescriptorSupplier() {}
  }

  private static final class HealthCheckerMethodDescriptorSupplier
      extends HealthCheckerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HealthCheckerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HealthCheckerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HealthCheckerFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getSimplePingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
