package p042cz.msebera.android.httpclient.conn.routing;

import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpHost;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.protocol.HttpContext;

/* renamed from: cz.msebera.android.httpclient.conn.routing.HttpRoutePlanner */
public interface HttpRoutePlanner {
    HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException;
}
