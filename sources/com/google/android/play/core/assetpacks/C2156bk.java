package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2289ca;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.assetpacks.bk */
final class C2156bk {

    /* renamed from: a */
    private static final C2241ag f1642a = new C2241ag("ExtractorLooper");

    /* renamed from: b */
    private final C2171bz f1643b;

    /* renamed from: c */
    private final C2154bi f1644c;

    /* renamed from: d */
    private final C2203dd f1645d;

    /* renamed from: e */
    private final C2187co f1646e;

    /* renamed from: f */
    private final C2192ct f1647f;

    /* renamed from: g */
    private final C2196cx f1648g;

    /* renamed from: h */
    private final C2289ca<C2220s> f1649h;

    /* renamed from: i */
    private final C2175cc f1650i;

    /* renamed from: j */
    private final AtomicBoolean f1651j = new AtomicBoolean(false);

    C2156bk(C2171bz bzVar, C2289ca<C2220s> caVar, C2154bi biVar, C2203dd ddVar, C2187co coVar, C2192ct ctVar, C2196cx cxVar, C2175cc ccVar) {
        this.f1643b = bzVar;
        this.f1649h = caVar;
        this.f1644c = biVar;
        this.f1645d = ddVar;
        this.f1646e = coVar;
        this.f1647f = ctVar;
        this.f1648g = cxVar;
        this.f1650i = ccVar;
    }

    /* renamed from: b */
    private final void m955b(int i, Exception exc) {
        try {
            this.f1643b.mo33716p(i);
            this.f1643b.mo33707g(i);
        } catch (C2155bj unused) {
            f1642a.mo33809b("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33692a() {
        f1642a.mo33808a("Run extractor loop", new Object[0]);
        if (this.f1651j.compareAndSet(false, true)) {
            while (true) {
                C2174cb cbVar = null;
                try {
                    cbVar = this.f1650i.mo33717a();
                } catch (C2155bj e) {
                    f1642a.mo33809b("Error while getting next extraction task: %s", e.getMessage());
                    if (e.f1641a >= 0) {
                        this.f1649h.mo33869a().mo33619g(e.f1641a);
                        m955b(e.f1641a, e);
                    }
                }
                if (cbVar != null) {
                    try {
                        if (cbVar instanceof C2153bh) {
                            this.f1644c.mo33691a((C2153bh) cbVar);
                        } else if (cbVar instanceof C2202dc) {
                            this.f1645d.mo33765a((C2202dc) cbVar);
                        } else if (cbVar instanceof C2186cn) {
                            this.f1646e.mo33735a((C2186cn) cbVar);
                        } else if (cbVar instanceof C2189cq) {
                            this.f1647f.mo33738a((C2189cq) cbVar);
                        } else if (cbVar instanceof C2195cw) {
                            this.f1648g.mo33741a((C2195cw) cbVar);
                        } else {
                            f1642a.mo33809b("Unknown task type: %s", cbVar.getClass().getName());
                        }
                    } catch (Exception e2) {
                        f1642a.mo33809b("Error during extraction task: %s", e2.getMessage());
                        this.f1649h.mo33869a().mo33619g(cbVar.f1713j);
                        m955b(cbVar.f1713j, e2);
                    }
                } else {
                    this.f1651j.set(false);
                    return;
                }
            }
        } else {
            f1642a.mo33812e("runLoop already looping; return", new Object[0]);
        }
    }
}
