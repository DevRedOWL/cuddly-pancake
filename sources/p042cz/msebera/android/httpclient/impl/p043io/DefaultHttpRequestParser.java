package p042cz.msebera.android.httpclient.impl.p043io;

import java.io.IOException;
import p042cz.msebera.android.httpclient.ConnectionClosedException;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpRequestFactory;
import p042cz.msebera.android.httpclient.ParseException;
import p042cz.msebera.android.httpclient.config.MessageConstraints;
import p042cz.msebera.android.httpclient.impl.DefaultHttpRequestFactory;
import p042cz.msebera.android.httpclient.message.LineParser;
import p042cz.msebera.android.httpclient.message.ParserCursor;
import p042cz.msebera.android.httpclient.p044io.SessionInputBuffer;
import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.util.Args;
import p042cz.msebera.android.httpclient.util.CharArrayBuffer;

/* renamed from: cz.msebera.android.httpclient.impl.io.DefaultHttpRequestParser */
public class DefaultHttpRequestParser extends AbstractMessageParser<HttpRequest> {
    private final CharArrayBuffer lineBuf;
    private final HttpRequestFactory requestFactory;

    @Deprecated
    public DefaultHttpRequestParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpRequestFactory httpRequestFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.requestFactory = (HttpRequestFactory) Args.notNull(httpRequestFactory, "Request factory");
        this.lineBuf = new CharArrayBuffer(128);
    }

    public DefaultHttpRequestParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpRequestFactory httpRequestFactory, MessageConstraints messageConstraints) {
        super(sessionInputBuffer, lineParser, messageConstraints);
        this.requestFactory = httpRequestFactory == null ? DefaultHttpRequestFactory.INSTANCE : httpRequestFactory;
        this.lineBuf = new CharArrayBuffer(128);
    }

    public DefaultHttpRequestParser(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this(sessionInputBuffer, (LineParser) null, (HttpRequestFactory) null, messageConstraints);
    }

    public DefaultHttpRequestParser(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (LineParser) null, (HttpRequestFactory) null, MessageConstraints.DEFAULT);
    }

    /* access modifiers changed from: protected */
    public HttpRequest parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException, ParseException {
        this.lineBuf.clear();
        if (sessionInputBuffer.readLine(this.lineBuf) != -1) {
            return this.requestFactory.newHttpRequest(this.lineParser.parseRequestLine(this.lineBuf, new ParserCursor(0, this.lineBuf.length())));
        }
        throw new ConnectionClosedException("Client closed connection");
    }
}
