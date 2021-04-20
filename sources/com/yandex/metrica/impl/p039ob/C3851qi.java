package com.yandex.metrica.impl.p039ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qi */
public class C3851qi extends C3846qd {

    /* renamed from: d */
    static final C3853qk f4168d = new C3853qk("PREF_KEY_DEVICE_ID_");

    /* renamed from: e */
    static final C3853qk f4169e = new C3853qk("PREF_KEY_UID_");

    /* renamed from: f */
    static final C3853qk f4170f = new C3853qk("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_");

    /* renamed from: g */
    static final C3853qk f4171g = new C3853qk("PREF_KEY_PINNING_UPDATE_URL");

    /* renamed from: h */
    private static final C3853qk f4172h = new C3853qk("PREF_KEY_HOST_URL_");

    /* renamed from: i */
    private static final C3853qk f4173i = new C3853qk("PREF_KEY_REPORT_URL_");

    /* renamed from: j */
    private static final C3853qk f4174j = new C3853qk("PREF_KEY_GET_AD_URL");

    /* renamed from: k */
    private static final C3853qk f4175k = new C3853qk("PREF_KEY_REPORT_AD_URL");

    /* renamed from: l */
    private static final C3853qk f4176l = new C3853qk("PREF_KEY_STARTUP_OBTAIN_TIME_");

    /* renamed from: m */
    private static final C3853qk f4177m = new C3853qk("PREF_KEY_STARTUP_ENCODED_CLIDS_");

    /* renamed from: n */
    private static final C3853qk f4178n = new C3853qk("PREF_KEY_DISTRIBUTION_REFERRER_");

    /* renamed from: o */
    private static final C3853qk f4179o = new C3853qk("PREF_KEY_EASY_COLLECTING_ENABLED_");

    /* renamed from: p */
    private C3853qk f4180p;

    /* renamed from: q */
    private C3853qk f4181q;

    /* renamed from: r */
    private C3853qk f4182r;

    /* renamed from: s */
    private C3853qk f4183s;

    /* renamed from: t */
    private C3853qk f4184t;

    /* renamed from: u */
    private C3853qk f4185u;

    /* renamed from: v */
    private C3853qk f4186v;

    /* renamed from: w */
    private C3853qk f4187w;

    /* renamed from: x */
    private C3853qk f4188x;

    /* renamed from: y */
    private C3853qk f4189y;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo40896f() {
        return "_startupserviceinfopreferences";
    }

    public C3851qi(Context context) {
        this(context, (String) null);
    }

    public C3851qi(Context context, String str) {
        super(context, str);
        this.f4180p = new C3853qk(f4168d.mo40945a());
        this.f4181q = new C3853qk(f4169e.mo40945a(), mo40901i());
        this.f4182r = new C3853qk(f4172h.mo40945a(), mo40901i());
        this.f4183s = new C3853qk(f4173i.mo40945a(), mo40901i());
        this.f4184t = new C3853qk(f4174j.mo40945a(), mo40901i());
        this.f4185u = new C3853qk(f4175k.mo40945a(), mo40901i());
        this.f4186v = new C3853qk(f4176l.mo40945a(), mo40901i());
        this.f4187w = new C3853qk(f4177m.mo40945a(), mo40901i());
        this.f4188x = new C3853qk(f4178n.mo40945a(), mo40901i());
        this.f4189y = new C3853qk(f4179o.mo40945a(), mo40901i());
    }

    /* renamed from: a */
    public long mo40933a(long j) {
        return this.f4105c.getLong(this.f4186v.mo40947b(), j);
    }

    /* renamed from: a */
    public String mo40934a(String str) {
        return this.f4105c.getString(this.f4180p.mo40947b(), str);
    }

    /* renamed from: b */
    public String mo40935b(String str) {
        return this.f4105c.getString(this.f4181q.mo40947b(), str);
    }

    /* renamed from: c */
    public String mo40937c(String str) {
        return this.f4105c.getString(this.f4182r.mo40947b(), str);
    }

    /* renamed from: d */
    public String mo40938d(String str) {
        return this.f4105c.getString(this.f4187w.mo40947b(), str);
    }

    /* renamed from: e */
    public String mo40939e(String str) {
        return this.f4105c.getString(this.f4183s.mo40947b(), str);
    }

    /* renamed from: f */
    public String mo40940f(String str) {
        return this.f4105c.getString(this.f4184t.mo40947b(), str);
    }

    /* renamed from: g */
    public String mo40941g(String str) {
        return this.f4105c.getString(this.f4185u.mo40947b(), str);
    }

    /* renamed from: a */
    public String mo40887a() {
        return this.f4105c.getString(this.f4188x.mo40945a(), (String) null);
    }

    /* renamed from: i */
    public C3851qi mo40942i(String str) {
        return (C3851qi) mo40898a(this.f4181q.mo40947b(), str);
    }

    /* renamed from: j */
    public C3851qi mo40943j(String str) {
        return (C3851qi) mo40898a(this.f4180p.mo40947b(), str);
    }

    /* renamed from: a */
    public static void m4619a(Context context) {
        C3854ql.m4639a(context, "_startupserviceinfopreferences").edit().remove(f4168d.mo40945a()).apply();
    }

    /* renamed from: b */
    public void mo40936b() {
        mo40900h(this.f4180p.mo40947b()).mo40900h(this.f4181q.mo40947b()).mo40900h(this.f4182r.mo40947b()).mo40900h(this.f4183s.mo40947b()).mo40900h(this.f4184t.mo40947b()).mo40900h(this.f4185u.mo40947b()).mo40900h(this.f4186v.mo40947b()).mo40900h(this.f4189y.mo40947b()).mo40900h(this.f4187w.mo40947b()).mo40900h(this.f4188x.mo40945a()).mo40900h(f4170f.mo40945a()).mo40900h(f4171g.mo40945a()).mo40902j();
    }
}
