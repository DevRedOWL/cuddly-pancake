package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.assetpacks.ab */
final class C2120ab extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ int f1507a;

    /* renamed from: b */
    final /* synthetic */ String f1508b;

    /* renamed from: c */
    final /* synthetic */ C2415i f1509c;

    /* renamed from: d */
    final /* synthetic */ int f1510d;

    /* renamed from: e */
    final /* synthetic */ C2131am f1511e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2120ab(C2131am amVar, C2415i iVar, int i, String str, C2415i iVar2, int i2) {
        super(iVar);
        this.f1511e = amVar;
        this.f1507a = i;
        this.f1508b = str;
        this.f1509c = iVar2;
        this.f1510d = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            ((C2310t) this.f1511e.f1539e.mo33821c()).mo33907g(this.f1511e.f1537c, C2131am.m853A(this.f1507a, this.f1508b), C2131am.m855C(), new C2128aj(this.f1511e, this.f1509c, this.f1507a, this.f1508b, this.f1510d));
        } catch (RemoteException e) {
            C2131am.f1535a.mo33810c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
