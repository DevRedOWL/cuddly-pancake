package com.yandex.metrica.impl.p039ob;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ip */
public class C3529ip {

    /* renamed from: a */
    private boolean f3393a;

    /* renamed from: b */
    private Set<Integer> f3394b;

    /* renamed from: c */
    private int f3395c;

    /* renamed from: d */
    private int f3396d;

    public C3529ip() {
        this(false, 0, 0, (Set<Integer>) new HashSet());
    }

    public C3529ip(boolean z, int i, int i2, int[] iArr) {
        this(z, i, i2, C3306cx.m2851a(iArr));
    }

    public C3529ip(boolean z, int i, int i2, Set<Integer> set) {
        this.f3393a = z;
        this.f3394b = set;
        this.f3395c = i;
        this.f3396d = i2;
    }

    /* renamed from: a */
    public void mo40214a() {
        this.f3394b = new HashSet();
        this.f3396d = 0;
    }

    /* renamed from: b */
    public boolean mo40218b() {
        return this.f3393a;
    }

    /* renamed from: a */
    public void mo40216a(boolean z) {
        this.f3393a = z;
    }

    /* renamed from: c */
    public Set<Integer> mo40219c() {
        return this.f3394b;
    }

    /* renamed from: d */
    public int mo40220d() {
        return this.f3396d;
    }

    /* renamed from: e */
    public int mo40221e() {
        return this.f3395c;
    }

    /* renamed from: a */
    public void mo40215a(int i) {
        this.f3395c = i;
        this.f3396d = 0;
    }

    /* renamed from: b */
    public void mo40217b(int i) {
        this.f3394b.add(Integer.valueOf(i));
        this.f3396d++;
    }
}
