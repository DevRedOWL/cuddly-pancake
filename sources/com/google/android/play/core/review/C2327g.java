package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C2241ag;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.review.g */
final class C2327g extends C2326f<ReviewInfo> {
    C2327g(C2328h hVar, C2415i iVar) {
        super(hVar, new C2241ag("OnRequestInstallCallback"), iVar);
    }

    /* renamed from: b */
    public final void mo33804b(Bundle bundle) throws RemoteException {
        super.mo33804b(bundle);
        this.f2003b.mo34076e(ReviewInfo.m1388b((PendingIntent) bundle.get("confirmation_intent")));
    }
}
