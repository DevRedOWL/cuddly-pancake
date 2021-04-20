package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C2238ad;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.review.f */
class C2326f<T> extends C2238ad {

    /* renamed from: a */
    final C2241ag f2002a;

    /* renamed from: b */
    final C2415i<T> f2003b;

    /* renamed from: c */
    final /* synthetic */ C2328h f2004c;

    C2326f(C2328h hVar, C2241ag agVar, C2415i<T> iVar) {
        this.f2004c = hVar;
        this.f2002a = agVar;
        this.f2003b = iVar;
    }

    /* renamed from: b */
    public void mo33804b(Bundle bundle) throws RemoteException {
        this.f2004c.f2006a.mo33820b();
        this.f2002a.mo33811d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
