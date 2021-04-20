package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3908rl;

/* renamed from: com.yandex.metrica.impl.ob.qw */
public abstract class C3865qw implements C3855qm, C3876rf {

    /* renamed from: a */
    private final String f4199a;

    /* renamed from: b */
    private final int f4200b;

    /* renamed from: c */
    private final C4289yk<String> f4201c;

    /* renamed from: d */
    private final C3857qo f4202d;

    /* renamed from: e */
    private C4216vz f4203e = C4206vr.m5905a();

    C3865qw(int i, String str, C4289yk<String> ykVar, C3857qo qoVar) {
        this.f4200b = i;
        this.f4199a = str;
        this.f4201c = ykVar;
        this.f4202d = qoVar;
    }

    /* renamed from: c */
    public String mo40961c() {
        return this.f4199a;
    }

    /* renamed from: d */
    public int mo40962d() {
        return this.f4200b;
    }

    /* renamed from: e */
    public C3857qo mo40963e() {
        return this.f4202d;
    }

    /* renamed from: a */
    public final C3908rl.C3909a.C3910a mo40948a() {
        C3908rl.C3909a.C3910a aVar = new C3908rl.C3909a.C3910a();
        aVar.f4386c = mo40962d();
        aVar.f4385b = mo40961c().getBytes();
        aVar.f4388e = new C3908rl.C3909a.C3912c();
        aVar.f4387d = new C3908rl.C3909a.C3911b();
        return aVar;
    }

    /* renamed from: a */
    public void mo40960a(C4216vz vzVar) {
        this.f4203e = vzVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo40964f() {
        C4287yi a = this.f4201c.mo40671a(mo40961c());
        if (a.mo41869a()) {
            return true;
        }
        if (!this.f4203e.mo41688c()) {
            return false;
        }
        C4216vz vzVar = this.f4203e;
        vzVar.mo41684b("Attribute " + mo40961c() + " of type " + C3874rd.m4690a(mo40962d()) + " is skipped because " + a.mo41870b());
        return false;
    }
}
