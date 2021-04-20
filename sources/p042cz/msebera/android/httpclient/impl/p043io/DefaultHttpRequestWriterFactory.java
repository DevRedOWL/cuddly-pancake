package p042cz.msebera.android.httpclient.impl.p043io;

import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.message.BasicLineFormatter;
import p042cz.msebera.android.httpclient.message.LineFormatter;
import p042cz.msebera.android.httpclient.p044io.HttpMessageWriter;
import p042cz.msebera.android.httpclient.p044io.HttpMessageWriterFactory;
import p042cz.msebera.android.httpclient.p044io.SessionOutputBuffer;

/* renamed from: cz.msebera.android.httpclient.impl.io.DefaultHttpRequestWriterFactory */
public class DefaultHttpRequestWriterFactory implements HttpMessageWriterFactory<HttpRequest> {
    public static final DefaultHttpRequestWriterFactory INSTANCE = new DefaultHttpRequestWriterFactory();
    private final LineFormatter lineFormatter;

    public DefaultHttpRequestWriterFactory(LineFormatter lineFormatter2) {
        this.lineFormatter = lineFormatter2 == null ? BasicLineFormatter.INSTANCE : lineFormatter2;
    }

    public DefaultHttpRequestWriterFactory() {
        this((LineFormatter) null);
    }

    public HttpMessageWriter<HttpRequest> create(SessionOutputBuffer sessionOutputBuffer) {
        return new DefaultHttpRequestWriter(sessionOutputBuffer, this.lineFormatter);
    }
}
