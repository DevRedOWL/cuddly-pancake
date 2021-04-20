package com.yandex.metrica.impl.p039ob;

import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.lt */
class C3685lt {

    /* renamed from: a */
    private static volatile SparseArray<C3853qk> f3700a = new SparseArray<>();

    C3685lt() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo40477a(int i) {
        if (f3700a.get(i) == null) {
            SparseArray<C3853qk> sparseArray = f3700a;
            sparseArray.put(i, new C3853qk("EVENT_NUMBER_OF_TYPE_" + i));
        }
        return f3700a.get(i).mo40947b();
    }
}
