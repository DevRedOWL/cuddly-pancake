package p042cz.msebera.android.httpclient.impl.conn;

import com.facebook.common.util.UriUtil;
import p042cz.msebera.android.httpclient.HttpHost;
import p042cz.msebera.android.httpclient.conn.SchemePortResolver;
import p042cz.msebera.android.httpclient.conn.UnsupportedSchemeException;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.conn.DefaultSchemePortResolver */
public class DefaultSchemePortResolver implements SchemePortResolver {
    public static final DefaultSchemePortResolver INSTANCE = new DefaultSchemePortResolver();

    public int resolve(HttpHost httpHost) throws UnsupportedSchemeException {
        Args.notNull(httpHost, "HTTP host");
        int port = httpHost.getPort();
        if (port > 0) {
            return port;
        }
        String schemeName = httpHost.getSchemeName();
        if (schemeName.equalsIgnoreCase("http")) {
            return 80;
        }
        if (schemeName.equalsIgnoreCase(UriUtil.HTTPS_SCHEME)) {
            return 443;
        }
        throw new UnsupportedSchemeException(schemeName + " protocol is not supported");
    }
}
