package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3929rr;
import com.yandex.metrica.impl.p039ob.C4120tv;
import com.yandex.metrica.impl.p039ob.C4143uk;
import java.util.List;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.lz */
public class C3691lz extends C3689lx {

    /* renamed from: a */
    static final C3853qk f3764a = new C3853qk("PREF_KEY_UID_");

    /* renamed from: b */
    static final C3853qk f3765b = new C3853qk("PREF_KEY_DEVICE_ID_");

    /* renamed from: c */
    private static final C3853qk f3766c = new C3853qk("PREF_KEY_HOST_URL_");

    /* renamed from: d */
    private static final C3853qk f3767d = new C3853qk("PREF_KEY_HOST_URLS_FROM_STARTUP");

    /* renamed from: e */
    private static final C3853qk f3768e = new C3853qk("PREF_KEY_HOST_URLS_FROM_CLIENT");
    @Deprecated

    /* renamed from: f */
    private static final C3853qk f3769f = new C3853qk("PREF_KEY_REPORT_URL_");

    /* renamed from: g */
    private static final C3853qk f3770g = new C3853qk("PREF_KEY_REPORT_URLS_");
    @Deprecated

    /* renamed from: h */
    private static final C3853qk f3771h = new C3853qk("PREF_L_URL");

    /* renamed from: i */
    private static final C3853qk f3772i = new C3853qk("PREF_L_URLS");

    /* renamed from: j */
    private static final C3853qk f3773j = new C3853qk("PREF_KEY_GET_AD_URL");

    /* renamed from: k */
    private static final C3853qk f3774k = new C3853qk("PREF_KEY_REPORT_AD_URL");

    /* renamed from: l */
    private static final C3853qk f3775l = new C3853qk("PREF_KEY_STARTUP_OBTAIN_TIME_");

    /* renamed from: m */
    private static final C3853qk f3776m = new C3853qk("PREF_KEY_STARTUP_ENCODED_CLIDS_");

    /* renamed from: n */
    private static final C3853qk f3777n = new C3853qk("PREF_KEY_DISTRIBUTION_REFERRER_");

    /* renamed from: o */
    private static final C3853qk f3778o = new C3853qk("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_");
    @Deprecated

    /* renamed from: p */
    private static final C3853qk f3779p = new C3853qk("PREF_KEY_PINNING_UPDATE_URL");

    /* renamed from: r */
    private static final C3853qk f3780r = new C3853qk("PREF_KEY_EASY_COLLECTING_ENABLED_");

    /* renamed from: s */
    private static final C3853qk f3781s = new C3853qk("PREF_KEY_COLLECTING_PACKAGE_INFO_ENABLED_");

    /* renamed from: t */
    private static final C3853qk f3782t = new C3853qk("PREF_KEY_PERMISSIONS_COLLECTING_ENABLED_");

    /* renamed from: u */
    private static final C3853qk f3783u = new C3853qk("PREF_KEY_FEATURES_COLLECTING_ENABLED_");

    /* renamed from: v */
    private static final C3853qk f3784v = new C3853qk("SOCKET_CONFIG_");

    /* renamed from: w */
    private static final C3853qk f3785w = new C3853qk("LAST_STARTUP_REQUEST_CLIDS");

    /* renamed from: x */
    private static final C3853qk f3786x = new C3853qk("FLCC");

    /* renamed from: y */
    private static final C3853qk f3787y = new C3853qk("BKCC");

    /* renamed from: A */
    private C3853qk f3788A = mo40566q(f3764a.mo40945a());

    /* renamed from: B */
    private C3853qk f3789B = mo40566q(f3766c.mo40945a());

    /* renamed from: C */
    private C3853qk f3790C = mo40566q(f3767d.mo40945a());

    /* renamed from: D */
    private C3853qk f3791D = mo40566q(f3768e.mo40945a());
    @Deprecated

    /* renamed from: E */
    private C3853qk f3792E = mo40566q(f3769f.mo40945a());

