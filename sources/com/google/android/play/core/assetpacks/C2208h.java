package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.assetpacks.h */
final class C2208h extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ C2415i f1831a;

    /* renamed from: b */
    final /* synthetic */ C2209i f1832b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2208h(C2209i iVar, Handler handler, C2415i iVar2) {
        super(handler);
        this.f1832b = iVar;
        this.f1831a = iVar2;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f1831a.mo34076e(-1);
            this.f1832b.f1840h.mo33686a((PendingIntent) null);
        } else if (i != 2) {
            this.f1831a.mo34075d(new AssetPackException(-100));
        } else {
            this.f1831a.mo34076e(0);
        }
    }
}
