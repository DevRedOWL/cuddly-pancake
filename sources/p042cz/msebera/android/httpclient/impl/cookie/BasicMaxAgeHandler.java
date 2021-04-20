package p042cz.msebera.android.httpclient.impl.cookie;

import java.util.Date;
import p042cz.msebera.android.httpclient.cookie.C4460SM;
import p042cz.msebera.android.httpclient.cookie.MalformedCookieException;
import p042cz.msebera.android.httpclient.cookie.SetCookie;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.cookie.BasicMaxAgeHandler */
public class BasicMaxAgeHandler extends AbstractCookieAttributeHandler {
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        Args.notNull(setCookie, C4460SM.COOKIE);
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    setCookie.setExpiryDate(new Date(System.currentTimeMillis() + (((long) parseInt) * 1000)));
                    return;
                }
                throw new MalformedCookieException("Negative max-age attribute: " + str);
            } catch (NumberFormatException unused) {
                throw new MalformedCookieException("Invalid max-age attribute: " + str);
            }
        } else {
            throw new MalformedCookieException("Missing value for max-age attribute");
        }
    }
}
