package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3299cs;
import com.yandex.metrica.impl.p039ob.C3744np;
import com.yandex.metrica.impl.p039ob.C3949rs;

/* renamed from: com.yandex.metrica.impl.ob.al */
public final class C3136al {

    /* renamed from: a */
    private static volatile C3136al f2567a;

    /* renamed from: b */
    private final Context f2568b;

    /* renamed from: c */
    private volatile C4030si f2569c;

    /* renamed from: d */
    private volatile C4081tj f2570d;

    /* renamed from: e */
    private volatile C3949rs f2571e;

    /* renamed from: f */
    private volatile C3299cs f2572f;

    /* renamed from: g */
    private volatile C3481h f2573g;

    /* renamed from: h */
    private volatile C4073td f2574h;

    /* renamed from: i */
    private volatile C3129ai f2575i;

    /* renamed from: j */
    private volatile C4264xo f2576j = new C4264xo();

    /* renamed from: k */
    private volatile C4191vd f2577k;

    /* renamed from: l */
    private volatile C3270ck f2578l;

    /* renamed from: a */
    public static void m1994a(Context context) {
        if (f2567a == null) {
            synchronized (C3136al.class) {
                if (f2567a == null) {
                    f2567a = new C3136al(context.getApplicationContext());
                }
            }
        }
    }

    /* renamed from: a */
    public static C3136al m1993a() {
        return f2567a;
    }

    private C3136al(Context context) {
        this.f2568b = context;
    }

    /* renamed from: b */
    public Context mo39487b() {
        return this.f2568b;
    }

    /* renamed from: c */
    public C4030si mo39488c() {
        if (this.f2569c == null) {
            synchronized (this) {
                if (this.f2569c == null) {
                    this.f2569c = new C4030si(this.f2568b);
                }
            }
        }
        return this.f2569c;
    }

    /* renamed from: d */
    public C4081tj mo39489d() {
        if (this.f2570d == null) {
            synchronized (this) {
                if (this.f2570d == null) {
                    this.f2570d = new C4081tj(this.f2568b);
                }
            }
        }
        return this.f2570d;
    }

    /* renamed from: e */
    public C3949rs mo39490e() {
        if (this.f2571e == null) {
            synchronized (this) {
                if (this.f2571e == null) {
                    this.f2571e = new C3949rs(this.f2568b, C3744np.C3746a.m4268a(C3949rs.C3954a.class).mo40705a(this.f2568b), m1993a().mo39493h(), mo39489d(), this.f2576j.mo41836h());
                }
            }
        }
        return this.f2571e;
    }

    /* renamed from: f */
    public C4073td mo39491f() {
        if (this.f2574h == null) {
            synchronized (this) {
                if (this.f2574h == null) {
                    this.f2574h = new C4073td(this.f2568b, this.f2576j.mo41836h());
                }
            }
        }
        return this.f2574h;
    }

    /* renamed from: g */
    public C3129ai mo39492g() {
        if (this.f2575i == null) {
            synchronized (this) {
                if (this.f2575i == null) {
                    this.f2575i = new C3129ai();
                }
            }
        }
        return this.f2575i;
    }

    /* renamed from: h */
    public C3299cs mo39493h() {
        if (this.f2572f == null) {
            synchronized (this) {
                if (this.f2572f == null) {
                    this.f2572f = new C3299cs(new C3299cs.C3301b(new C3690ly(C3628ld.m3815a(this.f2568b).mo40441c())));
                }
            }
        }
        return this.f2572f;
    }

    /* renamed from: i */
    public C3481h mo39494i() {
        if (this.f2573g == null) {
            synchronized (this) {
                if (this.f2573g == null) {
                    this.f2573g = new C3481h();
                }
            }
        }
        return this.f2573g;
    }

    /* renamed from: a */
    public void mo39486a(C4143uk ukVar) {
        if (this.f2574h != null) {
            this.f2574h.mo41435b(ukVar);
        }
        if (this.f2575i != null) {
            this.f2575i.mo39473a(ukVar);
        }
    }

    /* renamed from: j */
    public synchronized C4264xo mo39495j() {
        return this.f2576j;
    }

    /* renamed from: k */
    public C4191vd mo39496k() {
        if (this.f2577k == null) {
            synchronized (this) {
                if (this.f2577k == null) {
                    this.f2577k = new C4191vd(this.f2568b, mo39495j().mo41832d());
                }
            }
        }
        return this.f2577k;
    }

    /* renamed from: l */
    public synchronized C3270ck mo39497l() {
        return this.f2578l;
    }

    /* renamed from: a */
    public synchronized void mo39485a(C3271cl clVar) {
        this.f2578l = new C3270ck(this.f2568b, clVar);
    }
}
