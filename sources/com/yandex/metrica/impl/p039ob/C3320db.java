package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3090c;
import com.yandex.metrica.C3091d;
import com.yandex.metrica.C3093f;
import com.yandex.metrica.C4297j;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.impl.p038ac.C3098a;
import com.yandex.metrica.impl.p039ob.C3601ki;
import com.yandex.metrica.impl.p039ob.C4211vv;
import com.yandex.metrica.impl.p039ob.C4248x;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.db */
public class C3320db implements C4248x.C4249a {

    /* renamed from: a */
    private static C3320db f3009a;

    /* renamed from: b */
    private static C3116aa f3010b = new C3116aa();

    /* renamed from: c */
    private static volatile boolean f3011c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> f3012d = new EnumMap<>(IIdentifierCallback.Reason.class);

    /* renamed from: e */
    private static C4255xf f3013e = new C4255xf();

    /* renamed from: f */
    private final Context f3014f;

    /* renamed from: g */
    private final C3247ca f3015g;

    /* renamed from: h */
    private C3152ax f3016h;

    /* renamed from: i */
    private C3195bh f3017i;

    /* renamed from: j */
    private final C4135uf f3018j;

    /* renamed from: k */
    private final C3237bx f3019k;

    /* renamed from: l */
    private C3601ki f3020l;

    /* renamed from: m */
    private final C3370ee f3021m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public IIdentifierCallback f3022n;

    /* renamed from: o */
    private C3251cd f3023o = new C3251cd(this.f3021m, this.f3014f, m2960k().mo41803b());

    /* renamed from: p */
    private C4065t f3024p;

    static {
        f3012d.put(IIdentifierCallback.Reason.UNKNOWN, AppMetricaDeviceIDListener.Reason.UNKNOWN);
        f3012d.put(IIdentifierCallback.Reason.INVALID_RESPONSE, AppMetricaDeviceIDListener.Reason.INVALID_RESPONSE);
        f3012d.put(IIdentifierCallback.Reason.NETWORK, AppMetricaDeviceIDListener.Reason.NETWORK);
    }

    private C3320db(Context context) {
        this.f3014f = context.getApplicationContext();
        C3630lf f = C3628ld.m3815a(this.f3014f).mo40444f();
        C4216vz.m5909a(context.getApplicationContext());
        C3266ci.m2612a();
        C3098a.m1843b().mo39392a(this.f3014f);
        Handler a = m2960k().mo41803b().mo41806a();
        this.f3021m = new C3370ee(this.f3014f, (ResultReceiver) new C4248x(a, this));
        C3687lv lvVar = new C3687lv(f);
        f3010b.mo39448a(this.f3023o);
        new C3994s(lvVar).mo39629a(this.f3014f);
        this.f3018j = new C4135uf(this.f3023o, lvVar, a);
        this.f3023o.mo39774a((C4139ug) this.f3018j);
        this.f3019k = new C3237bx(this.f3023o, lvVar, m2960k().mo41803b());
        this.f3015g = new C3247ca(this.f3014f, this.f3021m, this.f3023o, a, this.f3018j);
        this.f3024p = new C4065t();
        this.f3024p.mo41419a();
    }

    /* renamed from: a */
    public static C4257xh m2945a() {
        return m2960k().mo41802a();
    }

