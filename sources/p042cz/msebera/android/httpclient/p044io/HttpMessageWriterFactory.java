package p042cz.msebera.android.httpclient.p044io;

import p042cz.msebera.android.httpclient.HttpMessage;

/* renamed from: cz.msebera.android.httpclient.io.HttpMessageWriterFactory */
public interface HttpMessageWriterFactory<T extends HttpMessage> {
    HttpMessageWriter<T> create(SessionOutputBuffer sessionOutputBuffer);
}
