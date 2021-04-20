package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Pair;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p038ac.NativeCrashesHelper;
import com.yandex.metrica.impl.p039ob.C3125af;
import com.yandex.metrica.impl.p039ob.C3256ce;
import com.yandex.metrica.impl.p039ob.C3908rl;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.yandex.metrica.impl.ob.cd */
public class C3251cd implements C3140ao {

    /* renamed from: a */
    private final Context f2839a;

    /* renamed from: b */
    private C3160bb f2840b;

    /* renamed from: c */
    private final NativeCrashesHelper f2841c;

    /* renamed from: d */
    private C3152ax f2842d;

    /* renamed from: e */
    private final C4127u f2843e;

    /* renamed from: f */
    private C4139ug f2844f;

    /* renamed from: g */
    private final C3613kt f2845g;

    /* renamed from: h */
    private final C3607kn f2846h;

    /* renamed from: i */
    private final C3256ce f2847i;

    C3251cd(C3370ee eeVar, Context context, C4257xh xhVar) {
        this(eeVar, context, new NativeCrashesHelper(context), new C3160bb(context, xhVar), new C3613kt(), new C3607kn());
    }

    C3251cd(C3370ee eeVar, Context context, NativeCrashesHelper nativeCrashesHelper, C3160bb bbVar, C3613kt ktVar, C3607kn knVar) {
        this.f2840b = bbVar;
        this.f2839a = context;
        this.f2841c = nativeCrashesHelper;
        this.f2843e = new C4127u(eeVar);
        this.f2845g = ktVar;
        this.f2846h = knVar;
        this.f2847i = new C3256ce(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39766a(C3152ax axVar) {
        this.f2842d = axVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39774a(C4139ug ugVar) {
        this.f2844f = ugVar;
        this.f2843e.mo39751b(ugVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39784a(boolean z, C3245bz bzVar) {
        this.f2841c.mo39390a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39776a(Boolean bool, Boolean bool2) {
        if (C3306cx.m2858a((Object) bool)) {
            this.f2843e.mo39947h().mo39227a(bool.booleanValue());
        }
        if (C3306cx.m2858a((Object) bool2)) {
            this.f2843e.mo39947h().mo39247g(bool2.booleanValue());
        }
        mo39775a(C4217w.m5959t(), (C3245bz) this.f2843e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39778a(String str, C3245bz bzVar) {
        mo39775a(C3125af.m1941a(C3125af.C3126a.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH, str, m2546c(bzVar)), bzVar);
    }

    /* renamed from: c */
    public void mo39789c() {
        this.f2840b.mo39587g();
    }

    /* renamed from: d */
    public void mo39790d() {
        this.f2840b.mo39588h();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C4217w m2544b(C4217w wVar, C3245bz bzVar) {
        if (wVar.mo41736g() == C3125af.C3126a.EVENT_TYPE_EXCEPTION_USER.mo39462a() || wVar.mo41736g() == C3125af.C3126a.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.mo39462a()) {
            wVar.mo41733e(bzVar.mo39754e());
        }
        return wVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39775a(C4217w wVar, C3245bz bzVar) {
        mo39765a(m2544b(wVar, bzVar), bzVar, (Map<String, Object>) null);
    }

    /* renamed from: a */
    public Future<Void> mo39765a(C4217w wVar, final C3245bz bzVar, final Map<String, Object> map) {
        this.f2840b.mo39584d();
        C3256ce.C3261d dVar = new C3256ce.C3261d(wVar, bzVar);
        if (!C3306cx.m2862a((Map) map)) {
            dVar.mo39799a((C3256ce.C3260c) new C3256ce.C3260c() {
                /* renamed from: a */
                public C4217w mo39791a(C4217w wVar) {
                    return C3251cd.this.m2544b(wVar.mo40970c(C4204vq.m5894b(map)), bzVar);
                }
            });
        }
        return m2543a(dVar);
    }

    /* renamed from: a */
    public void mo39782a(List<String> list, ResultReceiver resultReceiver, Map<String, String> map) {
        mo39775a(C3125af.m1940a(C3125af.C3126a.EVENT_TYPE_STARTUP, C4206vr.m5905a()).mo41726a(new C3141ap(list, map, resultReceiver)), (C3245bz) this.f2843e);
    }

    /* renamed from: a */
    public void mo39777a(String str) {
        mo39775a(C3125af.m1963f(str, C4206vr.m5905a()), (C3245bz) this.f2843e);
    }

    /* renamed from: a */
    public void mo39773a(C4034sj sjVar) {
        mo39775a(C3125af.m1943a(sjVar, C4206vr.m5905a()), (C3245bz) this.f2843e);
    }

    /* renamed from: a */
    public void mo39767a(C3245bz bzVar) {
        mo39775a(C3125af.m1942a(bzVar.mo39755f(), m2546c(bzVar)), bzVar);
    }

    /* renamed from: a */
    public void mo39781a(List<String> list) {
        this.f2843e.mo39946g().mo39951a(list);
    }

    /* renamed from: a */
    public void mo39783a(Map<String, String> map) {
        this.f2843e.mo39946g().mo39952a(map);
    }

    /* renamed from: b */
    public void mo39787b(String str) {
        this.f2843e.mo39946g().mo39950a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39769a(C3600kh khVar, C3245bz bzVar) {
        mo39775a(C3125af.m1948a(C3365e.m3064a((C3365e) this.f2846h.mo40225b(khVar)), m2546c(bzVar)), bzVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39779a(String str, C3605kl klVar, C3245bz bzVar) {
        mo39775a(C3125af.m1947a(str, C3365e.m3064a((C3365e) this.f2845g.mo40225b(klVar)), m2546c(bzVar)), bzVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39770a(C3605kl klVar, C3245bz bzVar) {
        this.f2840b.mo39584d();
        C3869r b = C3125af.m1951b(klVar.f3555a, C3365e.m3064a((C3365e) this.f2845g.mo40225b(klVar)), m2546c(bzVar));
        b.mo41733e(bzVar.mo39754e());
        try {
            m2543a(new C3256ce.C3261d(b, bzVar).mo39800a(b.mo40968a()).mo39801a(true)).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39771a(C3723n nVar) {
        this.f2840b.mo39584d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39786b(C3723n nVar) {
        this.f2840b.mo39583c();
    }

    /* renamed from: a */
    public void mo39502a(IMetricaService iMetricaService, C4217w wVar, C3245bz bzVar) throws RemoteException {
        m2545b(iMetricaService, wVar, bzVar);
        m2547e();
    }

    /* renamed from: a */
    public void mo39780a(String str, String str2, C3245bz bzVar) {
        m2543a(new C3256ce.C3261d(C3869r.m4670a(str, str2), bzVar));
    }

    /* renamed from: b */
    public void mo39785b(C3245bz bzVar) {
        m2543a(new C3256ce.C3261d(C3869r.m4673b(), bzVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39772a(final C3908rl.C3909a aVar, C3245bz bzVar) {
        m2543a(new C3256ce.C3261d(C3869r.m4676c(), bzVar).mo39799a((C3256ce.C3260c) new C3256ce.C3260c() {
            /* renamed from: a */
            public C4217w mo39791a(C4217w wVar) {
                return wVar.mo40970c(new String(Base64.encode(C3365e.m3064a((C3365e) aVar), 0)));
            }
        }));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39788b(final String str, C3245bz bzVar) {
        m2543a(new C3256ce.C3261d(C3869r.m4669a(str, m2546c(bzVar)), bzVar).mo39799a((C3256ce.C3260c) new C3256ce.C3260c() {
            /* renamed from: a */
            public C4217w mo39791a(C4217w wVar) {
                return wVar.mo40970c(str);
            }
        }));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39768a(final C3263cg cgVar, C3245bz bzVar) {
        m2543a(new C3256ce.C3261d(C3869r.m4668a(m2546c(bzVar)), bzVar).mo39799a((C3256ce.C3260c) new C3256ce.C3260c() {
            /* renamed from: a */
            public C4217w mo39791a(C4217w wVar) {
                Pair<byte[], Integer> a = cgVar.mo39808a();
                return wVar.mo40970c(new String(Base64.encode((byte[]) a.first, 0))).mo41730c(((Integer) a.second).intValue());
            }
        }));
    }

    /* renamed from: e */
    private void m2547e() {
        C3152ax axVar = this.f2842d;
        if (axVar == null || axVar.mo40669f()) {
            this.f2840b.mo39583c();
        }
    }

    /* renamed from: b */
    private static void m2545b(IMetricaService iMetricaService, C4217w wVar, C3245bz bzVar) throws RemoteException {
        iMetricaService.mo39270a(wVar.mo41722a(bzVar.mo39750b()));
    }

    /* renamed from: a */
    private Future<Void> m2543a(C3256ce.C3261d dVar) {
        dVar.mo39798a().mo39746a(this.f2844f);
        return this.f2847i.mo39792a(dVar);
    }

    /* renamed from: a */
    public C3160bb mo39501a() {
        return this.f2840b;
    }

    /* renamed from: b */
    public Context mo39503b() {
        return this.f2839a;
    }

    /* renamed from: c */
    private C4216vz m2546c(C3245bz bzVar) {
        return C4206vr.m5906a(bzVar.mo39947h().mo39242e());
    }
}
