package com.yandex.metrica.impl.p039ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.ly */
public class C3690ly extends C3689lx {

    /* renamed from: a */
    static final C3853qk f3743a = new C3853qk("LOCATION_TRACKING_ENABLED");
    @Deprecated

    /* renamed from: b */
    public static final C3853qk f3744b = new C3853qk("COLLECT_INSTALLED_APPS");

    /* renamed from: c */
    public static final C3853qk f3745c = new C3853qk("INSTALLED_APP_COLLECTING");

    /* renamed from: d */
    static final C3853qk f3746d = new C3853qk("REFERRER");

    /* renamed from: e */
    static final C3853qk f3747e = new C3853qk("REFERRER_FROM_PLAY_SERVICES");

    /* renamed from: f */
    static final C3853qk f3748f = new C3853qk("REFERRER_HANDLED");

    /* renamed from: g */
    static final C3853qk f3749g = new C3853qk("REFERRER_HOLDER_STATE");

    /* renamed from: h */
    static final C3853qk f3750h = new C3853qk("PREF_KEY_OFFSET");

    /* renamed from: i */
    static final C3853qk f3751i = new C3853qk("UNCHECKED_TIME");

    /* renamed from: j */
    static final C3853qk f3752j = new C3853qk("L_REQ_NUM");

    /* renamed from: k */
    static final C3853qk f3753k = new C3853qk("L_ID");

    /* renamed from: l */
    static final C3853qk f3754l = new C3853qk("LBS_ID");

    /* renamed from: m */
    static final C3853qk f3755m = new C3853qk("STATISTICS_RESTRICTED_IN_MAIN");

    /* renamed from: n */
    static final C3853qk f3756n = new C3853qk("SDKFCE");

    /* renamed from: o */
    static final C3853qk f3757o = new C3853qk("FST");

    /* renamed from: p */
    static final C3853qk f3758p = new C3853qk("LSST");

    /* renamed from: r */
    static final C3853qk f3759r = new C3853qk("FSDKFCO");

    /* renamed from: s */
    static final C3853qk f3760s = new C3853qk("SRSDKFC");

    /* renamed from: t */
    static final C3853qk f3761t = new C3853qk("LSDKFCAT");

    /* renamed from: u */
    static final C3853qk f3762u = new C3853qk("LAST_IDENTITY_LIGHT_SEND_TIME");

    /* renamed from: v */
    private static final C3853qk f3763v = new C3853qk("LAST_MIGRATION_VERSION");

    public C3690ly(C3630lf lfVar) {
        super(lfVar);
    }

    /* renamed from: a */
    public boolean mo40576a() {
        return mo40562b(f3745c.mo40947b(), false);
    }

    /* renamed from: b */
    public String mo40579b() {
        return mo40564c(f3746d.mo40947b(), (String) null);
    }

    /* renamed from: c */
    public C4034sj mo40583c() {
        return m4008b(mo40564c(f3747e.mo40947b(), (String) null));
    }

    /* renamed from: b */
    private C4034sj m4008b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return C4034sj.m5220a(Base64.encode(str.getBytes(), 0));
        } catch (C3318d unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo40588d() {
        return mo40562b(f3748f.mo40947b(), false);
    }

    /* renamed from: a */
    public C3690ly mo40575a(boolean z) {
        return (C3690ly) mo40556a(f3745c.mo40947b(), z);
    }

    /* renamed from: a */
    public C3690ly mo40574a(String str) {
        return (C3690ly) mo40560b(f3746d.mo40947b(), str);
    }

    /* renamed from: a */
    public C3690ly mo40573a(C4034sj sjVar) {
        return (C3690ly) mo40560b(f3747e.mo40947b(), m4009b(sjVar));
    }

    /* renamed from: b */
    private String m4009b(C4034sj sjVar) {
        if (sjVar == null) {
            return null;
        }
        return new String(Base64.encode(sjVar.mo41271a(), 0));
    }

    /* renamed from: e */
    public C3690ly mo40589e() {
        return (C3690ly) mo40556a(f3748f.mo40947b(), true);
    }

    /* renamed from: f */
    public C3690ly mo40594f() {
        return (C3690ly) mo40568r(f3746d.mo40947b()).mo40568r(f3747e.mo40947b());
    }

    /* renamed from: a */
    public int mo40571a(int i) {
        return mo40558b(f3763v.mo40947b(), i);
    }

    /* renamed from: b */
    public C3690ly mo40578b(int i) {
        return (C3690ly) mo40553a(f3763v.mo40947b(), i);
    }

    /* renamed from: b */
    public void mo40580b(boolean z) {
        mo40556a(f3743a.mo40947b(), z).mo40567q();
    }

    /* renamed from: g */
    public boolean mo40596g() {
        return mo40562b(f3743a.mo40947b(), false);
    }

    /* renamed from: c */
    public long mo40581c(int i) {
        return mo40559b(f3750h.mo40947b(), (long) i);
    }

    /* renamed from: a */
    public C3690ly mo40572a(long j) {
        return (C3690ly) mo40554a(f3750h.mo40947b(), j);
    }

    /* renamed from: b */
    public long mo40577b(long j) {
        return mo40559b(f3752j.mo40947b(), j);
    }

    /* renamed from: c */
    public C3690ly mo40582c(long j) {
        return (C3690ly) mo40554a(f3752j.mo40947b(), j);
    }

    /* renamed from: d */
    public long mo40586d(long j) {
        return mo40559b(f3753k.mo40947b(), j);
    }

    /* renamed from: e */
    public C3690ly mo40591e(long j) {
        return (C3690ly) mo40554a(f3753k.mo40947b(), j);
    }

    /* renamed from: f */
    public long mo40593f(long j) {
        return mo40559b(f3754l.mo40947b(), j);
    }

    /* renamed from: g */
    public C3690ly mo40595g(long j) {
        return (C3690ly) mo40554a(f3754l.mo40947b(), j);
    }

    /* renamed from: c */
    public boolean mo40584c(boolean z) {
        return mo40562b(f3751i.mo40947b(), z);
    }

    /* renamed from: d */
    public C3690ly mo40587d(boolean z) {
        return (C3690ly) mo40556a(f3751i.mo40947b(), z);
    }

    /* renamed from: d */
    public int mo40585d(int i) {
        return mo40558b(f3749g.mo40947b(), i);
    }

    /* renamed from: e */
    public C3690ly mo40590e(int i) {
        return (C3690ly) mo40553a(f3749g.mo40947b(), i);
    }

    /* renamed from: h */
    public Boolean mo40598h() {
        if (mo40570t(f3755m.mo40947b())) {
            return Boolean.valueOf(mo40562b(f3755m.mo40947b(), true));
        }
        return null;
    }

    /* renamed from: e */
    public C3690ly mo40592e(boolean z) {
        return (C3690ly) mo40556a(f3755m.mo40947b(), z);
    }

    /* renamed from: h */
    public long mo40597h(long j) {
        return mo40559b(f3762u.mo40947b(), j);
    }

    /* renamed from: i */
    public C3690ly mo40599i(long j) {
        return (C3690ly) mo40554a(f3762u.mo40947b(), j);
    }
}
