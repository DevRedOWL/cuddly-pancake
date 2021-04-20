package p042cz.msebera.android.httpclient.impl.cookie;

import org.apache.commons.lang3.ClassUtils;
import p042cz.msebera.android.httpclient.cookie.C4460SM;
import p042cz.msebera.android.httpclient.cookie.Cookie;
import p042cz.msebera.android.httpclient.cookie.CookieAttributeHandler;
import p042cz.msebera.android.httpclient.cookie.CookieOrigin;
import p042cz.msebera.android.httpclient.cookie.CookieRestrictionViolationException;
import p042cz.msebera.android.httpclient.cookie.MalformedCookieException;
import p042cz.msebera.android.httpclient.cookie.SetCookie;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.cookie.BasicDomainHandler */
public class BasicDomainHandler implements CookieAttributeHandler {
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        Args.notNull(setCookie, C4460SM.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        } else if (str.trim().length() != 0) {
            setCookie.setDomain(str);
        } else {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        Args.notNull(cookie, C4460SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            throw new CookieRestrictionViolationException("Cookie domain may not be null");
        } else if (host.contains(".")) {
            if (!host.endsWith(domain)) {
                if (domain.startsWith(".")) {
                    domain = domain.substring(1, domain.length());
                }
                if (!host.equals(domain)) {
                    throw new CookieRestrictionViolationException("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + host + "\"");
                }
            }
        } else if (!host.equals(domain)) {
            throw new CookieRestrictionViolationException("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + host + "\"");
        }
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, C4460SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            return false;
        }
        if (host.equals(domain)) {
            return true;
        }
        if (!domain.startsWith(".")) {
            domain = ClassUtils.PACKAGE_SEPARATOR_CHAR + domain;
        }
        if (host.endsWith(domain) || host.equals(domain.substring(1))) {
            return true;
        }
        return false;
    }
}
