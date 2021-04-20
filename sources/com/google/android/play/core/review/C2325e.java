package com.google.android.play.core.review;

import android.os.RemoteException;
import com.google.android.play.core.common.PlayCoreVersion;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.review.e */
final class C2325e extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ C2415i f2000a;

    /* renamed from: b */
    final /* synthetic */ C2328h f2001b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2325e(C2328h hVar, C2415i iVar, C2415i iVar2) {
        super(iVar);
        this.f2001b = hVar;
        this.f2000a = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            this.f2001b.f2006a.mo33821c().mo33802c(this.f2001b.f2007c, PlayCoreVersion.m1116b("review"), new C2327g(this.f2001b, this.f2000a));
        } catch (RemoteException e) {
            C2328h.f2005b.mo33810c(e, "error requesting in-app review for %s", this.f2001b.f2007c);
            this.f2000a.mo34075d(new RuntimeException(e));
        }
    }
}
