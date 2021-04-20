package com.yandex.metrica.impl.p039ob;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.vw */
public class C4213vw<K, V> {

    /* renamed from: a */
    private final Map<K, V> f5250a;

    /* renamed from: b */
    private final V f5251b;

    public C4213vw(V v) {
        this(new HashMap(), v);
    }

    public C4213vw(Map<K, V> map, V v) {
        this.f5250a = map;
        this.f5251b = v;
    }

    /* renamed from: a */
    public void mo41713a(K k, V v) {
        this.f5250a.put(k, v);
    }

    /* renamed from: a */
    public V mo41711a(K k) {
        V v = this.f5250a.get(k);
        return v == null ? this.f5251b : v;
    }

    /* renamed from: a */
    public Set<K> mo41712a() {
        return this.f5250a.keySet();
    }
}
