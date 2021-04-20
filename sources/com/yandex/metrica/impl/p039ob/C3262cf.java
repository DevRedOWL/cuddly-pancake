package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.cf */
public abstract class C3262cf<T> {

    /* renamed from: a */
    protected final Context f2872a;

    /* renamed from: b */
    private final String f2873b;

    /* renamed from: c */
    private final String f2874c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo39807b(int i);

    public C3262cf(Context context, String str, String str2) {
        this.f2872a = context;
        this.f2873b = str;
        this.f2874c = str2;
    }

    /* renamed from: a */
    public T mo39806a() {
        int identifier = this.f2872a.getResources().getIdentifier(this.f2873b, this.f2874c, this.f2872a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return mo39807b(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }
}
