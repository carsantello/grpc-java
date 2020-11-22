package com.github.carsantello.grpc.multiply.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class MultiplyServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hi gRPC, this is the multiply server");
        Server server = ServerBuilder.forPort(50052)
                .addService(new MultiplyServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("System shutdown request");
            server.shutdown();
            System.out.println("Successfully stop the server");
        })) ;

        server.awaitTermination();
    }
}
