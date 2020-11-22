package com.proto.multiply;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: multiply/multiply.proto")
public final class MultiplyServiceGrpc {

  private MultiplyServiceGrpc() {}

  public static final String SERVICE_NAME = "multiply.MultiplyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.multiply.MultiplyRequest,
      com.proto.multiply.MultiplyResponse> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Multiply",
      requestType = com.proto.multiply.MultiplyRequest.class,
      responseType = com.proto.multiply.MultiplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.multiply.MultiplyRequest,
      com.proto.multiply.MultiplyResponse> getMultiplyMethod() {
    io.grpc.MethodDescriptor<com.proto.multiply.MultiplyRequest, com.proto.multiply.MultiplyResponse> getMultiplyMethod;
    if ((getMultiplyMethod = MultiplyServiceGrpc.getMultiplyMethod) == null) {
      synchronized (MultiplyServiceGrpc.class) {
        if ((getMultiplyMethod = MultiplyServiceGrpc.getMultiplyMethod) == null) {
          MultiplyServiceGrpc.getMultiplyMethod = getMultiplyMethod =
              io.grpc.MethodDescriptor.<com.proto.multiply.MultiplyRequest, com.proto.multiply.MultiplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.multiply.MultiplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.multiply.MultiplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MultiplyServiceMethodDescriptorSupplier("Multiply"))
              .build();
        }
      }
    }
    return getMultiplyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MultiplyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MultiplyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MultiplyServiceStub>() {
        @java.lang.Override
        public MultiplyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MultiplyServiceStub(channel, callOptions);
        }
      };
    return MultiplyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MultiplyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MultiplyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MultiplyServiceBlockingStub>() {
        @java.lang.Override
        public MultiplyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MultiplyServiceBlockingStub(channel, callOptions);
        }
      };
    return MultiplyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MultiplyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MultiplyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MultiplyServiceFutureStub>() {
        @java.lang.Override
        public MultiplyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MultiplyServiceFutureStub(channel, callOptions);
        }
      };
    return MultiplyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MultiplyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void multiply(com.proto.multiply.MultiplyRequest request,
        io.grpc.stub.StreamObserver<com.proto.multiply.MultiplyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiplyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMultiplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.multiply.MultiplyRequest,
                com.proto.multiply.MultiplyResponse>(
                  this, METHODID_MULTIPLY)))
          .build();
    }
  }

  /**
   */
  public static final class MultiplyServiceStub extends io.grpc.stub.AbstractAsyncStub<MultiplyServiceStub> {
    private MultiplyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MultiplyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MultiplyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void multiply(com.proto.multiply.MultiplyRequest request,
        io.grpc.stub.StreamObserver<com.proto.multiply.MultiplyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MultiplyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MultiplyServiceBlockingStub> {
    private MultiplyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MultiplyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MultiplyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.proto.multiply.MultiplyResponse multiply(com.proto.multiply.MultiplyRequest request) {
      return blockingUnaryCall(
          getChannel(), getMultiplyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MultiplyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MultiplyServiceFutureStub> {
    private MultiplyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MultiplyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MultiplyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.multiply.MultiplyResponse> multiply(
        com.proto.multiply.MultiplyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MULTIPLY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MultiplyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MultiplyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MULTIPLY:
          serviceImpl.multiply((com.proto.multiply.MultiplyRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.multiply.MultiplyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MultiplyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MultiplyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.multiply.MultiplyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MultiplyService");
    }
  }

  private static final class MultiplyServiceFileDescriptorSupplier
      extends MultiplyServiceBaseDescriptorSupplier {
    MultiplyServiceFileDescriptorSupplier() {}
  }

  private static final class MultiplyServiceMethodDescriptorSupplier
      extends MultiplyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MultiplyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MultiplyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MultiplyServiceFileDescriptorSupplier())
              .addMethod(getMultiplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
