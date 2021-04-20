package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.bm */
public abstract class C2274bm extends C2301k implements C2275bn {
    public C2274bm() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo33803a(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo33857i(parcel.readInt(), (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                mo33859k(readInt);
                return true;
            case 4:
                mo33850b(parcel.readInt(), (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                mo33855g(parcel.readInt(), (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 6:
                mo33858j((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                mo33856h(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 8:
                mo33854f((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 9:
                mo33851c((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Bundle bundle2 = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                mo33861m();
                return true;
            case 11:
                Bundle bundle3 = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                mo33860l();
                return true;
            case 12:
                mo33852d((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                mo33853e((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
