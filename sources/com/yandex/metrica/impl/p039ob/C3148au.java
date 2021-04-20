package com.yandex.metrica.impl.p039ob;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.au */
class C3148au implements Runnable {

    /* renamed from: a */
    private final WeakReference<Handler> f2597a;

    /* renamed from: b */
    private final WeakReference<C3723n> f2598b;

    C3148au(Handler handler, C3723n nVar) {
        this.f2597a = new WeakReference<>(handler);
        this.f2598b = new WeakReference<>(nVar);
    }

    public void run() {
        Handler handler = (Handler) this.f2597a.get();
        C3723n nVar = (C3723n) this.f2598b.get();
        if (handler != null && nVar != null && nVar.mo40666c()) {
            C3147at.m2063a(handler, nVar, this);
        }
    }
}
