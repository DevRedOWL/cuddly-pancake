package p042cz.msebera.android.httpclient.impl.p043io;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.message.LineFormatter;
import p042cz.msebera.android.httpclient.p044io.SessionOutputBuffer;

/* renamed from: cz.msebera.android.httpclient.impl.io.DefaultHttpResponseWriter */
public class DefaultHttpResponseWriter extends AbstractMessageWriter<HttpResponse> {
    public DefaultHttpResponseWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        super(sessionOutputBuffer, lineFormatter);
    }

    public DefaultHttpResponseWriter(SessionOutputBuffer sessionOutputBuffer) {
        super(sessionOutputBuffer, (LineFormatter) null);
    }

    /* access modifiers changed from: protected */
    public void writeHeadLine(HttpResponse httpResponse) throws IOException {
        this.lineFormatter.formatStatusLine(this.lineBuf, httpResponse.getStatusLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}
