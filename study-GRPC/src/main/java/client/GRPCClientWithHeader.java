package client;

import io.grpc.*;
import proto.HealthCheckerGrpc;
import proto.PingRequest;
import proto.PingResponse;

public class GRPCClientWithHeader {
    public static void main(String[] args) {
         ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080").usePlaintext().build();
        ClientInterceptor clientInterceptor=new HeaderClientInterceptor();
        Channel interceptorChannel= ClientInterceptors.intercept(channel, clientInterceptor);
        HealthCheckerGrpc.HealthCheckerBlockingStub stub = HealthCheckerGrpc.newBlockingStub(interceptorChannel);
        PingRequest req = PingRequest.newBuilder().setEndpointId("test2").build();
        PingResponse resp = stub.simplePing(req);
        System.out.println(resp);
        channel.shutdown();
    }
}
