package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3512i;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qf */
public class C3848qf extends C3846qd {
    @Deprecated

    /* renamed from: d */
    public static final C3853qk f4128d = new C3853qk("APP_ENVIRONMENT");
    @Deprecated

    /* renamed from: e */
    public static final C3853qk f4129e = new C3853qk("APP_ENVIRONMENT_REVISION");

    /* renamed from: f */
    private static final C3853qk f4130f = new C3853qk("SESSION_SLEEP_START_");

    /* renamed from: g */
    private static final C3853qk f4131g = new C3853qk("SESSION_ID_");

    /* renamed from: h */
    private static final C3853qk f4132h = new C3853qk("SESSION_COUNTER_ID_");

    /* renamed from: i */
    private static final C3853qk f4133i = new C3853qk("SESSION_INIT_TIME_");

    /* renamed from: j */
    private static final C3853qk f4134j = new C3853qk("SESSION_ALIVE_TIME_");

    /* renamed from: k */
    private static final C3853qk f4135k = new C3853qk("SESSION_IS_ALIVE_REPORT_NEEDED_");

    /* renamed from: l */
    private static final C3853qk f4136l = new C3853qk("BG_SESSION_ID_");

    /* renamed from: m */
    private static final C3853qk f4137m = new C3853qk("BG_SESSION_SLEEP_START_");

    /* renamed from: n */
    private static final C3853qk f4138n = new C3853qk("BG_SESSION_COUNTER_ID_");

    /* renamed from: o */
    private static final C3853qk f4139o = new C3853qk("BG_SESSION_INIT_TIME_");

    /* renamed from: p */
    private static final C3853qk f4140p = new C3853qk("COLLECT_INSTALLED_APPS_");

    /* renamed from: q */
    private static final C3853qk f4141q = new C3853qk("IDENTITY_SEND_TIME_");

    /* renamed from: r */
    private static final C3853qk f4142r = new C3853qk("USER_INFO_");

    /* renamed from: s */
    private static final C3853qk f4143s = new C3853qk("REFERRER_");

    /* renamed from: t */
    private static final C3853qk f4144t = new C3853qk("APP_ENVIRONMENT_");

    /* renamed from: u */
    private static final C3853qk f4145u = new C3853qk("APP_ENVIRONMENT_REVISION_");

    /* renamed from: A */
    private C3853qk f4146A = new C3853qk(f4135k.mo40945a(), mo40901i());

    /* renamed from: B */
    private C3853qk f4147B = new C3853qk(f4136l.mo40945a(), mo40901i());

    /* renamed from: C */
    private C3853qk f4148C = new C3853qk(f4137m.mo40945a(), mo40901i());

    /* renamed from: D */
    private C3853qk f4149D = new C3853qk(f4138n.mo40945a(), mo40901i());

    /* renamed from: E */
    private C3853qk f4150E = new C3853qk(f4139o.mo40945a(), mo40901i());

    /* renamed from: F */
    private C3853qk f4151F = new C3853qk(f4141q.mo40945a(), mo40901i());

    /* renamed from: G */
    private C3853qk f4152G = new C3853qk(f4140p.mo40945a(), mo40901i());

    /* renamed from: H */
    private C3853qk f4153H = new C3853qk(f4142r.mo40945a(), mo40901i());

    /* renamed from: I */
    private C3853qk f4154I = new C3853qk(f4143s.mo40945a(), mo40901i());

    /* renamed from: J */
    private C3853qk f4155J = new C3853qk(f4144t.mo40945a(), mo40901i());

    /* renamed from: K */
    private C3853qk f4156K = new C3853qk(f4145u.mo40945a(), mo40901i());

    /* renamed from: v */
    private C3853qk f4157v = new C3853qk(f4130f.mo40945a(), mo40901i());

    /* renamed from: w */
    private C3853qk f4158w = new C3853qk(f4131g.mo40945a(), mo40901i());

    /* renamed from: x */
    private C3853qk f4159x = new C3853qk(f4132h.mo40945a(), mo40901i());

    /* renamed from: y */
    private C3853qk f4160y = new C3853qk(f4133i.mo40945a(), mo40901i());

    /* renamed from: z */
    private C3853qk f4161z = new C3853qk(f4134j.mo40945a(), mo40901i());

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo40896f() {
        return "_boundentrypreferences";
    }

    public C3848qf(Context context, String str) {
        super(context, str);
        m4589a(-1);
        m4590b(0);
        m4591c(0);
    }

    /* renamed from: a */
    public long mo40912a(long j) {
        return m4588a(this.f4160y.mo40947b(), j);
    }

    /* renamed from: b */
    public long mo40916b(long j) {
        return m4588a(this.f4150E.mo40947b(), j);
    }

    /* renamed from: c */
    public long mo40919c(long j) {
        return m4588a(this.f4151F.mo40947b(), j);
    }

