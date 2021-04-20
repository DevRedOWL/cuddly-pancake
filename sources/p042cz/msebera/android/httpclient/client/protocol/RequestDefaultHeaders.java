package p042cz.msebera.android.httpclient.client.protocol;

import java.io.IOException;
import java.util.Collection;
import p042cz.msebera.android.httpclient.Header;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpRequestInterceptor;
import p042cz.msebera.android.httpclient.client.params.ClientPNames;
import p042cz.msebera.android.httpclient.protocol.HttpContext;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.client.protocol.RequestDefaultHeaders */
public class RequestDefaultHeaders implements HttpRequestInterceptor {
    private final Collection<? extends Header> defaultHeaders;

    public RequestDefaultHeaders(Collection<? extends Header> collection) {
        this.defaultHeaders = collection;
    }

    public RequestDefaultHeaders() {
        this((Collection<? extends Header>) null);
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        Args.notNull(httpRequest, "HTTP request");
        if (!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            Collection<? extends Header> collection = (Collection) httpRequest.getParams().getParameter(ClientPNames.DEFAULT_HEADERS);
            if (collection == null) {
                collection = this.defaultHeaders;
            }
            if (collection != null) {
                for (Header addHeader : collection) {
                    httpRequest.addHeader(addHeader);
                }
            }
        }
    }
}
