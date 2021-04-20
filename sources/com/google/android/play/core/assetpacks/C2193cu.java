package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.C2229a;
import com.google.android.play.core.internal.C2291cc;
import com.google.android.play.core.internal.C2293ce;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.assetpacks.cu */
public final class C2193cu implements C2293ce<C2192ct> {

    /* renamed from: a */
    private final C2293ce f1776a;

    /* renamed from: b */
    private final C2293ce f1777b;

    /* renamed from: c */
    private final C2293ce f1778c;

    /* renamed from: d */
    private final C2293ce f1779d;

    /* renamed from: e */
    private final C2293ce f1780e;

    /* renamed from: f */
    private final C2293ce f1781f;

    /* renamed from: g */
    private final /* synthetic */ int f1782g = 0;

    public C2193cu(C2293ce<C2138at> ceVar, C2293ce<C2220s> ceVar2, C2293ce<C2171bz> ceVar3, C2293ce<Executor> ceVar4, C2293ce<C2159bn> ceVar5, C2293ce<C2229a> ceVar6) {
        this.f1776a = ceVar;
        this.f1777b = ceVar2;
        this.f1778c = ceVar3;
        this.f1779d = ceVar4;
        this.f1780e = ceVar5;
        this.f1781f = ceVar6;
    }

    public C2193cu(C2293ce<String> ceVar, C2293ce<C2135aq> ceVar2, C2293ce<C2159bn> ceVar3, C2293ce<Context> ceVar4, C2293ce<C2194cv> ceVar5, C2293ce<Executor> ceVar6, byte[] bArr) {
        this.f1781f = ceVar;
        this.f1777b = ceVar2;
        this.f1780e = ceVar3;
        this.f1779d = ceVar4;
        this.f1778c = ceVar5;
        this.f1776a = ceVar6;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33525a() {
        if (this.f1782g != 0) {
            String str = (String) this.f1781f.mo33525a();
            Object a = this.f1777b.mo33525a();
            Object a2 = this.f1780e.mo33525a();
            Context b = ((C2216o) this.f1779d).mo33525a();
            Object a3 = this.f1778c.mo33525a();
            return new C2182cj(str != null ? new File(b.getExternalFilesDir((String) null), str) : b.getExternalFilesDir((String) null), (C2135aq) a, (C2159bn) a2, b, (C2194cv) a3, C2291cc.m1280c(this.f1776a));
        }
        Object a4 = this.f1776a.mo33525a();
        return new C2192ct((C2138at) a4, C2291cc.m1280c(this.f1777b), (C2171bz) this.f1778c.mo33525a(), C2291cc.m1280c(this.f1779d), (C2159bn) this.f1780e.mo33525a(), (C2229a) this.f1781f.mo33525a());
    }
}
