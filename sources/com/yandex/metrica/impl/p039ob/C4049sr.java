package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C4204vq;

/* renamed from: com.yandex.metrica.impl.ob.sr */
public class C4049sr {

    /* renamed from: a */
    public final String f4791a;

    /* renamed from: b */
    public final String f4792b;
    @Deprecated

    /* renamed from: c */
    public final String f4793c;

    /* renamed from: d */
    public final String f4794d;

    /* renamed from: e */
    public final String f4795e;

    /* renamed from: f */
    public final String f4796f;

    /* renamed from: g */
    public final String f4797g;

    /* renamed from: h */
    public final String f4798h;

    /* renamed from: i */
    public final String f4799i;

    /* renamed from: j */
    public final String f4800j;

    /* renamed from: k */
    public final String f4801k;

    /* renamed from: l */
    public final String f4802l;

    /* renamed from: m */
    public final String f4803m;

    /* renamed from: n */
    public final String f4804n;

    /* renamed from: o */
    public final String f4805o;

    public C4049sr(C4204vq.C4205a aVar) {
        String str;
        this.f4791a = aVar.mo41700a("dId");
        this.f4792b = aVar.mo41700a("uId");
        this.f4793c = aVar.mo41701b("kitVer");
        this.f4794d = aVar.mo41700a("analyticsSdkVersionName");
        this.f4795e = aVar.mo41700a("kitBuildNumber");
        this.f4796f = aVar.mo41700a("kitBuildType");
        this.f4797g = aVar.mo41700a("appVer");
        this.f4798h = aVar.optString("app_debuggable", "0");
        this.f4799i = aVar.mo41700a("appBuild");
        this.f4800j = aVar.mo41700a("osVer");
        this.f4802l = aVar.mo41700a("lang");
        this.f4803m = aVar.mo41700a("root");
        this.f4804n = aVar.optString("app_framework", C3266ci.m2614b());
        int optInt = aVar.optInt("osApiLev", -1);
        String str2 = null;
        if (optInt == -1) {
            str = null;
        } else {
            str = String.valueOf(optInt);
        }
        this.f4801k = str;
        int optInt2 = aVar.optInt("attribution_id", 0);
        this.f4805o = optInt2 > 0 ? String.valueOf(optInt2) : str2;
    }

    public C4049sr() {
        this.f4791a = null;
        this.f4792b = null;
        this.f4793c = null;
        this.f4794d = null;
        this.f4795e = null;
        this.f4796f = null;
        this.f4797g = null;
        this.f4798h = null;
        this.f4799i = null;
        this.f4800j = null;
        this.f4801k = null;
        this.f4802l = null;
        this.f4803m = null;
        this.f4804n = null;
        this.f4805o = null;
    }
}
