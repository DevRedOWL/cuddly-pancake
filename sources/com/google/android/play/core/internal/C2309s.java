package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.s */
public abstract class C2309s extends C2301k implements C2310t {
    /* renamed from: b */
    public static C2310t m1335b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof C2310t ? (C2310t) queryLocalInterface : new C2308r(iBinder);
    }
}
