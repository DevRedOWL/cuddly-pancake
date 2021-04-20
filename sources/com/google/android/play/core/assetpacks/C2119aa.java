package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.C2242ah;
import com.google.android.play.core.internal.C2310t;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.assetpacks.aa */
final class C2119aa extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ int f1501a;

    /* renamed from: b */
    final /* synthetic */ String f1502b;

    /* renamed from: c */
    final /* synthetic */ String f1503c;

    /* renamed from: d */
    final /* synthetic */ int f1504d;

    /* renamed from: e */
    final /* synthetic */ C2415i f1505e;

    /* renamed from: f */
    final /* synthetic */ C2131am f1506f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2119aa(C2131am amVar, C2415i iVar, int i, String str, String str2, int i2, C2415i iVar2) {
        super(iVar);
        this.f1506f = amVar;
        this.f1501a = i;
        this.f1502b = str;
        this.f1503c = str2;
        this.f1504d = i2;
        this.f1505e = iVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33529a() {
        try {
            ((C2310t) this.f1506f.f1539e.mo33821c()).mo33906f(this.f1506f.f1537c, C2131am.m863r(this.f1501a, this.f1502b, this.f1503c, this.f1504d), C2131am.m855C(), new C2124af(this.f1506f, this.f1505e, (char[]) null));
        } catch (RemoteException e) {
            C2131am.f1535a.mo33810c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
