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

/* renamed from: cz.msebera.android.httpclient.impl.DefaultBHttpClientConnectionFactory */
public class DefaultBHttpClientConnectionFactory implements HttpConnectionFactory<DefaultBHttpClientConnection> {
    public static final DefaultBHttpClientConnectionFactory INSTANCE = new DefaultBHttpClientConnectionFactory();
    private final ConnectionConfig cconfig;
    private final ContentLengthStrategy incomingContentStrategy;
    private final ContentLengthStrategy outgoingContentStrategy;
    private final HttpMessageWriterFactory<HttpRequest> requestWriterFactory;
    private final HttpMessageParserFactory<HttpResponse> responseParserFactory;

    public DefaultBHttpClientConnectionFactory(ConnectionConfig connectionConfig, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        this.cconfig = connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig;
        this.incomingContentStrategy = contentLengthStrategy;
        this.outgoingContentStrategy = contentLengthStrategy2;
        this.requestWriterFactory = httpMessageWriterFactory;
        this.responseParserFactory = httpMessageParserFactory;
    }

    public DefaultBHttpClientConnectionFactory(ConnectionConfig connectionConfig, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        this(connectionConfig, (ContentLengthStrategy) null, (ContentLengthStrategy) null, httpMessageWriterFactory, httpMessageParserFactory);
    }

    public DefaultBHttpClientConnectionFactory(ConnectionConfig connectionConfig) {
        this(connectionConfig, (ContentLengthStrategy) null, (ContentLengthStrategy) null, (HttpMessageWriterFactory<HttpRequest>) null, (HttpMessageParserFactory<HttpResponse>) null);
    }

    public DefaultBHttpClientConnectionFactory() {
        this((ConnectionConfig) null, (ContentLengthStrategy) null, (ContentLengthStrategy) null, (HttpMessageWriterFactory<HttpRequest>) null, (HttpMessageParserFactory<HttpResponse>) null);
    }

    public DefaultBHttpClientConnection createConnection(Socket socket) throws IOException {
        DefaultBHttpClientConnection defaultBHttpClientConnection = new DefaultBHttpClientConnection(this.cconfig.getBufferSize(), this.cconfig.getFragmentSizeHint(), ConnSupport.createDecoder(this.cconfig), ConnSupport.createEncoder(this.cconfig), this.cconfig.getMessageConstraints(), this.incomingContentStrategy, this.outgoingContentStrategy, this.requestWriterFactory, this.responseParserFactory);
        defaultBHttpClientConnection.bind(socket);
        return defaultBHttpClientConnection;
    }
}
