package p042cz.msebera.android.httpclient.conn;

import p042cz.msebera.android.httpclient.HttpHost;

/* renamed from: cz.msebera.android.httpclient.conn.SchemePortResolver */
public interface SchemePortResolver {
    int resolve(HttpHost httpHost) throws UnsupportedSchemeException;
}