    /* renamed from: a */
    public static synchronized void m2946a(Context context, C4297j jVar) {
        synchronized (C3320db.class) {
            m2953c(context, jVar);
            if (C4232wk.m6040a(jVar.crashReporting, true) && m2955d().f3017i == null) {
                m2955d().f3017i = new C3195bh(Thread.getDefaultUncaughtExceptionHandler(), context);
                Thread.setDefaultUncaughtExceptionHandler(m2955d().f3017i);
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m2951b(Context context, C4297j jVar) {
        synchronized (C3320db.class) {
            C4216vz a = C4206vr.m5906a(jVar.apiKey);
            C4203vp b = C4206vr.m5908b(jVar.apiKey);
            boolean d = f3010b.mo39452d();
            C4297j a2 = f3010b.mo39446a(jVar);
            m2953c(context, a2);
            if (f3009a.f3016h == null) {
                f3009a.m2952b(jVar);
                f3009a.f3018j.mo41544a(a);
                f3009a.m2948a(jVar);
                f3009a.f3021m.mo39949a(jVar);
                f3009a.mo39885a(a2, d);
                Log.i("AppMetrica", "Activate AppMetrica with APIKey " + C3306cx.m2866b(a2.apiKey));
                if (C4196vi.m5861a(a2.logs)) {
                    a.mo41677a();
                    b.mo41677a();
                    C4206vr.m5905a().mo41677a();
                    C4206vr.m5907b().mo41677a();
                } else {
                    a.mo41683b();
                    b.mo41683b();
                    C4206vr.m5905a().mo41683b();
                    C4206vr.m5907b().mo41683b();
                }
            } else if (a.mo41688c()) {
                a.mo41684b("Appmetrica already has been activated!");
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m2953c(Context context, C4297j jVar) {
        synchronized (C3320db.class) {
            if (f3009a == null) {
                f3009a = new C3320db(context.getApplicationContext());
                f3009a.m2962m();
            }
        }
    }

    /* renamed from: b */
    public static void m2950b() {
        f3011c = true;
    }

    /* renamed from: c */
    public static boolean m2954c() {
        return f3011c;
    }

    /* renamed from: d */
    public static synchronized C3320db m2955d() {
        C3320db dbVar;
        synchronized (C3320db.class) {
            dbVar = f3009a;
        }
        return dbVar;
    }

    /* renamed from: a */
    public static C3320db m2944a(Context context) {
        m2953c(context.getApplicationContext(), (C4297j) null);
        return m2955d();
    }

    /* renamed from: e */
    public static C3320db m2956e() {
        return m2955d();
    }

    /* renamed from: f */
    public static synchronized C3152ax m2957f() {
        C3152ax axVar;
        synchronized (C3320db.class) {
            axVar = m2955d().f3016h;
        }
        return axVar;
    }

    /* renamed from: g */
    static synchronized boolean m2958g() {
        boolean z;
        synchronized (C3320db.class) {
            z = (f3009a == null || f3009a.f3016h == null) ? false : true;
        }
        return z;
    }

    /* renamed from: m */
    private void m2962m() {
        C3145as.m2059a();
        m2960k().mo41803b().mo41808a((Runnable) new C4211vv.C4212a(this.f3014f));
    }

    /* renamed from: a */
    private void m2948a(C4297j jVar) {
        if (jVar != null) {
            this.f3018j.mo41546a(jVar.f5361d);
            this.f3018j.mo41547a(jVar.f5359b);
            this.f3018j.mo41545a(jVar.f5360c);
        }
    }

    /* renamed from: a */
    public void mo39884a(C3093f fVar) {
        this.f3015g.mo39757a(fVar);
    }

    /* renamed from: b */
    public C3091d mo39887b(C3093f fVar) {
        return this.f3015g.mo39758b(fVar);
    }

    /* renamed from: a */
    public void mo39886a(String str) {
        this.f3019k.mo39730a(str);
    }

    /* renamed from: h */
    static C3159ba m2959h() {
        return m2958g() ? m2955d().f3016h : f3010b;
    }

    /* renamed from: a */
    public static void m2947a(Location location) {
        m2959h().mo39447a(location);
    }

    /* renamed from: a */
    public static void m2949a(boolean z) {
        m2959h().mo39449a(z);
    }

    /* renamed from: b */
    public void mo39888b(boolean z) {
        m2959h().mo39449a(z);
    }

    /* renamed from: c */
    public void mo39889c(boolean z) {
        m2959h().setStatisticsSending(z);
    }

    /* renamed from: i */
    public String mo39890i() {
        return this.f3018j.mo41548b();
    }

    /* renamed from: j */
    public String mo39891j() {
        return this.f3018j.mo41540a();
    }

    /* renamed from: a */
    public void mo39883a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f3018j.mo41543a(iIdentifierCallback, list, this.f3021m.mo39956c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39885a(C4297j jVar, boolean z) {
        this.f3023o.mo39776a(jVar.locationTracking, jVar.statisticsSending);
        this.f3016h = this.f3015g.mo39756a(jVar, z);
        this.f3018j.mo41549c();
    }

    /* renamed from: a */
    public void mo39880a(int i, Bundle bundle) {
        this.f3018j.mo41541a(i, bundle);
    }

    /* renamed from: a */
    public void mo39882a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f3019k.mo39729a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void mo39881a(final AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        this.f3022n = new IIdentifierCallback() {
            public void onReceive(Map<String, String> map) {
                IIdentifierCallback unused = C3320db.this.f3022n = null;
                appMetricaDeviceIDListener.onLoaded(map.get("appmetrica_device_id_hash"));
            }

            public void onRequestError(IIdentifierCallback.Reason reason) {
                IIdentifierCallback unused = C3320db.this.f3022n = null;
                appMetricaDeviceIDListener.onError((AppMetricaDeviceIDListener.Reason) C3320db.f3012d.get(reason));
            }
        };
        this.f3018j.mo41543a(this.f3022n, (List<String>) Collections.singletonList("appmetrica_device_id_hash"), this.f3021m.mo39956c());
    }

    /* renamed from: b */
    private void m2952b(C4297j jVar) {
        C3195bh bhVar = this.f3017i;
        if (bhVar != null) {
            bhVar.mo39624a((C3601ki) new C3603kj(new C3248cb(this.f3015g, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C3601ki.C3602a() {
                /* renamed from: a */
                public boolean mo39892a(Throwable th) {
                    return C3266ci.m2613a(th);
                }
            }, (C3090c) null));
            this.f3017i.mo39624a((C3601ki) new C3603kj(new C3248cb(this.f3015g, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), new C3601ki.C3602a() {
                /* renamed from: a */
                public boolean mo39892a(Throwable th) {
                    return C3266ci.m2616b(th);
                }
            }, (C3090c) null));
            if (this.f3020l == null) {
                this.f3020l = new C3603kj(new C3248cb(this.f3015g, jVar.apiKey), new C3601ki.C3602a() {
                    /* renamed from: a */
                    public boolean mo39892a(Throwable th) {
                        return true;
                    }
                }, jVar.f5371n);
            }
            this.f3017i.mo39624a(this.f3020l);
        }
    }

    /* renamed from: k */
    public static C4255xf m2960k() {
        return f3013e;
    }
}
