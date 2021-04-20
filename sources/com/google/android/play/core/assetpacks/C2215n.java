package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.C2269bh;
import com.google.android.play.core.internal.C2291cc;
import com.google.android.play.core.internal.C2293ce;

/* renamed from: com.google.android.play.core.assetpacks.n */
public final class C2215n implements C2293ce<AssetPackManager> {

    /* renamed from: a */
    private final C2293ce f1861a;

    /* renamed from: b */
    private final C2293ce f1862b;

    /* renamed from: c */
    private final /* synthetic */ int f1863c = 0;

    public C2215n(C2293ce<C2209i> ceVar, C2293ce<Context> ceVar2) {
        this.f1861a = ceVar;
        this.f1862b = ceVar2;
    }

    public C2215n(C2293ce<Context> ceVar, C2293ce<C2138at> ceVar2, byte[] bArr) {
        this.f1862b = ceVar;
        this.f1861a = ceVar2;
    }

    public C2215n(C2293ce<Context> ceVar, C2293ce<C2159bn> ceVar2, char[] cArr) {
        this.f1861a = ceVar;
        this.f1862b = ceVar2;
    }

    public C2215n(C2293ce<C2138at> ceVar, C2293ce<C2220s> ceVar2, int[] iArr) {
        this.f1862b = ceVar;
        this.f1861a = ceVar2;
    }

    public C2215n(C2293ce<Context> ceVar, C2293ce<C2194cv> ceVar2, short[] sArr) {
        this.f1861a = ceVar;
        this.f1862b = ceVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33525a() {
        int i = this.f1863c;
        if (i == 0) {
            Object a = this.f1861a.mo33525a();
            Context b = ((C2216o) this.f1862b).mo33525a();
            C2209i iVar = (C2209i) a;
            C2269bh.m1218h(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
            C2269bh.m1218h(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
            PlayCoreDialogWrapperActivity.m1114a(b);
            C2269bh.m1221k(iVar);
            return iVar;
        } else if (i == 1) {
            return new C2145b(((C2216o) this.f1862b).mo33525a(), (C2138at) this.f1861a.mo33525a());
        } else {
            if (i == 2) {
                return new C2131am(((C2216o) this.f1861a).mo33525a(), (C2159bn) this.f1862b.mo33525a());
            }
            if (i == 3) {
                return new C2138at(((C2216o) this.f1861a).mo33525a(), (C2194cv) this.f1862b.mo33525a());
            }
            return new C2196cx((C2138at) this.f1862b.mo33525a(), C2291cc.m1280c(this.f1861a));
        }
    }
}
