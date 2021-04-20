package p042cz.msebera.android.httpclient.impl;

import java.io.IOException;
import java.net.Socket;
import p042cz.msebera.android.httpclient.HttpConnectionFactory;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.config.ConnectionConfig;
import p042cz.msebera.android.httpclient.entity.ContentLengthStrategy;
import p042cz.msebera.android.httpclient.p044io.HttpMessageParserFactory;
import p042cz.msebera.android.httpclient.p044io.HttpMessageWriterFactory;

/* renamed from: cz.msebera.android.httpclient.impl.DefaultBHttpServerConnectionFactory */
public class DefaultBHttpServerConnectionFactory implements HttpConnectionFactory<DefaultBHttpServerConnection> {
    public static final DefaultBHttpServerConnectionFactory INSTANCE = new DefaultBHttpServerConnectionFactory();
    private final ConnectionConfig cconfig;
    private final ContentLengthStrategy incomingContentStrategy;
    private final ContentLengthStrategy outgoingContentStrategy;
    private final HttpMessageParserFactory<HttpRequest> requestParserFactory;
    private final HttpMessageWriterFactory<HttpResponse> responseWriterFactory;

    public DefaultBHttpServerConnectionFactory(ConnectionConfig connectionConfig, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageParserFactory<HttpRequest> httpMessageParserFactory, HttpMessageWriterFactory<HttpResponse> httpMessageWriterFactory) {
        this.cconfig = connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig;
        this.incomingContentStrategy = contentLengthStrategy;
        this.outgoingContentStrategy = contentLengthStrategy2;
        this.requestParserFactory = httpMessageParserFactory;
        this.responseWriterFactory = httpMessageWriterFactory;
    }

    public DefaultBHttpServerConnectionFactory(ConnectionConfig connectionConfig, HttpMessageParserFactory<HttpRequest> httpMessageParserFactory, HttpMessageWriterFactory<HttpResponse> httpMessageWriterFactory) {
        this(connectionConfig, (ContentLengthStrategy) null, (ContentLengthStrategy) null, httpMessageParserFactory, httpMessageWriterFactory);
    }

    public DefaultBHttpServerConnectionFactory(ConnectionConfig connectionConfig) {
        this(connectionConfig, (ContentLengthStrategy) null, (ContentLengthStrategy) null, (HttpMessageParserFactory<HttpRequest>) null, (HttpMessageWriterFactory<HttpResponse>) null);
    }

    public DefaultBHttpServerConnectionFactory() {
        this((ConnectionConfig) null, (ContentLengthStrategy) null, (ContentLengthStrategy) null, (HttpMessageParserFactory<HttpRequest>) null, (HttpMessageWriterFactory<HttpResponse>) null);
    }

    public DefaultBHttpServerConnection createConnection(Socket socket) throws IOException {
        DefaultBHttpServerConnection defaultBHttpServerConnection = new DefaultBHttpServerConnection(this.cconfig.getBufferSize(), this.cconfig.getFragmentSizeHint(), ConnSupport.createDecoder(this.cconfig), ConnSupport.createEncoder(this.cconfig), this.cconfig.getMessageConstraints(), this.incomingContentStrategy, this.outgoingContentStrategy, this.requestParserFactory, this.responseWriterFactory);
        defaultBHttpServerConnection.bind(socket);
        return defaultBHttpServerConnection;
    }
}
