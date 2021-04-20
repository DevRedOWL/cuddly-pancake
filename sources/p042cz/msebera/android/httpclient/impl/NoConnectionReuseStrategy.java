package p042cz.msebera.android.httpclient.impl;

import p042cz.msebera.android.httpclient.ConnectionReuseStrategy;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.protocol.HttpContext;

/* renamed from: cz.msebera.android.httpclient.impl.NoConnectionReuseStrategy */
public class NoConnectionReuseStrategy implements ConnectionReuseStrategy {
    public static final NoConnectionReuseStrategy INSTANCE = new NoConnectionReuseStrategy();

    public boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext) {
        return false;
    }
}
