package p042cz.msebera.android.httpclient.impl.conn;

import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p042cz.msebera.android.httpclient.conn.ClientConnectionManager;
import p042cz.msebera.android.httpclient.conn.ClientConnectionOperator;
import p042cz.msebera.android.httpclient.conn.ClientConnectionRequest;
import p042cz.msebera.android.httpclient.conn.ConnectionPoolTimeoutException;
import p042cz.msebera.android.httpclient.conn.DnsResolver;
import p042cz.msebera.android.httpclient.conn.ManagedClientConnection;
import p042cz.msebera.android.httpclient.conn.routing.HttpRoute;
import p042cz.msebera.android.httpclient.conn.scheme.SchemeRegistry;
import p042cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import p042cz.msebera.android.httpclient.pool.ConnPoolControl;
import p042cz.msebera.android.httpclient.pool.PoolStats;
import p042cz.msebera.android.httpclient.util.Args;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.conn.PoolingClientConnectionManager */
public class PoolingClientConnectionManager implements ClientConnectionManager, ConnPoolControl<HttpRoute> {
    private final DnsResolver dnsResolver;
    public HttpClientAndroidLog log;
    private final ClientConnectionOperator operator;
    private final HttpConnPool pool;
    private final SchemeRegistry schemeRegistry;

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry2) {
        this(schemeRegistry2, -1, TimeUnit.MILLISECONDS);
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry2, DnsResolver dnsResolver2) {
        this(schemeRegistry2, -1, TimeUnit.MILLISECONDS, dnsResolver2);
    }

    public PoolingClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry2, long j, TimeUnit timeUnit) {
        this(schemeRegistry2, j, timeUnit, new SystemDefaultDnsResolver());
    }

    public PoolingClientConnectionManager(SchemeRegistry schemeRegistry2, long j, TimeUnit timeUnit, DnsResolver dnsResolver2) {
        this.log = new HttpClientAndroidLog(getClass());
        Args.notNull(schemeRegistry2, "Scheme registry");
        Args.notNull(dnsResolver2, "DNS resolver");
        this.schemeRegistry = schemeRegistry2;
        this.dnsResolver = dnsResolver2;
        this.operator = createConnectionOperator(schemeRegistry2);
        this.pool = new HttpConnPool(this.log, this.operator, 2, 20, j, timeUnit);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: protected */
    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry2) {
        return new DefaultClientConnectionOperator(schemeRegistry2, this.dnsResolver);
    }

    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    private String format(HttpRoute httpRoute, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("[route: ");
        sb.append(httpRoute);
        sb.append("]");
        if (obj != null) {
            sb.append("[state: ");
            sb.append(obj);
            sb.append("]");
        }
        return sb.toString();
    }

    private String formatStats(HttpRoute httpRoute) {
        StringBuilder sb = new StringBuilder();
        PoolStats totalStats = this.pool.getTotalStats();
        PoolStats stats = this.pool.getStats(httpRoute);
        sb.append("[total kept alive: ");
        sb.append(totalStats.getAvailable());
        sb.append("; ");
        sb.append("route allocated: ");
        sb.append(stats.getLeased() + stats.getAvailable());
        sb.append(" of ");
        sb.append(stats.getMax());
        sb.append("; ");
        sb.append("total allocated: ");
        sb.append(totalStats.getLeased() + totalStats.getAvailable());
        sb.append(" of ");
        sb.append(totalStats.getMax());
        sb.append("]");
        return sb.toString();
    }

    private String format(HttpPoolEntry httpPoolEntry) {
        StringBuilder sb = new StringBuilder();
        sb.append("[id: ");
        sb.append(httpPoolEntry.getId());
        sb.append("]");
        sb.append("[route: ");
        sb.append(httpPoolEntry.getRoute());
        sb.append("]");
        Object state = httpPoolEntry.getState();
        if (state != null) {
            sb.append("[state: ");
            sb.append(state);
            sb.append("]");
        }
        return sb.toString();
    }

    public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "HTTP route");
        if (this.log.isDebugEnabled()) {
            HttpClientAndroidLog httpClientAndroidLog = this.log;
            httpClientAndroidLog.debug("Connection request: " + format(httpRoute, obj) + formatStats(httpRoute));
        }
        final Future lease = this.pool.lease(httpRoute, obj);
        return new ClientConnectionRequest() {
            public void abortRequest() {
                lease.cancel(true);
            }

            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
                return PoolingClientConnectionManager.this.leaseConnection(lease, j, timeUnit);
            }
        };
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p042cz.msebera.android.httpclient.conn.ManagedClientConnection leaseConnection(java.util.concurrent.Future<p042cz.msebera.android.httpclient.impl.conn.HttpPoolEntry> r1, long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, p042cz.msebera.android.httpclient.conn.ConnectionPoolTimeoutException {
        /*
            r0 = this;
            java.lang.Object r2 = r1.get(r2, r4)     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            cz.msebera.android.httpclient.impl.conn.HttpPoolEntry r2 = (p042cz.msebera.android.httpclient.impl.conn.HttpPoolEntry) r2     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            if (r2 == 0) goto L_0x0053
            boolean r1 = r1.isCancelled()     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            if (r1 != 0) goto L_0x0053
            java.lang.Object r1 = r2.getConnection()     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            if (r1 == 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            java.lang.String r3 = "Pool entry with no connection"
            p042cz.msebera.android.httpclient.util.Asserts.check(r1, r3)     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r1 = r0.log     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            boolean r1 = r1.isDebugEnabled()     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            if (r1 == 0) goto L_0x004b
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r1 = r0.log     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            r3.<init>()     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            java.lang.String r4 = "Connection leased: "
            r3.append(r4)     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            java.lang.String r4 = r0.format(r2)     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            r3.append(r4)     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            java.lang.Object r4 = r2.getRoute()     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            cz.msebera.android.httpclient.conn.routing.HttpRoute r4 = (p042cz.msebera.android.httpclient.conn.routing.HttpRoute) r4     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            java.lang.String r4 = r0.formatStats(r4)     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            r3.append(r4)     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            java.lang.String r3 = r3.toString()     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            r1.debug(r3)     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
        L_0x004b:
            cz.msebera.android.httpclient.impl.conn.ManagedClientConnectionImpl r1 = new cz.msebera.android.httpclient.impl.conn.ManagedClientConnectionImpl     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            cz.msebera.android.httpclient.conn.ClientConnectionOperator r3 = r0.operator     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            r1.<init>(r0, r3, r2)     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            return r1
        L_0x0053:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            r1.<init>()     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
            throw r1     // Catch:{ ExecutionException -> 0x0061, TimeoutException -> 0x0059 }
        L_0x0059:
            cz.msebera.android.httpclient.conn.ConnectionPoolTimeoutException r1 = new cz.msebera.android.httpclient.conn.ConnectionPoolTimeoutException
            java.lang.String r2 = "Timeout waiting for connection from pool"
            r1.<init>(r2)
            throw r1
        L_0x0061:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            if (r2 != 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = r2
        L_0x006a:
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r2 = r0.log
            java.lang.String r3 = "Unexpected exception leasing connection from pool"
            r2.error(r3, r1)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p042cz.msebera.android.httpclient.impl.conn.PoolingClientConnectionManager.leaseConnection(java.util.concurrent.Future, long, java.util.concurrent.TimeUnit):cz.msebera.android.httpclient.conn.ManagedClientConnection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseConnection(p042cz.msebera.android.httpclient.conn.ManagedClientConnection r5, long r6, java.util.concurrent.TimeUnit r8) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p042cz.msebera.android.httpclient.impl.conn.ManagedClientConnectionImpl
            java.lang.String r1 = "Connection class mismatch, connection not obtained from this manager"
            p042cz.msebera.android.httpclient.util.Args.check(r0, r1)
            cz.msebera.android.httpclient.impl.conn.ManagedClientConnectionImpl r5 = (p042cz.msebera.android.httpclient.impl.conn.ManagedClientConnectionImpl) r5
            cz.msebera.android.httpclient.conn.ClientConnectionManager r0 = r5.getManager()
            if (r0 != r4) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.lang.String r1 = "Connection not obtained from this manager"
            p042cz.msebera.android.httpclient.util.Asserts.check(r0, r1)
            monitor-enter(r5)
            cz.msebera.android.httpclient.impl.conn.HttpPoolEntry r0 = r5.detach()     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x0020
            monitor-exit(r5)     // Catch:{ all -> 0x00e0 }
            return
        L_0x0020:
            boolean r1 = r5.isOpen()     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x0040
            boolean r1 = r5.isMarkedReusable()     // Catch:{ all -> 0x00d5 }
            if (r1 != 0) goto L_0x0040
            r5.shutdown()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0040
        L_0x0030:
            r1 = move-exception
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r2 = r4.log     // Catch:{ all -> 0x00d5 }
            boolean r2 = r2.isDebugEnabled()     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x0040
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r2 = r4.log     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "I/O exception shutting down released connection"
            r2.debug(r3, r1)     // Catch:{ all -> 0x00d5 }
        L_0x0040:
            boolean r1 = r5.isMarkedReusable()     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x009b
            if (r8 == 0) goto L_0x004a
            r1 = r8
            goto L_0x004c
        L_0x004a:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00d5 }
        L_0x004c:
            r0.updateExpiry(r6, r1)     // Catch:{ all -> 0x00d5 }
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r1 = r4.log     // Catch:{ all -> 0x00d5 }
            boolean r1 = r1.isDebugEnabled()     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x009b
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0077
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r1.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "for "
            r1.append(r2)     // Catch:{ all -> 0x00d5 }
            r1.append(r6)     // Catch:{ all -> 0x00d5 }
            java.lang.String r6 = " "
            r1.append(r6)     // Catch:{ all -> 0x00d5 }
            r1.append(r8)     // Catch:{ all -> 0x00d5 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x00d5 }
            goto L_0x0079
        L_0x0077:
            java.lang.String r6 = "indefinitely"
        L_0x0079:
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r7 = r4.log     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r8.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "Connection "
            r8.append(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = r4.format(r0)     // Catch:{ all -> 0x00d5 }
            r8.append(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = " can be kept alive "
            r8.append(r1)     // Catch:{ all -> 0x00d5 }
            r8.append(r6)     // Catch:{ all -> 0x00d5 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x00d5 }
            r7.debug(r6)     // Catch:{ all -> 0x00d5 }
        L_0x009b:
            cz.msebera.android.httpclient.impl.conn.HttpConnPool r6 = r4.pool     // Catch:{ all -> 0x00e0 }
            boolean r7 = r5.isMarkedReusable()     // Catch:{ all -> 0x00e0 }
            r6.release(r0, (boolean) r7)     // Catch:{ all -> 0x00e0 }
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r6 = r4.log     // Catch:{ all -> 0x00e0 }
            boolean r6 = r6.isDebugEnabled()     // Catch:{ all -> 0x00e0 }
            if (r6 == 0) goto L_0x00d3
            cz.msebera.android.httpclient.extras.HttpClientAndroidLog r6 = r4.log     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r7.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r8 = "Connection released: "
            r7.append(r8)     // Catch:{ all -> 0x00e0 }
            java.lang.String r8 = r4.format(r0)     // Catch:{ all -> 0x00e0 }
            r7.append(r8)     // Catch:{ all -> 0x00e0 }
            java.lang.Object r8 = r0.getRoute()     // Catch:{ all -> 0x00e0 }
            cz.msebera.android.httpclient.conn.routing.HttpRoute r8 = (p042cz.msebera.android.httpclient.conn.routing.HttpRoute) r8     // Catch:{ all -> 0x00e0 }
            java.lang.String r8 = r4.formatStats(r8)     // Catch:{ all -> 0x00e0 }
            r7.append(r8)     // Catch:{ all -> 0x00e0 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00e0 }
            r6.debug(r7)     // Catch:{ all -> 0x00e0 }
        L_0x00d3:
            monitor-exit(r5)     // Catch:{ all -> 0x00e0 }
            return
        L_0x00d5:
            r6 = move-exception
            cz.msebera.android.httpclient.impl.conn.HttpConnPool r7 = r4.pool     // Catch:{ all -> 0x00e0 }
            boolean r8 = r5.isMarkedReusable()     // Catch:{ all -> 0x00e0 }
            r7.release(r0, (boolean) r8)     // Catch:{ all -> 0x00e0 }
            throw r6     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00e0 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p042cz.msebera.android.httpclient.impl.conn.PoolingClientConnectionManager.releaseConnection(cz.msebera.android.httpclient.conn.ManagedClientConnection, long, java.util.concurrent.TimeUnit):void");
    }

    public void shutdown() {
        this.log.debug("Connection manager is shutting down");
        try {
            this.pool.shutdown();
        } catch (IOException e) {
            this.log.debug("I/O exception shutting down connection manager", e);
        }
        this.log.debug("Connection manager shut down");
    }

    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        if (this.log.isDebugEnabled()) {
            HttpClientAndroidLog httpClientAndroidLog = this.log;
            httpClientAndroidLog.debug("Closing connections idle longer than " + j + " " + timeUnit);
        }
        this.pool.closeIdle(j, timeUnit);
    }

    public void closeExpiredConnections() {
        this.log.debug("Closing expired connections");
        this.pool.closeExpired();
    }

    public int getMaxTotal() {
        return this.pool.getMaxTotal();
    }

    public void setMaxTotal(int i) {
        this.pool.setMaxTotal(i);
    }

    public int getDefaultMaxPerRoute() {
        return this.pool.getDefaultMaxPerRoute();
    }

    public void setDefaultMaxPerRoute(int i) {
        this.pool.setDefaultMaxPerRoute(i);
    }

    public int getMaxPerRoute(HttpRoute httpRoute) {
        return this.pool.getMaxPerRoute(httpRoute);
    }

    public void setMaxPerRoute(HttpRoute httpRoute, int i) {
        this.pool.setMaxPerRoute(httpRoute, i);
    }

    public PoolStats getTotalStats() {
        return this.pool.getTotalStats();
    }

    public PoolStats getStats(HttpRoute httpRoute) {
        return this.pool.getStats(httpRoute);
    }
}
