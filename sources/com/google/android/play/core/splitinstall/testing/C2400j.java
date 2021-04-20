package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import com.google.android.play.core.internal.C2293ce;
import com.google.android.play.core.splitinstall.C2386p;
import com.google.android.play.core.splitinstall.C2405y;
import java.io.File;

/* renamed from: com.google.android.play.core.splitinstall.testing.j */
public final class C2400j implements C2293ce<FakeSplitInstallManager> {

    /* renamed from: a */
    private final C2293ce<Context> f2181a;

    /* renamed from: b */
    private final C2293ce<File> f2182b;

    /* renamed from: c */
    private final C2293ce<C2386p> f2183c;

    public C2400j(C2293ce<Context> ceVar, C2293ce<File> ceVar2, C2293ce<C2386p> ceVar3) {
        this.f2181a = ceVar;
        this.f2182b = ceVar2;
        this.f2183c = ceVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33525a() {
        return new FakeSplitInstallManager(((C2405y) this.f2181a).mo33525a(), this.f2182b.mo33525a(), this.f2183c.mo33525a());
    }
}
