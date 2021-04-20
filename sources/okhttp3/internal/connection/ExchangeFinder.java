package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010J0\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0010H\u0002J8\u0010%\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\u0006\u0010&\u001a\u00020\u0010J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010'\u001a\u00020\u0010H\u0002J\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, mo51343d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "transmitter", "Lokhttp3/internal/connection/Transmitter;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "address", "Lokhttp3/Address;", "call", "Lokhttp3/Call;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/internal/connection/Transmitter;Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/Call;Lokhttp3/EventListener;)V", "connectingConnection", "Lokhttp3/internal/connection/RealConnection;", "hasStreamFailure", "", "nextRouteToTry", "Lokhttp3/Route;", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "find", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "chain", "Lokhttp3/Interceptor$Chain;", "doExtensiveHealthChecks", "findConnection", "connectTimeout", "", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", "findHealthyConnection", "hasRouteToTry", "retryCurrentRoute", "trackFailure", "", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: ExchangeFinder.kt */
public final class ExchangeFinder {
    private final Address address;
    private final Call call;
    private RealConnection connectingConnection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener;
    private boolean hasStreamFailure;
    private Route nextRouteToTry;
    private RouteSelector.Selection routeSelection;
    private final RouteSelector routeSelector = new RouteSelector(this.address, this.connectionPool.getRouteDatabase(), this.call, this.eventListener);
    private final Transmitter transmitter;

    public ExchangeFinder(Transmitter transmitter2, RealConnectionPool realConnectionPool, Address address2, Call call2, EventListener eventListener2) {
        Intrinsics.checkParameterIsNotNull(transmitter2, "transmitter");
        Intrinsics.checkParameterIsNotNull(realConnectionPool, "connectionPool");
        Intrinsics.checkParameterIsNotNull(address2, Contact.Type.address);
        Intrinsics.checkParameterIsNotNull(call2, "call");
        Intrinsics.checkParameterIsNotNull(eventListener2, "eventListener");
        this.transmitter = transmitter2;
        this.connectionPool = realConnectionPool;
        this.address = address2;
        this.call = call2;
        this.eventListener = eventListener2;
    }

