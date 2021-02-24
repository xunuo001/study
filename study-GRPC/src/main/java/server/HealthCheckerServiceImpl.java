package server;


import io.grpc.stub.StreamObserver;
import proto.HealthCheckerGrpc;
import proto.PingRequest;
import proto.PingResponse;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

public class HealthCheckerServiceImpl extends HealthCheckerGrpc.HealthCheckerImplBase {

    @Override
    public StreamObserver<PingRequest> ping(StreamObserver<PingResponse> responseObserver) {
        return super.ping(responseObserver);
    }

    @Override
    public void simplePing(PingRequest request, StreamObserver<PingResponse> responseObserver) {
        System.out.println(request.getEndpointId());
        responseObserver.onNext(PingResponse.newBuilder().setSignature("1").build());
        responseObserver.onCompleted();
    }
}
