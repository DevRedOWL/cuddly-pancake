package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p039ob.C3856qn;
import com.yandex.metrica.impl.p039ob.C3859qq;
import com.yandex.metrica.impl.p039ob.C3862qt;
import com.yandex.metrica.impl.p039ob.C3863qu;
import com.yandex.metrica.impl.p039ob.C3864qv;
import com.yandex.metrica.impl.p039ob.C3866qx;
import com.yandex.metrica.impl.p039ob.C3868qz;
import com.yandex.metrica.impl.p039ob.C3871ra;
import com.yandex.metrica.impl.p039ob.C3876rf;
import com.yandex.metrica.impl.p039ob.C4268xs;
import com.yandex.metrica.impl.p039ob.C4289yk;

public final class NumberAttribute {

    /* renamed from: a */
    private final C3862qt f5392a;

    NumberAttribute(String str, C4289yk<String> ykVar, C3856qn qnVar) {
        this.f5392a = new C3862qt(str, ykVar, qnVar);
    }

    public UserProfileUpdate<? extends C3876rf> withValue(double d) {
        return new UserProfileUpdate<>(new C3866qx(this.f5392a.mo40956a(), d, new C3863qu(), new C3859qq(new C3864qv(new C4268xs(100)))));
    }

    public UserProfileUpdate<? extends C3876rf> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new C3866qx(this.f5392a.mo40956a(), d, new C3863qu(), new C3871ra(new C3864qv(new C4268xs(100)))));
    }

    public UserProfileUpdate<? extends C3876rf> withValueReset() {
        return new UserProfileUpdate<>(new C3868qz(1, this.f5392a.mo40956a(), new C3863qu(), new C3864qv(new C4268xs(100))));
    }
}
