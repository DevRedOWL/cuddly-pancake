package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.ff */
public class C3418ff {

    /* renamed from: a */
    private final C3688lw f3228a;

    /* renamed from: b */
    private C3550jd f3229b;

    /* renamed from: c */
    private C3621kz f3230c;

    /* renamed from: d */
    private final C4246wy f3231d;

    /* renamed from: e */
    private final C3512i f3232e;

    /* renamed from: f */
    private final C3400er f3233f;

    /* renamed from: g */
    private C3419a f3234g;

    /* renamed from: h */
    private final C4228wh f3235h;

    /* renamed from: i */
    private final int f3236i;

    /* renamed from: j */
    private long f3237j;

    /* renamed from: k */
    private long f3238k;

    /* renamed from: l */
    private int f3239l;

    /* renamed from: com.yandex.metrica.impl.ob.ff$a */
    public interface C3419a {
        /* renamed from: a */
        void mo40062a();
    }

    public C3418ff(C3688lw lwVar, C3550jd jdVar, C3621kz kzVar, C3512i iVar, C4246wy wyVar, int i, C3419a aVar) {
        this(lwVar, jdVar, kzVar, iVar, wyVar, i, aVar, new C3400er(lwVar), new C4227wg());
    }

    public C3418ff(C3688lw lwVar, C3550jd jdVar, C3621kz kzVar, C3512i iVar, C4246wy wyVar, int i, C3419a aVar, C3400er erVar, C4228wh whVar) {
        this.f3228a = lwVar;
        this.f3229b = jdVar;
        this.f3230c = kzVar;
        this.f3232e = iVar;
        this.f3231d = wyVar;
        this.f3236i = i;
        this.f3233f = erVar;
        this.f3235h = whVar;
        this.f3234g = aVar;
        this.f3237j = this.f3228a.mo40521a(0);
        this.f3238k = this.f3228a.mo40527b();
        this.f3239l = this.f3228a.mo40531c();
    }

    /* renamed from: a */
    public void mo40084a(C4217w wVar) {
        this.f3229b.mo40279c(wVar);
    }

    /* renamed from: b */
    public void mo40087b(C4217w wVar) {
        mo40092e(wVar);
        m3257f();
    }

    /* renamed from: c */
    public void mo40088c(C4217w wVar) {
        mo40092e(wVar);
        mo40083a();
    }

    /* renamed from: d */
    public void mo40091d(C4217w wVar) {
        mo40092e(wVar);
        mo40086b();
    }

    /* renamed from: e */
    public void mo40092e(C4217w wVar) {
        mo40085a(wVar, this.f3229b.mo40280d(wVar));
    }

    /* renamed from: f */
    public void mo40094f(C4217w wVar) {
        mo40085a(wVar, this.f3229b.mo40281e(wVar));
    }

    /* renamed from: a */
    public void mo40085a(C4217w wVar, C3554je jeVar) {
        if (TextUtils.isEmpty(wVar.mo41741l())) {
            wVar.mo40966a(this.f3228a.mo40543f());
        }
        wVar.mo40971d(this.f3228a.mo40545h());
        C3554je jeVar2 = jeVar;
        this.f3230c.mo40406a(this.f3231d.mo41793a(wVar).mo41785a(wVar), wVar.mo41736g(), jeVar2, this.f3232e.mo40190b(), this.f3233f);
        this.f3234g.mo40062a();
    }

    /* renamed from: f */
    private void m3257f() {
        this.f3237j = this.f3235h.mo41769b();
        this.f3228a.mo40529b(this.f3237j).mo40567q();
    }

    /* renamed from: a */
    public void mo40083a() {
        this.f3238k = this.f3235h.mo41769b();
        this.f3228a.mo40533c(this.f3238k).mo40567q();
    }

    /* renamed from: b */
    public void mo40086b() {
        this.f3239l = this.f3236i;
        this.f3228a.mo40532c(this.f3239l).mo40567q();
    }

    /* renamed from: c */
    public boolean mo40089c() {
        return this.f3235h.mo41769b() - this.f3237j > C3545ja.f3442a;
    }

    /* renamed from: d */
    public long mo40090d() {
        return this.f3238k;
    }

    /* renamed from: e */
    public boolean mo40093e() {
        return this.f3239l < this.f3236i;
    }
}
