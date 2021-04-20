package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.ye */
public class C4283ye implements C4289yk<String> {

    /* renamed from: a */
    private final String f5344a;

    public C4283ye(String str) {
        this.f5344a = str;
    }

    /* renamed from: a */
    public C4287yi mo40671a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return C4287yi.m6197a(this);
        }
        return C4287yi.m6198a(this, this.f5344a + " is empty.");
    }
}
