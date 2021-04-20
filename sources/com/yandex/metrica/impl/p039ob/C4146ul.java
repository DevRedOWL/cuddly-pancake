package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.yandex.metrica.IParamsCallback;
import com.yandex.metrica.impl.p039ob.C3292cq;
import com.yandex.metrica.impl.p039ob.C3744np;
import com.yandex.metrica.impl.p039ob.C4056su;
import com.yandex.metrica.impl.p039ob.C4143uk;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ul */
public class C4146ul implements C3401es {

    /* renamed from: a */
    private final Context f5146a;

    /* renamed from: b */
    private final C3379ek f5147b;

    /* renamed from: c */
    private final C4142uj f5148c;

    /* renamed from: d */
    private volatile C3700mf<C4143uk> f5149d;

    /* renamed from: e */
    private volatile C3298cr f5150e;

    /* renamed from: f */
    private C4133ud f5151f;

    public C4146ul(Context context, String str, C4056su.C4058a aVar, C4142uj ujVar) {
        this(context, new C3375eh(str), aVar, ujVar, C3744np.C3746a.m4268a(C4143uk.class).mo40705a(context), new C4202vo());
    }

    private C4146ul(Context context, C3379ek ekVar, C4056su.C4058a aVar, C4142uj ujVar, C3700mf<C4143uk> mfVar, C4202vo voVar) {
        this(context, ekVar, aVar, ujVar, mfVar, mfVar.mo40624a(), voVar);
    }

    private C4146ul(Context context, C3379ek ekVar, C4056su.C4058a aVar, C4142uj ujVar, C3700mf<C4143uk> mfVar, C4143uk ukVar, C4202vo voVar) {
        this(context, ekVar, ujVar, mfVar, ukVar, voVar, new C4133ud(new C4056su.C4059b(context, ekVar.mo39994b()), ukVar, aVar));
    }

