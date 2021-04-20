package com.yandex.metrica.push.impl;

import android.content.Context;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.push.impl.bp */
public class C4366bp {

    /* renamed from: a */
    private final List<? extends C4360bj> f5479a;

    public C4366bp(Context context) {
        this((List<C4360bj>) Arrays.asList(new C4360bj[]{new C4362bl(context), new C4365bo(context), new C4360bj(context)}));
    }

    C4366bp(List<C4360bj> list) {
        this.f5479a = list;
    }

    /* renamed from: a */
    public C4394j mo41994a() {
        for (C4360bj bjVar : this.f5479a) {
            C4367bq d = bjVar.mo41989d();
            if (!d.mo41997c()) {
                if (d.mo41998d()) {
                    return bjVar;
                }
                throw new IllegalStateException(bjVar.mo41990e());
            }
        }
        throw new IllegalStateException("Metrica Push SDK is not activated correctly. Please, activate in accordance with the documentation: https://tech.yandex.com/appmetrica/doc/mobile-sdk-dg/push/android-initialize-docpage");
    }
}
