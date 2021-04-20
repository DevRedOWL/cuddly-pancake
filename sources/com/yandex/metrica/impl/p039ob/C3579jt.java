package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.jt */
public class C3579jt {

    /* renamed from: a */
    private final C4257xh f3507a;

    /* renamed from: b */
    private final C3574jp f3508b;

    /* renamed from: com.yandex.metrica.impl.ob.jt$a */
    public interface C3581a {
        /* renamed from: a */
        void mo40331a();
    }

    public C3579jt(C4257xh xhVar, C3574jp jpVar) {
        this.f3507a = xhVar;
        this.f3508b = jpVar;
    }

    /* renamed from: a */
    public void mo40328a(long j, final C3581a aVar) {
        this.f3507a.mo41809a(new Runnable() {
            public void run() {
                try {
                    aVar.mo40331a();
                } catch (Throwable unused) {
                }
            }
        }, j);
    }

    /* renamed from: a */
    public void mo40329a(long j, boolean z) {
        this.f3508b.mo40310a(j, z);
    }

    /* renamed from: a */
    public void mo40327a() {
        this.f3508b.mo40309a();
    }
}
