package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.appupdate.j */
final class C2104j extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ String f1434a;

    /* renamed from: b */
    final /* synthetic */ C2415i f1435b;

    /* renamed from: c */
    final /* synthetic */ C2109o f1436c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2104j(C2109o oVar, C2415i iVar, String str, C2415i iVar2) {
        super(iVar);
        this.f1436c = oVar;
        this.f1434a = str;
        this.f1435b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            this.f1436c.f1447a.mo33821c().mo33901c(this.f1436c.f1448d, C2109o.m787d(this.f1436c, this.f1434a), new C2108n(this.f1436c, this.f1435b, this.f1434a));
        } catch (RemoteException e) {
            C2109o.f1445b.mo33810c(e, "requestUpdateInfo(%s)", this.f1434a);
            this.f1435b.mo34075d(new RuntimeException(e));
        }
    }
}
