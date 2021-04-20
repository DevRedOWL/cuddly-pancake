package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C2229a;
import com.google.android.play.core.internal.C2289ca;
import com.google.android.play.core.internal.C2291cc;
import com.google.android.play.core.internal.C2293ce;
import com.google.android.play.core.splitinstall.C2386p;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.j */
public final class C2210j implements C2293ce<C2209i> {

    /* renamed from: a */
    private final C2293ce<C2138at> f1845a;

    /* renamed from: b */
    private final C2293ce<C2220s> f1846b;

    /* renamed from: c */
    private final C2293ce<C2135aq> f1847c;

    /* renamed from: d */
    private final C2293ce<C2386p> f1848d;

    /* renamed from: e */
    private final C2293ce<C2171bz> f1849e;

    /* renamed from: f */
    private final C2293ce<C2159bn> f1850f;

    /* renamed from: g */
    private final C2293ce<C2149bd> f1851g;

    /* renamed from: h */
    private final C2293ce<Executor> f1852h;

    /* renamed from: i */
    private final C2293ce<C2229a> f1853i;

    public C2210j(C2293ce<C2138at> ceVar, C2293ce<C2220s> ceVar2, C2293ce<C2135aq> ceVar3, C2293ce<C2386p> ceVar4, C2293ce<C2171bz> ceVar5, C2293ce<C2159bn> ceVar6, C2293ce<C2149bd> ceVar7, C2293ce<Executor> ceVar8, C2293ce<C2229a> ceVar9) {
        this.f1845a = ceVar;
        this.f1846b = ceVar2;
        this.f1847c = ceVar3;
        this.f1848d = ceVar4;
        this.f1849e = ceVar5;
        this.f1850f = ceVar6;
        this.f1851g = ceVar7;
        this.f1852h = ceVar8;
        this.f1853i = ceVar9;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33525a() {
        C2138at a = this.f1845a.mo33525a();
        C2289ca<C2220s> c = C2291cc.m1280c(this.f1846b);
        C2135aq a2 = this.f1847c.mo33525a();
        C2171bz a3 = this.f1849e.mo33525a();
        C2159bn a4 = this.f1850f.mo33525a();
        C2159bn bnVar = a4;
        return new C2209i(a, c, a2, this.f1848d.mo33525a(), a3, bnVar, this.f1851g.mo33525a(), C2291cc.m1280c(this.f1852h), this.f1853i.mo33525a());
    }
}
