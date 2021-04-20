package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.ol */
public class C3780ol {

    /* renamed from: a */
    private final C3307cy f3937a;

    /* renamed from: b */
    private final C4191vd f3938b;

    /* renamed from: c */
    private final C3802ow f3939c;

    /* renamed from: d */
    private final C3783om f3940d;

    /* renamed from: e */
    private final C3770od f3941e;

    /* renamed from: f */
    private final C4227wg f3942f;

    /* renamed from: g */
    private final C4257xh f3943g;

    /* renamed from: h */
    private C3774oh f3944h;

    /* renamed from: i */
    private boolean f3945i;

    /* renamed from: j */
    private final Runnable f3946j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3780ol(Context context, C3307cy cyVar, C4191vd vdVar, C3802ow owVar, C3770od odVar, C4257xh xhVar, C3774oh ohVar) {
        this(cyVar, vdVar, owVar, new C3783om(context), new C4227wg(), odVar, xhVar, ohVar);
        Context context2 = context;
    }

    /* renamed from: a */
    public void mo40755a() {
        mo40758c();
    }

    /* renamed from: b */
    public void mo40757b() {
        m4344f();
    }

    /* renamed from: c */
    public void mo40758c() {
        C3774oh ohVar = this.f3944h;
        boolean z = ohVar != null && ohVar.f3918m;
        if (this.f3945i != z) {
            this.f3945i = z;
            if (this.f3945i) {
                this.f3945i = true;
                m4343e();
                return;
            }
            this.f3945i = false;
            m4344f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m4343e() {
        C3774oh ohVar = this.f3944h;
        if (ohVar != null && ohVar.f3917l > 0) {
            this.f3943g.mo41809a(this.f3946j, this.f3944h.f3917l);
        }
    }

    /* renamed from: f */
    private void m4344f() {
        this.f3943g.mo41812b(this.f3946j);
    }

    /* renamed from: a */
    public void mo40756a(C3774oh ohVar) {
        this.f3944h = ohVar;
        mo40758c();
    }

    /* renamed from: d */
    public void mo40759d() {
        final C3784on onVar = new C3784on();
        onVar.mo40764a(this.f3942f.mo41768a());
        onVar.mo40768b(this.f3942f.mo41770c());
        onVar.mo40766a(this.f3937a.mo39867a());
        this.f3938b.mo41616a((C4161uv) new C4161uv() {
            /* renamed from: a */
            public void mo40761a(C4155uu[] uuVarArr) {
                onVar.mo40769b(C4204vq.m5887a(uuVarArr));
            }
        });
        this.f3940d.mo40762a(onVar);
        this.f3939c.mo40816a();
        this.f3941e.mo40741a();
    }

    C3780ol(C3307cy cyVar, C4191vd vdVar, C3802ow owVar, C3783om omVar, C4227wg wgVar, C3770od odVar, C4257xh xhVar, C3774oh ohVar) {
        this.f3946j = new Runnable() {
            public void run() {
                C3780ol.this.mo40759d();
                C3780ol.this.m4343e();
            }
        };
        this.f3937a = cyVar;
        this.f3938b = vdVar;
        this.f3939c = owVar;
        this.f3940d = omVar;
        this.f3942f = wgVar;
        this.f3941e = odVar;
        this.f3943g = xhVar;
        this.f3944h = ohVar;
    }
}
