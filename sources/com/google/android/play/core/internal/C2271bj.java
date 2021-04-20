package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.bj */
public final class C2271bj extends C2300j implements C2273bl {
    C2271bj(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* renamed from: c */
    public final void mo33842c(String str, List<Bundle> list, Bundle bundle, C2275bn bnVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        a.writeTypedList(list);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, bnVar);
        mo33898b(2, a);
    }

    /* renamed from: d */
    public final void mo33843d(String str, int i, Bundle bundle, C2275bn bnVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        a.writeInt(i);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, bnVar);
        mo33898b(4, a);
    }

    /* renamed from: e */
    public final void mo33844e(String str, int i, C2275bn bnVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        a.writeInt(i);
        C2302l.m1316c(a, bnVar);
        mo33898b(5, a);
    }

    /* renamed from: f */
    public final void mo33845f(String str, C2275bn bnVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1316c(a, bnVar);
        mo33898b(6, a);
    }

    /* renamed from: g */
    public final void mo33846g(String str, List<Bundle> list, Bundle bundle, C2275bn bnVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        a.writeTypedList(list);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, bnVar);
        mo33898b(7, a);
    }

    /* renamed from: h */
    public final void mo33847h(String str, List<Bundle> list, Bundle bundle, C2275bn bnVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        a.writeTypedList(list);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, bnVar);
        mo33898b(8, a);
    }

    /* renamed from: i */
    public final void mo33848i(String str, List<Bundle> list, Bundle bundle, C2275bn bnVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        a.writeTypedList(list);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, bnVar);
        mo33898b(13, a);
    }

    /* renamed from: j */
    public final void mo33849j(String str, List<Bundle> list, Bundle bundle, C2275bn bnVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        a.writeTypedList(list);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, bnVar);
        mo33898b(14, a);
    }
}
