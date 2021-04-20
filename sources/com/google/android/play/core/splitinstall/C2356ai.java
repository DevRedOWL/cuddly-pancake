package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.splitinstall.ai */
final class C2356ai extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ int f2077a;

    /* renamed from: b */
    final /* synthetic */ C2415i f2078b;

    /* renamed from: c */
    final /* synthetic */ C2368au f2079c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2356ai(C2368au auVar, C2415i iVar, int i, C2415i iVar2) {
        super(iVar);
        this.f2079c = auVar;
        this.f2077a = i;
        this.f2078b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            this.f2079c.f2089a.mo33821c().mo33844e(this.f2079c.f2090d, this.f2077a, new C2364aq(this.f2079c, this.f2078b));
        } catch (RemoteException e) {
            C2368au.f2087b.mo33810c(e, "getSessionState(%d)", Integer.valueOf(this.f2077a));
            this.f2078b.mo34075d(new RuntimeException(e));
        }
    }
}
