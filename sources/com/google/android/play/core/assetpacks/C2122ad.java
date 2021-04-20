package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.assetpacks.ad */
final class C2122ad extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ int f1515a;

    /* renamed from: b */
    final /* synthetic */ String f1516b;

    /* renamed from: c */
    final /* synthetic */ String f1517c;

    /* renamed from: d */
    final /* synthetic */ int f1518d;

    /* renamed from: e */
    final /* synthetic */ C2415i f1519e;

    /* renamed from: f */
    final /* synthetic */ C2131am f1520f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2122ad(C2131am amVar, C2415i iVar, int i, String str, String str2, int i2, C2415i iVar2) {
        super(iVar);
        this.f1520f = amVar;
        this.f1515a = i;
        this.f1516b = str;
        this.f1517c = str2;
        this.f1518d = i2;
        this.f1519e = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            ((C2310t) this.f1520f.f1539e.mo33821c()).mo33910j(this.f1520f.f1537c, C2131am.m863r(this.f1515a, this.f1516b, this.f1517c, this.f1518d), C2131am.m855C(), new C2125ag(this.f1520f, this.f1519e));
        } catch (RemoteException e) {
            C2131am.f1535a.mo33809b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f1516b, this.f1517c, Integer.valueOf(this.f1518d), Integer.valueOf(this.f1515a));
            this.f1519e.mo34075d(new RuntimeException(e));
        }
    }
}
