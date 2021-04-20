package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.jk */
public class C3560jk {

    /* renamed from: a */
    private Context f3477a;

    /* renamed from: b */
    private C3559jj f3478b;

    /* renamed from: c */
    private C3570jo f3479c;

    public C3560jk(Context context) {
        this(context, new C3559jj(context), new C3570jo(context));
    }

    C3560jk(Context context, C3559jj jjVar, C3570jo joVar) {
        this.f3477a = context;
        this.f3478b = jjVar;
        this.f3479c = joVar;
    }

    /* renamed from: a */
    public void mo40308a() {
        this.f3477a.getPackageName();
        this.f3479c.mo40319a().mo40311a(this.f3478b.mo40307a());
    }
}
