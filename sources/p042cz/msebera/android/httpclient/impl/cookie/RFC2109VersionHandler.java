package p042cz.msebera.android.httpclient.impl.cookie;

import p042cz.msebera.android.httpclient.cookie.C4460SM;
import p042cz.msebera.android.httpclient.cookie.Cookie;
import p042cz.msebera.android.httpclient.cookie.CookieOrigin;
import p042cz.msebera.android.httpclient.cookie.CookieRestrictionViolationException;
import p042cz.msebera.android.httpclient.cookie.MalformedCookieException;
import p042cz.msebera.android.httpclient.cookie.SetCookie;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.cookie.RFC2109VersionHandler */
public class RFC2109VersionHandler extends AbstractCookieAttributeHandler {
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        Args.notNull(setCookie, C4460SM.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        } else if (str.trim().length() != 0) {
            try {
                setCookie.setVersion(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                throw new MalformedCookieException("Invalid version: " + e.getMessage());
            }
        } else {
            throw new MalformedCookieException("Blank value for version attribute");
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        Args.notNull(cookie, C4460SM.COOKIE);
        if (cookie.getVersion() < 0) {
            throw new CookieRestrictionViolationException("Cookie version may not be negative");
        }
    }
}
