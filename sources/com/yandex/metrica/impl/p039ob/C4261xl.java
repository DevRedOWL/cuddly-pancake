package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.xl */
public class C4261xl extends Thread implements C4259xj {

    /* renamed from: a */
    private volatile boolean f5310a = true;

    public C4261xl() {
    }

    public C4261xl(Runnable runnable, String str) {
        super(runnable, str);
    }

    public C4261xl(String str) {
        super(str);
    }

    /* renamed from: c */
    public synchronized boolean mo41813c() {
        return this.f5310a;
    }

    /* renamed from: b */
    public synchronized void mo41814b() {
        this.f5310a = false;
        interrupt();
    }
}
