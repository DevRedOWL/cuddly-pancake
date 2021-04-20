package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3481h;
import com.yandex.metrica.impl.p039ob.C3744np;
import com.yandex.metrica.impl.p039ob.C4067tb;

/* renamed from: com.yandex.metrica.impl.ob.td */
public class C4073td {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4069tc f4884a;

    /* renamed from: b */
    private final C3700mf<C4076te> f4885b;

    /* renamed from: c */
    private final C3305cw f4886c;

    /* renamed from: d */
    private final C4257xh f4887d;

    /* renamed from: e */
    private final C3481h.C3485b f4888e;

    /* renamed from: f */
    private final C3481h f4889f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4067tb f4890g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f4891h;

    /* renamed from: i */
    private C4128ua f4892i;

    /* renamed from: j */
    private boolean f4893j;

    /* renamed from: k */
    private long f4894k;

    /* renamed from: l */
    private long f4895l;

    /* renamed from: m */
    private long f4896m;

    /* renamed from: n */
    private boolean f4897n;

    /* renamed from: o */
    private boolean f4898o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f4899p;

    /* renamed from: q */
    private final Object f4900q;

    public C4073td(Context context, C4257xh xhVar) {
        this(context, new C4069tc(context, (String) null, xhVar), C3744np.C3746a.m4268a(C4076te.class).mo40705a(context), new C3305cw(), xhVar, C3136al.m1993a().mo39494i());
    }

    C4073td(Context context, C4069tc tcVar, C3700mf<C4076te> mfVar, C3305cw cwVar, C4257xh xhVar, C3481h hVar) {
        this.f4899p = false;
        this.f4900q = new Object();
        this.f4884a = tcVar;
        this.f4885b = mfVar;
        this.f4890g = new C4067tb(context, mfVar, new C4067tb.C4068a() {
            /* renamed from: a */
            public void mo41424a() {
                C4073td.this.mo41436c();
                boolean unused = C4073td.this.f4891h = false;
            }
        });
        this.f4886c = cwVar;
        this.f4887d = xhVar;
        this.f4888e = new C3481h.C3485b() {
            /* renamed from: a */
            public void mo40175a() {
                boolean unused = C4073td.this.f4899p = true;
                C4073td.this.f4884a.mo41426a(C4073td.this.f4890g);
            }
        };
        this.f4889f = hVar;
    }

    /* renamed from: a */
    public void mo41433a(C4143uk ukVar) {
        mo41436c();
        mo41435b(ukVar);
    }

    /* renamed from: d */
    private void m5436d() {
        if (this.f4898o) {
            m5438f();
        } else {
            m5439g();
        }
    }

    /* renamed from: e */
    private void m5437e() {
        if (this.f4894k - this.f4895l >= this.f4892i.f5044b) {
            mo41434b();
        }
    }

    /* renamed from: f */
    private void m5438f() {
        if (this.f4886c.mo39866b(this.f4896m, this.f4892i.f5046d, "should retry sdk collecting")) {
            mo41434b();
        }
    }

    /* renamed from: g */
    private void m5439g() {
        if (this.f4886c.mo39866b(this.f4896m, this.f4892i.f5043a, "should collect sdk as usual")) {
            mo41434b();
        }
    }

    /* renamed from: a */
    public void mo41432a() {
        synchronized (this.f4900q) {
            if (this.f4893j && this.f4892i != null) {
                if (this.f4897n) {
                    m5436d();
                } else {
                    m5437e();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo41435b(C4143uk ukVar) {
        boolean c = m5435c(ukVar);
        synchronized (this.f4900q) {
            if (ukVar != null) {
                this.f4893j = ukVar.f5101o.f4998e;
                this.f4892i = ukVar.f5081B;
                this.f4894k = ukVar.f5083D;
                this.f4895l = ukVar.f5084E;
            }
            this.f4884a.mo41427a(ukVar);
        }
        if (c) {
            mo41432a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41434b() {
        if (!this.f4891h) {
            this.f4891h = true;
            if (!this.f4899p) {
                this.f4889f.mo40172a(this.f4892i.f5045c, this.f4887d, this.f4888e);
            } else {
                this.f4884a.mo41426a(this.f4890g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41436c() {
        C4076te a = this.f4885b.mo40624a();
        this.f4896m = a.f4905c;
        this.f4897n = a.f4906d;
        this.f4898o = a.f4907e;
    }

    /* renamed from: c */
    private boolean m5435c(C4143uk ukVar) {
        C4128ua uaVar;
        if (ukVar == null) {
            return false;
        }
        if ((this.f4893j || !ukVar.f5101o.f4998e) && (uaVar = this.f4892i) != null && uaVar.equals(ukVar.f5081B) && this.f4894k == ukVar.f5083D && this.f4895l == ukVar.f5084E && !this.f4884a.mo41428b(ukVar)) {
            return false;
        }
        return true;
    }
}
