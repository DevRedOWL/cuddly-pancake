package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.od */
class C3770od {

    /* renamed from: a */
    private C3774oh f3905a;

    /* renamed from: b */
    private final C3633lh f3906b;

    /* renamed from: c */
    private final C3632lg f3907c;

    public C3770od(C3774oh ohVar, C3633lh lhVar, C3632lg lgVar) {
        this.f3905a = ohVar;
        this.f3906b = lhVar;
        this.f3907c = lgVar;
    }

    /* renamed from: a */
    public void mo40741a() {
        C3774oh ohVar = this.f3905a;
        if (ohVar != null) {
            m4320b(ohVar);
            m4321c(this.f3905a);
        }
    }

    /* renamed from: b */
    private void m4320b(C3774oh ohVar) {
        if (this.f3906b.mo40380a() > ((long) ohVar.f3915j)) {
            this.f3906b.mo40388c((int) (((float) ohVar.f3915j) * 0.1f));
        }
    }

    /* renamed from: c */
    private void m4321c(C3774oh ohVar) {
        if (this.f3907c.mo40380a() > ((long) ohVar.f3915j)) {
            this.f3907c.mo40388c((int) (((float) ohVar.f3915j) * 0.1f));
        }
    }

    /* renamed from: a */
    public void mo40742a(C3774oh ohVar) {
        this.f3905a = ohVar;
    }
}
