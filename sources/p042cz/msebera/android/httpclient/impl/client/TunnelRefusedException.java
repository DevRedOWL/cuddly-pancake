package p042cz.msebera.android.httpclient.impl.client;

import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpResponse;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.client.TunnelRefusedException */
public class TunnelRefusedException extends HttpException {
    private static final long serialVersionUID = -8646722842745617323L;
    private final HttpResponse response;

    public TunnelRefusedException(String str, HttpResponse httpResponse) {
        super(str);
        this.response = httpResponse;
    }

    public HttpResponse getResponse() {
        return this.response;
    }
}
