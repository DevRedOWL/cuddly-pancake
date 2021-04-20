package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C2274bm;
import com.google.android.play.core.tasks.C2415i;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.at */
class C2367at<T> extends C2274bm {

    /* renamed from: a */
    final C2415i<T> f2085a;

    /* renamed from: b */
    final /* synthetic */ C2368au f2086b;

    C2367at(C2368au auVar, C2415i<T> iVar) {
        this.f2086b = auVar;
        this.f2085a = iVar;
    }

    /* renamed from: b */
    public void mo33850b(int i, Bundle bundle) throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onCancelInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo33851c(Bundle bundle) throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onDeferredInstall", new Object[0]);
    }

    /* renamed from: d */
    public void mo33852d(Bundle bundle) throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onDeferredLanguageInstall", new Object[0]);
    }

    /* renamed from: e */
    public void mo33853e(Bundle bundle) throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onDeferredLanguageUninstall", new Object[0]);
    }

    /* renamed from: f */
    public void mo33854f(Bundle bundle) throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onDeferredUninstall", new Object[0]);
    }

    /* renamed from: g */
    public void mo33855g(int i, Bundle bundle) throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: h */
    public void mo33856h(List<Bundle> list) throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: i */
    public void mo33857i(int i, Bundle bundle) throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onStartInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: j */
    public final void mo33858j(Bundle bundle) throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        int i = bundle.getInt("error_code");
        C2368au.f2087b.mo33809b("onError(%d)", Integer.valueOf(i));
        this.f2085a.mo34075d(new SplitInstallException(i));
    }

    /* renamed from: k */
    public final void mo33859k(int i) throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: l */
    public final void mo33860l() throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    /* renamed from: m */
    public final void mo33861m() throws RemoteException {
        this.f2086b.f2089a.mo33820b();
        C2368au.f2087b.mo33811d("onGetSplitsForAppUpdate", new Object[0]);
    }
}
