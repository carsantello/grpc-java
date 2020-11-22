package com.github.simplesteph.grpc.greeting.server;

import com.proto.greet.GreetResponse;
import com.proto.greet.Greeting;
import com.proto.sum.Sum;
import com.proto.sum.SumRequest;
import com.proto.sum.SumResponse;
import com.proto.sum.SumServiceGrpc;
import io.grpc.stub.StreamObserver;

public class SumServiceImpl extends SumServiceGrpc.SumServiceImplBase {
    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        //extract the fields we need
        Sum sum = request.getSum();
        int first_digit = sum.getFirstDigit();
        int second_digit = sum.getSecondDigit();

        //create the response
        //String result = "The value of the sum is " + first_digit +  second_digit;
        int result = first_digit + second_digit;
        SumResponse response = SumResponse.newBuilder()
                .setResult(result)
                .build();
        //send the response
        responseObserver.onNext(response);

        //complete the rpc call
        responseObserver.onCompleted();
    }
}
