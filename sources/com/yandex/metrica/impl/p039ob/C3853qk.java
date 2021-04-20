package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.qk */
public class C3853qk {

    /* renamed from: a */
    private final String f4191a;

    /* renamed from: b */
    private final String f4192b;

    public C3853qk(String str) {
        this(str, (String) null);
    }

    public C3853qk(String str, String str2) {
        this.f4191a = str;
        this.f4192b = mo40946a(str2);
    }

    /* renamed from: a */
    public String mo40945a() {
        return this.f4191a;
    }

    /* renamed from: b */
    public String mo40947b() {
        return this.f4192b;
    }

    /* renamed from: a */
    public final String mo40946a(String str) {
        if (str == null) {
            return this.f4191a;
        }
        return this.f4191a + str;
    }
}
