package p042cz.msebera.android.httpclient.impl.cookie;

import p042cz.msebera.android.httpclient.cookie.Cookie;
import p042cz.msebera.android.httpclient.cookie.CookieAttributeHandler;
import p042cz.msebera.android.httpclient.cookie.CookieOrigin;
import p042cz.msebera.android.httpclient.cookie.MalformedCookieException;
import p042cz.msebera.android.httpclient.cookie.SetCookie;
import p042cz.msebera.android.httpclient.cookie.SetCookie2;

/* renamed from: cz.msebera.android.httpclient.impl.cookie.RFC2965CommentUrlAttributeHandler */
public class RFC2965CommentUrlAttributeHandler implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return true;
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie instanceof SetCookie2) {
            ((SetCookie2) setCookie).setCommentURL(str);
        }
    }
}
