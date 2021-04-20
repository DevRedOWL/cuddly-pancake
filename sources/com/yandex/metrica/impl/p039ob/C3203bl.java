package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.bl */
public class C3203bl extends C4261xl {

    /* renamed from: a */
    private final Executor f2708a;

    /* renamed from: b */
    private Executor f2709b;

    /* renamed from: c */
    private final BlockingQueue<C3205a> f2710c = new LinkedBlockingQueue();

    /* renamed from: d */
    private final Object f2711d = new Object();

    /* renamed from: e */
    private final Object f2712e = new Object();

    /* renamed from: f */
    private volatile C3205a f2713f;

    /* renamed from: g */
    private C3821pi f2714g;

    /* renamed from: h */
    private String f2715h;

    public C3203bl(Context context, C3379ek ekVar, Executor executor) {
        this.f2708a = executor;
        this.f2709b = new C4253xd();
        this.f2715h = String.format(Locale.US, "[%s:%s]", new Object[]{"NetworkTaskQueue", ekVar.toString()});
        this.f2714g = new C3821pi(context);
    }

    /* renamed from: a */
    public void mo39641a(C3208bo boVar) {
        synchronized (this.f2711d) {
            C3205a aVar = new C3205a(boVar);
            if (!m2326a(aVar)) {
                aVar.f2716a.mo39650C();
                this.f2710c.offer(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo39640a() {
        synchronized (this.f2712e) {
            C3205a aVar = this.f2713f;
            if (aVar != null) {
                aVar.f2716a.mo39688w();
                aVar.f2716a.mo39651D();
            }
            while (!this.f2710c.isEmpty()) {
                try {
                    this.f2710c.take().f2716a.mo39651D();
                } catch (InterruptedException unused) {
                }
            }
            mo41814b();
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void run() {
        /*
            r4 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r4.mo41813c()
            if (r2 == 0) goto L_0x0056
            java.lang.Object r2 = r4.f2712e     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            java.util.concurrent.BlockingQueue<com.yandex.metrica.impl.ob.bl$a> r2 = r4.f2710c     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            java.lang.Object r2 = r2.take()     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            com.yandex.metrica.impl.ob.bl$a r2 = (com.yandex.metrica.impl.p039ob.C3203bl.C3205a) r2     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            r4.f2713f = r2     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            com.yandex.metrica.impl.ob.bl$a r2 = r4.f2713f     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            com.yandex.metrica.impl.ob.bo r1 = r2.f2716a     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            java.util.concurrent.Executor r2 = r4.mo39643c(r1)     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            com.yandex.metrica.impl.ob.br r3 = r4.mo39642b(r1)     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            r2.execute(r3)     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
            java.lang.Object r2 = r4.f2712e
            monitor-enter(r2)
            r4.f2713f = r0     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x002f
            r1.mo39651D()     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            goto L_0x0002
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            throw r0
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r3     // Catch:{ InterruptedException -> 0x0047, all -> 0x0037 }
        L_0x0037:
            r2 = move-exception
            java.lang.Object r3 = r4.f2712e
            monitor-enter(r3)
            r4.f2713f = r0     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0042
            r1.mo39651D()     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r3)     // Catch:{ all -> 0x0044 }
            throw r2
        L_0x0044:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0044 }
            throw r0
        L_0x0047:
            java.lang.Object r2 = r4.f2712e
            monitor-enter(r2)
            r4.f2713f = r0     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0051
            r1.mo39651D()     // Catch:{ all -> 0x0053 }
        L_0x0051:
            monitor-exit(r2)     // Catch:{ all -> 0x0053 }
            goto L_0x0002
        L_0x0053:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0053 }
            throw r0
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3203bl.run():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3211br mo39642b(C3208bo boVar) {
        return new C3211br(this.f2714g, boVar, this, this.f2715h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Executor mo39643c(C3208bo boVar) {
        if (boVar.mo39680o()) {
            return this.f2708a;
        }
        return this.f2709b;
    }

    /* renamed from: a */
    private boolean m2326a(C3205a aVar) {
        return this.f2710c.contains(aVar) || aVar.equals(this.f2713f);
    }

    /* renamed from: com.yandex.metrica.impl.ob.bl$a */
    private static class C3205a {

        /* renamed from: a */
        final C3208bo f2716a;

        /* renamed from: b */
        private final String f2717b;

        private C3205a(C3208bo boVar) {
            this.f2716a = boVar;
            this.f2717b = boVar.mo39679n();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f2717b.equals(((C3205a) obj).f2717b);
        }

        public int hashCode() {
            return this.f2717b.hashCode();
        }
    }
}
