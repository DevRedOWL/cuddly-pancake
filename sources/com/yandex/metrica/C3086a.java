package com.yandex.metrica;

import com.yandex.metrica.impl.p039ob.C3320db;
import com.yandex.metrica.impl.p039ob.C4257xh;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.a */
public class C3086a {

    /* renamed from: a */
    private final C4257xh f2413a;

    /* renamed from: b */
    private final long f2414b;

    /* renamed from: c */
    private final Set<C3088a> f2415c;

    /* renamed from: d */
    private final Runnable f2416d;

    /* renamed from: e */
    private boolean f2417e;

    /* renamed from: com.yandex.metrica.a$a */
    public interface C3088a {
        /* renamed from: a */
        void mo39347a();

        /* renamed from: b */
        void mo39348b();
    }

    public C3086a(long j) {
        this(j, C3320db.m2960k().mo41803b());
    }

    C3086a(long j, C4257xh xhVar) {
        this.f2415c = new HashSet();
        this.f2416d = new Runnable() {
            public void run() {
                C3086a.this.m1782d();
            }
        };
        this.f2417e = true;
        this.f2413a = xhVar;
        this.f2414b = j;
    }

    /* renamed from: a */
    public void mo39344a() {
        if (this.f2417e) {
            this.f2417e = false;
            this.f2413a.mo41812b(this.f2416d);
            m1781c();
        }
    }

    /* renamed from: b */
    public void mo39345b() {
        if (!this.f2417e) {
            this.f2417e = true;
            this.f2413a.mo41809a(this.f2416d, this.f2414b);
        }
    }

    /* renamed from: c */
    private void m1781c() {
        for (C3088a a : new HashSet(this.f2415c)) {
            a.mo39347a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m1782d() {
        for (C3088a b : new HashSet(this.f2415c)) {
            b.mo39348b();
        }
    }
}
