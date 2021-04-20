package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.p */
public abstract class C2306p extends C2301k implements C2307q {
    public C2306p() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo33803a(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            mo33530b((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo33531c((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
