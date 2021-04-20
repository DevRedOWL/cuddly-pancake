package com.yandex.metrica.push.impl;

import com.yandex.metrica.C4300p;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.push.impl.bi */
public class C4359bi {
    /* renamed from: a */
    public static void m6382a() {
        if (YandexMetrica.getLibraryApiLevel() >= 68) {
            try {
                C4300p.seb();
            } catch (Exception unused) {
            }
        }
    }
}
