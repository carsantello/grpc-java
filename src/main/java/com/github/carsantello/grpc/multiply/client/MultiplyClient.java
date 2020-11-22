package com.github.carsantello.grpc.multiply.client;

import com.proto.multiply.Multiply;
import com.proto.multiply.MultiplyRequest;
import com.proto.multiply.MultiplyResponse;
import com.proto.multiply.MultiplyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MultiplyClient {
    public static void main(String[] args) {
        System.out.println("This is the gRPC multiply client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();
        System.out.println("Creating stub");

        // created a greet service client (blocking - synchronous)
        MultiplyServiceGrpc.MultiplyServiceBlockingStub multiplyClient = MultiplyServiceGrpc.newBlockingStub(channel);

        //creating a protobuf multiply message
        Multiply multiply = Multiply.newBuilder()
                .setFirstNumber(8)
                .setSecondNumber(9)
                .build();
        //do the same for a multiplyRequest
        MultiplyRequest multiplyRequest = MultiplyRequest.newBuilder()
                .setMultiply(multiply)
                .build();
        //call the RPC and get back a MultiplyResponse (protocol buffers)
        MultiplyResponse multiplyResponse = multiplyClient.multiply(multiplyRequest);
        //giving to the screen the result
        System.out.println("The result of multiplying " + " " + multiply.getFirstNumber() + " * "
                + multiply.getSecondNumber() + " is " + multiplyResponse.getResult()  );
        System.out.println("Shutting down channel!!");
        channel.shutdown();
    }
}
