package p042cz.msebera.android.httpclient.impl.pool;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpClientConnection;
import p042cz.msebera.android.httpclient.HttpHost;
import p042cz.msebera.android.httpclient.pool.PoolEntry;

/* renamed from: cz.msebera.android.httpclient.impl.pool.BasicPoolEntry */
public class BasicPoolEntry extends PoolEntry<HttpHost, HttpClientConnection> {
    public BasicPoolEntry(String str, HttpHost httpHost, HttpClientConnection httpClientConnection) {
        super(str, httpHost, httpClientConnection);
    }

    public void close() {
        try {
            ((HttpClientConnection) getConnection()).close();
        } catch (IOException unused) {
        }
    }

    public boolean isClosed() {
        return !((HttpClientConnection) getConnection()).isOpen();
    }
}
