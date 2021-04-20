package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.jj */
class C3559jj {

    /* renamed from: a */
    C3690ly f3473a;

    /* renamed from: b */
    private final C3375eh f3474b;

    /* renamed from: c */
    private String f3475c;

    /* renamed from: d */
    private C3558ji f3476d;

    public C3559jj(Context context) {
        this(context.getPackageName(), new C3690ly(C3628ld.m3815a(context).mo40441c()), new C3558ji());
    }

    /* renamed from: a */
    public Bundle mo40307a() {
        Bundle bundle = new Bundle();
        this.f3476d.mo40306a(bundle, this.f3475c, this.f3473a.mo40596g());
        return bundle;
    }

    C3559jj(String str, C3690ly lyVar, C3558ji jiVar) {
        this.f3475c = str;
        this.f3473a = lyVar;
        this.f3476d = jiVar;
        this.f3474b = new C3375eh(this.f3475c);
    }
}
