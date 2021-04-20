package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.google.android.play.core.internal.ap */
final class C2250ap implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C2251aq f1917a;

    /* synthetic */ C2250ap(C2251aq aqVar) {
        this.f1917a = aqVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1917a.f1920c.mo33811d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f1917a.m1161r(new C2248an(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f1917a.f1920c.mo33811d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f1917a.m1161r(new C2249ao(this));
    }
}
