package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3373eg;
import com.yandex.metrica.impl.p039ob.C3402et;
import com.yandex.metrica.impl.p039ob.C3405ew;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.fc */
public class C3415fc<COMPONENT extends C3405ew & C3402et> implements C3398ep, C3404ev, C4140uh {

    /* renamed from: a */
    private final Context f3217a;

    /* renamed from: b */
    private final C3379ek f3218b;

    /* renamed from: c */
    private final C3203bl f3219c;

    /* renamed from: d */
    private final C3435ft<COMPONENT> f3220d;

    /* renamed from: e */
    private final C4146ul f3221e;

    /* renamed from: f */
    private final C3421fh f3222f;

    /* renamed from: g */
    private COMPONENT f3223g;

    /* renamed from: h */
    private C3403eu f3224h;

    /* renamed from: i */
    private List<C4140uh> f3225i;

    /* renamed from: j */
    private final C3380el<C3430fp> f3226j;

    public C3415fc(Context context, C3379ek ekVar, C3373eg egVar, C3435ft<COMPONENT> ftVar) {
        this(context, ekVar, egVar, new C3421fh(egVar.f3105b), ftVar, new C3206bm(), new C3380el(), C4130uc.m5560a());
    }

    public C3415fc(Context context, C3379ek ekVar, C3373eg egVar, C3421fh fhVar, C3435ft<COMPONENT> ftVar, C3206bm bmVar, C3380el<C3430fp> elVar, C4130uc ucVar) {
        this.f3225i = new ArrayList();
        this.f3217a = context;
        this.f3218b = ekVar;
        this.f3222f = fhVar;
        this.f3219c = bmVar.mo39647a(this.f3217a, this.f3218b);
        this.f3220d = ftVar;
        this.f3226j = elVar;
        this.f3221e = ucVar.mo41532a(this.f3217a, mo40077a(), this, egVar.f3104a);
    }

    /* renamed from: a */
    public void mo40080a(C4217w wVar, C3373eg egVar) {
        C3405ew ewVar;
        m3243b();
        if (C3125af.m1960d(wVar.mo41736g())) {
            ewVar = m3245e();
        } else {
            ewVar = m3244d();
        }
        if (!C3125af.m1949a(wVar.mo41736g())) {
            mo40078a(egVar.f3105b);
        }
        ewVar.mo40016a(wVar);
    }

    /* renamed from: b */
    private void m3243b() {
        m3245e().mo40070a();
    }

    /* renamed from: a */
    public synchronized void mo40078a(C3373eg.C3374a aVar) {
        this.f3222f.mo40097a(aVar);
        if (this.f3224h != null) {
            this.f3224h.mo39979a(aVar);
        }
        if (this.f3223g != null) {
            ((C3402et) this.f3223g).mo39979a(aVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo40079a(C3430fp fpVar) {
        this.f3226j.mo40000a(fpVar);
    }

    /* renamed from: b */
    public synchronized void mo40081b(C3430fp fpVar) {
        this.f3226j.mo40001b(fpVar);
    }

    /* renamed from: d */
    private COMPONENT m3244d() {
        if (this.f3223g == null) {
            synchronized (this) {
                this.f3223g = this.f3220d.mo40109d(this.f3217a, this.f3218b, this.f3222f.mo40096a(), this.f3219c, this.f3221e);
                this.f3225i.add(this.f3223g);
            }
        }
        return this.f3223g;
    }

    /* renamed from: e */
    private C3403eu m3245e() {
        if (this.f3224h == null) {
            synchronized (this) {
                this.f3224h = this.f3220d.mo40108c(this.f3217a, this.f3218b, this.f3222f.mo40096a(), this.f3219c, this.f3221e);
                this.f3225i.add(this.f3224h);
            }
        }
        return this.f3224h;
    }

    /* renamed from: a */
    public final C3379ek mo40077a() {
        return this.f3218b;
    }

    /* renamed from: a */
    public synchronized void mo39983a(C4143uk ukVar) {
        for (C4140uh a : this.f3225i) {
            a.mo39983a(ukVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo39982a(C4134ue ueVar, C4143uk ukVar) {
        for (C4140uh a : this.f3225i) {
            a.mo39982a(ueVar, ukVar);
        }
    }

    /* renamed from: c */
    public void mo39987c() {
        COMPONENT component = this.f3223g;
        if (component != null) {
            ((C3398ep) component).mo39987c();
        }
        C3403eu euVar = this.f3224h;
        if (euVar != null) {
            euVar.mo39987c();
        }
    }

    /* renamed from: a */
    public void mo39980a(C3373eg egVar) {
        this.f3221e.mo41600a(egVar.f3104a);
        mo40078a(egVar.f3105b);
    }
}
