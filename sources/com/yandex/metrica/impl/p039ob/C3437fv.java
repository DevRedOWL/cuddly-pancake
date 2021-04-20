package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p039ob.C3373eg;

/* renamed from: com.yandex.metrica.impl.ob.fv */
class C3437fv implements C3431fq, C3435ft<C3408ez> {
    C3437fv() {
    }

    /* renamed from: a */
    public C3430fp mo40123a(Context context, C3436fu fuVar, C3427fn fnVar, C3373eg egVar) {
        return new C3438fw(context, fuVar.mo40127a(new C3414fb(fnVar.mo40111b(), fnVar.mo40110a()), egVar, new C3416fd(this)));
    }

    /* renamed from: a */
    public C3408ez mo40109d(Context context, C3379ek ekVar, C3373eg.C3374a aVar, C3203bl blVar, C4146ul ulVar) {
        return new C3408ez(context, ulVar.mo41609e(), blVar, ekVar, aVar, C3136al.m1993a().mo39488c(), C3136al.m1993a().mo39493h(), new C4149uo(ulVar));
    }

    /* renamed from: b */
    public C3447ge mo40108c(Context context, C3379ek ekVar, C3373eg.C3374a aVar, C3203bl blVar, C4146ul ulVar) {
        return new C3447ge(context, ekVar, blVar, aVar, ulVar.mo41609e(), new C4149uo(ulVar), CounterConfiguration.C3075a.MAIN);
    }
}
