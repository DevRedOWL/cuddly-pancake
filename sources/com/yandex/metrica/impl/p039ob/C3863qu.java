package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.qu */
public class C3863qu implements C4289yk<String> {
    /* renamed from: a */
    public C4287yi mo40671a(String str) {
        if (str == null) {
            return C4287yi.m6198a(this, "key is null");
        }
        if (str.startsWith("appmetrica")) {
            return C4287yi.m6198a(this, "key starts with appmetrica");
        }
        if (str.length() > 200) {
            return C4287yi.m6198a(this, "key length more then 200 characters");
        }
        return C4287yi.m6197a(this);
    }
}
