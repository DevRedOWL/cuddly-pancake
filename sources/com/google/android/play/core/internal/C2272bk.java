package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.bk */
public abstract class C2272bk extends C2301k implements C2273bl {
    /* renamed from: b */
    public static C2273bl m1236b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof C2273bl ? (C2273bl) queryLocalInterface : new C2271bj(iBinder);
    }
}
