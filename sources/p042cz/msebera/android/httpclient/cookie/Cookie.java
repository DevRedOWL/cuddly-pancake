package p042cz.msebera.android.httpclient.cookie;

import java.util.Date;

/* renamed from: cz.msebera.android.httpclient.cookie.Cookie */
public interface Cookie {
    String getComment();

    String getCommentURL();

    String getDomain();

    Date getExpiryDate();

    String getName();

    String getPath();

    int[] getPorts();

    String getValue();

    int getVersion();

    boolean isExpired(Date date);

    boolean isPersistent();

    boolean isSecure();
}
