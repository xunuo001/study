package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;

public class GRPCServerWithHeader {
    public static void main(String[] args) throws Exception {
//        Metadata.Key.of("head", PingRequest.)
        Server server = ServerBuilder.forPort(8080).addService(
                ServerInterceptors.intercept( new HealthCheckerServiceImpl(),new HeaderServerInterceptor())
        ).build().start();
        System.out.println("grpc server started");
        server.awaitTermination();
    }
}
