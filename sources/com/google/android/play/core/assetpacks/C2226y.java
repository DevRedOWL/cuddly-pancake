package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.tasks.C2415i;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.y */
final class C2226y extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ Map f1883a;

    /* renamed from: b */
    final /* synthetic */ C2415i f1884b;

    /* renamed from: c */
    final /* synthetic */ C2131am f1885c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2226y(C2131am amVar, C2415i iVar, Map map, C2415i iVar2) {
        super(iVar);
        this.f1885c = amVar;
        this.f1883a = map;
        this.f1884b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            ((C2310t) this.f1885c.f1539e.mo33821c()).mo33905e(this.f1885c.f1537c, C2131am.m858m(this.f1883a), new C2126ah(this.f1885c, this.f1884b));
        } catch (RemoteException e) {
            C2131am.f1535a.mo33810c(e, "syncPacks", new Object[0]);
            this.f1884b.mo34075d(new RuntimeException(e));
        }
    }
}
