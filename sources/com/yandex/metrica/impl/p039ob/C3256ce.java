package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p039ob.C3125af;
import com.yandex.metrica.impl.p039ob.C3160bb;
import com.yandex.metrica.impl.p039ob.C3869r;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.yandex.metrica.impl.ob.ce */
public class C3256ce implements C3160bb.C3163a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3140ao f2857a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3160bb f2858b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f2859c;

    /* renamed from: d */
    private final C4257xh f2860d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3128ah f2861e;

    /* renamed from: com.yandex.metrica.impl.ob.ce$c */
    public interface C3260c {
        /* renamed from: a */
        C4217w mo39791a(C4217w wVar);
    }

    /* renamed from: b */
    public void mo39593b() {
    }

    public C3256ce(C3140ao aoVar) {
        this(aoVar, C3320db.m2960k().mo41804c(), new C3128ah());
    }

    public C3256ce(C3140ao aoVar, C4257xh xhVar, C3128ah ahVar) {
        this.f2859c = new Object();
        this.f2857a = aoVar;
        this.f2860d = xhVar;
        this.f2861e = ahVar;
        this.f2858b = aoVar.mo39501a();
        this.f2858b.mo39580a((C3160bb.C3163a) this);
    }

    /* renamed from: a */
    public Future<Void> mo39792a(C3261d dVar) {
        return this.f2860d.mo41807a(dVar.mo39803c() ? new C3258a(this, dVar) : new C3259b(dVar));
    }

    /* renamed from: a */
    public void mo39592a() {
        synchronized (this.f2859c) {
            this.f2859c.notifyAll();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ce$b */
    private class C3259b implements Callable<Void> {

        /* renamed from: b */
        final C3261d f2865b;

        private C3259b(C3261d dVar) {
            this.f2865b = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r0 = r4.f2865b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
            com.yandex.metrica.impl.p039ob.C3350dr.m3043a().mo39929a((java.lang.Object) r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0033 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                r0 = 0
            L_0x0001:
                r1 = 0
                com.yandex.metrica.impl.ob.ce r2 = com.yandex.metrica.impl.p039ob.C3256ce.this     // Catch:{ all -> 0x0033 }
                com.yandex.metrica.impl.ob.bb r2 = r2.f2858b     // Catch:{ all -> 0x0033 }
                com.yandex.metrica.IMetricaService r2 = r2.mo39586f()     // Catch:{ all -> 0x0033 }
                if (r2 == 0) goto L_0x001e
                com.yandex.metrica.impl.ob.ce$d r3 = r4.f2865b     // Catch:{ all -> 0x0033 }
                boolean r2 = r4.m2592a(r2, r3)     // Catch:{ all -> 0x0033 }
                if (r2 == 0) goto L_0x001e
            L_0x0016:
                com.yandex.metrica.impl.ob.dr r0 = com.yandex.metrica.impl.p039ob.C3350dr.m3043a()
                r0.mo39929a((java.lang.Object) r4)
                return r1
            L_0x001e:
                boolean r2 = r4.mo39796b()     // Catch:{ all -> 0x0033 }
                int r0 = r0 + 1
                if (r2 == 0) goto L_0x0016
                java.util.concurrent.atomic.AtomicBoolean r2 = com.yandex.metrica.impl.p039ob.C3195bh.f2694a     // Catch:{ all -> 0x0033 }
                boolean r2 = r2.get()     // Catch:{ all -> 0x0033 }
                if (r2 != 0) goto L_0x0016
                r2 = 20
                if (r0 < r2) goto L_0x0001
                goto L_0x0016
            L_0x0033:
                com.yandex.metrica.impl.ob.ce$d r0 = r4.f2865b     // Catch:{ all -> 0x003d }
                com.yandex.metrica.impl.ob.dr r0 = com.yandex.metrica.impl.p039ob.C3350dr.m3043a()
                r0.mo39929a((java.lang.Object) r4)
                return r1
            L_0x003d:
                r0 = move-exception
                com.yandex.metrica.impl.ob.dr r1 = com.yandex.metrica.impl.p039ob.C3350dr.m3043a()
                r1.mo39929a((java.lang.Object) r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3256ce.C3259b.call():java.lang.Void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo39796b() {
            C3256ce.this.f2858b.mo39582b();
            m2593c();
            return true;
        }

        /* renamed from: a */
        private boolean m2592a(IMetricaService iMetricaService, C3261d dVar) {
            try {
                C3256ce.this.f2857a.mo39502a(iMetricaService, dVar.mo39802b(), dVar.f2868b);
                return true;
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0020 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m2593c() {
            /*
                r5 = this;
                com.yandex.metrica.impl.ob.ce r0 = com.yandex.metrica.impl.p039ob.C3256ce.this
                java.lang.Object r0 = r0.f2859c
                monitor-enter(r0)
                com.yandex.metrica.impl.ob.ce r1 = com.yandex.metrica.impl.p039ob.C3256ce.this     // Catch:{ all -> 0x002b }
                com.yandex.metrica.impl.ob.bb r1 = r1.f2858b     // Catch:{ all -> 0x002b }
                boolean r1 = r1.mo39585e()     // Catch:{ all -> 0x002b }
                if (r1 != 0) goto L_0x0029
                com.yandex.metrica.impl.ob.ce r1 = com.yandex.metrica.impl.p039ob.C3256ce.this     // Catch:{ InterruptedException -> 0x0020 }
                java.lang.Object r1 = r1.f2859c     // Catch:{ InterruptedException -> 0x0020 }
                r2 = 500(0x1f4, double:2.47E-321)
                r4 = 0
                r1.wait(r2, r4)     // Catch:{ InterruptedException -> 0x0020 }
                goto L_0x0029
            L_0x0020:
                com.yandex.metrica.impl.ob.ce r1 = com.yandex.metrica.impl.p039ob.C3256ce.this     // Catch:{ all -> 0x002b }
                java.lang.Object r1 = r1.f2859c     // Catch:{ all -> 0x002b }
                r1.notifyAll()     // Catch:{ all -> 0x002b }
            L_0x0029:
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x002b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3256ce.C3259b.m2593c():void");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ce$a */
    class C3258a extends C3259b {

        /* renamed from: d */
        private final C3595kc f2863d;

        /* renamed from: e */
        private final C4209vu f2864e;

        C3258a(C3256ce ceVar, C3261d dVar) {
            this(dVar, new C3595kc(), new C4209vu());
        }

        C3258a(C3261d dVar, C3595kc kcVar, C4209vu vuVar) {
            super(dVar);
            this.f2863d = kcVar;
            this.f2864e = vuVar;
        }

        /* renamed from: a */
        public Void call() {
            if (this.f2864e.mo41707a("Metrica")) {
                mo39795b(this.f2865b);
                return null;
            }
            C3256ce.this.f2858b.mo39583c();
            return super.call();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo39796b() {
            mo39794a(this.f2865b);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo39794a(C3261d dVar) {
            if (dVar.mo39804d().mo41744o() == 0) {
                Context b = C3256ce.this.f2857a.mo39503b();
                Intent b2 = C3289cn.m2654b(b);
                dVar.mo39804d().mo41723a(C3125af.C3126a.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.mo39462a());
                b2.putExtras(dVar.mo39804d().mo41722a(dVar.mo39798a().mo39750b()));
                try {
                    b.startService(b2);
                } catch (Throwable unused) {
                    mo39795b(dVar);
                }
            } else {
                mo39795b(dVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo39795b(C3261d dVar) {
            PrintWriter printWriter;
            File b = C3256ce.this.f2861e.mo39469b(C3256ce.this.f2858b.mo39579a());
            if (this.f2863d.mo40344a(b)) {
                C3370ee g = dVar.mo39798a().mo39946g();
                Integer e = g.mo39959e();
                String f = g.mo39960f();
                try {
                    printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(C3256ce.this.f2861e.mo39467a(b, e + "-" + f))));
                    try {
                        printWriter.write(new C3615kv(dVar.f2867a, dVar.mo39798a(), dVar.f2871e).mo40379j());
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    printWriter = null;
                }
                C3306cx.m2855a((Closeable) printWriter);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ce$d */
    public static class C3261d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C4217w f2867a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C3245bz f2868b;

        /* renamed from: c */
        private boolean f2869c = false;

        /* renamed from: d */
        private C3260c f2870d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public HashMap<C3869r.C3870a, Integer> f2871e;

        C3261d(C4217w wVar, C3245bz bzVar) {
            this.f2867a = wVar;
            this.f2868b = new C3245bz(new C3370ee(bzVar.mo39946g()), new CounterConfiguration(bzVar.mo39947h()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3261d mo39799a(C3260c cVar) {
            this.f2870d = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3261d mo39800a(HashMap<C3869r.C3870a, Integer> hashMap) {
            this.f2871e = hashMap;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3261d mo39801a(boolean z) {
            this.f2869c = z;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3245bz mo39798a() {
            return this.f2868b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C4217w mo39802b() {
            C3260c cVar = this.f2870d;
            return cVar != null ? cVar.mo39791a(this.f2867a) : this.f2867a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo39803c() {
            return this.f2869c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C4217w mo39804d() {
            return this.f2867a;
        }

        public String toString() {
            return "ReportToSend{mReport=" + this.f2867a + ", mEnvironment=" + this.f2868b + ", mCrash=" + this.f2869c + ", mAction=" + this.f2870d + ", mTrimmedFields=" + this.f2871e + '}';
        }
    }
}
