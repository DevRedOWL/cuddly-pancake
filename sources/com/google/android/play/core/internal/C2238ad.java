package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.ad */
public abstract class C2238ad extends C2301k implements C2239ae {
    public C2238ad() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo33803a(int i, Parcel parcel) throws RemoteException {
        if (i != 2) {
            return false;
        }
        mo33804b((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
        return true;
    }
}
