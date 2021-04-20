package com.yandex.metrica.push.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.push.impl.a */
public class C4312a {

    /* renamed from: a */
    public final boolean f5411a;

    /* renamed from: b */
    public final boolean f5412b;

    /* renamed from: c */
    public final boolean f5413c;

    /* renamed from: d */
    public final boolean f5414d;

    /* renamed from: e */
    public final boolean f5415e;

    /* renamed from: f */
    public final Set<String> f5416f;

    /* synthetic */ C4312a(C4313a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public boolean mo41952a(String str) {
        return this.f5414d && !this.f5416f.contains(str);
    }

    /* renamed from: com.yandex.metrica.push.impl.a$a */
    public static class C4313a {

        /* renamed from: a */
        boolean f5417a = true;

        /* renamed from: b */
        boolean f5418b = true;

        /* renamed from: c */
        boolean f5419c = true;

        /* renamed from: d */
        boolean f5420d = true;

        /* renamed from: e */
        boolean f5421e = true;

        /* renamed from: f */
        final Set<String> f5422f = new HashSet();

        /* renamed from: a */
        public C4312a mo41953a() {
            return new C4312a(this, (byte) 0);
        }
    }

    private C4312a(C4313a aVar) {
        this.f5411a = aVar.f5417a;
        this.f5412b = aVar.f5418b;
        this.f5413c = aVar.f5419c;
        this.f5414d = aVar.f5420d;
        this.f5415e = aVar.f5421e;
        this.f5416f = Collections.unmodifiableSet(aVar.f5422f);
    }
}
