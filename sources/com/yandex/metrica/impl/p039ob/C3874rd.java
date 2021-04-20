package com.yandex.metrica.impl.p039ob;

import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.rd */
public class C3874rd {

    /* renamed from: a */
    private static SparseArray<String> f4215a = new SparseArray<>();

    static {
        f4215a.put(0, "String");
        f4215a.put(1, "Number");
        f4215a.put(2, "Counter");
    }

    /* renamed from: a */
    static String m4690a(int i) {
        return f4215a.get(i);
    }
}
