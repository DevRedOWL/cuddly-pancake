package p042cz.msebera.android.httpclient.impl.cookie;

import java.util.Date;
import p042cz.msebera.android.httpclient.client.utils.DateUtils;
import p042cz.msebera.android.httpclient.cookie.C4460SM;
import p042cz.msebera.android.httpclient.cookie.MalformedCookieException;
import p042cz.msebera.android.httpclient.cookie.SetCookie;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.cookie.BasicExpiresHandler */
public class BasicExpiresHandler extends AbstractCookieAttributeHandler {
    private final String[] datepatterns;

    public BasicExpiresHandler(String[] strArr) {
        Args.notNull(strArr, "Array of date patterns");
        this.datepatterns = strArr;
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        Args.notNull(setCookie, C4460SM.COOKIE);
        if (str != null) {
            Date parseDate = DateUtils.parseDate(str, this.datepatterns);
            if (parseDate != null) {
                setCookie.setExpiryDate(parseDate);
                return;
            }
            throw new MalformedCookieException("Unable to parse expires attribute: " + str);
        }
        throw new MalformedCookieException("Missing value for expires attribute");
    }
}
