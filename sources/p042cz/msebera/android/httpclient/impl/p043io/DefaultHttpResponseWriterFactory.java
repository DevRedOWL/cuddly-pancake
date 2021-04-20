package p042cz.msebera.android.httpclient.impl.p043io;

import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.message.BasicLineFormatter;
import p042cz.msebera.android.httpclient.message.LineFormatter;
import p042cz.msebera.android.httpclient.p044io.HttpMessageWriter;
import p042cz.msebera.android.httpclient.p044io.HttpMessageWriterFactory;
import p042cz.msebera.android.httpclient.p044io.SessionOutputBuffer;

/* renamed from: cz.msebera.android.httpclient.impl.io.DefaultHttpResponseWriterFactory */
public class DefaultHttpResponseWriterFactory implements HttpMessageWriterFactory<HttpResponse> {
    public static final DefaultHttpResponseWriterFactory INSTANCE = new DefaultHttpResponseWriterFactory();
    private final LineFormatter lineFormatter;

    public DefaultHttpResponseWriterFactory(LineFormatter lineFormatter2) {
        this.lineFormatter = lineFormatter2 == null ? BasicLineFormatter.INSTANCE : lineFormatter2;
    }

    public DefaultHttpResponseWriterFactory() {
        this((LineFormatter) null);
    }

    public HttpMessageWriter<HttpResponse> create(SessionOutputBuffer sessionOutputBuffer) {
        return new DefaultHttpResponseWriter(sessionOutputBuffer, this.lineFormatter);
    }
}
