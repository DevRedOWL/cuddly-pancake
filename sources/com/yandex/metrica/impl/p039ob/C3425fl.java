package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.fl */
public abstract class C3425fl implements C3430fp {

    /* renamed from: a */
    private final Context f3248a;

    /* renamed from: b */
    private final C3415fc f3249b;

    /* renamed from: c */
    private final C3804ox f3250c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo40104b(C4217w wVar, C3373eg egVar);

    public C3425fl(Context context, C3415fc fcVar) {
        this(context, fcVar, new C3804ox(C3785oo.m4363a(context), C3136al.m1993a().mo39496k(), C3307cy.m2873a(context), new C3690ly(C3628ld.m3815a(context).mo40441c())));
    }

    /* renamed from: a */
    public void mo40102a(C4217w wVar, C3373eg egVar) {
        mo40104b(wVar, egVar);
    }

    /* renamed from: a */
    public void mo40101a() {
        this.f3249b.mo40081b(this);
        this.f3250c.mo40819a((Object) this);
    }

    /* renamed from: b */
    public C3415fc mo40103b() {
        return this.f3249b;
    }

    C3425fl(Context context, C3415fc fcVar, C3804ox oxVar) {
        this.f3248a = context.getApplicationContext();
        this.f3249b = fcVar;
        this.f3250c = oxVar;
        this.f3249b.mo40079a((C3430fp) this);
        this.f3250c.mo40821b(this);
    }

    /* renamed from: c */
    public C3804ox mo40105c() {
        return this.f3250c;
    }
}
