package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.tasks.C2415i;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.play.core.splitinstall.ad */
final class C2351ad extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ Collection f2061a;

    /* renamed from: b */
    final /* synthetic */ Collection f2062b;

    /* renamed from: c */
    final /* synthetic */ C2415i f2063c;

    /* renamed from: d */
    final /* synthetic */ C2368au f2064d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2351ad(C2368au auVar, C2415i iVar, Collection collection, Collection collection2, C2415i iVar2) {
        super(iVar);
        this.f2064d = auVar;
        this.f2061a = collection;
        this.f2062b = collection2;
        this.f2063c = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        ArrayList i = C2368au.m1492i(this.f2061a);
        i.addAll(C2368au.m1493j(this.f2062b));
        try {
            this.f2064d.f2089a.mo33821c().mo33842c(this.f2064d.f2090d, i, C2368au.m1495l(), new C2366as(this.f2064d, this.f2063c));
        } catch (RemoteException e) {
            C2368au.f2087b.mo33810c(e, "startInstall(%s,%s)", this.f2061a, this.f2062b);
            this.f2063c.mo34075d(new RuntimeException(e));
        }
    }
}
