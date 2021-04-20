package p042cz.msebera.android.httpclient.impl.cookie;

import p042cz.msebera.android.httpclient.cookie.CookieSpec;
import p042cz.msebera.android.httpclient.cookie.CookieSpecFactory;
import p042cz.msebera.android.httpclient.cookie.CookieSpecProvider;
import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.protocol.HttpContext;

/* renamed from: cz.msebera.android.httpclient.impl.cookie.IgnoreSpecFactory */
public class IgnoreSpecFactory implements CookieSpecFactory, CookieSpecProvider {
    public CookieSpec newInstance(HttpParams httpParams) {
        return new IgnoreSpec();
    }

    public CookieSpec create(HttpContext httpContext) {
        return new IgnoreSpec();
    }
}