    public final ExchangeCodec find(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z) {
        Intrinsics.checkParameterIsNotNull(okHttpClient, "client");
        Intrinsics.checkParameterIsNotNull(chain, "chain");
        try {
            return findHealthyConnection(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z).newCodec$okhttp(okHttpClient, chain);
        } catch (RouteException e) {
            trackFailure();
            throw e;
        } catch (IOException e2) {
            trackFailure();
            throw new RouteException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.isHealthy(r9) != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.connection.RealConnection findHealthyConnection(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.internal.connection.RealConnection r0 = r3.findConnection(r4, r5, r6, r7, r8)
            okhttp3.internal.connection.RealConnectionPool r1 = r3.connectionPool
            monitor-enter(r1)
            int r2 = r0.getSuccessCount$okhttp()     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)
            return r0
        L_0x000f:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x001d }
            monitor-exit(r1)
            boolean r1 = r0.isHealthy(r9)
            if (r1 != 0) goto L_0x001c
            r0.noNewExchanges()
            goto L_0x0000
        L_0x001c:
            return r0
        L_0x001d:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findHealthyConnection(int, int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    private final okhttp3.internal.connection.RealConnection findConnection(int r19, int r20, int r21, int r22, boolean r23) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            r0 = 0
            r2 = r0
            okhttp3.internal.connection.RealConnection r2 = (okhttp3.internal.connection.RealConnection) r2
            r3 = r0
            okhttp3.Route r3 = (okhttp3.Route) r3
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            okhttp3.internal.connection.RealConnectionPool r5 = r1.connectionPool
            monitor-enter(r5)
            okhttp3.internal.connection.Transmitter r6 = r1.transmitter     // Catch:{ all -> 0x01f5 }
            boolean r6 = r6.isCanceled()     // Catch:{ all -> 0x01f5 }
            if (r6 != 0) goto L_0x01eb
            r6 = 0
            r1.hasStreamFailure = r6     // Catch:{ all -> 0x01f5 }
            okhttp3.internal.connection.Transmitter r7 = r1.transmitter     // Catch:{ all -> 0x01f5 }
            okhttp3.internal.connection.RealConnection r7 = r7.getConnection()     // Catch:{ all -> 0x01f5 }
            r4.element = r7     // Catch:{ all -> 0x01f5 }
            okhttp3.internal.connection.Transmitter r7 = r1.transmitter     // Catch:{ all -> 0x01f5 }
            okhttp3.internal.connection.RealConnection r7 = r7.getConnection()     // Catch:{ all -> 0x01f5 }
            if (r7 == 0) goto L_0x0044
            okhttp3.internal.connection.Transmitter r7 = r1.transmitter     // Catch:{ all -> 0x01f5 }
            okhttp3.internal.connection.RealConnection r7 = r7.getConnection()     // Catch:{ all -> 0x01f5 }
            if (r7 != 0) goto L_0x0037
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01f5 }
        L_0x0037:
            boolean r7 = r7.getNoNewExchanges()     // Catch:{ all -> 0x01f5 }
            if (r7 == 0) goto L_0x0044
            okhttp3.internal.connection.Transmitter r7 = r1.transmitter     // Catch:{ all -> 0x01f5 }
            java.net.Socket r7 = r7.releaseConnectionNoEvents()     // Catch:{ all -> 0x01f5 }
            goto L_0x0045
        L_0x0044:
            r7 = r0
        L_0x0045:
            okhttp3.internal.connection.Transmitter r8 = r1.transmitter     // Catch:{ all -> 0x01f5 }
            okhttp3.internal.connection.RealConnection r8 = r8.getConnection()     // Catch:{ all -> 0x01f5 }
            if (r8 == 0) goto L_0x0058
            okhttp3.internal.connection.Transmitter r2 = r1.transmitter     // Catch:{ all -> 0x01f5 }
            okhttp3.internal.connection.RealConnection r2 = r2.getConnection()     // Catch:{ all -> 0x01f5 }
            r8 = r0
            okhttp3.internal.connection.RealConnection r8 = (okhttp3.internal.connection.RealConnection) r8     // Catch:{ all -> 0x01f5 }
            r4.element = r8     // Catch:{ all -> 0x01f5 }
        L_0x0058:
            r8 = 1
            if (r2 != 0) goto L_0x0091
            okhttp3.internal.connection.RealConnectionPool r9 = r1.connectionPool     // Catch:{ all -> 0x01f5 }
            okhttp3.Address r10 = r1.address     // Catch:{ all -> 0x01f5 }
            okhttp3.internal.connection.Transmitter r11 = r1.transmitter     // Catch:{ all -> 0x01f5 }
            boolean r9 = r9.transmitterAcquirePooledConnection(r10, r11, r0, r6)     // Catch:{ all -> 0x01f5 }
            if (r9 == 0) goto L_0x0070
            okhttp3.internal.connection.Transmitter r2 = r1.transmitter     // Catch:{ all -> 0x01f5 }
            okhttp3.internal.connection.RealConnection r2 = r2.getConnection()     // Catch:{ all -> 0x01f5 }
            r9 = r3
            r3 = 1
            goto L_0x0093
        L_0x0070:
            okhttp3.Route r9 = r1.nextRouteToTry     // Catch:{ all -> 0x01f5 }
            if (r9 == 0) goto L_0x007c
            okhttp3.Route r3 = r1.nextRouteToTry     // Catch:{ all -> 0x01f5 }
            r9 = r0
            okhttp3.Route r9 = (okhttp3.Route) r9     // Catch:{ all -> 0x01f5 }
            r1.nextRouteToTry = r9     // Catch:{ all -> 0x01f5 }
            goto L_0x0091
        L_0x007c:
            boolean r9 = r18.retryCurrentRoute()     // Catch:{ all -> 0x01f5 }
            if (r9 == 0) goto L_0x0091
            okhttp3.internal.connection.Transmitter r3 = r1.transmitter     // Catch:{ all -> 0x01f5 }
            okhttp3.internal.connection.RealConnection r3 = r3.getConnection()     // Catch:{ all -> 0x01f5 }
            if (r3 != 0) goto L_0x008d
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01f5 }
        L_0x008d:
            okhttp3.Route r3 = r3.route()     // Catch:{ all -> 0x01f5 }
        L_0x0091:
            r9 = r3
            r3 = 0
        L_0x0093:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01f5 }
            monitor-exit(r5)
            if (r7 == 0) goto L_0x009b
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r7)
        L_0x009b:
            T r5 = r4.element
            okhttp3.internal.connection.RealConnection r5 = (okhttp3.internal.connection.RealConnection) r5
            if (r5 == 0) goto L_0x00b3
            okhttp3.EventListener r5 = r1.eventListener
            okhttp3.Call r7 = r1.call
            T r4 = r4.element
            okhttp3.internal.connection.RealConnection r4 = (okhttp3.internal.connection.RealConnection) r4
            if (r4 != 0) goto L_0x00ae
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00ae:
            okhttp3.Connection r4 = (okhttp3.Connection) r4
            r5.connectionReleased(r7, r4)
        L_0x00b3:
            if (r3 == 0) goto L_0x00c4
            okhttp3.EventListener r4 = r1.eventListener
            okhttp3.Call r5 = r1.call
            if (r2 != 0) goto L_0x00be
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00be:
            r7 = r2
            okhttp3.Connection r7 = (okhttp3.Connection) r7
            r4.connectionAcquired(r5, r7)
        L_0x00c4:
            if (r2 == 0) goto L_0x00cc
            if (r2 != 0) goto L_0x00cb
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00cb:
            return r2
        L_0x00cc:
            if (r9 != 0) goto L_0x00e7
            okhttp3.internal.connection.RouteSelector$Selection r4 = r1.routeSelection
            if (r4 == 0) goto L_0x00dd
            if (r4 != 0) goto L_0x00d7
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00d7:
            boolean r4 = r4.hasNext()
            if (r4 != 0) goto L_0x00e7
        L_0x00dd:
            okhttp3.internal.connection.RouteSelector r4 = r1.routeSelector
            okhttp3.internal.connection.RouteSelector$Selection r4 = r4.next()
            r1.routeSelection = r4
            r4 = 1
            goto L_0x00e8
        L_0x00e7:
            r4 = 0
        L_0x00e8:
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            okhttp3.internal.connection.RealConnectionPool r7 = r1.connectionPool
            monitor-enter(r7)
            okhttp3.internal.connection.Transmitter r10 = r1.transmitter     // Catch:{ all -> 0x01e8 }
            boolean r10 = r10.isCanceled()     // Catch:{ all -> 0x01e8 }
            if (r10 != 0) goto L_0x01de
            if (r4 == 0) goto L_0x0116
            okhttp3.internal.connection.RouteSelector$Selection r4 = r1.routeSelection     // Catch:{ all -> 0x01e8 }
            if (r4 != 0) goto L_0x00ff
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01e8 }
        L_0x00ff:
            java.util.List r5 = r4.getRoutes()     // Catch:{ all -> 0x01e8 }
            okhttp3.internal.connection.RealConnectionPool r4 = r1.connectionPool     // Catch:{ all -> 0x01e8 }
            okhttp3.Address r10 = r1.address     // Catch:{ all -> 0x01e8 }
            okhttp3.internal.connection.Transmitter r11 = r1.transmitter     // Catch:{ all -> 0x01e8 }
            boolean r4 = r4.transmitterAcquirePooledConnection(r10, r11, r5, r6)     // Catch:{ all -> 0x01e8 }
            if (r4 == 0) goto L_0x0116
            okhttp3.internal.connection.Transmitter r2 = r1.transmitter     // Catch:{ all -> 0x01e8 }
            okhttp3.internal.connection.RealConnection r2 = r2.getConnection()     // Catch:{ all -> 0x01e8 }
            r3 = 1
        L_0x0116:
            if (r3 != 0) goto L_0x0133
            if (r9 != 0) goto L_0x0125
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.routeSelection     // Catch:{ all -> 0x01e8 }
            if (r2 != 0) goto L_0x0121
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01e8 }
        L_0x0121:
            okhttp3.Route r9 = r2.next()     // Catch:{ all -> 0x01e8 }
        L_0x0125:
            okhttp3.internal.connection.RealConnection r2 = new okhttp3.internal.connection.RealConnection     // Catch:{ all -> 0x01e8 }
            okhttp3.internal.connection.RealConnectionPool r4 = r1.connectionPool     // Catch:{ all -> 0x01e8 }
            if (r9 != 0) goto L_0x012e
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01e8 }
        L_0x012e:
            r2.<init>(r4, r9)     // Catch:{ all -> 0x01e8 }
            r1.connectingConnection = r2     // Catch:{ all -> 0x01e8 }
        L_0x0133:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01e8 }
            monitor-exit(r7)
            if (r3 == 0) goto L_0x014d
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.Call r3 = r1.call
            if (r2 != 0) goto L_0x0141
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0141:
            r4 = r2
            okhttp3.Connection r4 = (okhttp3.Connection) r4
            r0.connectionAcquired(r3, r4)
            if (r2 != 0) goto L_0x014c
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x014c:
            return r2
        L_0x014d:
            if (r2 != 0) goto L_0x0152
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0152:
            okhttp3.Call r3 = r1.call
            okhttp3.EventListener r4 = r1.eventListener
            r10 = r2
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r3
            r17 = r4
            r10.connect(r11, r12, r13, r14, r15, r16, r17)
            okhttp3.internal.connection.RealConnectionPool r3 = r1.connectionPool
            okhttp3.internal.connection.RouteDatabase r3 = r3.getRouteDatabase()
            if (r2 != 0) goto L_0x0173
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0173:
            okhttp3.Route r4 = r2.route()
            r3.connected(r4)
            r3 = r0
            java.net.Socket r3 = (java.net.Socket) r3
            okhttp3.internal.connection.RealConnectionPool r4 = r1.connectionPool
            monitor-enter(r4)
            okhttp3.internal.connection.RealConnection r0 = (okhttp3.internal.connection.RealConnection) r0     // Catch:{ all -> 0x01db }
            r1.connectingConnection = r0     // Catch:{ all -> 0x01db }
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch:{ all -> 0x01db }
            okhttp3.Address r6 = r1.address     // Catch:{ all -> 0x01db }
            okhttp3.internal.connection.Transmitter r7 = r1.transmitter     // Catch:{ all -> 0x01db }
            boolean r0 = r0.transmitterAcquirePooledConnection(r6, r7, r5, r8)     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x01aa
            if (r2 != 0) goto L_0x0195
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01db }
        L_0x0195:
            r2.setNoNewExchanges(r8)     // Catch:{ all -> 0x01db }
            if (r2 != 0) goto L_0x019d
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01db }
        L_0x019d:
            java.net.Socket r3 = r2.socket()     // Catch:{ all -> 0x01db }
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter     // Catch:{ all -> 0x01db }
            okhttp3.internal.connection.RealConnection r2 = r0.getConnection()     // Catch:{ all -> 0x01db }
            r1.nextRouteToTry = r9     // Catch:{ all -> 0x01db }
            goto L_0x01be
        L_0x01aa:
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch:{ all -> 0x01db }
            if (r2 != 0) goto L_0x01b1
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01db }
        L_0x01b1:
            r0.put(r2)     // Catch:{ all -> 0x01db }
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter     // Catch:{ all -> 0x01db }
            if (r2 != 0) goto L_0x01bb
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x01db }
        L_0x01bb:
            r0.acquireConnectionNoEvents(r2)     // Catch:{ all -> 0x01db }
        L_0x01be:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01db }
            monitor-exit(r4)
            if (r3 == 0) goto L_0x01c6
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r3)
        L_0x01c6:
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.Call r3 = r1.call
            if (r2 != 0) goto L_0x01cf
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01cf:
            r4 = r2
            okhttp3.Connection r4 = (okhttp3.Connection) r4
            r0.connectionAcquired(r3, r4)
            if (r2 != 0) goto L_0x01da
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01da:
            return r2
        L_0x01db:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01de:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01e8 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x01e8 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01e8 }
            throw r0     // Catch:{ all -> 0x01e8 }
        L_0x01e8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x01eb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01f5 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x01f5 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01f5 }
            throw r0     // Catch:{ all -> 0x01f5 }
        L_0x01f5:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findConnection(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final RealConnection connectingConnection() {
        boolean holdsLock = Thread.holdsLock(this.connectionPool);
        if (!_Assertions.ENABLED || holdsLock) {
            return this.connectingConnection;
        }
        throw new AssertionError("Assertion failed");
    }

    public final void trackFailure() {
        boolean z = !Thread.holdsLock(this.connectionPool);
        if (!_Assertions.ENABLED || z) {
            synchronized (this.connectionPool) {
                this.hasStreamFailure = true;
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public final boolean hasStreamFailure() {
        boolean z;
        synchronized (this.connectionPool) {
            z = this.hasStreamFailure;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasRouteToTry() {
        /*
            r4 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r4.connectionPool
            monitor-enter(r0)
            okhttp3.Route r1 = r4.nextRouteToTry     // Catch:{ all -> 0x003c }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)
            return r2
        L_0x000a:
            boolean r1 = r4.retryCurrentRoute()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0023
            okhttp3.internal.connection.Transmitter r1 = r4.transmitter     // Catch:{ all -> 0x003c }
            okhttp3.internal.connection.RealConnection r1 = r1.getConnection()     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x001b
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x003c }
        L_0x001b:
            okhttp3.Route r1 = r1.route()     // Catch:{ all -> 0x003c }
            r4.nextRouteToTry = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r0)
            return r2
        L_0x0023:
            okhttp3.internal.connection.RouteSelector$Selection r1 = r4.routeSelection     // Catch:{ all -> 0x003c }
            r3 = 0
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.hasNext()     // Catch:{ all -> 0x003c }
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 != 0) goto L_0x003a
            okhttp3.internal.connection.RouteSelector r1 = r4.routeSelector     // Catch:{ all -> 0x003c }
            boolean r1 = r1.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            monitor-exit(r0)
            return r2
        L_0x003c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.hasRouteToTry():boolean");
    }

    private final boolean retryCurrentRoute() {
        if (this.transmitter.getConnection() != null) {
            RealConnection connection = this.transmitter.getConnection();
            if (connection == null) {
                Intrinsics.throwNpe();
            }
            if (connection.getRouteFailureCount$okhttp() == 0) {
                RealConnection connection2 = this.transmitter.getConnection();
                if (connection2 == null) {
                    Intrinsics.throwNpe();
                }
                if (Util.canReuseConnectionFor(connection2.route().address().url(), this.address.url())) {
                    return true;
                }
            }
        }
        return false;
    }
}
