package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.splitinstall.aj */
final class C2357aj extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ C2415i f2080a;

    /* renamed from: b */
    final /* synthetic */ C2368au f2081b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2357aj(C2368au auVar, C2415i iVar, C2415i iVar2) {
        super(iVar);
        this.f2081b = auVar;
        this.f2080a = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            this.f2081b.f2089a.mo33821c().mo33845f(this.f2081b.f2090d, new C2365ar(this.f2081b, this.f2080a));
        } catch (RemoteException e) {
            C2368au.f2087b.mo33810c(e, "getSessionStates", new Object[0]);
            this.f2080a.mo34075d(new RuntimeException(e));
        }
    }
}
