package p042cz.msebera.android.httpclient.impl.cookie;

import p042cz.msebera.android.httpclient.cookie.C4460SM;
import p042cz.msebera.android.httpclient.cookie.Cookie;
import p042cz.msebera.android.httpclient.cookie.CookieAttributeHandler;
import p042cz.msebera.android.httpclient.cookie.CookieOrigin;
import p042cz.msebera.android.httpclient.cookie.CookieRestrictionViolationException;
import p042cz.msebera.android.httpclient.cookie.MalformedCookieException;
import p042cz.msebera.android.httpclient.cookie.SetCookie;
import p042cz.msebera.android.httpclient.util.Args;
import p042cz.msebera.android.httpclient.util.TextUtils;

/* renamed from: cz.msebera.android.httpclient.impl.cookie.BasicPathHandler */
public class BasicPathHandler implements CookieAttributeHandler {
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        Args.notNull(setCookie, C4460SM.COOKIE);
        if (TextUtils.isBlank(str)) {
            str = "/";
        }
        setCookie.setPath(str);
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (!match(cookie, cookieOrigin)) {
            throw new CookieRestrictionViolationException("Illegal path attribute \"" + cookie.getPath() + "\". Path of origin: \"" + cookieOrigin.getPath() + "\"");
        }
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, C4460SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        String path = cookieOrigin.getPath();
        String path2 = cookie.getPath();
        if (path2 == null) {
            path2 = "/";
        }
        if (path2.length() > 1 && path2.endsWith("/")) {
            path2 = path2.substring(0, path2.length() - 1);
        }
        boolean startsWith = path.startsWith(path2);
        if (!startsWith || path.length() == path2.length() || path2.endsWith("/")) {
            return startsWith;
        }
        return path.charAt(path2.length()) == '/';
    }
}
