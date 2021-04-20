package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C2291cc;
import com.google.android.play.core.internal.C2293ce;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.ca */
public final class C2173ca implements C2293ce<C2171bz> {

    /* renamed from: a */
    private final C2293ce f1708a;

    /* renamed from: b */
    private final C2293ce f1709b;

    /* renamed from: c */
    private final C2293ce f1710c;

    /* renamed from: d */
    private final C2293ce f1711d;

    /* renamed from: e */
    private final /* synthetic */ int f1712e = 0;

    public C2173ca(C2293ce<C2138at> ceVar, C2293ce<C2220s> ceVar2, C2293ce<C2159bn> ceVar3, C2293ce<Executor> ceVar4) {
        this.f1708a = ceVar;
        this.f1709b = ceVar2;
        this.f1710c = ceVar3;
        this.f1711d = ceVar4;
    }

    public C2173ca(C2293ce<C2138at> ceVar, C2293ce<C2220s> ceVar2, C2293ce<C2135aq> ceVar3, C2293ce<C2159bn> ceVar4, byte[] bArr) {
        this.f1708a = ceVar;
        this.f1709b = ceVar2;
        this.f1710c = ceVar3;
        this.f1711d = ceVar4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33525a() {
        if (this.f1712e != 0) {
            return new C2154bi((C2138at) this.f1708a.mo33525a(), C2291cc.m1280c(this.f1709b), C2291cc.m1280c(this.f1710c), (C2159bn) this.f1711d.mo33525a());
        }
        Object a = this.f1708a.mo33525a();
        return new C2171bz((C2138at) a, C2291cc.m1280c(this.f1709b), (C2159bn) this.f1710c.mo33525a(), C2291cc.m1280c(this.f1711d));
    }
}
