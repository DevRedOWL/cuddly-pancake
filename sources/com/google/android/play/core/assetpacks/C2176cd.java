package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.C2269bh;
import com.google.android.play.core.internal.C2291cc;
import com.google.android.play.core.internal.C2293ce;

/* renamed from: com.google.android.play.core.assetpacks.cd */
public final class C2176cd implements C2293ce<C2175cc> {

    /* renamed from: a */
    private final C2293ce f1719a;

    /* renamed from: b */
    private final C2293ce f1720b;

    /* renamed from: c */
    private final C2293ce f1721c;

    /* renamed from: d */
    private final /* synthetic */ int f1722d = 0;

    public C2176cd(C2293ce<C2171bz> ceVar, C2293ce<C2138at> ceVar2, C2293ce<C2147bb> ceVar3) {
        this.f1719a = ceVar;
        this.f1720b = ceVar2;
        this.f1721c = ceVar3;
    }

    public C2176cd(C2293ce<Context> ceVar, C2293ce<C2131am> ceVar2, C2293ce<C2182cj> ceVar3, byte[] bArr) {
        this.f1721c = ceVar;
        this.f1720b = ceVar2;
        this.f1719a = ceVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33525a() {
        if (this.f1722d != 0) {
            C2220s sVar = (C2220s) (C2212l.m1083b(((C2216o) this.f1721c).mo33525a()) == null ? C2291cc.m1280c(this.f1720b).mo33869a() : C2291cc.m1280c(this.f1719a).mo33869a());
            C2269bh.m1221k(sVar);
            return sVar;
        }
        return new C2175cc((C2171bz) this.f1719a.mo33525a(), (C2138at) this.f1720b.mo33525a(), (C2147bb) this.f1721c.mo33525a());
    }
}
