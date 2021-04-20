package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.an */
final class C2248an extends C2242ah {

    /* renamed from: a */
    final /* synthetic */ IBinder f1914a;

    /* renamed from: b */
    final /* synthetic */ C2250ap f1915b;

    C2248an(C2250ap apVar, IBinder iBinder) {
        this.f1915b = apVar;
        this.f1914a = iBinder;
    }

    /* renamed from: a */
    public final void mo33529a() {
        C2251aq aqVar = this.f1915b.f1917a;
        aqVar.f1929l = (IInterface) aqVar.f1925h.mo33528a(this.f1914a);
        C2251aq.m1154j(this.f1915b.f1917a);
        this.f1915b.f1917a.f1923f = false;
        for (Runnable run : this.f1915b.f1917a.f1922e) {
            run.run();
        }
        this.f1915b.f1917a.f1922e.clear();
    }
}
