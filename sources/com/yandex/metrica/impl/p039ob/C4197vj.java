package com.yandex.metrica.impl.p039ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.vj */
public class C4197vj {
    /* renamed from: a */
    public static boolean m5866a(Collection<?> collection, Collection<?> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
        } else if (collection2 instanceof HashSet) {
            HashSet hashSet2 = (HashSet) collection2;
            collection2 = collection;
            hashSet = hashSet2;
        } else {
            hashSet = new HashSet(collection);
        }
        for (Object contains : collection2) {
            if (!hashSet.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static List<Integer> m5864a(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int[] m5867a(List<Integer> list) {
        int[] iArr = new int[list.size()];
        int i = 0;
        for (Integer intValue : list) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: a */
    public static <K, V> void m5865a(Map<K, V> map, K k, V v) {
        if (k != null && v != null) {
            map.put(k, v);
        }
    }
}
