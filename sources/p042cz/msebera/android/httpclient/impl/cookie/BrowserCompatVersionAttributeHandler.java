package p042cz.msebera.android.httpclient.impl.cookie;

import p042cz.msebera.android.httpclient.cookie.C4460SM;
import p042cz.msebera.android.httpclient.cookie.MalformedCookieException;
import p042cz.msebera.android.httpclient.cookie.SetCookie;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.cookie.BrowserCompatVersionAttributeHandler */
public class BrowserCompatVersionAttributeHandler extends AbstractCookieAttributeHandler {
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        Args.notNull(setCookie, C4460SM.COOKIE);
        if (str != null) {
            int i = 0;
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
            setCookie.setVersion(i);
            return;
        }
        throw new MalformedCookieException("Missing value for version attribute");
    }
}
