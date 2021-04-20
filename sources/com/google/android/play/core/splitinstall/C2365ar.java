package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C2415i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.ar */
final class C2365ar extends C2367at<List<SplitInstallSessionState>> {
    C2365ar(C2368au auVar, C2415i<List<SplitInstallSessionState>> iVar) {
        super(auVar, iVar);
    }

    /* renamed from: h */
    public final void mo33856h(List<Bundle> list) throws RemoteException {
        super.mo33856h(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Bundle d : list) {
            arrayList.add(SplitInstallSessionState.m1454d(d));
        }
        this.f2085a.mo34076e(arrayList);
    }
}
