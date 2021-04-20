package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.C2291cc;
import com.google.android.play.core.internal.C2293ce;

/* renamed from: com.google.android.play.core.appupdate.w */
public final class C2117w {

    /* renamed from: a */
    private C2293ce<Context> f1488a;

    /* renamed from: b */
    private C2293ce<C2111q> f1489b = C2291cc.m1279b(new C2101g(this.f1488a, (char[]) null));

    /* renamed from: c */
    private C2293ce<C2109o> f1490c = C2291cc.m1279b(new C2110p(this.f1488a, this.f1489b));

    /* renamed from: d */
    private C2293ce<C2095a> f1491d = C2291cc.m1279b(new C2101g(this.f1488a, (byte[]) null));

    /* renamed from: e */
    private C2293ce<C2098d> f1492e = C2291cc.m1279b(new C2099e(this.f1490c, this.f1491d, this.f1488a));

    /* renamed from: f */
    private C2293ce<AppUpdateManager> f1493f = C2291cc.m1279b(new C2101g(this.f1492e));

    /* synthetic */ C2117w(C2100f fVar) {
        this.f1488a = new C2102h(fVar);
    }

    /* renamed from: a */
    public final AppUpdateManager mo33562a() {
        return this.f1493f.mo33525a();
    }
}
