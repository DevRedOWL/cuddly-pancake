package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2269bh;
import com.google.android.play.core.internal.C2287bz;
import com.google.android.play.core.internal.C2289ca;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.google.android.play.core.assetpacks.cx */
final class C2196cx {

    /* renamed from: a */
    private static final C2241ag f1794a = new C2241ag("PatchSliceTaskHandler");

    /* renamed from: b */
    private final C2138at f1795b;

    /* renamed from: c */
    private final C2289ca<C2220s> f1796c;

    C2196cx(C2138at atVar, C2289ca<C2220s> caVar) {
        this.f1795b = atVar;
        this.f1796c = caVar;
    }

    /* renamed from: a */
    public final void mo33741a(C2195cw cwVar) {
        InputStream inputStream;
        File f = this.f1795b.mo33638f(cwVar.f1714k, cwVar.f1786a, cwVar.f1787b);
        C2138at atVar = this.f1795b;
        String str = cwVar.f1714k;
        int i = cwVar.f1786a;
        long j = cwVar.f1787b;
        File file = new File(atVar.mo33639g(str, i, j), cwVar.f1791f);
        try {
            inputStream = cwVar.f1793h;
            if (cwVar.f1790e == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            C2140av avVar = new C2140av(f, file);
            File h = this.f1795b.mo33640h(cwVar.f1714k, cwVar.f1788c, cwVar.f1789d, cwVar.f1791f);
            if (!h.exists()) {
                h.mkdirs();
            }
            C2198cz czVar = new C2198cz(this.f1795b, cwVar.f1714k, cwVar.f1788c, cwVar.f1789d, cwVar.f1791f);
            C2269bh.m1222l(avVar, inputStream, new C2158bm(h, czVar), cwVar.f1792g);
            czVar.mo33753d(0);
            inputStream.close();
            f1794a.mo33811d("Patching and extraction finished for slice %s of pack %s.", cwVar.f1791f, cwVar.f1714k);
            this.f1796c.mo33869a().mo33617e(cwVar.f1713j, cwVar.f1714k, cwVar.f1791f, 0);
            try {
                cwVar.f1793h.close();
                return;
            } catch (IOException unused) {
                f1794a.mo33812e("Could not close file for slice %s of pack %s.", cwVar.f1791f, cwVar.f1714k);
                return;
            }
        } catch (IOException e) {
            f1794a.mo33809b("IOException during patching %s.", e.getMessage());
            throw new C2155bj(String.format("Error patching slice %s of pack %s.", new Object[]{cwVar.f1791f, cwVar.f1714k}), e, cwVar.f1713j);
        } catch (Throwable th) {
            C2287bz.m1273a(th, th);
        }
        throw th;
    }
}
