package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.jq */
public class C3575jq {

    /* renamed from: a */
    private final C4208vt f3499a;

    /* renamed from: b */
    private final C3578js f3500b;

    public C3575jq(Context context) {
        this(new C4208vt(), new C3578js(context));
    }

    /* renamed from: a */
    public Long mo40321a(List<C3778oj> list) {
        long j;
        if (C3306cx.m2861a((Collection) list)) {
            return null;
        }
        C3778oj ojVar = list.get(Math.min(this.f3500b.mo40326a(), list.size()) - 1);
        if (ojVar.f3931a == ojVar.f3932b) {
            j = ojVar.f3931a;
        } else {
            j = this.f3499a.mo41705a(ojVar.f3931a, ojVar.f3932b);
        }
        return Long.valueOf(j);
    }

    C3575jq(C4208vt vtVar, C3578js jsVar) {
        this.f3499a = vtVar;
        this.f3500b = jsVar;
    }
}
