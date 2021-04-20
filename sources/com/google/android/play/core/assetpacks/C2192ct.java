package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C2229a;
import com.google.android.play.core.internal.C2289ca;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.ct */
final class C2192ct {

    /* renamed from: a */
    private final C2138at f1770a;

    /* renamed from: b */
    private final C2289ca<C2220s> f1771b;

    /* renamed from: c */
    private final C2171bz f1772c;

    /* renamed from: d */
    private final C2289ca<Executor> f1773d;

    /* renamed from: e */
    private final C2159bn f1774e;

    /* renamed from: f */
    private final C2229a f1775f;

    C2192ct(C2138at atVar, C2289ca<C2220s> caVar, C2171bz bzVar, C2289ca<Executor> caVar2, C2159bn bnVar, C2229a aVar) {
        this.f1770a = atVar;
        this.f1771b = caVar;
        this.f1772c = bzVar;
        this.f1773d = caVar2;
        this.f1774e = bnVar;
        this.f1775f = aVar;
    }

    /* renamed from: a */
    public final void mo33738a(C2189cq cqVar) {
        Runnable runnable;
        Executor executor;
        File j = this.f1770a.mo33642j(cqVar.f1714k, cqVar.f1765a, cqVar.f1766b);
        File p = this.f1770a.mo33648p(cqVar.f1714k, cqVar.f1765a, cqVar.f1766b);
        if (!j.exists() || !p.exists()) {
            throw new C2155bj(String.format("Cannot find pack files to move for pack %s.", new Object[]{cqVar.f1714k}), cqVar.f1713j);
        }
        File f = this.f1770a.mo33638f(cqVar.f1714k, cqVar.f1765a, cqVar.f1766b);
        f.mkdirs();
        if (j.renameTo(f)) {
            new File(this.f1770a.mo33638f(cqVar.f1714k, cqVar.f1765a, cqVar.f1766b), "merge.tmp").delete();
            File g = this.f1770a.mo33639g(cqVar.f1714k, cqVar.f1765a, cqVar.f1766b);
            g.mkdirs();
            if (p.renameTo(g)) {
                if (this.f1775f.mo33792a()) {
                    executor = this.f1773d.mo33869a();
                    runnable = new C2190cr(this, cqVar);
                } else {
                    executor = this.f1773d.mo33869a();
                    C2138at atVar = this.f1770a;
                    atVar.getClass();
                    runnable = C2191cs.m1033a(atVar);
                }
                executor.execute(runnable);
                this.f1772c.mo33706f(cqVar.f1714k, cqVar.f1765a, cqVar.f1766b);
                this.f1774e.mo33696a(cqVar.f1714k);
                this.f1771b.mo33869a().mo33618f(cqVar.f1713j, cqVar.f1714k);
                return;
            }
            throw new C2155bj("Cannot move metadata files to final location.", cqVar.f1713j);
        }
        throw new C2155bj("Cannot move merged pack files to final location.", cqVar.f1713j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo33739b(C2189cq cqVar) {
        this.f1770a.mo33650r(cqVar.f1714k, cqVar.f1765a, cqVar.f1766b);
    }
}
