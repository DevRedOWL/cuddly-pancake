package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.r */
public final class C2308r extends C2300j implements C2310t {
    C2308r(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* renamed from: c */
    public final void mo33903c(String str, List<Bundle> list, Bundle bundle, C2312v vVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        a.writeTypedList(list);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, vVar);
        mo33898b(2, a);
    }

    /* renamed from: d */
    public final void mo33904d(String str, List<Bundle> list, Bundle bundle, C2312v vVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        a.writeTypedList(list);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, vVar);
        mo33898b(14, a);
    }

    /* renamed from: e */
    public final void mo33905e(String str, Bundle bundle, C2312v vVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, vVar);
        mo33898b(5, a);
    }

    /* renamed from: f */
    public final void mo33906f(String str, Bundle bundle, Bundle bundle2, C2312v vVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1315b(a, bundle);
        C2302l.m1315b(a, bundle2);
        C2302l.m1316c(a, vVar);
        mo33898b(6, a);
    }

    /* renamed from: g */
    public final void mo33907g(String str, Bundle bundle, Bundle bundle2, C2312v vVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1315b(a, bundle);
        C2302l.m1315b(a, bundle2);
        C2302l.m1316c(a, vVar);
        mo33898b(7, a);
    }

    /* renamed from: h */
    public final void mo33908h(String str, Bundle bundle, Bundle bundle2, C2312v vVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1315b(a, bundle);
        C2302l.m1315b(a, bundle2);
        C2302l.m1316c(a, vVar);
        mo33898b(9, a);
    }

    /* renamed from: i */
    public final void mo33909i(String str, Bundle bundle, C2312v vVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, vVar);
        mo33898b(10, a);
    }

    /* renamed from: j */
    public final void mo33910j(String str, Bundle bundle, Bundle bundle2, C2312v vVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1315b(a, bundle);
        C2302l.m1315b(a, bundle2);
        C2302l.m1316c(a, vVar);
        mo33898b(11, a);
    }

    /* renamed from: k */
    public final void mo33911k(String str, List<Bundle> list, Bundle bundle, C2312v vVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        a.writeTypedList(list);
        C2302l.m1315b(a, bundle);
        C2302l.m1316c(a, vVar);
        mo33898b(12, a);
    }

    /* renamed from: l */
    public final void mo33912l(String str, Bundle bundle, Bundle bundle2, C2312v vVar) throws RemoteException {
        Parcel a = mo33896a();
        a.writeString(str);
        C2302l.m1315b(a, bundle);
        C2302l.m1315b(a, bundle2);
        C2302l.m1316c(a, vVar);
        mo33898b(13, a);
    }
}
