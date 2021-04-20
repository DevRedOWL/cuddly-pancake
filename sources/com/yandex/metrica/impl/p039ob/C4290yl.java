package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.yl */
public class C4290yl implements C4289yk<String> {
    /* renamed from: a */
    public C4287yi mo40671a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C4287yi.m6198a(this, "ApiKey is empty. Please, read official documentation how to obtain one: https://tech.yandex.com/metrica-mobile-sdk/doc/mobile-sdk-dg/concepts/android-initialize-docpage/");
        }
        try {
            UUID.fromString(str);
            return C4287yi.m6197a(this);
        } catch (Throwable unused) {
            return C4287yi.m6198a(this, "Invalid ApiKey=" + str + ". " + "Please, read official documentation how to obtain one:" + " " + "https://tech.yandex.com/metrica-mobile-sdk/doc/mobile-sdk-dg/concepts/android-initialize-docpage/");
        }
    }
}