    /* renamed from: F */
    private C3853qk f3793F = mo40566q(f3770g.mo40945a());
    @Deprecated

    /* renamed from: G */
    private C3853qk f3794G = mo40566q(f3771h.mo40945a());

    /* renamed from: H */
    private C3853qk f3795H = mo40566q(f3772i.mo40945a());

    /* renamed from: I */
    private C3853qk f3796I = mo40566q(f3773j.mo40945a());

    /* renamed from: J */
    private C3853qk f3797J = mo40566q(f3774k.mo40945a());

    /* renamed from: K */
    private C3853qk f3798K = mo40566q(f3775l.mo40945a());

    /* renamed from: L */
    private C3853qk f3799L = mo40566q(f3776m.mo40945a());

    /* renamed from: M */
    private C3853qk f3800M = mo40566q(f3777n.mo40945a());

    /* renamed from: N */
    private C3853qk f3801N = mo40566q(f3778o.mo40945a());

    /* renamed from: O */
    private C3853qk f3802O = mo40566q(f3780r.mo40945a());

    /* renamed from: P */
    private C3853qk f3803P = mo40566q(f3781s.mo40945a());

    /* renamed from: Q */
    private C3853qk f3804Q = mo40566q(f3782t.mo40945a());

    /* renamed from: R */
    private C3853qk f3805R = mo40566q(f3783u.mo40945a());

    /* renamed from: S */
    private C3853qk f3806S = mo40566q(f3784v.mo40945a());

    /* renamed from: T */
    private C3853qk f3807T = mo40566q(f3785w.mo40945a());

    /* renamed from: U */
    private C3853qk f3808U = mo40566q(f3786x.mo40945a());

    /* renamed from: V */
    private C3853qk f3809V = mo40566q(f3787y.mo40945a());

    /* renamed from: z */
    private C3853qk f3810z = new C3853qk(f3765b.mo40945a());

    public C3691lz(C3630lf lfVar, String str) {
        super(lfVar, str);
    }

    /* renamed from: a */
    public C3691lz mo40601a(String str) {
        return (C3691lz) mo40560b(this.f3788A.mo40947b(), str);
    }

    @Deprecated
    /* renamed from: b */
    public C3691lz mo40605b(String str) {
        return (C3691lz) mo40560b(this.f3810z.mo40947b(), str);
    }

    @Deprecated
    /* renamed from: c */
    public C3691lz mo40607c(String str) {
        return (C3691lz) mo40560b(this.f3792E.mo40947b(), str);
    }

    /* renamed from: a */
    public C3691lz mo40602a(List<String> list) {
        return (C3691lz) mo40560b(this.f3793F.mo40947b(), C4204vq.m5882a(list));
    }

    /* renamed from: b */
    public C3691lz mo40606b(List<String> list) {
        return (C3691lz) mo40560b(this.f3795H.mo40947b(), C4204vq.m5882a(list));
    }

    /* renamed from: d */
    public C3691lz mo40608d(String str) {
        return (C3691lz) mo40560b(this.f3797J.mo40947b(), str);
    }

    /* renamed from: e */
    public C3691lz mo40609e(String str) {
        return (C3691lz) mo40560b(this.f3796I.mo40947b(), str);
    }

    /* renamed from: f */
    public C3691lz mo40610f(String str) {
        return (C3691lz) mo40560b(this.f3789B.mo40947b(), str);
    }

    /* renamed from: a */
    public C3691lz mo40600a(long j) {
        return (C3691lz) mo40554a(this.f3798K.mo40947b(), j);
    }

    /* renamed from: g */
    public C3691lz mo40611g(String str) {
        return (C3691lz) mo40560b(this.f3799L.mo40947b(), str);
    }

    /* renamed from: h */
    public C3691lz mo40612h(String str) {
        return (C3691lz) mo40560b(this.f3800M.mo40947b(), str);
    }

    /* renamed from: a */
    public C3691lz mo40603a(boolean z) {
        return (C3691lz) mo40556a(this.f3801N.mo40947b(), z);
    }

