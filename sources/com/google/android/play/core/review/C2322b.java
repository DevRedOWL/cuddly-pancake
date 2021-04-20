package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.review.b */
final class C2322b extends ResultReceiver {

    /* renamed from: a */
    final /* synthetic */ C2415i f1996a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2322b(Handler handler, C2415i iVar) {
        super(handler);
        this.f1996a = iVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.f1996a.mo34076e(null);
    }
}
