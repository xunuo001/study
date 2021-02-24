package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import io.grpc.stub.StreamObserver;

public class test {
    public static void main(String[] args) {
        testStream();
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
            req.onNext(HelloRequest.newBuilder().setName("grpc for dubbo " + i).build());
        }
        req.onCompleted();
        channel.shutdown();
    }
}
