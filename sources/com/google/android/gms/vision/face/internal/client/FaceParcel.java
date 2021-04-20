package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new zzd();
    public final float centerX;
    public final float centerY;
    public final float height;

    /* renamed from: id */
    public final int f1384id;
    private final int versionCode;
    public final float width;
    public final float zzcg;
    public final float zzch;
    public final float zzci;
    public final float zzdb;
    public final float zzdc;
    public final float zzdd;
    public final LandmarkParcel[] zzde;
    public final zza[] zzdf;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, zza[] zzaArr) {
        this.versionCode = i;
        this.f1384id = i2;
        this.centerX = f;
        this.centerY = f2;
        this.width = f3;
        this.height = f4;
        this.zzdb = f5;
        this.zzdc = f6;
        this.zzdd = f7;
        this.zzde = landmarkParcelArr;
        this.zzcg = f8;
        this.zzch = f9;
        this.zzci = f10;
        this.zzdf = zzaArr;
    }

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, LandmarkParcel[] landmarkParcelArr, float f7, float f8, float f9) {
        this(i, i2, f, f2, f3, f4, f5, f6, 0.0f, landmarkParcelArr, f7, f8, f9, new zza[0]);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeInt(parcel, 2, this.f1384id);
        SafeParcelWriter.writeFloat(parcel, 3, this.centerX);
        SafeParcelWriter.writeFloat(parcel, 4, this.centerY);
        SafeParcelWriter.writeFloat(parcel, 5, this.width);
        SafeParcelWriter.writeFloat(parcel, 6, this.height);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzdb);
        SafeParcelWriter.writeFloat(parcel, 8, this.zzdc);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.zzde, i, false);
        SafeParcelWriter.writeFloat(parcel, 10, this.zzcg);
        SafeParcelWriter.writeFloat(parcel, 11, this.zzch);
        SafeParcelWriter.writeFloat(parcel, 12, this.zzci);
        SafeParcelWriter.writeTypedArray(parcel, 13, this.zzdf, i, false);
        SafeParcelWriter.writeFloat(parcel, 14, this.zzdd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
