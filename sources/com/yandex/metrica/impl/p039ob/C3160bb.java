package com.yandex.metrica.impl.p039ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.yandex.metrica.IMetricaService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.bb */
public class C3160bb {

    /* renamed from: a */
    public static final long f2624a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private final Context f2625b;

    /* renamed from: c */
    private final C4257xh f2626c;

    /* renamed from: d */
    private boolean f2627d;

    /* renamed from: e */
    private final List<C3163a> f2628e = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile IMetricaService f2629f = null;

    /* renamed from: g */
    private final Object f2630g = new Object();

    /* renamed from: h */
    private final Runnable f2631h = new Runnable() {
        public void run() {
            C3160bb.this.m2171i();
        }
    };

    /* renamed from: i */
    private final ServiceConnection f2632i = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IMetricaService unused = C3160bb.this.f2629f = IMetricaService.C3076a.m1745a(iBinder);
            C3160bb.this.m2172j();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            IMetricaService unused = C3160bb.this.f2629f = null;
            C3160bb.this.m2173k();
        }
    };

    /* renamed from: com.yandex.metrica.impl.ob.bb$a */
    interface C3163a {
        /* renamed from: a */
        void mo39592a();

        /* renamed from: b */
        void mo39593b();
    }

    /* renamed from: a */
    public Context mo39579a() {
        return this.f2625b;
    }

    public C3160bb(Context context, C4257xh xhVar) {
        this.f2625b = context.getApplicationContext();
        this.f2626c = xhVar;
        this.f2627d = false;
    }

    /* renamed from: b */
    public synchronized void mo39582b() {
        if (this.f2629f == null) {
            try {
                this.f2625b.bindService(C3289cn.m2654b(this.f2625b), this.f2632i, 1);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo39583c() {
        mo39581a(this.f2626c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39581a(C4257xh xhVar) {
        synchronized (this.f2630g) {
            xhVar.mo41812b(this.f2631h);
            if (!this.f2627d) {
                xhVar.mo41809a(this.f2631h, f2624a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo39584d() {
        this.f2626c.mo41812b(this.f2631h);
    }

    /* renamed from: e */
    public boolean mo39585e() {
        return this.f2629f != null;
    }

    /* renamed from: f */
    public IMetricaService mo39586f() {
        return this.f2629f;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:6|7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m2171i() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.content.Context r0 = r3.f2625b     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r3.mo39585e()     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0015
            android.content.Context r0 = r3.f2625b     // Catch:{ all -> 0x0015 }
            android.content.ServiceConnection r2 = r3.f2632i     // Catch:{ all -> 0x0015 }
            r0.unbindService(r2)     // Catch:{ all -> 0x0015 }
            r3.f2629f = r1     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r3.f2629f = r1     // Catch:{ all -> 0x001c }
            r3.m2173k()     // Catch:{ all -> 0x001c }
            monitor-exit(r3)
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3160bb.m2171i():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m2172j() {
        for (C3163a a : this.f2628e) {
            a.mo39592a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m2173k() {
        for (C3163a b : this.f2628e) {
            b.mo39593b();
        }
    }

    /* renamed from: a */
    public void mo39580a(C3163a aVar) {
        this.f2628e.add(aVar);
    }

    /* renamed from: g */
    public void mo39587g() {
        synchronized (this.f2630g) {
            this.f2627d = true;
        }
        mo39584d();
    }

    /* renamed from: h */
    public void mo39588h() {
        this.f2627d = false;
        mo39583c();
    }
}
