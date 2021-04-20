package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3512i;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.lw */
public class C3688lw extends C3689lx {

    /* renamed from: a */
    public static final String f3721a = null;
    @Deprecated

    /* renamed from: b */
    public static final C3853qk f3722b = new C3853qk("COLLECT_INSTALLED_APPS");

    /* renamed from: c */
    static final C3853qk f3723c = new C3853qk("DEPRECATED_NATIVE_CRASHES_CHECKED");

    /* renamed from: d */
    private static final C3853qk f3724d = new C3853qk("IDENTITY_SEND_TIME");

    /* renamed from: e */
    private static final C3853qk f3725e = new C3853qk("PERMISSIONS_CHECK_TIME");

    /* renamed from: f */
    private static final C3853qk f3726f = new C3853qk("USER_INFO");

    /* renamed from: g */
    private static final C3853qk f3727g = new C3853qk("PROFILE_ID");

    /* renamed from: h */
    private static final C3853qk f3728h = new C3853qk("APP_ENVIRONMENT");

    /* renamed from: i */
    private static final C3853qk f3729i = new C3853qk("APP_ENVIRONMENT_REVISION");

    /* renamed from: j */
    private static final C3853qk f3730j = new C3853qk("LAST_MIGRATION_VERSION");

    /* renamed from: k */
    private static final C3853qk f3731k = new C3853qk("LAST_APP_VERSION_WITH_FEATURES");

    /* renamed from: l */
    private static final C3853qk f3732l = new C3853qk("APPLICATION_FEATURES");

    /* renamed from: m */
    private static final C3853qk f3733m = new C3853qk("CURRENT_SESSION_ID");

    /* renamed from: n */
    private static final C3853qk f3734n = new C3853qk("ATTRIBUTION_ID");

    /* renamed from: o */
    private static final C3853qk f3735o = new C3853qk("LAST_STAT_SENDING_DISABLED_REPORTING_TIMESTAMP");

    /* renamed from: p */
    private static final C3853qk f3736p = new C3853qk("NEXT_EVENT_GLOBAL_NUMBER");

    /* renamed from: r */
    private static final C3853qk f3737r = new C3853qk("LAST_REQUEST_ID");

    /* renamed from: s */
    private static final C3853qk f3738s = new C3853qk("CERTIFICATES_SHA1_FINGERPRINTS");

    /* renamed from: t */
    private static final C3685lt f3739t = new C3685lt();

    public C3688lw(C3630lf lfVar) {
        super(lfVar);
    }

    /* renamed from: a */
    public int mo40519a() {
        return mo40558b(f3736p.mo40947b(), 0);
    }

    /* renamed from: a */
    public int mo40520a(int i) {
        return mo40558b(f3739t.mo40477a(i), 0);
    }

    /* renamed from: a */
    public long mo40521a(long j) {
        return mo40559b(f3724d.mo40947b(), j);
    }

    /* renamed from: b */
    public long mo40527b() {
        return mo40559b(f3725e.mo40947b(), 0);
    }

    /* renamed from: c */
    public int mo40531c() {
        return mo40558b(f3731k.mo40947b(), -1);
    }

    /* renamed from: d */
    public C3512i.C3513a mo40535d() {
        C3512i.C3513a aVar;
        synchronized (this) {
            aVar = new C3512i.C3513a(mo40564c(f3728h.mo40947b(), "{}"), mo40559b(f3729i.mo40947b(), 0));
        }
        return aVar;
    }

    /* renamed from: e */
    public String mo40541e() {
        return mo40564c(f3732l.mo40947b(), "");
    }

    /* renamed from: f */
    public String mo40543f() {
        return mo40564c(f3726f.mo40947b(), f3721a);
    }

    /* renamed from: b */
    public C3688lw mo40528b(int i) {
        return (C3688lw) mo40553a(f3736p.mo40947b(), i);
    }

    /* renamed from: a */
    public C3688lw mo40522a(int i, int i2) {
        return (C3688lw) mo40553a(f3739t.mo40477a(i), i2);
    }

    /* renamed from: a */
    public C3688lw mo40523a(C3512i.C3513a aVar) {
        synchronized (this) {
            mo40560b(f3728h.mo40947b(), aVar.f3369a);
            mo40554a(f3729i.mo40947b(), aVar.f3370b);
        }
        return this;
    }

    /* renamed from: b */
    public C3688lw mo40529b(long j) {
        return (C3688lw) mo40554a(f3724d.mo40947b(), j);
    }

    /* renamed from: c */
    public C3688lw mo40533c(long j) {
        return (C3688lw) mo40554a(f3725e.mo40947b(), j);
    }

    /* renamed from: a */
    public C3688lw mo40524a(String str) {
        return (C3688lw) mo40560b(f3726f.mo40947b(), str);
    }

    /* renamed from: g */
    public long mo40544g() {
        return mo40559b(f3730j.mo40947b(), 0);
    }

    /* renamed from: d */
    public C3688lw mo40537d(long j) {
        return (C3688lw) mo40554a(f3730j.mo40947b(), j);
    }

    /* renamed from: c */
    public C3688lw mo40532c(int i) {
        return (C3688lw) mo40553a(f3731k.mo40947b(), i);
    }

    /* renamed from: b */
    public C3688lw mo40530b(String str) {
        return (C3688lw) mo40560b(f3732l.mo40947b(), str);
    }

    /* renamed from: a */
    public C3688lw mo40525a(String str, String str2) {
        return (C3688lw) mo40560b(new C3853qk("SESSION_", str).mo40947b(), str2);
    }

    /* renamed from: c */
    public String mo40534c(String str) {
        return mo40564c(new C3853qk("SESSION_", str).mo40947b(), "");
    }

    /* renamed from: h */
    public String mo40545h() {
        return mo40569s(f3727g.mo40947b());
    }

    /* renamed from: d */
    public C3688lw mo40538d(String str) {
        return (C3688lw) mo40560b(f3727g.mo40947b(), str);
    }

    /* renamed from: d */
    public C3688lw mo40536d(int i) {
        return (C3688lw) mo40553a(f3734n.mo40947b(), i);
    }

    /* renamed from: i */
    public int mo40546i() {
        return mo40558b(f3734n.mo40947b(), 1);
    }

    /* renamed from: j */
    public long mo40547j() {
        return mo40559b(f3733m.mo40947b(), -1);
    }

    /* renamed from: e */
    public C3688lw mo40540e(long j) {
        return (C3688lw) mo40554a(f3733m.mo40947b(), j);
    }

    /* renamed from: k */
    public long mo40548k() {
        return mo40559b(f3735o.mo40947b(), 0);
    }

    /* renamed from: f */
    public C3688lw mo40542f(long j) {
        return (C3688lw) mo40554a(f3735o.mo40947b(), j);
    }

    /* renamed from: l */
    public int mo40549l() {
        return mo40558b(f3737r.mo40947b(), -1);
    }

    /* renamed from: e */
    public C3688lw mo40539e(int i) {
        return (C3688lw) mo40553a(f3737r.mo40947b(), i);
    }

    /* renamed from: m */
    public boolean mo40550m() {
        return mo40562b(f3723c.mo40947b(), false);
    }

    /* renamed from: n */
    public C3688lw mo40551n() {
        return (C3688lw) mo40556a(f3723c.mo40947b(), true);
    }

    /* renamed from: o */
    public List<String> mo40552o() {
        return mo40561b(f3738s.mo40947b(), (List<String>) Collections.emptyList());
    }

    /* renamed from: a */
    public C3688lw mo40526a(List<String> list) {
        return (C3688lw) mo40555a(f3738s.mo40947b(), list);
    }
}