    /* renamed from: d */
    public long mo40921d(long j) {
        return m4588a(this.f4158w.mo40947b(), j);
    }

    /* renamed from: e */
    public long mo40923e(long j) {
        return m4588a(this.f4147B.mo40947b(), j);
    }

    /* renamed from: f */
    public long mo40925f(long j) {
        return m4588a(this.f4159x.mo40947b(), j);
    }

    /* renamed from: a */
    private long m4588a(String str, long j) {
        return this.f4105c.getLong(str, j);
    }

    /* renamed from: g */
    public long mo40926g(long j) {
        return m4588a(this.f4149D.mo40947b(), j);
    }

    /* renamed from: a */
    public C3512i.C3513a mo40887a() {
        synchronized (this) {
            if (!this.f4105c.contains(this.f4155J.mo40947b()) || !this.f4105c.contains(this.f4156K.mo40947b())) {
                return null;
            }
            C3512i.C3513a aVar = new C3512i.C3513a(this.f4105c.getString(this.f4155J.mo40947b(), "{}"), this.f4105c.getLong(this.f4156K.mo40947b(), 0));
            return aVar;
        }
    }

    /* renamed from: h */
    public long mo40928h(long j) {
        return m4588a(this.f4157v.mo40947b(), j);
    }

    /* renamed from: i */
    public long mo40929i(long j) {
        return m4588a(this.f4148C.mo40947b(), j);
    }

    /* renamed from: a */
    public Boolean mo40914a(boolean z) {
        return Boolean.valueOf(this.f4105c.getBoolean(this.f4146A.mo40947b(), z));
    }

    /* renamed from: b */
    public Boolean mo40917b() {
        int i = this.f4105c.getInt(this.f4152G.mo40947b(), -1);
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            return null;
        }
        return true;
    }

    /* renamed from: a */
    public String mo40915a(String str) {
        return this.f4105c.getString(this.f4153H.mo40947b(), str);
    }

    /* renamed from: b */
    public String mo40918b(String str) {
        return this.f4105c.getString(this.f4154I.mo40947b(), str);
    }

    /* renamed from: a */
    public C3848qf mo40913a(C3512i.C3513a aVar) {
        synchronized (this) {
            mo40898a(this.f4155J.mo40947b(), aVar.f3369a);
            mo40898a(this.f4156K.mo40947b(), Long.valueOf(aVar.f3370b));
        }
        return this;
    }

    /* renamed from: c */
    public C3848qf mo40920c() {
        return (C3848qf) mo40900h(this.f4154I.mo40947b());
    }

    /* renamed from: a */
    private void m4589a(int i) {
        C3854ql.m4640a(this.f4105c, this.f4161z.mo40947b(), i);
    }

    /* renamed from: b */
    private void m4590b(int i) {
        C3854ql.m4640a(this.f4105c, this.f4157v.mo40947b(), i);
    }

    /* renamed from: c */
    private void m4591c(int i) {
        C3854ql.m4640a(this.f4105c, this.f4159x.mo40947b(), i);
    }

    /* renamed from: d */
    public C3848qf mo40922d() {
        return this.f4105c.contains(this.f4152G.mo40947b()) ? (C3848qf) mo40900h(this.f4152G.mo40947b()) : this;
    }

    /* renamed from: e */
    public boolean mo40924e() {
        return this.f4105c.contains(this.f4160y.mo40947b()) || this.f4105c.contains(this.f4161z.mo40947b()) || this.f4105c.contains(this.f4146A.mo40947b()) || this.f4105c.contains(this.f4157v.mo40947b()) || this.f4105c.contains(this.f4158w.mo40947b()) || this.f4105c.contains(this.f4159x.mo40947b()) || this.f4105c.contains(this.f4150E.mo40947b()) || this.f4105c.contains(this.f4148C.mo40947b()) || this.f4105c.contains(this.f4147B.mo40947b()) || this.f4105c.contains(this.f4149D.mo40947b()) || this.f4105c.contains(this.f4155J.mo40947b()) || this.f4105c.contains(this.f4153H.mo40947b()) || this.f4105c.contains(this.f4154I.mo40947b()) || this.f4105c.contains(this.f4151F.mo40947b());
    }

    /* renamed from: g */
    public void mo40927g() {
        this.f4105c.edit().remove(this.f4150E.mo40947b()).remove(this.f4149D.mo40947b()).remove(this.f4147B.mo40947b()).remove(this.f4148C.mo40947b()).remove(this.f4160y.mo40947b()).remove(this.f4159x.mo40947b()).remove(this.f4158w.mo40947b()).remove(this.f4157v.mo40947b()).remove(this.f4146A.mo40947b()).remove(this.f4161z.mo40947b()).remove(this.f4153H.mo40947b()).remove(this.f4155J.mo40947b()).remove(this.f4156K.mo40947b()).remove(this.f4154I.mo40947b()).remove(this.f4151F.mo40947b()).apply();
    }
}
