package p042cz.msebera.android.httpclient.impl.p043io;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.message.LineFormatter;
import p042cz.msebera.android.httpclient.p044io.SessionOutputBuffer;

/* renamed from: cz.msebera.android.httpclient.impl.io.DefaultHttpRequestWriter */
public class DefaultHttpRequestWriter extends AbstractMessageWriter<HttpRequest> {
    public DefaultHttpRequestWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        super(sessionOutputBuffer, lineFormatter);
    }

    public DefaultHttpRequestWriter(SessionOutputBuffer sessionOutputBuffer) {
        this(sessionOutputBuffer, (LineFormatter) null);
    }

    /* access modifiers changed from: protected */
    public void writeHeadLine(HttpRequest httpRequest) throws IOException {
        this.lineFormatter.formatRequestLine(this.lineBuf, httpRequest.getRequestLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}
