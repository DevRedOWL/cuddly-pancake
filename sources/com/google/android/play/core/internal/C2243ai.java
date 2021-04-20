package com.google.android.play.core.internal;

import android.os.IBinder;

/* renamed from: com.google.android.play.core.internal.ai */
final /* synthetic */ class C2243ai implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final C2251aq f1910a;

    C2243ai(C2251aq aqVar) {
        this.f1910a = aqVar;
    }

    public final void binderDied() {
        this.f1910a.mo33822n();
    }
}
