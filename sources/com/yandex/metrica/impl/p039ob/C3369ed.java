package com.yandex.metrica.impl.p039ob;

import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.ed */
public class C3369ed {

    /* renamed from: a */
    private final C3370ee f3099a;

    /* renamed from: b */
    private final CounterConfiguration f3100b;

    public C3369ed(Bundle bundle) {
        this.f3099a = C3370ee.m3073a(bundle);
        this.f3100b = CounterConfiguration.m1689c(bundle);
    }

    public C3369ed(C3370ee eeVar, CounterConfiguration counterConfiguration) {
        this.f3099a = eeVar;
        this.f3100b = counterConfiguration;
    }

    /* renamed from: g */
    public C3370ee mo39946g() {
        return this.f3099a;
    }

    /* renamed from: h */
    public CounterConfiguration mo39947h() {
        return this.f3100b;
    }

    public String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f3099a + ", mCounterConfiguration=" + this.f3100b + '}';
    }
}
