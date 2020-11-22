package com.github.carsantello.grpc.multiply.server;

import com.proto.multiply.Multiply;
import com.proto.multiply.MultiplyRequest;
import com.proto.multiply.MultiplyResponse;
import com.proto.multiply.MultiplyServiceGrpc;
import io.grpc.stub.StreamObserver;

public class MultiplyServiceImpl extends MultiplyServiceGrpc.MultiplyServiceImplBase {
    @Override
    public void multiply(MultiplyRequest request, StreamObserver<MultiplyResponse> responseObserver) {
        Multiply multiply = request.getMultiply();

        //collect the fields we need
        int first_num = multiply.getFirstNumber();
        int second_num = multiply.getSecondNumber();

        //create the response
        int result = first_num * second_num;
        MultiplyResponse response = MultiplyResponse.newBuilder()
                .setResult(result)
                .build();
        //send the response
        responseObserver.onNext(response);

        //complete the RPC call
        responseObserver.onCompleted();

    }
}