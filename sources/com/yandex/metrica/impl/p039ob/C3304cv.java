package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3402et;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.cv */
public class C3304cv<C extends C3402et> implements Closeable {

    /* renamed from: a */
    final Object f2977a = new Object();

    /* renamed from: b */
    final C3203bl f2978b;

    /* renamed from: c */
    boolean f2979c = false;

    /* renamed from: d */
    private C f2980d;

    /* renamed from: e */
    private final C4151uq f2981e;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39760a() {
    }

    public C3304cv(C c, C4151uq uqVar, C3203bl blVar) {
        this.f2980d = c;
        this.f2981e = uqVar;
        this.f2978b = blVar;
    }

    public void close() {
        synchronized (this.f2977a) {
            if (!this.f2979c) {
                mo39760a();
                if (this.f2978b.isAlive()) {
                    this.f2978b.mo39640a();
                }
                this.f2979c = true;
            }
        }
    }

    /* renamed from: e */
    public void mo39862e() {
        synchronized (this.f2977a) {
            if (!this.f2979c) {
                mo39863f();
                mo39760a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo39863f() {
        synchronized (this.f2977a) {
            if (!this.f2979c) {
                mo39762c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo39762c() {
        this.f2981e.mo41614a(this.f2978b);
    }

    /* renamed from: g */
    public C mo39864g() {
        return this.f2980d;
    }
}
