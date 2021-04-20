package p042cz.msebera.android.httpclient.protocol;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpRequestInterceptor;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.protocol.RequestConnControl */
public class RequestConnControl implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        Args.notNull(httpRequest, "HTTP request");
        if (!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") && !httpRequest.containsHeader("Connection")) {
            httpRequest.addHeader("Connection", HTTP.CONN_KEEP_ALIVE);
        }
    }
}
