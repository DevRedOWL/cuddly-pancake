package p042cz.msebera.android.httpclient.client.protocol;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpRequestInterceptor;
import p042cz.msebera.android.httpclient.protocol.HttpContext;

/* renamed from: cz.msebera.android.httpclient.client.protocol.RequestAcceptEncoding */
public class RequestAcceptEncoding implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        if (!httpRequest.containsHeader("Accept-Encoding")) {
            httpRequest.addHeader("Accept-Encoding", "gzip,deflate");
        }
    }
}
