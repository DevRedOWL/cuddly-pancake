package com.google.android.play.core.splitinstall;

import com.google.android.play.core.internal.C2291cc;
import com.google.android.play.core.internal.C2293ce;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import java.io.File;

/* renamed from: com.google.android.play.core.splitinstall.j */
public final class C2379j implements C2293ce<C2378i> {

    /* renamed from: a */
    private final C2293ce<C2402v> f2110a;

    /* renamed from: b */
    private final C2293ce<FakeSplitInstallManager> f2111b;

    /* renamed from: c */
    private final C2293ce<File> f2112c;

    public C2379j(C2293ce<C2402v> ceVar, C2293ce<FakeSplitInstallManager> ceVar2, C2293ce<File> ceVar3) {
        this.f2110a = ceVar;
        this.f2111b = ceVar2;
        this.f2112c = ceVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33525a() {
        return new C2378i(C2291cc.m1280c(this.f2110a), C2291cc.m1280c(this.f2111b), C2291cc.m1280c(this.f2112c));
    }
}
