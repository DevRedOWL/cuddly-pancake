package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.om */
public class C3783om {

    /* renamed from: a */
    private final C3632lg f3950a;

    /* renamed from: b */
    private final C3773og f3951b;

    public C3783om(Context context) {
        this(C3628ld.m3815a(context).mo40446h(), new C3773og(context));
    }

    /* renamed from: a */
    public void mo40762a(C3784on onVar) {
        String a = this.f3951b.mo40746a(onVar);
        if (!TextUtils.isEmpty(a)) {
            this.f3950a.mo40387b(onVar.mo40767b(), a);
        }
    }

    C3783om(C3632lg lgVar, C3773og ogVar) {
        this.f3950a = lgVar;
        this.f3951b = ogVar;
    }
}
