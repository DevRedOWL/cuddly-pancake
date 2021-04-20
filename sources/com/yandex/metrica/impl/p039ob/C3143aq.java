package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.aq */
public class C3143aq {

    /* renamed from: a */
    private final C4228wh f2584a;

    /* renamed from: b */
    private final C3305cw f2585b;

    /* renamed from: c */
    private final C3690ly f2586c;

    /* renamed from: d */
    private final Context f2587d;

    /* renamed from: e */
    private long f2588e;

    /* renamed from: f */
    private C4125ty f2589f;

    public C3143aq(C3690ly lyVar, Context context, C4125ty tyVar) {
        this(lyVar, context, tyVar, new C4227wg(), new C3305cw());
    }

    C3143aq(C3690ly lyVar, Context context, C4125ty tyVar, C4228wh whVar, C3305cw cwVar) {
        this.f2586c = lyVar;
        this.f2587d = context;
        this.f2589f = tyVar;
        this.f2588e = this.f2586c.mo40597h(0);
        this.f2584a = whVar;
        this.f2585b = cwVar;
    }

    /* renamed from: a */
    public void mo39514a() {
        C4125ty tyVar = this.f2589f;
        if (tyVar != null && this.f2585b.mo39865a(this.f2588e, tyVar.f5040a, "should send EVENT_IDENTITY_LIGHT")) {
            m2043b();
            this.f2588e = this.f2584a.mo41769b();
            this.f2586c.mo40599i(this.f2588e);
        }
    }

    /* renamed from: b */
    private void m2043b() {
        C4085tl.m5459a(this.f2587d).mo39500e();
    }

    /* renamed from: a */
    public void mo39515a(C4125ty tyVar) {
        this.f2589f = tyVar;
    }
}
