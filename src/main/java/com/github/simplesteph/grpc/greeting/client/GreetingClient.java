package com.github.simplesteph.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.*;
import com.proto.sum.Sum;
import com.proto.sum.SumRequest;
import com.proto.sum.SumResponse;
import com.proto.sum.SumServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
    public static void main(String[] args) {
        System.out.println("Hello, I'm a gRPC client!!");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        System.out.println("Creating Stub");
        //old and dummy
        //DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);
        //DummyServiceGrpc.DummyServiceFutureStub asyncClient = DummyServiceGrpc.newFutureStub(channel):

        // created a greet service client (blocking - synchronous)
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);

        //created a protocol buffer greeting message
        Greeting greeting = Greeting.newBuilder()
                .setFirstName("Carlos")
                .setLastName("Sánchez")
                .build();
        //do the same for a GreetRequest
        GreetRequest greetRequest = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();
        //call the RPC and get back a GreetResponse (protocol buffers)
        GreetResponse greetResponse = greetClient.greet(greetRequest);

//new implementation of the sum service
        // created a greet service client (blocking - synchronous)
        SumServiceGrpc.SumServiceBlockingStub sumClient = SumServiceGrpc.newBlockingStub(channel);

        //created a protocol buffer greeting message
        Sum sum = Sum.newBuilder()
                .setFirstDigit(20)
                .setSecondDigit(10)
                .build();
        //do the same for a SumRequest
        SumRequest sumRequest = SumRequest.newBuilder()
                .setSum(sum)
                .build();
        //call the RPC and get back a GreetResponse (protocol buffers)
        SumResponse sumResponse = sumClient.sum(sumRequest);
        System.out.println(sumResponse.getResult());
//end of the new sum service implementation

        System.out.println(greetResponse.getResult());
        // do Something
        System.out.println("Shutting down channel!!");
        channel.shutdown();
    }
}
