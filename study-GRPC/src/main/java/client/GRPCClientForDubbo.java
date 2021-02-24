package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import io.grpc.examples.helloworld.HelloWorldProto;
import io.grpc.stub.StreamObserver;
import proto.HealthCheckerGrpc;
import proto.PingRequest;
import proto.PingResponse;

public class GRPCClientForDubbo {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("10.200.176.105:50051").usePlaintext().build();

        GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(channel);
        HelloRequest req = HelloRequest.newBuilder().setName("grpc for dubbo").build();
        HelloReply resp = stub.sayHello(req);
        System.out.println(resp);
        channel.shutdown();
    }

    private static void testStream() {
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("10.200.176.105:50051").usePlaintext().build();

        GreeterGrpc.GreeterStub stub = GreeterGrpc.newStub(channel);
        StreamObserver<HelloRequest> req = stub.savHelloStream(new StreamObserver<HelloReply>() {
            @Override
            public void onNext(HelloReply helloReply) {
                System.out.println(helloReply.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("complete");
            }
        });
        for (int i = 0; i < 10; i++) {
            HelloRequest hr= HelloRequest.newBuilder().setName("grpc for dubbo " + i).build();
            req.onNext(hr);
            System.out.println(i);
        }
        req.onCompleted();
    }
}
