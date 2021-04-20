package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.vo */
public class C4202vo {
    /* renamed from: a */
    public String mo41698a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C3303cu.m2821a(C3137am.m2030c(str.getBytes()));
    }

    /* renamed from: a */
    public String mo41697a() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.US);
    }
}
