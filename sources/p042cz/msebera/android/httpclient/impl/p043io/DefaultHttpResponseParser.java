package p042cz.msebera.android.httpclient.impl.p043io;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.HttpResponseFactory;
import p042cz.msebera.android.httpclient.NoHttpResponseException;
import p042cz.msebera.android.httpclient.ParseException;
import p042cz.msebera.android.httpclient.config.MessageConstraints;
import p042cz.msebera.android.httpclient.impl.DefaultHttpResponseFactory;
import p042cz.msebera.android.httpclient.message.LineParser;
import p042cz.msebera.android.httpclient.message.ParserCursor;
import p042cz.msebera.android.httpclient.p044io.SessionInputBuffer;
import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.protocol.HttpContext;
import p042cz.msebera.android.httpclient.util.Args;
import p042cz.msebera.android.httpclient.util.CharArrayBuffer;

/* renamed from: cz.msebera.android.httpclient.impl.io.DefaultHttpResponseParser */
public class DefaultHttpResponseParser extends AbstractMessageParser<HttpResponse> {
    private final CharArrayBuffer lineBuf;
    private final HttpResponseFactory responseFactory;

    @Deprecated
    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.responseFactory = (HttpResponseFactory) Args.notNull(httpResponseFactory, "Response factory");
        this.lineBuf = new CharArrayBuffer(128);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, MessageConstraints messageConstraints) {
        super(sessionInputBuffer, lineParser, messageConstraints);
        this.responseFactory = httpResponseFactory == null ? DefaultHttpResponseFactory.INSTANCE : httpResponseFactory;
        this.lineBuf = new CharArrayBuffer(128);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, messageConstraints);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, MessageConstraints.DEFAULT);
    }

    /* access modifiers changed from: protected */
    public HttpResponse parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException, ParseException {
        this.lineBuf.clear();
        if (sessionInputBuffer.readLine(this.lineBuf) != -1) {
            return this.responseFactory.newHttpResponse(this.lineParser.parseStatusLine(this.lineBuf, new ParserCursor(0, this.lineBuf.length())), (HttpContext) null);
        }
        throw new NoHttpResponseException("The target server failed to respond");
    }
}
