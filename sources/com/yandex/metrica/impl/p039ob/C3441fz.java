package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p039ob.C3373eg;

/* renamed from: com.yandex.metrica.impl.ob.fz */
public class C3441fz implements C3431fq, C3435ft<C3391en> {
    /* renamed from: a */
    public C3430fp mo40123a(Context context, C3436fu fuVar, C3427fn fnVar, C3373eg egVar) {
        return new C3440fy(context, fuVar.mo40127a(new C3379ek(fnVar.mo40111b(), fnVar.mo40110a()), egVar, new C3416fd(this)));
    }

    /* renamed from: a */
    public C3391en mo40109d(Context context, C3379ek ekVar, C3373eg.C3374a aVar, C3203bl blVar, C4146ul ulVar) {
        return new C3422fi(context, ekVar, blVar, aVar, C3136al.m1993a().mo39493h(), ulVar.mo41609e(), new C4149uo(ulVar));
    }

    /* renamed from: b */
    public C3447ge mo40108c(Context context, C3379ek ekVar, C3373eg.C3374a aVar, C3203bl blVar, C4146ul ulVar) {
        return new C3447ge(context, ekVar, blVar, aVar, ulVar.mo41609e(), new C4149uo(ulVar), CounterConfiguration.C3075a.MANUAL);
    }
}
