package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3481h;

/* renamed from: com.yandex.metrica.impl.ob.ow */
class C3802ow {

    /* renamed from: a */
    private final Context f4021a;

    /* renamed from: b */
    private C4143uk f4022b;

    /* renamed from: c */
    private C3774oh f4023c;

    /* renamed from: d */
    private final C3210bq f4024d;

    /* renamed from: e */
    private final C3633lh f4025e;

    /* renamed from: f */
    private final C3632lg f4026f;

    /* renamed from: g */
    private final C4228wh f4027g;

    /* renamed from: h */
    private final C3816pg f4028h;

    /* renamed from: i */
    private final C3481h f4029i;

    /* renamed from: j */
    private final C3481h.C3485b f4030j;

    /* renamed from: k */
    private final C3821pi f4031k;

    /* renamed from: l */
    private final C4257xh f4032l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f4033m;

    public C3802ow(Context context, C4143uk ukVar, C3774oh ohVar, C3633lh lhVar, C3632lg lgVar, C4257xh xhVar) {
        this(context, ukVar, ohVar, new C3210bq(), lhVar, lgVar, xhVar, new C4227wg(), new C3816pg(), C3136al.m1993a().mo39494i(), new C3821pi(context));
    }

    /* renamed from: a */
    public void mo40816a() {
        if (m4435d()) {
            m4430b();
        }
    }

    /* renamed from: b */
    private void m4430b() {
        if (!this.f4033m) {
            this.f4029i.mo40172a(C3481h.f3335a, this.f4032l, this.f4030j);
        } else {
            m4433c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m4433c() {
        C3774oh ohVar = this.f4023c;
        if (ohVar != null) {
            C3813pd a = this.f4028h.mo40835a(this.f4021a, this.f4022b, ohVar);
            boolean a2 = this.f4031k.mo40839a();
            do {
                if (this.f4031k.mo40839a() && (a2 = a.mo39664a()) && a.mo39668c().mo40841b()) {
                    while (this.f4032l.mo41813c() && a2) {
                        this.f4024d.mo39695a(a);
                        a2 = !a.mo39666b() && a.mo39685t();
                    }
                }
            } while (a2);
        }
    }

    /* renamed from: d */
    private boolean m4435d() {
        return m4427a((C3616kw) this.f4025e) || m4427a((C3616kw) this.f4026f);
    }

    /* renamed from: a */
    private boolean m4427a(C3616kw kwVar) {
        return this.f4023c != null && (m4431b(kwVar) || m4434c(kwVar));
    }

    /* renamed from: b */
    private boolean m4431b(C3616kw kwVar) {
        C3774oh ohVar = this.f4023c;
        return ohVar != null && m4428a(kwVar, (long) ohVar.f3912g);
    }

    /* renamed from: a */
    private boolean m4428a(C3616kw kwVar, long j) {
        return kwVar.mo40380a() >= j;
    }

    /* renamed from: c */
    private boolean m4434c(C3616kw kwVar) {
        C3774oh ohVar = this.f4023c;
        return ohVar != null && m4432b(kwVar, ohVar.f3914i);
    }

    /* renamed from: b */
    private boolean m4432b(C3616kw kwVar, long j) {
        return this.f4027g.mo41768a() - kwVar.mo40385b() > j;
    }

    /* renamed from: a */
    public void mo40817a(C4143uk ukVar, C3774oh ohVar) {
        this.f4022b = ukVar;
        this.f4023c = ohVar;
    }

    C3802ow(Context context, C4143uk ukVar, C3774oh ohVar, C3210bq bqVar, C3633lh lhVar, C3632lg lgVar, C4257xh xhVar, C4228wh whVar, C3816pg pgVar, C3481h hVar, C3821pi piVar) {
        this.f4033m = false;
        this.f4021a = context;
        this.f4023c = ohVar;
        this.f4022b = ukVar;
        this.f4024d = bqVar;
        this.f4025e = lhVar;
        this.f4026f = lgVar;
        this.f4032l = xhVar;
        this.f4027g = whVar;
        this.f4028h = pgVar;
        this.f4029i = hVar;
        this.f4030j = new C3481h.C3485b() {
            /* renamed from: a */
            public void mo40175a() {
                boolean unused = C3802ow.this.f4033m = true;
                C3802ow.this.m4433c();
            }
        };
        this.f4031k = piVar;
    }
}
