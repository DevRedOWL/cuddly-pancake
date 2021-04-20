package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.tasks.C2415i;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.x */
final class C2225x extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ List f1880a;

    /* renamed from: b */
    final /* synthetic */ C2415i f1881b;

    /* renamed from: c */
    final /* synthetic */ C2131am f1882c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2225x(C2131am amVar, C2415i iVar, List list, C2415i iVar2) {
        super(iVar);
        this.f1882c = amVar;
        this.f1880a = list;
        this.f1881b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            ((C2310t) this.f1882c.f1539e.mo33821c()).mo33904d(this.f1882c.f1537c, C2131am.m856k(this.f1880a), C2131am.m855C(), new C2124af(this.f1882c, this.f1881b, (byte[]) null));
        } catch (RemoteException e) {
            C2131am.f1535a.mo33810c(e, "cancelDownloads(%s)", this.f1880a);
        }
    }
}
