package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.ab */
public abstract class C2236ab extends C2301k implements C2237ac {
    /* renamed from: b */
    public static C2237ac m1126b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof C2237ac ? (C2237ac) queryLocalInterface : new C2235aa(iBinder);
    }
}
