package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzd;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class zzk extends zzb implements zzl {
    zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final IObjectWrapper zza(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel a_ = mo26008a_();
        zzd.zza(a_, (IInterface) iObjectWrapper);
        a_.writeString(str);
        a_.writeInt(i);
        Parcel zza = zza(2, a_);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    public final int zza(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel a_ = mo26008a_();
        zzd.zza(a_, (IInterface) iObjectWrapper);
        a_.writeString(str);
        zzd.zza(a_, z);
        Parcel zza = zza(3, a_);
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel a_ = mo26008a_();
        zzd.zza(a_, (IInterface) iObjectWrapper);
        a_.writeString(str);
        a_.writeInt(i);
        Parcel zza = zza(4, a_);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    public final int zzb(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel a_ = mo26008a_();
        zzd.zza(a_, (IInterface) iObjectWrapper);
        a_.writeString(str);
        zzd.zza(a_, z);
        Parcel zza = zza(5, a_);
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final int zzb() throws RemoteException {
        Parcel zza = zza(6, mo26008a_());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final IObjectWrapper zza(IObjectWrapper iObjectWrapper, String str, boolean z, long j) throws RemoteException {
        Parcel a_ = mo26008a_();
        zzd.zza(a_, (IInterface) iObjectWrapper);
        a_.writeString(str);
        zzd.zza(a_, z);
        a_.writeLong(j);
        Parcel zza = zza(7, a_);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    public final IObjectWrapper zza(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel a_ = mo26008a_();
        zzd.zza(a_, (IInterface) iObjectWrapper);
        a_.writeString(str);
        a_.writeInt(i);
        zzd.zza(a_, (IInterface) iObjectWrapper2);
        Parcel zza = zza(8, a_);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }
}
