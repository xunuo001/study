package client;

import com.example.products.Header;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.*;

public class HeaderClientInterceptor implements ClientInterceptor {
    static final Metadata.Key<String> CUSTOM_HEADER_KEY =
            Metadata.Key.of("custom_client_header_key", Metadata.ASCII_STRING_MARSHALLER);
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
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
                                                               CallOptions callOptions, Channel next) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {

            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                /* put custom header */
                headers.put(CUSTOM_HEADER_KEY, "customRequestValue");
                headers.put(CUSTOM_HEADER_KEY2, Header.newBuilder().setTaskId("222").build());
                super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
                    @Override
                    public void onHeaders(Metadata headers) {
                        /**
                         * if you don't need receive header from server,
                         * you can use {@link io.grpc.stub.MetadataUtils#attachHeaders}
                         * directly to send header
                         */
                        System.out.println(headers.get(CUSTOM_HEADER_KEY2).getTaskId());
                        System.out.println("header received from server:" + headers);
                        super.onHeaders(headers);
                    }
                }, headers);
            }
        };
    }
}
