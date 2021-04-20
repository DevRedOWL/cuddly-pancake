package p042cz.msebera.android.httpclient.impl.cookie;

import p042cz.msebera.android.httpclient.cookie.Cookie;
import p042cz.msebera.android.httpclient.cookie.CookieAttributeHandler;
import p042cz.msebera.android.httpclient.cookie.CookieOrigin;
import p042cz.msebera.android.httpclient.cookie.MalformedCookieException;

/* renamed from: cz.msebera.android.httpclient.impl.cookie.AbstractCookieAttributeHandler */
public abstract class AbstractCookieAttributeHandler implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return true;
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
    }
}
