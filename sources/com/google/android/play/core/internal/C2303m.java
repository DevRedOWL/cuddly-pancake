package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.m */
public final class C2303m extends C2300j implements C2305o {
    C2303m(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* renamed from: c */
    public final void mo33901c(String str, Bundle bundle, C2307q qVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, qVar);
        mo33898b(2, a);
    }

    /* renamed from: d */
    public final void mo33902d(String str, Bundle bundle, C2307q qVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, qVar);
        mo33898b(3, a);
    }
}
