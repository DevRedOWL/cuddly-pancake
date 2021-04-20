package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.io */
public class C3528io {

    /* renamed from: a */
    private final int f3390a;

    /* renamed from: b */
    private final C3532is f3391b;

    /* renamed from: c */
    private C3529ip f3392c;

    public C3528io(Context context, C3379ek ekVar, int i) {
        this(new C3532is(context, ekVar), i);
    }

    /* renamed from: a */
    public C3134aj mo40212a(String str) {
        if (this.f3392c == null) {
            m3488b();
        }
        int b = m3487b(str);
        if (this.f3392c.mo40219c().contains(Integer.valueOf(b))) {
            return C3134aj.NON_FIRST_OCCURENCE;
        }
        C3134aj ajVar = this.f3392c.mo40218b() ? C3134aj.FIRST_OCCURRENCE : C3134aj.UNKNOWN;
        if (this.f3392c.mo40220d() < 1000) {
            this.f3392c.mo40217b(b);
        } else {
            this.f3392c.mo40216a(false);
        }
        m3489c();
        return ajVar;
    }

    /* renamed from: a */
    public void mo40213a() {
        if (this.f3392c == null) {
            m3488b();
        }
        this.f3392c.mo40214a();
        this.f3392c.mo40216a(true);
        m3489c();
    }

    /* renamed from: b */
    private void m3488b() {
        this.f3392c = this.f3391b.mo40231a();
        int e = this.f3392c.mo40221e();
        int i = this.f3390a;
        if (e != i) {
            this.f3392c.mo40215a(i);
            m3489c();
        }
    }

    /* renamed from: c */
    private void m3489c() {
        this.f3391b.mo40232a(this.f3392c);
    }

    /* renamed from: b */
    private int m3487b(String str) {
        return str.hashCode();
    }

    C3528io(C3532is isVar, int i) {
        this.f3390a = i;
        this.f3391b = isVar;
    }
}
