package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.af */
final class C2353af extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ List f2068a;

    /* renamed from: b */
    final /* synthetic */ C2415i f2069b;

    /* renamed from: c */
    final /* synthetic */ C2368au f2070c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2353af(C2368au auVar, C2415i iVar, List list, C2415i iVar2) {
        super(iVar);
        this.f2070c = auVar;
        this.f2068a = list;
        this.f2069b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            this.f2070c.f2089a.mo33821c().mo33847h(this.f2070c.f2090d, C2368au.m1492i(this.f2068a), C2368au.m1495l(), new C2360am(this.f2070c, this.f2069b));
        } catch (RemoteException e) {
            C2368au.f2087b.mo33810c(e, "deferredInstall(%s)", this.f2068a);
            this.f2069b.mo34075d(new RuntimeException(e));
        }
    }
}
