package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.assetpacks.ae */
final class C2123ae extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ C2415i f1521a;

    /* renamed from: b */
    final /* synthetic */ C2131am f1522b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2123ae(C2131am amVar, C2415i iVar, C2415i iVar2) {
        super(iVar);
        this.f1522b = amVar;
        this.f1521a = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            ((C2310t) this.f1522b.f1540f.mo33821c()).mo33909i(this.f1522b.f1537c, C2131am.m855C(), new C2127ai(this.f1522b, this.f1521a));
        } catch (RemoteException e) {
            C2131am.f1535a.mo33810c(e, "keepAlive", new Object[0]);
        }
    }
}
