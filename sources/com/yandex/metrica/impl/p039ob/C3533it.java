package com.yandex.metrica.impl.p039ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.it */
public abstract class C3533it implements C3536iw<C3539iy> {

    /* renamed from: a */
    private final C3391en f3401a;

    /* renamed from: b */
    private final C3549jc f3402b;

    /* renamed from: c */
    private final C3556jg f3403c;

    /* renamed from: d */
    private final C3546jb f3404d;

    public C3533it(C3391en enVar, C3549jc jcVar, C3556jg jgVar, C3546jb jbVar) {
        this.f3401a = enVar;
        this.f3402b = jcVar;
        this.f3403c = jgVar;
        this.f3404d = jbVar;
    }

    /* renamed from: a */
    public final C3537ix mo40233a() {
        if (this.f3403c.mo40304i()) {
            return new C3537ix(this.f3401a, this.f3403c, mo40236b());
        }
        return null;
    }

    /* renamed from: a */
    public final C3537ix mo40235a(C3539iy iyVar) {
        if (this.f3403c.mo40304i()) {
            C4085tl.m5459a(this.f3401a.mo40027k()).reportEvent("create session with non-empty storage");
        }
        return new C3537ix(this.f3401a, this.f3403c, m3511b(iyVar));
    }

    /* renamed from: b */
    private C3540iz m3511b(C3539iy iyVar) {
        long a = this.f3402b.mo40274a();
        this.f3403c.mo40297d(a).mo40293b(TimeUnit.MILLISECONDS.toSeconds(iyVar.f3423a)).mo40299e(iyVar.f3423a).mo40290a(0).mo40291a(true).mo40303h();
        this.f3401a.mo40026j().mo40403a(a, this.f3404d.mo40270a(), TimeUnit.MILLISECONDS.toSeconds(iyVar.f3424b));
        return mo40236b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3540iz mo40236b() {
        return C3540iz.m3536a(this.f3404d).mo40261a(this.f3403c.mo40302g()).mo40265c(this.f3403c.mo40298d()).mo40264b(this.f3403c.mo40296c()).mo40262a(this.f3403c.mo40295b()).mo40266d(this.f3403c.mo40300e()).mo40267e(this.f3403c.mo40301f()).mo40263a();
    }
}
