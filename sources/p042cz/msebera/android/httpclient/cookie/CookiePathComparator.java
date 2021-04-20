package p042cz.msebera.android.httpclient.cookie;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: cz.msebera.android.httpclient.cookie.CookiePathComparator */
public class CookiePathComparator implements Serializable, Comparator<Cookie> {
    private static final long serialVersionUID = 7523645369616405818L;

    private String normalizePath(Cookie cookie) {
        String path = cookie.getPath();
        if (path == null) {
            path = "/";
        }
        if (path.endsWith("/")) {
            return path;
        }
        return path + '/';
    }

    public int compare(Cookie cookie, Cookie cookie2) {
        String normalizePath = normalizePath(cookie);
        String normalizePath2 = normalizePath(cookie2);
        if (normalizePath.equals(normalizePath2)) {
            return 0;
        }
        if (normalizePath.startsWith(normalizePath2)) {
            return -1;
        }
        if (normalizePath2.startsWith(normalizePath)) {
            return 1;
        }
        return 0;
    }
}
