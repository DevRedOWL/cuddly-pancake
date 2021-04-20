package com.yandex.metrica.impl.p039ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import com.yandex.browser.crashreports.C3067a;
import com.yandex.metrica.C3086a;
import com.yandex.metrica.C4297j;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.ax */
public class C3152ax extends C3723n implements C3159ba {

    /* renamed from: f */
    private static final C4289yk<String> f2605f = new C4285yg(new C4283ye("Deeplink"));
    @Deprecated

    /* renamed from: g */
    private static final C4289yk<String> f2606g = new C4285yg(new C4283ye("Referral url"));

    /* renamed from: h */
    private final C3086a f2607h;

    /* renamed from: i */
    private final C4028sg f2608i;

    /* renamed from: j */
    private final C4297j f2609j;

    /* renamed from: k */
    private final C4135uf f2610k;

    /* renamed from: l */
    private C3067a f2611l;

    /* renamed from: m */
    private final AtomicBoolean f2612m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C3346dq f2613n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3152ax(android.content.Context r14, com.yandex.metrica.impl.p039ob.C3370ee r15, com.yandex.metrica.C4297j r16, com.yandex.metrica.impl.p039ob.C3251cd r17, com.yandex.metrica.impl.p039ob.C4135uf r18, com.yandex.metrica.impl.p039ob.C3248cb r19, com.yandex.metrica.impl.p039ob.C3248cb r20) {
        /*
            r13 = this;
            r1 = r14
            r2 = r16
            com.yandex.metrica.impl.ob.bz r4 = new com.yandex.metrica.impl.ob.bz
            com.yandex.metrica.CounterConfiguration r0 = new com.yandex.metrica.CounterConfiguration
            r0.<init>((com.yandex.metrica.C4297j) r2)
            r3 = r15
            r4.<init>(r15, r0)
            com.yandex.metrica.a r5 = new com.yandex.metrica.a
            java.lang.Integer r0 = r2.sessionTimeout
            if (r0 != 0) goto L_0x001d
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r6 = 10
            long r6 = r0.toMillis(r6)
            goto L_0x0024
        L_0x001d:
            java.lang.Integer r0 = r2.sessionTimeout
            int r0 = r0.intValue()
            long r6 = (long) r0
        L_0x0024:
            r5.<init>(r6)
            com.yandex.metrica.impl.ob.sg r6 = new com.yandex.metrica.impl.ob.sg
            r6.<init>(r14)
            com.yandex.metrica.impl.ob.av r8 = new com.yandex.metrica.impl.ob.av
            r8.<init>()
            com.yandex.metrica.impl.ob.xh r11 = com.yandex.metrica.impl.p039ob.C3320db.m2945a()
            com.yandex.metrica.impl.ob.ag r12 = new com.yandex.metrica.impl.ob.ag
            r12.<init>(r14)
            r0 = r13
            r1 = r14
            r2 = r16
            r3 = r17
            r7 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3152ax.<init>(android.content.Context, com.yandex.metrica.impl.ob.ee, com.yandex.metrica.j, com.yandex.metrica.impl.ob.cd, com.yandex.metrica.impl.ob.uf, com.yandex.metrica.impl.ob.cb, com.yandex.metrica.impl.ob.cb):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3152ax(Context context, C4297j jVar, C3251cd cdVar, C3245bz bzVar, C3086a aVar, C4028sg sgVar, C4135uf ufVar, C3149av avVar, C3248cb cbVar, C3248cb cbVar2, C4257xh xhVar, C3127ag agVar) {
        super(context, cdVar, bzVar, agVar);
        C4297j jVar2 = jVar;
        Context context2 = context;
        this.f2612m = new AtomicBoolean(false);
        this.f2613n = new C3346dq();
        this.f3831b.mo39745a(new C3222bu(jVar2.preloadInfo, this.f3832c));
        this.f2607h = aVar;
        this.f2608i = sgVar;
        this.f2609j = jVar2;
        this.f2610k = ufVar;
        boolean a = C4232wk.m6040a(jVar2.nativeCrashReporting, true);
        this.f3834e.mo39784a(a, this.f3831b);
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41681a("Set report native crashes enabled: %b", Boolean.valueOf(a));
        }
        C4028sg sgVar2 = this.f2608i;
        C4297j jVar3 = this.f2609j;
        sgVar2.mo41266a(aVar, jVar3, jVar3.f5370m, ufVar.mo41548b(), this.f3832c);
        this.f2611l = m2077a(xhVar, avVar, cbVar, cbVar2);
        if (C4196vi.m5861a(jVar2.f5369l)) {
            mo39540g();
        }
    }

    public void reportError(String str, Throwable th) {
        super.reportError(str, th);
    }

    /* renamed from: g */
    public final void mo39540g() {
        if (this.f2612m.compareAndSet(false, true)) {
            this.f2611l.mo39204a();
        }
    }

    /* renamed from: a */
    public void mo39532a(Activity activity) {
        if (activity != null) {
            if (activity.getIntent() != null) {
                String dataString = activity.getIntent().getDataString();
                if (!TextUtils.isEmpty(dataString)) {
                    this.f3834e.mo39775a(C3125af.m1964g(dataString, this.f3832c), this.f3831b);
                }
                m2080g(dataString);
            }
        } else if (this.f3832c.mo41688c()) {
            this.f3832c.mo41684b("Null activity parameter for reportAppOpen(Activity)");
        }
    }

    /* renamed from: g */
    private void m2080g(String str) {
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41680a("App opened " + " via deeplink: " + mo40668d(str));
        }
    }

