package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.assetpacks.aj */
final class C2128aj extends C2124af<Void> {

    /* renamed from: c */
    final int f1527c;

    /* renamed from: d */
    final String f1528d;

    /* renamed from: e */
    final int f1529e;

    /* renamed from: f */
    final /* synthetic */ C2131am f1530f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2128aj(C2131am amVar, C2415i<Void> iVar, int i, String str, int i2) {
        super(amVar, iVar);
        this.f1530f = amVar;
        this.f1527c = i;
        this.f1528d = str;
        this.f1529e = i2;
    }

    /* renamed from: g */
    public final void mo33605g(Bundle bundle) {
        this.f1530f.f1539e.mo33820b();
        int i = bundle.getInt("error_code");
        C2131am.f1535a.mo33809b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f1529e;
        if (i2 > 0) {
            this.f1530f.m870y(this.f1527c, this.f1528d, i2 - 1);
        }
    }
}
