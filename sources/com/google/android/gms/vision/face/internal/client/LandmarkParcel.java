package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new zzm();
    public final int type;
    private final int versionCode;

    /* renamed from: x */
    public final float f1385x;

    /* renamed from: y */
    public final float f1386y;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.versionCode = i;
        this.f1385x = f;
        this.f1386y = f2;
        this.type = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeFloat(parcel, 2, this.f1385x);
        SafeParcelWriter.writeFloat(parcel, 3, this.f1386y);
        SafeParcelWriter.writeInt(parcel, 4, this.type);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
