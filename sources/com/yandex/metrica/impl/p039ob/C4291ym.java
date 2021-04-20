package com.yandex.metrica.impl.p039ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ym */
public class C4291ym implements C4289yk<String> {

    /* renamed from: a */
    private final Map<String, ?> f5350a;

    public C4291ym(Map<String, ?> map) {
        this.f5350a = map;
    }

    /* renamed from: a */
    public C4287yi mo40671a(String str) {
        if (!this.f5350a.containsKey(str)) {
            return C4287yi.m6197a(this);
        }
        return C4287yi.m6198a(this, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", new Object[]{str}));
    }
}
