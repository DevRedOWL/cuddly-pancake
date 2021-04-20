package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.splitinstall.ak */
final class C2358ak extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ int f2082a;

    /* renamed from: b */
    final /* synthetic */ C2415i f2083b;

    /* renamed from: c */
    final /* synthetic */ C2368au f2084c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2358ak(C2368au auVar, C2415i iVar, int i, C2415i iVar2) {
        super(iVar);
        this.f2084c = auVar;
        this.f2082a = i;
        this.f2083b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            this.f2084c.f2089a.mo33821c().mo33843d(this.f2084c.f2090d, this.f2082a, C2368au.m1495l(), new C2359al(this.f2084c, this.f2083b));
        } catch (RemoteException e) {
            C2368au.f2087b.mo33810c(e, "cancelInstall(%d)", Integer.valueOf(this.f2082a));
            this.f2083b.mo34075d(new RuntimeException(e));
        }
    }
}
