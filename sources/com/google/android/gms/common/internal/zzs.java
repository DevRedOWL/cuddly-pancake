package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.zzj;
import com.google.android.gms.common.zzl;
import com.google.android.gms.common.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzd;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class zzs extends zzb implements zzr {
    zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean zza(zzq zzq, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a_ = mo26008a_();
        zzd.zza(a_, (Parcelable) zzq);
        zzd.zza(a_, (IInterface) iObjectWrapper);
        Parcel zza = zza(5, a_);
        boolean zza2 = zzd.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final zzl zza(zzj zzj) throws RemoteException {
        Parcel a_ = mo26008a_();
        zzd.zza(a_, (Parcelable) zzj);
        Parcel zza = zza(6, a_);
        zzl zzl = (zzl) zzd.zza(zza, zzl.CREATOR);
        zza.recycle();
        return zzl;
    }

    public final boolean zza() throws RemoteException {
        Parcel zza = zza(7, mo26008a_());
        boolean zza2 = zzd.zza(zza);
        zza.recycle();
        return zza2;
    }
}
