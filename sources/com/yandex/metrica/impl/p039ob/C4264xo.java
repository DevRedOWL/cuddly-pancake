package com.yandex.metrica.impl.p039ob;

import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.xo */
public class C4264xo {

    /* renamed from: a */
    private final C4263xn f5313a;

    /* renamed from: b */
    private volatile C4257xh f5314b;

    /* renamed from: c */
    private volatile Executor f5315c;

    /* renamed from: d */
    private volatile C4257xh f5316d;

    /* renamed from: e */
    private volatile C4257xh f5317e;

    /* renamed from: f */
    private volatile C4258xi f5318f;

    /* renamed from: g */
    private volatile C4257xh f5319g;

    /* renamed from: h */
    private volatile C4257xh f5320h;

    /* renamed from: i */
    private volatile C4257xh f5321i;

    /* renamed from: j */
    private volatile C4257xh f5322j;

    public C4264xo() {
        this(new C4263xn());
    }

    /* renamed from: a */
    public C4257xh mo41828a() {
        if (this.f5314b == null) {
            synchronized (this) {
                if (this.f5314b == null) {
                    this.f5314b = this.f5313a.mo41818a();
                }
            }
        }
        return this.f5314b;
    }

    /* renamed from: b */
    public Executor mo41830b() {
        if (this.f5315c == null) {
            synchronized (this) {
                if (this.f5315c == null) {
                    this.f5315c = this.f5313a.mo41820b();
                }
            }
        }
        return this.f5315c;
    }

    /* renamed from: c */
    public C4257xh mo41831c() {
        if (this.f5316d == null) {
            synchronized (this) {
                if (this.f5316d == null) {
                    this.f5316d = this.f5313a.mo41821c();
                }
            }
        }
        return this.f5316d;
    }

    /* renamed from: d */
    public C4257xh mo41832d() {
        if (this.f5317e == null) {
            synchronized (this) {
                if (this.f5317e == null) {
                    this.f5317e = this.f5313a.mo41822d();
                }
            }
        }
        return this.f5317e;
    }

    /* renamed from: e */
    public C4258xi mo41833e() {
        if (this.f5318f == null) {
            synchronized (this) {
                if (this.f5318f == null) {
                    this.f5318f = this.f5313a.mo41823e();
                }
            }
        }
        return this.f5318f;
    }

    /* renamed from: f */
    public C4257xh mo41834f() {
        if (this.f5319g == null) {
            synchronized (this) {
                if (this.f5319g == null) {
                    this.f5319g = this.f5313a.mo41824f();
                }
            }
        }
        return this.f5319g;
    }

    /* renamed from: g */
    public C4257xh mo41835g() {
        if (this.f5320h == null) {
            synchronized (this) {
                if (this.f5320h == null) {
                    this.f5320h = this.f5313a.mo41825g();
                }
            }
        }
        return this.f5320h;
    }

    /* renamed from: h */
    public C4257xh mo41836h() {
        if (this.f5321i == null) {
            synchronized (this) {
                if (this.f5321i == null) {
                    this.f5321i = this.f5313a.mo41826h();
                }
            }
        }
        return this.f5321i;
    }

    /* renamed from: i */
    public C4257xh mo41837i() {
        if (this.f5322j == null) {
            synchronized (this) {
                if (this.f5322j == null) {
                    this.f5322j = this.f5313a.mo41827i();
                }
            }
        }
        return this.f5322j;
    }

    /* renamed from: a */
    public C4261xl mo41829a(Runnable runnable) {
        return this.f5313a.mo41819a(runnable);
    }

    C4264xo(C4263xn xnVar) {
        this.f5313a = xnVar;
    }
}
