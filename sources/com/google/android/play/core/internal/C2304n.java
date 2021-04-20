package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.n */
public abstract class C2304n extends C2301k implements C2305o {
    /* renamed from: b */
    public static C2305o m1319b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C2305o ? (C2305o) queryLocalInterface : new C2303m(iBinder);
    }
}
