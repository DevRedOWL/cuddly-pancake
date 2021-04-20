package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.ag */
final class C2354ag extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ List f2071a;

    /* renamed from: b */
    final /* synthetic */ C2415i f2072b;

    /* renamed from: c */
    final /* synthetic */ C2368au f2073c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2354ag(C2368au auVar, C2415i iVar, List list, C2415i iVar2) {
        super(iVar);
        this.f2073c = auVar;
        this.f2071a = list;
        this.f2072b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            this.f2073c.f2089a.mo33821c().mo33848i(this.f2073c.f2090d, C2368au.m1493j(this.f2071a), C2368au.m1495l(), new C2361an(this.f2073c, this.f2072b));
        } catch (RemoteException e) {
            C2368au.f2087b.mo33810c(e, "deferredLanguageInstall(%s)", this.f2071a);
            this.f2072b.mo34075d(new RuntimeException(e));
        }
    }
}
