package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3908rl;

/* renamed from: com.yandex.metrica.impl.ob.qr */
public abstract class C3860qr<T> extends C3865qw {

    /* renamed from: a */
    private final T f4194a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40953a(C3908rl.C3909a.C3910a aVar);

    C3860qr(int i, String str, T t, C4289yk<String> ykVar, C3857qo qoVar) {
        super(i, str, ykVar, qoVar);
        this.f4194a = t;
    }

    /* renamed from: b */
    public T mo40955b() {
        return this.f4194a;
    }

    /* renamed from: a */
    public void mo40954a(C3875re reVar) {
        C3908rl.C3909a.C3910a b;
        if (mo40964f() && (b = m4648b(reVar)) != null) {
            mo40953a(b);
        }
    }

    /* renamed from: b */
    private C3908rl.C3909a.C3910a m4648b(C3875re reVar) {
        return mo40963e().mo40951a(reVar, reVar.mo40973a(mo40962d(), mo40961c()), this);
    }
}
