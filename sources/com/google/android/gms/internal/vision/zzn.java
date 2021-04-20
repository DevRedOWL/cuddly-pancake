package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.vision.Frame;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();
    public int height;

    /* renamed from: id */
    public int f1381id;
    public int rotation;
    public int width;
    public long zzat;

    public zzn() {
    }

    public zzn(int i, int i2, int i3, long j, int i4) {
        this.width = i;
        this.height = i2;
        this.f1381id = i3;
        this.zzat = j;
        this.rotation = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.width);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.f1381id);
        SafeParcelWriter.writeLong(parcel, 5, this.zzat);
        SafeParcelWriter.writeInt(parcel, 6, this.rotation);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzn zzc(Frame frame) {
        zzn zzn = new zzn();
        zzn.width = frame.getMetadata().getWidth();
        zzn.height = frame.getMetadata().getHeight();
        zzn.rotation = frame.getMetadata().getRotation();
        zzn.f1381id = frame.getMetadata().getId();
        zzn.zzat = frame.getMetadata().getTimestampMillis();
        return zzn;
    }
}
