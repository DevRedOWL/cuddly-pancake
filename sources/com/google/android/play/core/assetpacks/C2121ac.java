package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.assetpacks.ac */
final class C2121ac extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ int f1512a;

    /* renamed from: b */
    final /* synthetic */ C2415i f1513b;

    /* renamed from: c */
    final /* synthetic */ C2131am f1514c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2121ac(C2131am amVar, C2415i iVar, int i, C2415i iVar2) {
        super(iVar);
        this.f1514c = amVar;
        this.f1512a = i;
        this.f1513b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            ((C2310t) this.f1514c.f1539e.mo33821c()).mo33908h(this.f1514c.f1537c, C2131am.m854B(this.f1512a), C2131am.m855C(), new C2124af(this.f1514c, this.f1513b, (int[]) null));
        } catch (RemoteException e) {
            C2131am.f1535a.mo33810c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