    /* renamed from: e */
    public void mo39538e(String str) {
        f2605f.mo40671a(str);
        this.f3834e.mo39775a(C3125af.m1964g(str, this.f3832c), this.f3831b);
        m2080g(str);
    }

    @Deprecated
    /* renamed from: f */
    public void mo39539f(String str) {
        f2606g.mo40671a(str);
        this.f3834e.mo39775a(C3125af.m1965h(str, this.f3832c), this.f3831b);
        m2081h(str);
    }

    @Deprecated
    /* renamed from: h */
    private void m2081h(String str) {
        if (this.f3832c.mo41688c()) {
            this.f3832c.mo41680a("Referral URL received: " + mo40668d(str));
        }
    }

    /* renamed from: a */
    public void mo39533a(Application application, C4257xh xhVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            if (this.f3832c.mo41688c()) {
                this.f3832c.mo41680a("Enable activity auto tracking");
            }
            m2079b(application, xhVar);
        } else if (this.f3832c.mo41688c()) {
            this.f3832c.mo41684b("Could not enable activity auto tracking. API level should be more than 14 (ICE_CREAM_SANDWICH)");
        }
    }

    /* renamed from: b */
    private void m2079b(Application application, C4257xh xhVar) {
        application.registerActivityLifecycleCallbacks(new C4294z(this, xhVar));
    }

    /* renamed from: b */
    public void mo39535b(Activity activity) {
        mo40658a(mo39537d(activity));
        this.f2607h.mo39344a();
    }

    /* renamed from: c */
    public void mo39536c(Activity activity) {
        mo40661b(mo39537d(activity));
        this.f2607h.mo39345b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo39537d(Activity activity) {
        if (activity != null) {
            return activity.getClass().getSimpleName();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39534a(C4297j jVar, boolean z) {
        if (z) {
            mo40660b();
        }
        mo40663b(jVar.f5366i);
        mo40659a(jVar.f5365h);
    }

    /* renamed from: a */
    public void mo39447a(Location location) {
        this.f3831b.mo39947h().mo39223a(location);
        if (this.f3832c.mo41688c()) {
            C4216vz vzVar = this.f3832c;
            vzVar.mo41681a("Set location: %s" + location.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo39449a(boolean z) {
        this.f3831b.mo39947h().mo39227a(z);
    }

    /* renamed from: a */
    private C3067a m2077a(C4257xh xhVar, C3149av avVar, C3248cb cbVar, C3248cb cbVar2) {
        final C4257xh xhVar2 = xhVar;
        final C3149av avVar2 = avVar;
        final C3248cb cbVar3 = cbVar;
        final C3248cb cbVar4 = cbVar2;
        return new C3067a(new C3067a.C3069a() {
            /* renamed from: a */
            public void mo39207a() {
                final C3599kg a = C3152ax.this.f2613n.mo39920a();
                xhVar2.mo41808a((Runnable) new Runnable() {
                    public void run() {
                        C3152ax.this.mo39498a(a);
                        if (avVar2.mo39528a(a.f3541a.f3554f)) {
                            cbVar3.mo39759a().mo39498a(a);
                        }
                        if (avVar2.mo39529b(a.f3541a.f3554f)) {
                            cbVar4.mo39759a().mo39498a(a);
                        }
                    }
                });
            }
        });
    }
}
