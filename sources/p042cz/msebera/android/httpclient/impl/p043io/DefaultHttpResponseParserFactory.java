package p042cz.msebera.android.httpclient.impl.p043io;

import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.HttpResponseFactory;
import p042cz.msebera.android.httpclient.config.MessageConstraints;
import p042cz.msebera.android.httpclient.impl.DefaultHttpResponseFactory;
import p042cz.msebera.android.httpclient.message.BasicLineParser;
import p042cz.msebera.android.httpclient.message.LineParser;
import p042cz.msebera.android.httpclient.p044io.HttpMessageParser;
import p042cz.msebera.android.httpclient.p044io.HttpMessageParserFactory;
import p042cz.msebera.android.httpclient.p044io.SessionInputBuffer;

/* renamed from: cz.msebera.android.httpclient.impl.io.DefaultHttpResponseParserFactory */
public class DefaultHttpResponseParserFactory implements HttpMessageParserFactory<HttpResponse> {
    public static final DefaultHttpResponseParserFactory INSTANCE = new DefaultHttpResponseParserFactory();
    private final LineParser lineParser;
    private final HttpResponseFactory responseFactory;

    public DefaultHttpResponseParserFactory(LineParser lineParser2, HttpResponseFactory httpResponseFactory) {
        this.lineParser = lineParser2 == null ? BasicLineParser.INSTANCE : lineParser2;
        this.responseFactory = httpResponseFactory == null ? DefaultHttpResponseFactory.INSTANCE : httpResponseFactory;
    }

    public DefaultHttpResponseParserFactory() {
        this((LineParser) null, (HttpResponseFactory) null);
    }

    public HttpMessageParser<HttpResponse> create(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        return new DefaultHttpResponseParser(sessionInputBuffer, this.lineParser, this.responseFactory, messageConstraints);
    }
}
