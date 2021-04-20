package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzao();
    private final float zzdo;
    public final String zzex;
    public final zzy zzfd;
    private final zzy zzfe;
    public final String zzfg;
    private final zzai[] zzfm;
    private final boolean zzfn;

    public zzan(zzai[] zzaiArr, zzy zzy, zzy zzy2, String str, float f, String str2, boolean z) {
        this.zzfm = zzaiArr;
        this.zzfd = zzy;
        this.zzfe = zzy2;
        this.zzfg = str;
        this.zzdo = f;
        this.zzex = str2;
        this.zzfn = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzfm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzfd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzfe, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzfg, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzdo);
        SafeParcelWriter.writeString(parcel, 7, this.zzex, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzfn);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
