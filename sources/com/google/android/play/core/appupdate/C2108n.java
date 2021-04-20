package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.appupdate.n */
final class C2108n extends C2106l<AppUpdateInfo> {

    /* renamed from: d */
    final /* synthetic */ C2109o f1443d;

    /* renamed from: e */
    private final String f1444e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2108n(C2109o oVar, C2415i<AppUpdateInfo> iVar, String str) {
        super(oVar, new C2241ag("OnRequestInstallCallback"), iVar);
        this.f1443d = oVar;
        this.f1444e = str;
    }

    /* renamed from: b */
    public final void mo33530b(Bundle bundle) throws RemoteException {
        super.mo33530b(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f1441b.mo34075d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f1441b.mo34076e(C2109o.m791h(this.f1443d, bundle, this.f1444e));
        }
    }
}
