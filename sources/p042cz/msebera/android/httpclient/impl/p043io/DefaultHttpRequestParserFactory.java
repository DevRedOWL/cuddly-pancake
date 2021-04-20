package p042cz.msebera.android.httpclient.impl.p043io;

import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpRequestFactory;
import p042cz.msebera.android.httpclient.config.MessageConstraints;
import p042cz.msebera.android.httpclient.impl.DefaultHttpRequestFactory;
import p042cz.msebera.android.httpclient.message.BasicLineParser;
import p042cz.msebera.android.httpclient.message.LineParser;
import p042cz.msebera.android.httpclient.p044io.HttpMessageParser;
import p042cz.msebera.android.httpclient.p044io.HttpMessageParserFactory;
import p042cz.msebera.android.httpclient.p044io.SessionInputBuffer;

/* renamed from: cz.msebera.android.httpclient.impl.io.DefaultHttpRequestParserFactory */
public class DefaultHttpRequestParserFactory implements HttpMessageParserFactory<HttpRequest> {
    public static final DefaultHttpRequestParserFactory INSTANCE = new DefaultHttpRequestParserFactory();
    private final LineParser lineParser;
    private final HttpRequestFactory requestFactory;

    public DefaultHttpRequestParserFactory(LineParser lineParser2, HttpRequestFactory httpRequestFactory) {
        this.lineParser = lineParser2 == null ? BasicLineParser.INSTANCE : lineParser2;
        this.requestFactory = httpRequestFactory == null ? DefaultHttpRequestFactory.INSTANCE : httpRequestFactory;
    }

    public DefaultHttpRequestParserFactory() {
        this((LineParser) null, (HttpRequestFactory) null);
    }

    public HttpMessageParser<HttpRequest> create(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        return new DefaultHttpRequestParser(sessionInputBuffer, this.lineParser, this.requestFactory, messageConstraints);
    }
}
