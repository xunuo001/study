package com.example.products;

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
    comments = "Source: products_service.proto")
public final class ConnectivityProductsGrpc {

  private ConnectivityProductsGrpc() {}

  public static final String SERVICE_NAME = "com.example.ConnectivityProducts";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.products.GetProductsRequest,
      com.example.products.GetProductsResponse> getGetProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProducts",
      requestType = com.example.products.GetProductsRequest.class,
      responseType = com.example.products.GetProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.products.GetProductsRequest,
      com.example.products.GetProductsResponse> getGetProductsMethod() {
    io.grpc.MethodDescriptor<com.example.products.GetProductsRequest, com.example.products.GetProductsResponse> getGetProductsMethod;
    if ((getGetProductsMethod = ConnectivityProductsGrpc.getGetProductsMethod) == null) {
      synchronized (ConnectivityProductsGrpc.class) {
        if ((getGetProductsMethod = ConnectivityProductsGrpc.getGetProductsMethod) == null) {
          ConnectivityProductsGrpc.getGetProductsMethod = getGetProductsMethod =
              io.grpc.MethodDescriptor.<com.example.products.GetProductsRequest, com.example.products.GetProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.products.GetProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.products.GetProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectivityProductsMethodDescriptorSupplier("GetProducts"))
              .build();
        }
      }
    }
    return getGetProductsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectivityProductsStub newStub(io.grpc.Channel channel) {
    return new ConnectivityProductsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectivityProductsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConnectivityProductsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectivityProductsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConnectivityProductsFutureStub(channel);
  }

  /**
   */
  public static abstract class ConnectivityProductsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProducts(com.example.products.GetProductsRequest request,
        io.grpc.stub.StreamObserver<com.example.products.GetProductsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.products.GetProductsRequest,
                com.example.products.GetProductsResponse>(
                  this, METHODID_GET_PRODUCTS)))
          .build();
    }
  }

  /**
   */
  public static final class ConnectivityProductsStub extends io.grpc.stub.AbstractStub<ConnectivityProductsStub> {
    private ConnectivityProductsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConnectivityProductsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectivityProductsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConnectivityProductsStub(channel, callOptions);
    }

    /**
     */
    public void getProducts(com.example.products.GetProductsRequest request,
        io.grpc.stub.StreamObserver<com.example.products.GetProductsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConnectivityProductsBlockingStub extends io.grpc.stub.AbstractStub<ConnectivityProductsBlockingStub> {
    private ConnectivityProductsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConnectivityProductsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectivityProductsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConnectivityProductsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.products.GetProductsResponse getProducts(com.example.products.GetProductsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProductsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConnectivityProductsFutureStub extends io.grpc.stub.AbstractStub<ConnectivityProductsFutureStub> {
    private ConnectivityProductsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConnectivityProductsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectivityProductsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConnectivityProductsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.products.GetProductsResponse> getProducts(
        com.example.products.GetProductsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConnectivityProductsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConnectivityProductsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((com.example.products.GetProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.products.GetProductsResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ConnectivityProductsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnectivityProductsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.products.ConnectivityProductsPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConnectivityProducts");
    }
  }

  private static final class ConnectivityProductsFileDescriptorSupplier
      extends ConnectivityProductsBaseDescriptorSupplier {
    ConnectivityProductsFileDescriptorSupplier() {}
  }

  private static final class ConnectivityProductsMethodDescriptorSupplier
      extends ConnectivityProductsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConnectivityProductsMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConnectivityProductsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectivityProductsFileDescriptorSupplier())
              .addMethod(getGetProductsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
