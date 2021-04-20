package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.y */
public final class C2315y extends C2300j implements C2316z {
    C2315y(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* renamed from: c */
    public final void mo33913c(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel a = mo33896a();
        C2302l.m1315b(a, bundle);
        C2302l.m1315b(a, bundle2);
        mo33898b(2, a);
    }

    /* renamed from: d */
    public final void mo33914d(Bundle bundle) throws RemoteException {
        Parcel a = mo33896a();
        C2302l.m1315b(a, bundle);
        mo33898b(3, a);
    }

    /* renamed from: e */
    public final void mo33915e(Bundle bundle) throws RemoteException {
        Parcel a = mo33896a();
        C2302l.m1315b(a, bundle);
        mo33898b(4, a);
    }
}
