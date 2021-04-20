package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3908rl;

/* renamed from: com.yandex.metrica.impl.ob.rc */
public class C3873rc extends C3860qr<String> {

    /* renamed from: a */
    private final C4280yb<String> f4214a;

    public C3873rc(String str, String str2, C4280yb<String> ybVar, C4289yk<String> ykVar, C3857qo qoVar) {
        super(0, str, str2, ykVar, qoVar);
        this.f4214a = ybVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40953a(C3908rl.C3909a.C3910a aVar) {
        String a = this.f4214a.mo41840a(mo40955b());
        aVar.f4388e.f4391b = a == null ? new byte[0] : a.getBytes();
    }
}
