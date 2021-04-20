package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.appupdate.m */
final class C2107m extends C2106l<Void> {
    C2107m(C2109o oVar, C2415i<Void> iVar) {
        super(oVar, new C2241ag("OnCompleteUpdateCallback"), iVar);
    }

    /* renamed from: c */
    public final void mo33531c(Bundle bundle) throws RemoteException {
        super.mo33531c(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f1441b.mo34075d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f1441b.mo34076e(null);
        }
    }
}
