package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.yj */
public class C4288yj implements C4289yk<List<C4287yi>> {
    /* renamed from: a */
    public C4287yi mo40671a(List<C4287yi> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C4287yi next : list) {
            if (!next.mo41869a()) {
                linkedList.add(next.mo41870b());
                z = false;
            }
        }
        if (z) {
            return C4287yi.m6197a(this);
        }
        return C4287yi.m6198a(this, TextUtils.join(", ", linkedList));
    }
}
