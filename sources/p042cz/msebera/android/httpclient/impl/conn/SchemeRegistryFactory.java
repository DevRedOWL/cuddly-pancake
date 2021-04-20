package p042cz.msebera.android.httpclient.impl.conn;

import com.facebook.common.util.UriUtil;
import p042cz.msebera.android.httpclient.conn.scheme.PlainSocketFactory;
import p042cz.msebera.android.httpclient.conn.scheme.Scheme;
import p042cz.msebera.android.httpclient.conn.scheme.SchemeRegistry;
import p042cz.msebera.android.httpclient.conn.scheme.SchemeSocketFactory;
import p042cz.msebera.android.httpclient.conn.ssl.SSLSocketFactory;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.conn.SchemeRegistryFactory */
public final class SchemeRegistryFactory {
    public static SchemeRegistry createDefault() {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", 80, (SchemeSocketFactory) PlainSocketFactory.getSocketFactory()));
        schemeRegistry.register(new Scheme(UriUtil.HTTPS_SCHEME, 443, (SchemeSocketFactory) SSLSocketFactory.getSocketFactory()));
        return schemeRegistry;
    }

    public static SchemeRegistry createSystemDefault() {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", 80, (SchemeSocketFactory) PlainSocketFactory.getSocketFactory()));
        schemeRegistry.register(new Scheme(UriUtil.HTTPS_SCHEME, 443, (SchemeSocketFactory) SSLSocketFactory.getSystemSocketFactory()));
        return schemeRegistry;
    }
}
