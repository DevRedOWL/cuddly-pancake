package com.google.android.play.core.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.play.core.internal.l */
public final class C2302l {
    static {
        C2302l.class.getClassLoader();
    }

    private C2302l() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m1314a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m1315b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.IInterface, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1316c(android.os.Parcel r0, android.os.IInterface r1) {
        /*
            r0.writeStrongBinder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C2302l.m1316c(android.os.Parcel, android.os.IInterface):void");
    }
}
