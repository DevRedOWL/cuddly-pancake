package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qe */
public class C3847qe extends C3846qd {

    /* renamed from: d */
    private static final C3853qk f4108d = new C3853qk("UUID");

    /* renamed from: e */
    private static final C3853qk f4109e = new C3853qk("DEVICEID");

    /* renamed from: f */
    private static final C3853qk f4110f = new C3853qk("DEVICEID_2");

    /* renamed from: g */
    private static final C3853qk f4111g = new C3853qk("DEVICEID_3");

    /* renamed from: h */
    private static final C3853qk f4112h = new C3853qk("AD_URL_GET");

    /* renamed from: i */
    private static final C3853qk f4113i = new C3853qk("AD_URL_REPORT");

    /* renamed from: j */
    private static final C3853qk f4114j = new C3853qk("HOST_URL");

    /* renamed from: k */
    private static final C3853qk f4115k = new C3853qk("SERVER_TIME_OFFSET");

    /* renamed from: l */
    private static final C3853qk f4116l = new C3853qk("STARTUP_REQUEST_TIME");

    /* renamed from: m */
    private static final C3853qk f4117m = new C3853qk("CLIDS");

    /* renamed from: n */
    private C3853qk f4118n = new C3853qk(f4108d.mo40945a());

    /* renamed from: o */
    private C3853qk f4119o = new C3853qk(f4109e.mo40945a());

    /* renamed from: p */
    private C3853qk f4120p = new C3853qk(f4110f.mo40945a());

    /* renamed from: q */
    private C3853qk f4121q = new C3853qk(f4111g.mo40945a());

    /* renamed from: r */
    private C3853qk f4122r = new C3853qk(f4112h.mo40945a());

    /* renamed from: s */
    private C3853qk f4123s = new C3853qk(f4113i.mo40945a());

    /* renamed from: t */
    private C3853qk f4124t = new C3853qk(f4114j.mo40945a());

    /* renamed from: u */
    private C3853qk f4125u = new C3853qk(f4115k.mo40945a());

    /* renamed from: v */
    private C3853qk f4126v = new C3853qk(f4116l.mo40945a());

    /* renamed from: w */
    private C3853qk f4127w = new C3853qk(f4117m.mo40945a());

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo40896f() {
        return "_startupinfopreferences";
    }

    public C3847qe(Context context) {
        super(context, (String) null);
    }

    /* renamed from: a */
    public String mo40904a(String str) {
        return this.f4105c.getString(this.f4118n.mo40947b(), str);
    }

    /* renamed from: b */
    public String mo40907b(String str) {
        return this.f4105c.getString(this.f4121q.mo40947b(), str);
    }

    /* renamed from: a */
    public String mo40887a() {
        return this.f4105c.getString(this.f4120p.mo40947b(), this.f4105c.getString(this.f4119o.mo40947b(), ""));
    }

    /* renamed from: c */
    public String mo40908c(String str) {
        return this.f4105c.getString(this.f4122r.mo40947b(), str);
    }

    /* renamed from: d */
    public String mo40910d(String str) {
        return this.f4105c.getString(this.f4123s.mo40947b(), str);
    }

    /* renamed from: a */
    public long mo40903a(long j) {
        return this.f4105c.getLong(this.f4125u.mo40945a(), j);
    }

    /* renamed from: b */
    public long mo40905b(long j) {
        return this.f4105c.getLong(this.f4126v.mo40947b(), j);
    }

    /* renamed from: e */
    public String mo40911e(String str) {
        return this.f4105c.getString(this.f4127w.mo40947b(), str);
    }

    /* renamed from: b */
    public C3847qe mo40906b() {
        return (C3847qe) mo40899h();
    }

    /* renamed from: c */
    public Map<String, ?> mo40909c() {
        return this.f4105c.getAll();
    }
}
