package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.appupdate.b */
final class C2096b extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ C2415i f1420a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2096b(Handler handler, C2415i iVar) {
        super(handler);
        this.f1420a = iVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        C2415i iVar;
        int i2 = 1;
        if (i == 1) {
            iVar = this.f1420a;
            i2 = -1;
        } else if (i != 2) {
            iVar = this.f1420a;
        } else {
            iVar = this.f1420a;
            i2 = 0;
        }
        iVar.mo34076e(Integer.valueOf(i2));
    }
}
