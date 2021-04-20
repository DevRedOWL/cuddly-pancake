package com.yandex.metrica.impl.p039ob;

import android.location.Location;
import com.yandex.metrica.C4297j;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.aa */
public class C3116aa implements C3159ba {

    /* renamed from: a */
    private Location f2476a;

    /* renamed from: b */
    private Boolean f2477b;

    /* renamed from: c */
    private Boolean f2478c;

    /* renamed from: d */
    private Map<String, String> f2479d = new LinkedHashMap();

    /* renamed from: e */
    private Map<String, String> f2480e = new LinkedHashMap();

    /* renamed from: f */
    private boolean f2481f;

    /* renamed from: g */
    private boolean f2482g;

    /* renamed from: h */
    private C3251cd f2483h;

    /* renamed from: a */
    private static boolean m1914a(Object obj) {
        return obj == null;
    }

    /* renamed from: a */
    public Location mo39445a() {
        return this.f2476a;
    }

    /* renamed from: b */
    public Boolean mo39450b() {
        return this.f2477b;
    }

    /* renamed from: a */
    public void mo39449a(boolean z) {
        this.f2477b = Boolean.valueOf(z);
        m1918f();
    }

    /* renamed from: c */
    public Boolean mo39451c() {
        return this.f2478c;
    }

    public void setStatisticsSending(boolean z) {
        this.f2478c = Boolean.valueOf(z);
        m1918f();
    }

    /* renamed from: a */
    public void mo39447a(Location location) {
        this.f2476a = location;
    }

    /* renamed from: d */
    public boolean mo39452d() {
        return this.f2481f;
    }

    /* renamed from: e */
    private void m1917e() {
        this.f2476a = null;
        this.f2477b = null;
        this.f2478c = null;
        this.f2479d.clear();
        this.f2480e.clear();
        this.f2481f = false;
    }

    /* renamed from: a */
    public C4297j mo39446a(C4297j jVar) {
        if (this.f2482g) {
            return jVar;
        }
        C4297j.C4299a b = m1915b(jVar);
        m1912a(jVar, b);
        this.f2482g = true;
        m1917e();
        return b.mo41900b();
    }

    /* renamed from: b */
    private C4297j.C4299a m1915b(C4297j jVar) {
        C4297j.C4299a a = C4297j.m6214a(jVar.apiKey);
        a.mo41894a(jVar.f5359b, jVar.f5367j);
        a.mo41902c(jVar.f5358a);
        a.mo41888a(jVar.preloadInfo);
        a.mo41887a(jVar.location);
        a.mo41890a(jVar.f5370m);
        m1911a(a, jVar);
        m1913a(this.f2479d, a);
        m1913a(jVar.f5366i, a);
        m1916b(this.f2480e, a);
        m1916b(jVar.f5365h, a);
        return a;
    }

    /* renamed from: a */
    private void m1911a(C4297j.C4299a aVar, C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.f5361d)) {
            aVar.mo41893a(jVar.f5361d);
        }
        if (C3306cx.m2858a((Object) jVar.appVersion)) {
            aVar.mo41891a(jVar.appVersion);
        }
        if (C3306cx.m2858a((Object) jVar.f5363f)) {
            aVar.mo41904d(jVar.f5363f.intValue());
        }
        if (C3306cx.m2858a((Object) jVar.f5362e)) {
            aVar.mo41896b(jVar.f5362e.intValue());
        }
        if (C3306cx.m2858a((Object) jVar.f5364g)) {
            aVar.mo41901c(jVar.f5364g.intValue());
        }
        if (C3306cx.m2858a((Object) jVar.logs) && jVar.logs.booleanValue()) {
            aVar.mo41885a();
        }
        if (C3306cx.m2858a((Object) jVar.sessionTimeout)) {
            aVar.mo41886a(jVar.sessionTimeout.intValue());
        }
        if (C3306cx.m2858a((Object) jVar.crashReporting)) {
            aVar.mo41895a(jVar.crashReporting.booleanValue());
        }
        if (C3306cx.m2858a((Object) jVar.nativeCrashReporting)) {
            aVar.mo41899b(jVar.nativeCrashReporting.booleanValue());
        }
        if (C3306cx.m2858a((Object) jVar.locationTracking)) {
            aVar.mo41905d(jVar.locationTracking.booleanValue());
        }
        if (C3306cx.m2858a((Object) jVar.installedAppCollecting)) {
            aVar.mo41907e(jVar.installedAppCollecting.booleanValue());
        }
        if (C3306cx.m2858a((Object) jVar.f5360c)) {
            aVar.mo41897b(jVar.f5360c);
        }
        if (C3306cx.m2858a((Object) jVar.firstActivationAsUpdate)) {
            aVar.mo41909g(jVar.firstActivationAsUpdate.booleanValue());
        }
        if (C3306cx.m2858a((Object) jVar.statisticsSending)) {
            aVar.mo41908f(jVar.statisticsSending.booleanValue());
        }
        if (C3306cx.m2858a((Object) jVar.f5369l)) {
            aVar.mo41903c(jVar.f5369l.booleanValue());
        }
        if (C3306cx.m2858a((Object) jVar.maxReportsInDatabaseCount)) {
            aVar.mo41906e(jVar.maxReportsInDatabaseCount.intValue());
        }
        if (C3306cx.m2858a((Object) jVar.f5371n)) {
            aVar.mo41889a(jVar.f5371n);
        }
    }

    /* renamed from: a */
    private void m1913a(Map<String, String> map, C4297j.C4299a aVar) {
        if (!C3306cx.m2862a((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                aVar.mo41898b((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* renamed from: b */
    private void m1916b(Map<String, String> map, C4297j.C4299a aVar) {
        if (!C3306cx.m2862a((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                aVar.mo41892a((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* renamed from: a */
    private void m1912a(C4297j jVar, C4297j.C4299a aVar) {
        Boolean b = mo39450b();
        if (m1914a((Object) jVar.locationTracking) && C3306cx.m2858a((Object) b)) {
            aVar.mo41905d(b.booleanValue());
        }
        Location a = mo39445a();
        if (m1914a((Object) jVar.location) && C3306cx.m2858a((Object) a)) {
            aVar.mo41887a(a);
        }
        Boolean c = mo39451c();
        if (m1914a((Object) jVar.statisticsSending) && C3306cx.m2858a((Object) c)) {
            aVar.mo41908f(c.booleanValue());
        }
    }

    /* renamed from: a */
    public void mo39448a(C3251cd cdVar) {
        this.f2483h = cdVar;
    }

    /* renamed from: f */
    private void m1918f() {
        C3251cd cdVar = this.f2483h;
        if (cdVar != null) {
            cdVar.mo39776a(this.f2477b, this.f2478c);
        }
    }
}
