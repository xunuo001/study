package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.MetadataUtils;
import proto.HealthCheckerGrpc;
import proto.PingRequest;
import proto.PingRequestOrBuilder;
import proto.PingResponse;

public class GRPCClient {
    public static void main(String[] args) {
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080").usePlaintext().build();
        HealthCheckerGrpc.HealthCheckerBlockingStub stub = HealthCheckerGrpc.newBlockingStub(channel);
        PingRequest req = PingRequest.newBuilder().setEndpointId("test2").build();
        PingResponse resp = stub.simplePing(req);
        System.out.println(resp);
        channel.shutdown();
    }
}
