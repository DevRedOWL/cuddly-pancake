package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.j */
public class C2300j implements IInterface {

    /* renamed from: a */
    private final IBinder f1977a;

    /* renamed from: b */
    private final String f1978b;

    protected C2300j(IBinder iBinder, String str) {
        this.f1977a = iBinder;
        this.f1978b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo33896a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1978b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f1977a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33898b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f1977a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
