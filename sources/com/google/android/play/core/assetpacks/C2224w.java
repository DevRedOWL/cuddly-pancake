package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.tasks.C2415i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.w */
final class C2224w extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ List f1875a;

    /* renamed from: b */
    final /* synthetic */ Map f1876b;

    /* renamed from: c */
    final /* synthetic */ C2415i f1877c;

    /* renamed from: d */
    final /* synthetic */ List f1878d;

    /* renamed from: e */
    final /* synthetic */ C2131am f1879e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2224w(C2131am amVar, C2415i iVar, List list, Map map, C2415i iVar2, List list2) {
        super(iVar);
        this.f1879e = amVar;
        this.f1875a = list;
        this.f1876b = map;
        this.f1877c = iVar2;
        this.f1878d = list2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        ArrayList k = C2131am.m856k(this.f1875a);
        try {
            String l = this.f1879e.f1537c;
            Bundle m = C2131am.m858m(this.f1876b);
            C2131am amVar = this.f1879e;
            ((C2310t) this.f1879e.f1539e.mo33821c()).mo33903c(l, k, m, new C2130al(amVar, this.f1877c, amVar.f1538d, this.f1878d));
        } catch (RemoteException e) {
            C2131am.f1535a.mo33810c(e, "startDownload(%s)", this.f1875a);
            this.f1877c.mo34075d(new RuntimeException(e));
        }
    }
}
