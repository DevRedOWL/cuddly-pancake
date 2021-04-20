package p042cz.msebera.android.httpclient.impl.client.cache;

import java.net.URI;
import java.net.URISyntaxException;
import p042cz.msebera.android.httpclient.HttpHost;
import p042cz.msebera.android.httpclient.client.utils.URIUtils;
import p042cz.msebera.android.httpclient.conn.routing.RouteInfo;

/* renamed from: cz.msebera.android.httpclient.impl.client.cache.InternalURIUtils */
class InternalURIUtils {
    public static URI rewriteURIForRoute(URI uri, RouteInfo routeInfo) throws URISyntaxException {
        if (uri == null) {
            return null;
        }
        if (routeInfo.getProxyHost() == null || routeInfo.isTunnelled()) {
            if (uri.isAbsolute()) {
                return URIUtils.rewriteURI(uri, (HttpHost) null, true);
            }
            return URIUtils.rewriteURI(uri);
        } else if (!uri.isAbsolute()) {
            return URIUtils.rewriteURI(uri, routeInfo.getTargetHost(), true);
        } else {
            return URIUtils.rewriteURI(uri);
        }
    }

    private InternalURIUtils() {
    }
}
