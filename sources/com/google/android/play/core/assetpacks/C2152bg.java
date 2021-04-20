package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.appupdate.C2101g;
import com.google.android.play.core.common.C2229a;
import com.google.android.play.core.common.C2231c;
import com.google.android.play.core.internal.C2290cb;
import com.google.android.play.core.internal.C2291cc;
import com.google.android.play.core.internal.C2293ce;
import com.google.android.play.core.splitinstall.C2386p;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.bg */
public final class C2152bg implements C2118a {

    /* renamed from: A */
    private C2293ce<C2145b> f1599A;

    /* renamed from: a */
    private final C2212l f1600a;

    /* renamed from: b */
    private C2293ce<Context> f1601b;

    /* renamed from: c */
    private C2293ce<C2194cv> f1602c = C2291cc.m1279b(new C2188cp(this.f1601b, (char[]) null));

    /* renamed from: d */
    private C2293ce<C2138at> f1603d = C2291cc.m1279b(new C2215n(this.f1601b, this.f1602c, (short[]) null));

    /* renamed from: e */
    private C2293ce<C2159bn> f1604e = C2291cc.m1279b(C2160bo.f1669a);

    /* renamed from: f */
    private C2293ce<C2131am> f1605f = C2291cc.m1279b(new C2215n(this.f1601b, this.f1604e, (char[]) null));

    /* renamed from: g */
    private C2293ce<String> f1606g = C2291cc.m1279b(new C2217p(this.f1601b));

    /* renamed from: h */
    private C2293ce<C2220s> f1607h = new C2290cb();

    /* renamed from: i */
    private C2293ce<Executor> f1608i = C2291cc.m1279b(C2213m.f1858a);

    /* renamed from: j */
    private C2293ce<C2171bz> f1609j = C2291cc.m1279b(new C2173ca(this.f1603d, this.f1607h, this.f1604e, this.f1608i));

    /* renamed from: k */
    private C2293ce<C2135aq> f1610k = new C2290cb();

    /* renamed from: l */
    private C2293ce<C2154bi> f1611l = C2291cc.m1279b(new C2173ca(this.f1603d, this.f1607h, this.f1610k, this.f1604e, (byte[]) null));

    /* renamed from: m */
    private C2293ce<C2203dd> f1612m = C2291cc.m1279b(new C2188cp(this.f1603d, (short[]) null));

    /* renamed from: n */
    private C2293ce<C2187co> f1613n = C2291cc.m1279b(new C2188cp(this.f1603d));

    /* renamed from: o */
    private C2293ce<C2229a> f1614o = C2291cc.m1279b(C2231c.m1120b());

    /* renamed from: p */
    private C2293ce<C2192ct> f1615p = C2291cc.m1279b(new C2193cu(this.f1603d, this.f1607h, this.f1609j, this.f1608i, this.f1604e, this.f1614o));

    /* renamed from: q */
    private C2293ce<C2196cx> f1616q = C2291cc.m1279b(new C2215n(this.f1603d, this.f1607h, (int[]) null));

    /* renamed from: r */
    private C2293ce<C2147bb> f1617r = C2291cc.m1279b(new C2188cp(this.f1607h, (byte[]) null));

    /* renamed from: s */
    private C2293ce<C2175cc> f1618s = C2291cc.m1279b(new C2176cd(this.f1609j, this.f1603d, this.f1617r));

    /* renamed from: t */
    private C2293ce<C2156bk> f1619t = C2291cc.m1279b(new C2157bl(this.f1609j, this.f1607h, this.f1611l, this.f1612m, this.f1613n, this.f1615p, this.f1616q, this.f1618s));

    /* renamed from: u */
    private C2293ce<C2149bd> f1620u = C2291cc.m1279b(C2150be.f1597a);

    /* renamed from: v */
    private C2293ce<Executor> f1621v = C2291cc.m1279b(C2218q.f1866a);

    /* renamed from: w */
    private C2293ce<C2182cj> f1622w;

    /* renamed from: x */
    private C2293ce<C2386p> f1623x;

    /* renamed from: y */
    private C2293ce<C2209i> f1624y;

    /* renamed from: z */
    private C2293ce<AssetPackManager> f1625z;

    /* synthetic */ C2152bg(C2212l lVar) {
        this.f1600a = lVar;
        this.f1601b = new C2216o(lVar);
        C2290cb.m1277b(this.f1610k, C2291cc.m1279b(new C2157bl(this.f1601b, this.f1609j, this.f1619t, this.f1607h, this.f1604e, this.f1620u, this.f1608i, this.f1621v, (byte[]) null)));
        this.f1622w = C2291cc.m1279b(new C2193cu(this.f1606g, this.f1610k, this.f1604e, this.f1601b, this.f1602c, this.f1608i, (byte[]) null));
        C2290cb.m1277b(this.f1607h, C2291cc.m1279b(new C2176cd(this.f1601b, this.f1605f, this.f1622w, (byte[]) null)));
        this.f1623x = C2291cc.m1279b(C2101g.m775b(this.f1601b));
        this.f1624y = C2291cc.m1279b(new C2210j(this.f1603d, this.f1607h, this.f1610k, this.f1623x, this.f1609j, this.f1604e, this.f1620u, this.f1608i, this.f1614o));
        this.f1625z = C2291cc.m1279b(new C2215n(this.f1624y, this.f1601b));
        this.f1599A = C2291cc.m1279b(new C2215n(this.f1601b, this.f1603d, (byte[]) null));
    }

    /* renamed from: a */
    public final AssetPackManager mo33597a() {
        return this.f1625z.mo33525a();
    }

    /* renamed from: b */
    public final void mo33598b(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f1495a = this.f1599A.mo33525a();
    }

    /* renamed from: c */
    public final void mo33599c(ExtractionForegroundService extractionForegroundService) {
        extractionForegroundService.f1497a = C2216o.m1088c(this.f1600a);
        extractionForegroundService.f1498b = this.f1624y.mo33525a();
    }
}
