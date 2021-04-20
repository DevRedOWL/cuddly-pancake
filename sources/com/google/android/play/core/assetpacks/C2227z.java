package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.tasks.C2415i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.z */
final class C2227z extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ List f1886a;

    /* renamed from: b */
    final /* synthetic */ Map f1887b;

    /* renamed from: c */
    final /* synthetic */ C2415i f1888c;

    /* renamed from: d */
    final /* synthetic */ C2136ar f1889d;

    /* renamed from: e */
    final /* synthetic */ C2131am f1890e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2227z(C2131am amVar, C2415i iVar, List list, Map map, C2415i iVar2, C2136ar arVar) {
        super(iVar);
        this.f1890e = amVar;
        this.f1886a = list;
        this.f1887b = map;
        this.f1888c = iVar2;
        this.f1889d = arVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        ArrayList k = C2131am.m856k(this.f1886a);
        try {
            String l = this.f1890e.f1537c;
            Bundle m = C2131am.m858m(this.f1887b);
            C2131am amVar = this.f1890e;
            ((C2310t) this.f1890e.f1539e.mo33821c()).mo33911k(l, k, m, new C2129ak(amVar, this.f1888c, amVar.f1538d, this.f1889d));
        } catch (RemoteException e) {
            C2131am.f1535a.mo33810c(e, "getPackStates(%s)", this.f1886a);
            this.f1888c.mo34075d(new RuntimeException(e));
        }
    }
}
