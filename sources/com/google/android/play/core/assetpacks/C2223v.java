package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.assetpacks.v */
final class C2223v extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ String f1872a;

    /* renamed from: b */
    final /* synthetic */ C2415i f1873b;

    /* renamed from: c */
    final /* synthetic */ C2131am f1874c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2223v(C2131am amVar, C2415i iVar, String str, C2415i iVar2) {
        super(iVar);
        this.f1874c = amVar;
        this.f1872a = str;
        this.f1873b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            ((C2310t) this.f1874c.f1539e.mo33821c()).mo33912l(this.f1874c.f1537c, C2131am.m853A(0, this.f1872a), C2131am.m855C(), new C2124af(this.f1874c, this.f1873b, (short[]) null));
        } catch (RemoteException e) {
            C2131am.f1535a.mo33810c(e, "removePack(%s)", this.f1872a);
        }
    }
}
