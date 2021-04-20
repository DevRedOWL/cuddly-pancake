package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.appupdate.C2101g;
import com.google.android.play.core.internal.C2291cc;
import com.google.android.play.core.internal.C2293ce;
import com.google.android.play.core.splitinstall.testing.C2400j;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import java.io.File;

/* renamed from: com.google.android.play.core.splitinstall.c */
public final class C2372c implements C2382m {

    /* renamed from: a */
    private C2293ce<Context> f2095a;

    /* renamed from: b */
    private C2293ce<C2368au> f2096b = C2291cc.m1279b(new C2370aw(this.f2095a, (byte[]) null));

    /* renamed from: c */
    private C2293ce<C2389s> f2097c;

    /* renamed from: d */
    private C2293ce<C2386p> f2098d;

    /* renamed from: e */
    private C2293ce<C2369av> f2099e;

    /* renamed from: f */
    private C2293ce<C2402v> f2100f;

    /* renamed from: g */
    private C2293ce<File> f2101g;

    /* renamed from: h */
    private C2293ce<FakeSplitInstallManager> f2102h;

    /* renamed from: i */
    private C2293ce<C2378i> f2103i;

    /* renamed from: j */
    private C2293ce<SplitInstallManager> f2104j;

    /* synthetic */ C2372c(C2404x xVar) {
        this.f2095a = new C2405y(xVar);
        this.f2097c = C2291cc.m1279b(new C2348aa(xVar));
        this.f2098d = C2291cc.m1279b(C2101g.m775b(this.f2095a));
        this.f2099e = C2291cc.m1279b(new C2370aw(this.f2095a));
        this.f2100f = C2291cc.m1279b(new C2403w(this.f2096b, this.f2097c, this.f2098d, this.f2099e));
        this.f2101g = C2291cc.m1279b(new C2406z(this.f2095a));
        this.f2102h = C2291cc.m1279b(new C2400j(this.f2095a, this.f2101g, this.f2098d));
        this.f2103i = C2291cc.m1279b(new C2379j(this.f2100f, this.f2102h, this.f2101g));
        this.f2104j = C2291cc.m1279b(new C2349ab(xVar, this.f2103i));
    }

    /* renamed from: a */
    public final SplitInstallManager mo34022a() {
        return this.f2104j.mo33525a();
    }

    /* renamed from: b */
    public final File mo34023b() {
        return this.f2101g.mo33525a();
    }
}
