package p042cz.msebera.android.httpclient.impl.conn;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p042cz.msebera.android.httpclient.conn.ManagedHttpClientConnection;
import p042cz.msebera.android.httpclient.conn.routing.HttpRoute;
import p042cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import p042cz.msebera.android.httpclient.pool.AbstractConnPool;
import p042cz.msebera.android.httpclient.pool.ConnFactory;

/* renamed from: cz.msebera.android.httpclient.impl.conn.CPool */
class CPool extends AbstractConnPool<HttpRoute, ManagedHttpClientConnection, CPoolEntry> {
    private static final AtomicLong COUNTER = new AtomicLong();
    public HttpClientAndroidLog log = new HttpClientAndroidLog(CPool.class);
    private final long timeToLive;
    private final TimeUnit tunit;

    public CPool(ConnFactory<HttpRoute, ManagedHttpClientConnection> connFactory, int i, int i2, long j, TimeUnit timeUnit) {
        super(connFactory, i, i2);
        this.timeToLive = j;
        this.tunit = timeUnit;
    }

    /* access modifiers changed from: protected */
    public CPoolEntry createEntry(HttpRoute httpRoute, ManagedHttpClientConnection managedHttpClientConnection) {
        return new CPoolEntry(this.log, Long.toString(COUNTER.getAndIncrement()), httpRoute, managedHttpClientConnection, this.timeToLive, this.tunit);
    }
}
