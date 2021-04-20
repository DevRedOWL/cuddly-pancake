package p042cz.msebera.android.httpclient.impl.conn;

import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpHost;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.conn.SchemePortResolver;
import p042cz.msebera.android.httpclient.protocol.HttpContext;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.conn.DefaultProxyRoutePlanner */
public class DefaultProxyRoutePlanner extends DefaultRoutePlanner {
    private final HttpHost proxy;

    public DefaultProxyRoutePlanner(HttpHost httpHost, SchemePortResolver schemePortResolver) {
        super(schemePortResolver);
        this.proxy = (HttpHost) Args.notNull(httpHost, "Proxy host");
    }

    public DefaultProxyRoutePlanner(HttpHost httpHost) {
        this(httpHost, (SchemePortResolver) null);
    }

    /* access modifiers changed from: protected */
    public HttpHost determineProxy(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        return this.proxy;
    }
}
