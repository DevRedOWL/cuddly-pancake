package p042cz.msebera.android.httpclient.impl.p043io;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpMessage;
import p042cz.msebera.android.httpclient.HttpResponseFactory;
import p042cz.msebera.android.httpclient.NoHttpResponseException;
import p042cz.msebera.android.httpclient.ParseException;
import p042cz.msebera.android.httpclient.message.LineParser;
import p042cz.msebera.android.httpclient.message.ParserCursor;
import p042cz.msebera.android.httpclient.p044io.SessionInputBuffer;
import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.protocol.HttpContext;
import p042cz.msebera.android.httpclient.util.Args;
import p042cz.msebera.android.httpclient.util.CharArrayBuffer;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.io.HttpResponseParser */
public class HttpResponseParser extends AbstractMessageParser<HttpMessage> {
    private final CharArrayBuffer lineBuf = new CharArrayBuffer(128);
    private final HttpResponseFactory responseFactory;

    public HttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.responseFactory = (HttpResponseFactory) Args.notNull(httpResponseFactory, "Response factory");
    }

    /* access modifiers changed from: protected */
    public HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException, ParseException {
        this.lineBuf.clear();
        if (sessionInputBuffer.readLine(this.lineBuf) != -1) {
            return this.responseFactory.newHttpResponse(this.lineParser.parseStatusLine(this.lineBuf, new ParserCursor(0, this.lineBuf.length())), (HttpContext) null);
        }
        throw new NoHttpResponseException("The target server failed to respond");
    }
}
