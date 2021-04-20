package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.ah */
final class C2355ah extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ List f2074a;

    /* renamed from: b */
    final /* synthetic */ C2415i f2075b;

    /* renamed from: c */
    final /* synthetic */ C2368au f2076c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2355ah(C2368au auVar, C2415i iVar, List list, C2415i iVar2) {
        super(iVar);
        this.f2076c = auVar;
        this.f2074a = list;
        this.f2075b = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            this.f2076c.f2089a.mo33821c().mo33849j(this.f2076c.f2090d, C2368au.m1493j(this.f2074a), C2368au.m1495l(), new C2362ao(this.f2076c, this.f2075b));
        } catch (RemoteException e) {
            C2368au.f2087b.mo33810c(e, "deferredLanguageUninstall(%s)", this.f2074a);
            this.f2075b.mo34075d(new RuntimeException(e));
        }
    }
}
