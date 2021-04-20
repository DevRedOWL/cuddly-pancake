package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.u */
public abstract class C2311u extends C2301k implements C2312v {
    public C2311u() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo33803a(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo33600b(parcel.readInt(), (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                mo33606h(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                mo33608j(readInt2);
                return true;
            case 5:
                mo33601c(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Bundle bundle3 = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                mo33609k((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                mo33605g((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Bundle bundle4 = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                mo33610l((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Bundle bundle5 = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                mo33611m((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                mo33602d((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR), (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                mo33603e((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR), (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                mo33604f((Bundle) C2302l.m1314a(parcel, Bundle.CREATOR), (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR));
                return true;
            case 14:
                Bundle bundle6 = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                Bundle bundle7 = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                mo33612n();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) C2302l.m1314a(parcel, Bundle.CREATOR);
                mo33607i();
                return true;
            default:
                return false;
        }
    }
}
