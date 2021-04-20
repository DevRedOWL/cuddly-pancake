package com.yandex.metrica.impl.p039ob;

import android.os.Handler;

/* renamed from: com.yandex.metrica.impl.ob.xf */
public class C4255xf {

    /* renamed from: a */
    private final C4254xe f5301a;

    /* renamed from: b */
    private volatile C4258xi f5302b;

    /* renamed from: c */
    private volatile C4257xh f5303c;

    /* renamed from: d */
    private volatile C4257xh f5304d;

    /* renamed from: e */
    private volatile Handler f5305e;

    public C4255xf() {
        this(new C4254xe());
    }

    /* renamed from: a */
    public C4257xh mo41802a() {
        if (this.f5303c == null) {
            synchronized (this) {
                if (this.f5303c == null) {
                    this.f5303c = this.f5301a.mo41799b();
                }
            }
        }
        return this.f5303c;
    }

    /* renamed from: b */
    public C4258xi mo41803b() {
        if (this.f5302b == null) {
            synchronized (this) {
                if (this.f5302b == null) {
                    this.f5302b = this.f5301a.mo41801d();
                }
            }
        }
        return this.f5302b;
    }

    /* renamed from: c */
    public C4257xh mo41804c() {
        if (this.f5304d == null) {
            synchronized (this) {
                if (this.f5304d == null) {
                    this.f5304d = this.f5301a.mo41800c();
                }
            }
        }
        return this.f5304d;
    }

    /* renamed from: d */
    public Handler mo41805d() {
        if (this.f5305e == null) {
            synchronized (this) {
                if (this.f5305e == null) {
                    this.f5305e = this.f5301a.mo41798a();
                }
            }
        }
        return this.f5305e;
    }

    C4255xf(C4254xe xeVar) {
        this.f5301a = xeVar;
    }
}
