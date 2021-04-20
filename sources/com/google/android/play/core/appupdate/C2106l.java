package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.internal.C2306p;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.appupdate.l */
class C2106l<T> extends C2306p {

    /* renamed from: a */
    final C2241ag f1440a;

    /* renamed from: b */
    final C2415i<T> f1441b;

    /* renamed from: c */
    final /* synthetic */ C2109o f1442c;

    C2106l(C2109o oVar, C2241ag agVar, C2415i<T> iVar) {
        this.f1442c = oVar;
        this.f1440a = agVar;
        this.f1441b = iVar;
    }

    /* renamed from: b */
    public void mo33530b(Bundle bundle) throws RemoteException {
        this.f1442c.f1447a.mo33820b();
        this.f1440a.mo33811d("onRequestInfo", new Object[0]);
    }

    /* renamed from: c */
    public void mo33531c(Bundle bundle) throws RemoteException {
        this.f1442c.f1447a.mo33820b();
        this.f1440a.mo33811d("onCompleteUpdate", new Object[0]);
    }
}
