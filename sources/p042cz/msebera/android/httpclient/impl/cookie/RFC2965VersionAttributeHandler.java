package p042cz.msebera.android.httpclient.impl.cookie;

import p042cz.msebera.android.httpclient.cookie.C4460SM;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;
import p042cz.msebera.android.httpclient.cookie.Cookie;
import p042cz.msebera.android.httpclient.cookie.CookieAttributeHandler;
import p042cz.msebera.android.httpclient.cookie.CookieOrigin;
import p042cz.msebera.android.httpclient.cookie.CookieRestrictionViolationException;
import p042cz.msebera.android.httpclient.cookie.MalformedCookieException;
import p042cz.msebera.android.httpclient.cookie.SetCookie;
import p042cz.msebera.android.httpclient.cookie.SetCookie2;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.cookie.RFC2965VersionAttributeHandler */
public class RFC2965VersionAttributeHandler implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return true;
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        int i;
        Args.notNull(setCookie, C4460SM.COOKIE);
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i >= 0) {
                setCookie.setVersion(i);
                return;
            }
            throw new MalformedCookieException("Invalid cookie version.");
        }
        throw new MalformedCookieException("Missing value for version attribute");
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        Args.notNull(cookie, C4460SM.COOKIE);
        if ((cookie instanceof SetCookie2) && (cookie instanceof ClientCookie) && !((ClientCookie) cookie).containsAttribute(ClientCookie.VERSION_ATTR)) {
            throw new CookieRestrictionViolationException("Violates RFC 2965. Version attribute is required.");
        }
    }
}
