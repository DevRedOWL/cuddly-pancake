package p042cz.msebera.android.httpclient.impl.p043io;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.message.LineFormatter;
import p042cz.msebera.android.httpclient.p044io.SessionOutputBuffer;
import p042cz.msebera.android.httpclient.params.HttpParams;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.io.HttpResponseWriter */
public class HttpResponseWriter extends AbstractMessageWriter<HttpResponse> {
    public HttpResponseWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter, HttpParams httpParams) {
        super(sessionOutputBuffer, lineFormatter, httpParams);
    }

    /* access modifiers changed from: protected */
    public void writeHeadLine(HttpResponse httpResponse) throws IOException {
        this.lineFormatter.formatStatusLine(this.lineBuf, httpResponse.getStatusLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}
