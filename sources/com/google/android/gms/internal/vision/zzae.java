package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();
    private final float zzdo;
    public final String zzex;
    public final zzan[] zzfc;
    public final zzy zzfd;
    private final zzy zzfe;
    private final zzy zzff;
    public final String zzfg;
    private final int zzfh;
    public final boolean zzfi;
    public final int zzfj;
    public final int zzfk;

    public zzae(zzan[] zzanArr, zzy zzy, zzy zzy2, zzy zzy3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.zzfc = zzanArr;
        this.zzfd = zzy;
        this.zzfe = zzy2;
        this.zzff = zzy3;
        this.zzfg = str;
        this.zzdo = f;
        this.zzex = str2;
        this.zzfh = i;
        this.zzfi = z;
        this.zzfj = i2;
        this.zzfk = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzfc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzfd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzfe, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzff, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzfg, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzdo);
        SafeParcelWriter.writeString(parcel, 8, this.zzex, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzfh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzfi);
        SafeParcelWriter.writeInt(parcel, 11, this.zzfj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzfk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
