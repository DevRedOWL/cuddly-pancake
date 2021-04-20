package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzp();
    private final String zza;
    @Nullable
    private final zzd zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzq(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zza(iBinder);
        this.zzc = z;
        this.zzd = z2;
    }

    zzq(String str, @Nullable zzd zzd2, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzd2;
        this.zzc = z;
        this.zzd = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        zzd zzd2 = this.zzb;
        if (zzd2 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = zzd2.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    private static zzd zza(@Nullable IBinder iBinder) {
        byte[] bArr;
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper zzb2 = zzo.zza(iBinder).zzb();
            if (zzb2 == null) {
                bArr = null;
            } else {
                bArr = (byte[]) ObjectWrapper.unwrap(zzb2);
            }
            if (bArr != null) {
                return new zzg(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
