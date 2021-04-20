package com.yandex.metrica.push.impl;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.yandex.metrica.push.impl.w */
public class C4413w {

    /* renamed from: a */
    public final Set<C4415b> f5652a;

    /* renamed from: b */
    public final Set<C4414a> f5653b;

    /* renamed from: c */
    public final boolean f5654c;

    /* renamed from: d */
    public final boolean f5655d;

    /* renamed from: com.yandex.metrica.push.impl.w$b */
    public static class C4415b {

        /* renamed from: a */
        public final String f5659a;

        /* renamed from: b */
        public final Set<C4414a> f5660b;

        /* renamed from: c */
        public final boolean f5661c;

        /* renamed from: d */
        public final boolean f5662d;

        public C4415b(String str, Set<C4414a> set, boolean z, boolean z2) {
            this.f5659a = str;
            this.f5661c = z;
            this.f5660b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
            this.f5662d = z2;
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.w$a */
    public static class C4414a {

        /* renamed from: a */
        public final String f5656a;

        /* renamed from: b */
        public final boolean f5657b;

        /* renamed from: c */
        public final boolean f5658c;

        public C4414a(String str, boolean z, boolean z2) {
            this.f5656a = str;
            this.f5657b = z;
            this.f5658c = z2;
        }
    }

    public C4413w(boolean z, boolean z2) {
        this(Collections.emptySet(), Collections.emptySet(), z, z2);
    }

    public C4413w(Set<C4415b> set, Set<C4414a> set2, boolean z, boolean z2) {
        this.f5652a = Collections.unmodifiableSet(set);
        this.f5653b = Collections.unmodifiableSet(set2);
        this.f5654c = z;
        this.f5655d = z2;
    }
}
