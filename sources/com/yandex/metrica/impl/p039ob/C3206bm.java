package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.bm */
public class C3206bm {

    /* renamed from: a */
    private Executor f2718a;

    public C3206bm() {
        this(C3136al.m1993a().mo39495j().mo41830b());
    }

    public C3206bm(Executor executor) {
        this.f2718a = executor;
    }

    /* renamed from: a */
    public C3203bl mo39647a(Context context, C3379ek ekVar) {
        C3203bl blVar = new C3203bl(context, ekVar, this.f2718a);
        blVar.setName(C4262xm.m6113a("YMM-NC[" + ekVar.mo39995c() + "]"));
        blVar.start();
        return blVar;
    }
}
