package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.tg */
public class C4078tg {

    /* renamed from: a */
    private final C3700mf<C4076te> f4908a;

    /* renamed from: b */
    private final C4077tf f4909b;

    /* renamed from: c */
    private final Context f4910c;

    public C4078tg(Context context, C3700mf<C4076te> mfVar) {
        this(context, mfVar, new C4077tf());
    }

    public C4078tg(Context context, C3700mf<C4076te> mfVar, C4077tf tfVar) {
        this.f4908a = mfVar;
        this.f4910c = context;
        this.f4909b = tfVar;
    }

    /* renamed from: a */
    public void mo41440a() {
        C3139an a = C4085tl.m5459a(this.f4910c);
        C4077tf tfVar = this.f4909b;
        a.reportEvent("sdk_list", tfVar.mo41439b(tfVar.mo41438a(this.f4908a.mo40624a().f4903a)).toString());
    }
}
