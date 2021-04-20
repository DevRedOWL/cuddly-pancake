package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p039ob.C3856qn;
import com.yandex.metrica.impl.p039ob.C3858qp;
import com.yandex.metrica.impl.p039ob.C3859qq;
import com.yandex.metrica.impl.p039ob.C3862qt;
import com.yandex.metrica.impl.p039ob.C3868qz;
import com.yandex.metrica.impl.p039ob.C3871ra;
import com.yandex.metrica.impl.p039ob.C3876rf;
import com.yandex.metrica.impl.p039ob.C4289yk;

public class BooleanAttribute {

    /* renamed from: a */
    private final C3862qt f5389a;

    BooleanAttribute(String str, C4289yk<String> ykVar, C3856qn qnVar) {
        this.f5389a = new C3862qt(str, ykVar, qnVar);
    }

    public UserProfileUpdate<? extends C3876rf> withValue(boolean z) {
        return new UserProfileUpdate<>(new C3858qp(this.f5389a.mo40956a(), z, this.f5389a.mo40958c(), new C3859qq(this.f5389a.mo40957b())));
    }

    public UserProfileUpdate<? extends C3876rf> withValueIfUndefined(boolean z) {
        return new UserProfileUpdate<>(new C3858qp(this.f5389a.mo40956a(), z, this.f5389a.mo40958c(), new C3871ra(this.f5389a.mo40957b())));
    }

    public UserProfileUpdate<? extends C3876rf> withValueReset() {
        return new UserProfileUpdate<>(new C3868qz(3, this.f5389a.mo40956a(), this.f5389a.mo40958c(), this.f5389a.mo40957b()));
    }
}
