package com.yandex.metrica.impl.p039ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.wp */
public class C4237wp<K, V> {

    /* renamed from: a */
    private final HashMap<K, Collection<V>> f5279a = new HashMap<>();

    /* renamed from: a */
    public int mo41773a() {
        int i = 0;
        for (Collection<V> size : this.f5279a.values()) {
            i += size.size();
        }
        return i;
    }

    /* renamed from: a */
    public Collection<V> mo41774a(K k) {
        return this.f5279a.get(k);
    }

    /* renamed from: a */
    public Collection<V> mo41775a(K k, V v) {
        Collection collection;
        Collection collection2 = this.f5279a.get(k);
        if (collection2 == null) {
            collection = m6048c();
        } else {
            collection = m6047a(collection2);
        }
        collection.add(v);
        return this.f5279a.put(k, collection);
    }

    /* renamed from: b */
    public Collection<V> mo41776b(K k) {
        return this.f5279a.remove(k);
    }

    /* renamed from: b */
    public Collection<V> mo41777b(K k, V v) {
        Collection collection = this.f5279a.get(k);
        if (collection == null || !collection.remove(v)) {
            return null;
        }
        return m6047a(collection);
    }

    /* renamed from: c */
    private Collection<V> m6048c() {
        return new ArrayList();
    }

    /* renamed from: a */
    private Collection<V> m6047a(Collection<V> collection) {
        return new ArrayList(collection);
    }

    /* renamed from: b */
    public Set<? extends Map.Entry<K, ? extends Collection<V>>> mo41778b() {
        return this.f5279a.entrySet();
    }

    public String toString() {
        return this.f5279a.toString();
    }
}
