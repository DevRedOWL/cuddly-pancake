package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3373eg;

/* renamed from: com.yandex.metrica.impl.ob.fi */
public class C3422fi extends C3391en {

    /* renamed from: b */
    private final String f3241b;

    /* renamed from: c */
    private final C3299cs f3242c;

    public C3422fi(Context context, C3379ek ekVar, C3203bl blVar, C3373eg.C3374a aVar, C3299cs csVar, C4143uk ukVar, C4148un unVar) {
        super(context, ukVar, blVar, ekVar, aVar, new C3420fg(csVar), unVar);
        this.f3241b = ekVar.mo39993a();
        this.f3242c = csVar;
    }

    /* renamed from: a */
    public synchronized void mo39979a(C3373eg.C3374a aVar) {
        super.mo39979a(aVar);
        this.f3242c.mo39854a(this.f3241b, aVar.f3119m);
    }
}
