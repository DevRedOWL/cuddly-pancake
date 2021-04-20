package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3744np;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.hk */
public class C3496hk extends C3489hd {

    /* renamed from: a */
    private final C3836pv f3352a;

    /* renamed from: b */
    private final C3700mf<C3827pn> f3353b;

    /* renamed from: c */
    private final C3692m f3354c;

    /* renamed from: d */
    private final C3543j f3355d;

    /* renamed from: e */
    private final C3592k f3356e;

    public C3496hk(C3391en enVar, C3836pv pvVar) {
        this(enVar, pvVar, C3744np.C3746a.m4268a(C3827pn.class).mo40705a(enVar.mo40027k()), new C3692m(enVar.mo40027k()), new C3543j(), new C3592k(enVar.mo40027k()));
    }

    C3496hk(C3391en enVar, C3836pv pvVar, C3700mf<C3827pn> mfVar, C3692m mVar, C3543j jVar, C3592k kVar) {
        super(enVar);
        this.f3352a = pvVar;
        this.f3353b = mfVar;
        this.f3354c = mVar;
        this.f3355d = jVar;
        this.f3356e = kVar;
    }

    /* renamed from: a */
    public boolean mo40170a(C4217w wVar) {
        C3391en a = mo40176a();
        a.mo39985b().toString();
        if (!a.mo40037u().mo40487d() || !a.mo40034r()) {
            return false;
        }
        C3827pn a2 = this.f3353b.mo40624a();
        C3827pn a3 = m3422a(a2);
        if (a3 != null) {
            m3423a(a3, wVar, a.mo40021e());
            this.f3353b.mo40625a(a3);
            return false;
        } else if (!a.mo40035s()) {
            return false;
        } else {
            m3423a(a2, wVar, a.mo40021e());
            return false;
        }
    }

    /* renamed from: a */
    private C3827pn m3422a(C3827pn pnVar) {
        List<C3835pu> list = pnVar.f4073a;
        C3623l lVar = pnVar.f4074b;
        C3623l a = this.f3354c.mo40615a();
        List<String> list2 = pnVar.f4075c;
        List<String> a2 = this.f3356e.mo40342a();
        List<C3835pu> a3 = this.f3352a.mo40868a(mo40176a().mo40027k(), list);
        if (a3 == null && C3306cx.m2859a((Object) lVar, (Object) a) && C4197vj.m5866a(list2, a2)) {
            return null;
        }
        if (a3 != null) {
            list = a3;
        }
        return new C3827pn(list, a, a2);
    }

    /* renamed from: a */
    private void m3423a(C3827pn pnVar, C4217w wVar, C3418ff ffVar) {
        ffVar.mo40088c(C4217w.m5947a(wVar, pnVar.f4073a, pnVar.f4074b, this.f3355d, pnVar.f4075c));
    }
}