    C4146ul(Context context, C3379ek ekVar, C4142uj ujVar, C3700mf<C4143uk> mfVar, C4143uk ukVar, C4202vo voVar, C4133ud udVar) {
        this.f5146a = context;
        this.f5147b = ekVar;
        this.f5148c = ujVar;
        this.f5149d = mfVar;
        this.f5151f = udVar;
        m5672a(ukVar, voVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5672a(com.yandex.metrica.impl.p039ob.C4143uk r7, com.yandex.metrica.impl.p039ob.C4202vo r8) {
        /*
            r6 = this;
            com.yandex.metrica.impl.ob.uk$a r0 = r7.mo41562a()
            com.yandex.metrica.impl.ob.ud r1 = r6.f5151f
            com.yandex.metrica.impl.ob.sn r1 = r1.mo41327d()
            com.yandex.metrica.impl.ob.su r1 = (com.yandex.metrica.impl.p039ob.C4056su) r1
            com.yandex.metrica.impl.ac.a$c r1 = r1.mo41280D()
            java.lang.String r2 = ""
            r3 = 1
            if (r1 == 0) goto L_0x002a
            java.lang.String r1 = r1.f2454a
            java.lang.String r1 = r8.mo41698a(r1)
            java.lang.String r4 = r7.f5089c
            boolean r4 = android.text.TextUtils.equals(r4, r1)
            if (r4 != 0) goto L_0x0028
            com.yandex.metrica.impl.ob.uk$a r0 = r0.mo41582c((java.lang.String) r1)
            goto L_0x002f
        L_0x0028:
            r4 = 0
            goto L_0x0030
        L_0x002a:
            com.yandex.metrica.impl.ob.uk$a r0 = r0.mo41582c((java.lang.String) r2)
            r1 = r2
        L_0x002f:
            r4 = 1
        L_0x0030:
            java.lang.String r5 = r7.f5087a
            boolean r5 = r6.m5676b((java.lang.String) r5)
            if (r5 == 0) goto L_0x0043
            java.lang.String r5 = r7.f5088b
            boolean r5 = r6.m5678c((java.lang.String) r5)
            if (r5 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r3 = r4
            goto L_0x0064
        L_0x0043:
            java.lang.String r4 = r7.f5087a
            boolean r4 = r6.m5676b((java.lang.String) r4)
            if (r4 != 0) goto L_0x0053
            java.lang.String r8 = r8.mo41697a()
            com.yandex.metrica.impl.ob.uk$a r0 = r0.mo41573a((java.lang.String) r8)
        L_0x0053:
            java.lang.String r8 = r7.f5088b
            boolean r8 = r6.m5678c((java.lang.String) r8)
            if (r8 != 0) goto L_0x0064
            com.yandex.metrica.impl.ob.uk$a r8 = r0.mo41578b((java.lang.String) r1)
            com.yandex.metrica.impl.ob.uk$a r8 = r8.mo41585d((java.lang.String) r2)
            r0 = r8
        L_0x0064:
            if (r3 == 0) goto L_0x0071
            com.yandex.metrica.impl.ob.uk r7 = r0.mo41576a()
            r6.m5679d((com.yandex.metrica.impl.p039ob.C4143uk) r7)
            r6.mo41606b((com.yandex.metrica.impl.p039ob.C4143uk) r7)
            goto L_0x0074
        L_0x0071:
            r6.mo41606b((com.yandex.metrica.impl.p039ob.C4143uk) r7)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C4146ul.m5672a(com.yandex.metrica.impl.ob.uk, com.yandex.metrica.impl.ob.vo):void");
    }

    /* renamed from: b */
    public C3379ek mo39985b() {
        return this.f5147b;
    }

    /* renamed from: a */
    public synchronized C3298cr mo41597a() {
        if (!mo41607c()) {
            return null;
        }
        if (this.f5150e == null) {
            this.f5150e = new C3298cr(this, mo41608d());
        }
        return this.f5150e;
    }

    /* renamed from: a */
    public synchronized boolean mo41605a(List<String> list, Map<String, String> map) {
        boolean a;
        boolean z = false;
        if (list == null) {
            return false;
        }
        C4143uk b = this.f5151f.mo41325b();
        for (String next : list) {
            if (next.equals("yandex_mobile_metrica_uuid")) {
                a = m5676b(b.f5087a);
            } else if (next.equals("yandex_mobile_metrica_device_id")) {
                a = m5678c(b.f5088b);
            } else if (next.equals("appmetrica_device_id_hash")) {
                a = m5680d(b.f5090d);
            } else if (next.equals("yandex_mobile_metrica_get_ad_url")) {
                a = m5682e(b.f5092f);
            } else if (next.equals("yandex_mobile_metrica_report_ad_url")) {
                a = m5684f(b.f5093g);
            } else if (next.equals(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)) {
                a = m5674a(map);
            } else {
                z = true;
            }
            z |= !a;
        }
        return z;
    }

    /* renamed from: c */
    public synchronized boolean mo41607c() {
        boolean z;
        z = mo41609e().f5085F;
        if (!z && !(!mo41604a(C4232wk.m6036a(Long.valueOf(mo41609e().f5106t), 0))) && !m5674a(((C4056su) this.f5151f.mo41327d()).mo41387G())) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m5674a(Map<String, String> map) {
        if (C3306cx.m2862a((Map) map)) {
            return true;
        }
        return map.equals(C4225we.m6009a(mo41609e().f5100n));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo41604a(long r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.yandex.metrica.impl.ob.ud r0 = r4.f5151f     // Catch:{ all -> 0x002a }
            com.yandex.metrica.impl.ob.sn r0 = r0.mo41327d()     // Catch:{ all -> 0x002a }
            com.yandex.metrica.impl.ob.su r0 = (com.yandex.metrica.impl.p039ob.C4056su) r0     // Catch:{ all -> 0x002a }
            boolean r0 = r0.mo41291f()     // Catch:{ all -> 0x002a }
            r1 = 0
            if (r0 != 0) goto L_0x0012
            monitor-exit(r4)
            return r1
        L_0x0012:
            long r2 = com.yandex.metrica.impl.p039ob.C4229wi.m6029b()     // Catch:{ all -> 0x002a }
            long r2 = r2 - r5
            r5 = 86400(0x15180, double:4.26873E-319)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0028
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0025
            goto L_0x0028
        L_0x0025:
            r5 = 1
            monitor-exit(r4)
            return r5
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C4146ul.mo41604a(long):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41602a(C4143uk ukVar) {
        this.f5149d.mo40625a(ukVar);
    }

    /* renamed from: d */
    public C4056su mo41608d() {
        return (C4056su) this.f5151f.mo41327d();
    }

    /* renamed from: f */
    private synchronized void m5683f() {
        this.f5150e = null;
    }

    /* renamed from: a */
    public void mo41599a(C3292cq.C3296b bVar, C4056su suVar, Map<String, List<String>> map) {
        C4143uk a;
        synchronized (this) {
            Long valueOf = Long.valueOf(C4232wk.m6036a(C3292cq.m2670a(map), 0));
            m5673a(bVar.mo39844t(), valueOf);
            a = mo41598a(bVar, suVar, valueOf);
            new C3755ns().mo40716a(this.f5146a, new C3753nq(a.f5088b, a.f5090d), new C3832pr(C3828po.m4497b().mo40847a(a).mo40849a()));
            m5683f();
            m5679d(a);
        }
        m5677c(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4143uk mo41598a(C3292cq.C3296b bVar, C4056su suVar, Long l) {
        String a = C4225we.m6008a(suVar.mo41387G());
        String a2 = m5670a(bVar.mo39835k(), mo41609e().f5099m);
        String str = mo41609e().f5088b;
        if (TextUtils.isEmpty(str)) {
            str = bVar.mo39833i();
        }
        return new C4143uk.C4145a(bVar.mo39823a()).mo41564a(C4229wi.m6029b()).mo41578b(str).mo41582c(mo41609e().f5089c).mo41585d(bVar.mo39834j()).mo41573a(mo41609e().f5087a).mo41587e(bVar.mo39829e()).mo41583c(bVar.mo39827c()).mo41586d(suVar.mo41386F()).mo41574a(bVar.mo39830f()).mo41579b(bVar.mo39832h()).mo41589f(bVar.mo39831g()).mo41591g(bVar.mo39828d()).mo41588e(bVar.mo39847w()).mo41593h(a2).mo41594i(a).mo41580b(m5675a(suVar.mo41387G(), a2)).mo41571a(bVar.mo39838n()).mo41566a(bVar.mo39842r()).mo41565a(bVar.mo39843s()).mo41590f(bVar.mo39845u()).mo41596k(bVar.mo39846v()).mo41569a(bVar.mo39839o()).mo41592g(bVar.mo39841q()).mo41570a(bVar.mo39840p()).mo41572a(bVar.mo39848x()).mo41575a(true).mo41577b(C4232wk.m6036a(l, C4229wi.m6029b() * 1000)).mo41581c(((C4056su) this.f5151f.mo41327d()).mo41398b(l.longValue())).mo41584c(false).mo41595j(mo41609e().f5105s).mo41568a(bVar.mo39849y()).mo41567a(bVar.mo39822A()).mo41576a();
    }

    /* renamed from: c */
    private void m5677c(C4143uk ukVar) {
        this.f5148c.mo41536a(this.f5147b.mo39994b(), ukVar);
        mo41606b(ukVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41606b(C4143uk ukVar) {
        C3350dr.m3043a().mo39931b((C3356dt) new C3367eb(this.f5147b.mo39994b(), ukVar));
        if (!TextUtils.isEmpty(ukVar.f5087a)) {
            C3350dr.m3043a().mo39931b((C3356dt) new C3368ec(ukVar.f5087a, this.f5147b.mo39994b()));
        }
        if (!TextUtils.isEmpty(ukVar.f5088b)) {
            C3350dr.m3043a().mo39931b((C3356dt) new C3363dy(ukVar.f5088b));
        }
        if (ukVar.f5104r == null) {
            C3350dr.m3043a().mo39928a((Class<? extends C3356dt>) C3366ea.class);
        } else {
            C3350dr.m3043a().mo39931b((C3356dt) new C3366ea(ukVar.f5104r));
        }
    }

    /* renamed from: a */
    private void m5673a(Long l, Long l2) {
        C4222wd.m6001a().mo41757a(l2.longValue(), l);
    }

    /* renamed from: d */
    private void m5679d(C4143uk ukVar) {
        this.f5151f.mo41324a(ukVar);
        mo41602a(ukVar);
        m5681e(ukVar);
    }

    /* renamed from: a */
    private static String m5670a(String str, String str2) {
        if (C4225we.m6010b(str)) {
            return str;
        }
        if (C4225we.m6010b(str2)) {
            return str2;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m5675a(Map<String, String> map, String str) {
        Map<String, String> a = C4225we.m6009a(str);
        if (C3306cx.m2862a((Map) map)) {
            return C3306cx.m2862a((Map) a);
        }
        return a.equals(map);
    }

    @Deprecated
    /* renamed from: e */
    private void m5681e(C4143uk ukVar) {
        if (!TextUtils.isEmpty(ukVar.f5088b)) {
            try {
                Intent intent = new Intent("com.yandex.metrica.intent.action.SYNC");
                intent.putExtra("CAUSE", "CAUSE_DEVICE_ID");
                intent.putExtra("SYNC_TO_PKG", this.f5147b.mo39994b());
                intent.putExtra("SYNC_DATA", ukVar.f5088b);
                intent.putExtra("SYNC_DATA_2", ukVar.f5087a);
                this.f5146a.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    public C4143uk mo41609e() {
        return this.f5151f.mo41325b();
    }

    /* renamed from: a */
    public void mo41601a(C4134ue ueVar) {
        m5683f();
        this.f5148c.mo41535a(mo39985b().mo39994b(), ueVar, mo41609e());
    }

    /* renamed from: a */
    public synchronized void mo41600a(C4056su.C4058a aVar) {
        this.f5151f.mo41321a(aVar);
        m5671a((C4056su) this.f5151f.mo41327d());
    }

    /* renamed from: a */
    private void m5671a(C4056su suVar) {
        if (suVar.mo41390J()) {
            boolean z = false;
            List<String> I = suVar.mo41389I();
            C4143uk.C4145a aVar = null;
            if (C3306cx.m2861a((Collection) I) && !C3306cx.m2861a((Collection) suVar.mo41386F())) {
                aVar = mo41609e().mo41562a().mo41586d((List<String>) null);
                z = true;
            }
            if (!C3306cx.m2861a((Collection) I) && !C3306cx.m2859a((Object) I, (Object) suVar.mo41386F())) {
                aVar = mo41609e().mo41562a().mo41586d(I);
                z = true;
            }
            if (z) {
                m5679d(aVar.mo41576a());
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo41603a(String str) {
        m5679d(mo41609e().mo41562a().mo41595j(str).mo41576a());
    }

    /* renamed from: b */
    private boolean m5676b(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: c */
    private boolean m5678c(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: d */
    private boolean m5680d(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: e */
    private boolean m5682e(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: f */
    private boolean m5684f(String str) {
        return !TextUtils.isEmpty(str);
    }
}