    @Deprecated
    /* renamed from: a */
    public C4143uk mo40604a() {
        return new C4143uk.C4145a(new C4120tv.C4121a().mo41507a(mo40562b(this.f3802O.mo40947b(), C4120tv.C4122b.f5024a)).mo41509b(mo40562b(this.f3803P.mo40947b(), C4120tv.C4122b.f5025b)).mo41510c(mo40562b(this.f3804Q.mo40947b(), C4120tv.C4122b.f5026c)).mo41511d(mo40562b(this.f3805R.mo40947b(), C4120tv.C4122b.f5027d)).mo41508a()).mo41573a(mo40569s(this.f3788A.mo40947b())).mo41583c(C4204vq.m5897c(mo40569s(this.f3790C.mo40947b()))).mo41586d(C4204vq.m5897c(mo40569s(this.f3791D.mo40947b()))).mo41593h(mo40569s(this.f3799L.mo40947b())).mo41574a(C4204vq.m5897c(mo40569s(this.f3793F.mo40947b()))).mo41579b(C4204vq.m5897c(mo40569s(this.f3795H.mo40947b()))).mo41587e(mo40569s(this.f3796I.mo40947b())).mo41589f(mo40569s(this.f3797J.mo40947b())).mo41595j(mo40564c(this.f3800M.mo40947b(), (String) null)).mo41566a(m4041k(mo40569s(this.f3808U.mo40947b()))).mo41565a(m4042l(mo40569s(this.f3809V.mo40947b()))).mo41571a(C4129ub.m5558a(mo40569s(this.f3806S.mo40947b()))).mo41594i(mo40569s(this.f3807T.mo40947b())).mo41580b(mo40562b(this.f3801N.mo40947b(), true)).mo41564a(mo40559b(this.f3798K.mo40947b(), -1)).mo41576a();
    }

    /* renamed from: k */
    private C3774oh m4041k(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new C3715ms().mo40224a(m4039a(new JSONObject(str)));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    static C3929rr.C3930a.C3941e m4039a(JSONObject jSONObject) {
        C3929rr.C3930a.C3941e eVar = new C3929rr.C3930a.C3941e();
        eVar.f4512b = C4232wk.m6036a(C4204vq.m5880a(jSONObject, "uti"), eVar.f4512b);
        eVar.f4513c = C4232wk.m6034a(C4204vq.m5898d(jSONObject, "udi"), eVar.f4513c);
        eVar.f4514d = C4232wk.m6035a(C4204vq.m5893b(jSONObject, "rcff"), eVar.f4514d);
        eVar.f4515e = C4232wk.m6035a(C4204vq.m5893b(jSONObject, "mbs"), eVar.f4515e);
        eVar.f4516f = C4232wk.m6036a(C4204vq.m5880a(jSONObject, "maff"), eVar.f4516f);
        eVar.f4517g = C4232wk.m6035a(C4204vq.m5893b(jSONObject, "mrsl"), eVar.f4517g);
        eVar.f4518h = C4232wk.m6040a(C4204vq.m5896c(jSONObject, "ce"), eVar.f4518h);
        return eVar;
    }

    /* renamed from: l */
    private C3769oc m4042l(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return m4040b(new JSONObject(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    private C3769oc m4040b(JSONObject jSONObject) {
        C3929rr.C3930a.C3931a aVar = new C3929rr.C3930a.C3931a();
        aVar.f4464b = m4039a(jSONObject);
        aVar.f4465c = C4232wk.m6036a(C4204vq.m5880a(jSONObject, "cd"), aVar.f4465c);
        aVar.f4466d = C4232wk.m6036a(C4204vq.m5880a(jSONObject, "ci"), aVar.f4466d);
        return new C3708mn().mo40224a(aVar);
    }

    @Deprecated
    /* renamed from: i */
    public String mo40613i(String str) {
        return mo40564c(this.f3792E.mo40947b(), str);
    }

    @Deprecated
    /* renamed from: j */
    public String mo40614j(String str) {
        return mo40564c(this.f3794G.mo40947b(), str);
    }
}
