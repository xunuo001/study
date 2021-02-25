package client;

import io.grpc.*;
import proto.HealthCheckerGrpc;
import proto.PingRequest;
import proto.PingResponse;

public class GRPCClientWithHeader {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8080).usePlaintext().build();
//         ManagedChannel channel = ManagedChannelBuilder.forTarget("127.0.0.1:8080").usePlaintext().build();
        ClientInterceptor clientInterceptor=new HeaderClientInterceptor();
        Channel interceptorChannel= ClientInterceptors.intercept(channel, clientInterceptor);
        HealthCheckerGrpc.HealthCheckerBlockingStub stub = HealthCheckerGrpc.newBlockingStub(interceptorChannel);
        PingRequest req = PingRequest.newBuilder().setEndpointId("test2").build();
        PingResponse resp = stub.simplePing(req);
        System.out.println(resp);
        channel.shutdown();
    }
}
