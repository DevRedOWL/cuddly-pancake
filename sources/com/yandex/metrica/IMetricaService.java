package com.yandex.metrica;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IMetricaService extends IInterface {
    /* renamed from: a */
    void mo39270a(Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo39271a(String str, int i, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: com.yandex.metrica.IMetricaService$a */
    public static abstract class C3076a extends Binder implements IMetricaService {
        public IBinder asBinder() {
            return this;
        }

        public C3076a() {
            attachInterface(this, "com.yandex.metrica.IMetricaService");
        }

        /* renamed from: a */
        public static IMetricaService m1745a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.metrica.IMetricaService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMetricaService)) {
                return new C3077a(iBinder);
            }
            return (IMetricaService) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "com.yandex.metrica.IMetricaService"
                if (r5 == r1) goto L_0x002d
                r3 = 2
                if (r5 == r3) goto L_0x0017
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0013
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0013:
                r7.writeString(r2)
                return r1
            L_0x0017:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0029
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0029:
                r4.mo39270a(r0)
                return r1
            L_0x002d:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r7 = r6.readInt()
                java.lang.String r8 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x004b
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x004b:
                r4.mo39271a(r5, r7, r8, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.IMetricaService.C3076a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        /* renamed from: com.yandex.metrica.IMetricaService$a$a */
        private static class C3077a implements IMetricaService {

            /* renamed from: a */
            private IBinder f2370a;

            C3077a(IBinder iBinder) {
                this.f2370a = iBinder;
            }

            public IBinder asBinder() {
                return this.f2370a;
            }

            /* renamed from: a */
            public void mo39271a(String str, int i, String str2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2370a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo39270a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2370a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
