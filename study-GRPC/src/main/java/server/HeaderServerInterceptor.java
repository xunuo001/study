package server;

import com.example.products.Header;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.*;

public class HeaderServerInterceptor implements ServerInterceptor {
     Metadata.Key<String> CUSTOM_HEADER_KEY =
            Metadata.Key.of("custom_server_header_key", Metadata.ASCII_STRING_MARSHALLER);
    Metadata.Key<Header> CUSTOM_HEADER_KEY2 =
            Metadata.Key.of("custom_server_header_key-bin", new Metadata.BinaryMarshaller<Header>() {
                @Override
                public byte[] toBytes(Header s) {
                    return s.toByteArray();
                }

                @Override
                public Header parseBytes(byte[] bytes) {
                    try {
                        return  Header.newBuilder().mergeFrom(bytes).build();
                    } catch (InvalidProtocolBufferException e) {
                        e.printStackTrace();
                    }
                    return null;
                }
            });

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            final Metadata requestHeaders,
            ServerCallHandler<ReqT, RespT> next) {


        System.out.println("header received from client:" + requestHeaders);
        System.out.println(requestHeaders.get(CUSTOM_HEADER_KEY2).getTaskId());
        return next.startCall(new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {
            @Override
            public void sendHeaders(Metadata responseHeaders) {
                responseHeaders.put(CUSTOM_HEADER_KEY, "customRespondValue");
                responseHeaders.put(CUSTOM_HEADER_KEY2, Header.newBuilder().setTaskId("000000").build());
                super.sendHeaders(responseHeaders);
            }
        }, requestHeaders);
    }
}
