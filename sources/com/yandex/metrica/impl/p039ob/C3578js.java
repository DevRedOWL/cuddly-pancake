package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.yandex.metrica.impl.ob.js */
public class C3578js {

    /* renamed from: a */
    private final Context f3505a;

    /* renamed from: b */
    private final C4281yc f3506b;

    public C3578js(Context context) {
        this(context, new C4281yc());
    }

    /* renamed from: a */
    public int mo40326a() {
        try {
            return Math.max(1, this.f3506b.mo41865b(this.f3505a, new Intent().setAction("com.yandex.metrica.configuration.ACTION_INIT"), 128).size());
        } catch (Throwable unused) {
            return 1;
        }
    }

    C3578js(Context context, C4281yc ycVar) {
        this.f3505a = context;
        this.f3506b = ycVar;
    }
}
