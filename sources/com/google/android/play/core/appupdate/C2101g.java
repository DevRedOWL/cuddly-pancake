package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.C2269bh;
import com.google.android.play.core.internal.C2293ce;
import com.google.android.play.core.splitinstall.C2386p;

/* renamed from: com.google.android.play.core.appupdate.g */
public final class C2101g implements C2293ce<AppUpdateManager> {

    /* renamed from: a */
    private final C2293ce f1430a;

    /* renamed from: b */
    private final /* synthetic */ int f1431b = 0;

    public C2101g(C2293ce<C2098d> ceVar) {
        this.f1430a = ceVar;
    }

    public C2101g(C2293ce<Context> ceVar, byte[] bArr) {
        this.f1430a = ceVar;
    }

    public C2101g(C2293ce<Context> ceVar, char[] cArr) {
        this.f1430a = ceVar;
    }

    public C2101g(C2293ce<Context> ceVar, short[] sArr) {
        this.f1430a = ceVar;
    }

    /* renamed from: b */
    public static C2101g m775b(C2293ce<Context> ceVar) {
        return new C2101g(ceVar, (short[]) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33525a() {
        int i = this.f1431b;
        if (i != 0) {
            return i != 1 ? i != 2 ? new C2386p((Context) this.f1430a.mo33525a()) : new C2111q(((C2102h) this.f1430a).mo33525a()) : new C2095a(((C2102h) this.f1430a).mo33525a());
        }
        C2098d dVar = (C2098d) this.f1430a.mo33525a();
        C2269bh.m1221k(dVar);
        return dVar;
    }
}
