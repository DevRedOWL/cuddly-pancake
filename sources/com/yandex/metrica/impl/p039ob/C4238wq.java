package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.wq */
public class C4238wq {

    /* renamed from: a */
    private final String f5280a;

    public C4238wq(Context context) {
        this(context.getPackageName());
    }

    C4238wq(String str) {
        this.f5280a = str;
    }

    /* renamed from: a */
    public byte[] mo41780a() {
        try {
            return C4221wc.m5998a(this.f5280a);
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    /* renamed from: b */
    public byte[] mo41781b() {
        try {
            return C4221wc.m5998a(new StringBuilder(this.f5280a).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
