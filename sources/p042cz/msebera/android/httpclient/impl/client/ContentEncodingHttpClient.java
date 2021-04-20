package p042cz.msebera.android.httpclient.impl.client;

import p042cz.msebera.android.httpclient.client.protocol.RequestAcceptEncoding;
import p042cz.msebera.android.httpclient.client.protocol.ResponseContentEncoding;
import p042cz.msebera.android.httpclient.conn.ClientConnectionManager;
import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.protocol.BasicHttpProcessor;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.client.ContentEncodingHttpClient */
public class ContentEncodingHttpClient extends DefaultHttpClient {
    public ContentEncodingHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
    }

    public ContentEncodingHttpClient(HttpParams httpParams) {
        this((ClientConnectionManager) null, httpParams);
    }

    public ContentEncodingHttpClient() {
        this((HttpParams) null);
    }

    /* access modifiers changed from: protected */
    public BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor createHttpProcessor = super.createHttpProcessor();
        createHttpProcessor.addRequestInterceptor(new RequestAcceptEncoding());
        createHttpProcessor.addResponseInterceptor(new ResponseContentEncoding());
        return createHttpProcessor;
    }
}
