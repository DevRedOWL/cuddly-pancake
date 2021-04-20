package com.yandex.metrica.push.impl;

import android.content.Context;

/* renamed from: com.yandex.metrica.push.impl.cd */
public class C4382cd {

    /* renamed from: a */
    private final C4381cc f5500a;

    public C4382cd(Context context) {
        if (C4380cb.m6471a("okhttp3.OkHttpClient")) {
            this.f5500a = new C4383ce(context);
        } else {
            this.f5500a = new C4384cf();
        }
    }

    /* renamed from: a */
    public C4381cc mo42022a() {
        return this.f5500a;
    }
}
