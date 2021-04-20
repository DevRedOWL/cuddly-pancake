package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.appupdate.k */
final class C2105k extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ C2415i f1437a;

    /* renamed from: b */
    final /* synthetic */ String f1438b;

    /* renamed from: c */
    final /* synthetic */ C2109o f1439c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2105k(C2109o oVar, C2415i iVar, C2415i iVar2, String str) {
        super(iVar);
        this.f1439c = oVar;
        this.f1437a = iVar2;
        this.f1438b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            this.f1439c.f1447a.mo33821c().mo33902d(this.f1439c.f1448d, C2109o.m793j(), new C2107m(this.f1439c, this.f1437a));
        } catch (RemoteException e) {
            C2109o.f1445b.mo33810c(e, "completeUpdate(%s)", this.f1438b);
            this.f1437a.mo34075d(new RuntimeException(e));
        }
    }
}
