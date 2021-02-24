package server;

import io.grpc.*;
import proto.PingRequest;


public class GRPCServer {
    public static void main(String[] args) throws Exception {
//        Metadata.Key.of("head", PingRequest.)
        Server server = ServerBuilder.forPort(8080).addService(new HealthCheckerServiceImpl()).build().start();
        System.out.println("grpc server started");
        server.awaitTermination();
    }
}
