package p042cz.msebera.android.httpclient.conn;

import p042cz.msebera.android.httpclient.HttpConnection;
import p042cz.msebera.android.httpclient.config.ConnectionConfig;

/* renamed from: cz.msebera.android.httpclient.conn.HttpConnectionFactory */
public interface HttpConnectionFactory<T, C extends HttpConnection> {
    C create(T t, ConnectionConfig connectionConfig);
}
