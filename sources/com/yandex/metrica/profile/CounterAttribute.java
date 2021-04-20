package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p039ob.C3856qn;
import com.yandex.metrica.impl.p039ob.C3861qs;
import com.yandex.metrica.impl.p039ob.C3862qt;
import com.yandex.metrica.impl.p039ob.C3876rf;
import com.yandex.metrica.impl.p039ob.C4289yk;

public final class CounterAttribute {

    /* renamed from: a */
    private final C3862qt f5390a;

    CounterAttribute(String str, C4289yk<String> ykVar, C3856qn qnVar) {
        this.f5390a = new C3862qt(str, ykVar, qnVar);
    }

    public UserProfileUpdate<? extends C3876rf> withDelta(double d) {
        return new UserProfileUpdate<>(new C3861qs(this.f5390a.mo40956a(), d));
    }
}
