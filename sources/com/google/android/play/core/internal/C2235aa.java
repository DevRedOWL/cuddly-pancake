package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.aa */
public final class C2235aa extends C2300j implements C2237ac {
    C2235aa(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* renamed from: c */
    public final void mo33802c(String str, Bundle bundle, C2239ae aeVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, aeVar);
        mo33898b(2, a);
    }
}
