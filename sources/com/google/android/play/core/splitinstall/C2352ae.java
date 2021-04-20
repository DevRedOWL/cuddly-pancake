package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.ae */
final class C2352ae extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ List f2065a;

    /* renamed from: b */
    final /* synthetic */ C2415i f2066b;

    /* renamed from: c */
    final /* synthetic */ C2368au f2067c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2352ae(C2368au auVar, C2415i iVar, List list, C2415i iVar2) {
        super(iVar);
        this.f2067c = auVar;
        this.f2065a = list;
        this.f2066b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            this.f2067c.f2089a.mo33821c().mo33846g(this.f2067c.f2090d, C2368au.m1492i(this.f2065a), C2368au.m1495l(), new C2363ap(this.f2067c, this.f2066b));
        } catch (RemoteException e) {
            C2368au.f2087b.mo33810c(e, "deferredUninstall(%s)", this.f2065a);
            this.f2066b.mo34075d(new RuntimeException(e));
        }
    }
}
