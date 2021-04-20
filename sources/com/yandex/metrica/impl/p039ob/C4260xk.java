package com.yandex.metrica.impl.p039ob;

import android.os.HandlerThread;

/* renamed from: com.yandex.metrica.impl.ob.xk */
public class C4260xk extends HandlerThread implements C4259xj {

    /* renamed from: a */
    private volatile boolean f5309a = true;

    public C4260xk(String str) {
        super(str);
    }

    /* renamed from: c */
    public synchronized boolean mo41813c() {
        return this.f5309a;
    }
}
