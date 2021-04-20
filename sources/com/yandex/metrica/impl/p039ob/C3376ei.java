package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3373eg;
import com.yandex.metrica.impl.p039ob.C4030si;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ei */
public class C3376ei implements C3402et, C3404ev, C4140uh {

    /* renamed from: a */
    private final Context f3124a;

    /* renamed from: b */
    private final C3379ek f3125b;

    /* renamed from: c */
    private C4130uc f3126c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4146ul f3127d;

    /* renamed from: e */
    private final C3421fh f3128e;

    /* renamed from: f */
    private C3203bl f3129f;

    /* renamed from: g */
    private C3474gu<C3473gt, C3376ei> f3130g;

    /* renamed from: h */
    private C3304cv<C3376ei> f3131h;

    /* renamed from: i */
    private List<C3141ap> f3132i;

    /* renamed from: j */
    private final C3380el<C3434fs> f3133j;

    /* renamed from: k */
    private C4030si f3134k;

    /* renamed from: l */
    private final C4030si.C4032a f3135l;

    /* renamed from: m */
    private C3949rs f3136m;

    /* renamed from: n */
    private final Object f3137n;

    public C3376ei(Context context, C4130uc ucVar, C3379ek ekVar, C3373eg egVar, C4030si siVar, C3203bl blVar) {
        this(context, ucVar, ekVar, egVar, new C3421fh(egVar.f3105b), siVar, blVar);
    }

    C3376ei(Context context, C4130uc ucVar, C3379ek ekVar, C3373eg egVar, C3421fh fhVar, C4030si siVar, C3203bl blVar) {
        this.f3133j = new C3380el<>();
        this.f3137n = new Object();
        this.f3124a = context.getApplicationContext();
        this.f3125b = ekVar;
        this.f3126c = ucVar;
        this.f3128e = fhVar;
        this.f3129f = blVar;
        this.f3132i = new ArrayList();
        this.f3130g = new C3474gu<>(new C3463gm(this), this);
        this.f3127d = this.f3126c.mo41532a(this.f3124a, this.f3125b, this, egVar.f3104a);
        this.f3131h = new C3304cv<>(this, new C4150up(this.f3127d), this.f3129f);
        this.f3134k = siVar;
        this.f3135l = new C4030si.C4032a() {
            /* renamed from: a */
            public boolean mo39990a(C4034sj sjVar) {
                if (TextUtils.isEmpty(sjVar.f4752a)) {
                    return false;
                }
                C3376ei.this.f3127d.mo41603a(sjVar.f4752a);
                return false;
            }
        };
        this.f3134k.mo41268a(this.f3135l);
    }

    /* renamed from: a */
    public void mo39979a(C3373eg.C3374a aVar) {
        this.f3128e.mo40097a(aVar);
    }

    /* renamed from: a */
    public synchronized void mo39981a(C3434fs fsVar) {
        this.f3133j.mo40000a(fsVar);
    }

    /* renamed from: b */
    public synchronized void mo39986b(C3434fs fsVar) {
        this.f3133j.mo40001b(fsVar);
    }

    /* renamed from: a */
    public void mo39984a(C4217w wVar, C3434fs fsVar) {
        this.f3130g.mo40166a(wVar, fsVar);
    }

    /* renamed from: a */
    public C3373eg.C3374a mo39977a() {
        return this.f3128e.mo40096a();
    }

    /* renamed from: b */
    public C3379ek mo39985b() {
        return this.f3125b;
    }

    /* renamed from: a */
    public void mo39983a(C4143uk ukVar) {
        m3099b(ukVar);
        if (ukVar != null) {
            if (this.f3136m == null) {
                this.f3136m = C3136al.m1993a().mo39490e();
            }
            this.f3136m.mo41104a(ukVar);
        }
    }

    /* renamed from: a */
    public void mo39982a(C4134ue ueVar, C4143uk ukVar) {
        synchronized (this.f3137n) {
            for (C3141ap c : this.f3132i) {
                C4248x.m6078a(c.mo39507c(), ueVar, ukVar);
            }
            this.f3132i.clear();
        }
    }

    /* renamed from: b */
    private void m3099b(C4143uk ukVar) {
        synchronized (this.f3137n) {
            for (C3434fs a : this.f3133j.mo39999a()) {
                a.mo39983a(ukVar);
            }
            ArrayList arrayList = new ArrayList();
            for (C3141ap next : this.f3132i) {
                if (next.mo39505a(ukVar)) {
                    C4248x.m6079a(next.mo39507c(), ukVar);
                } else {
                    arrayList.add(next);
                }
            }
            this.f3132i = new ArrayList(arrayList);
            if (!arrayList.isEmpty()) {
                this.f3131h.mo39862e();
            }
        }
    }

    /* renamed from: c */
    public void mo39987c() {
        C3306cx.m2855a((Closeable) this.f3131h);
        this.f3129f.mo41814b();
    }

    /* renamed from: d */
    public Context mo39988d() {
        return this.f3124a;
    }

    /* renamed from: a */
    public void mo39978a(C3141ap apVar) {
        ResultReceiver resultReceiver;
        Map hashMap = new HashMap();
        List<String> list = null;
        if (apVar != null) {
            list = apVar.mo39504a();
            resultReceiver = apVar.mo39507c();
            hashMap = apVar.mo39506b();
        } else {
            resultReceiver = null;
        }
        boolean a = this.f3127d.mo41605a(list, (Map<String, String>) hashMap);
        if (!a) {
            C4248x.m6079a(resultReceiver, this.f3127d.mo41609e());
        }
        if (this.f3127d.mo41607c()) {
            synchronized (this.f3137n) {
                if (a && apVar != null) {
                    this.f3132i.add(apVar);
                }
            }
            this.f3131h.mo39862e();
            return;
        }
        C4248x.m6079a(resultReceiver, this.f3127d.mo41609e());
    }

    /* renamed from: e */
    public C4030si mo39989e() {
        return this.f3134k;
    }

    /* renamed from: a */
    public void mo39980a(C3373eg egVar) {
        this.f3127d.mo41600a(egVar.f3104a);
        mo39979a(egVar.f3105b);
    }
}
