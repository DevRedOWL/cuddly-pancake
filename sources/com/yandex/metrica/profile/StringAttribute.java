package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p039ob.C3856qn;
import com.yandex.metrica.impl.p039ob.C3859qq;
import com.yandex.metrica.impl.p039ob.C3862qt;
import com.yandex.metrica.impl.p039ob.C3868qz;
import com.yandex.metrica.impl.p039ob.C3871ra;
import com.yandex.metrica.impl.p039ob.C3873rc;
import com.yandex.metrica.impl.p039ob.C3876rf;
import com.yandex.metrica.impl.p039ob.C4280yb;
import com.yandex.metrica.impl.p039ob.C4289yk;

public class StringAttribute {

    /* renamed from: a */
    private final C4280yb<String> f5393a;

    /* renamed from: b */
    private final C3862qt f5394b;

    StringAttribute(String str, C4280yb<String> ybVar, C4289yk<String> ykVar, C3856qn qnVar) {
        this.f5394b = new C3862qt(str, ykVar, qnVar);
        this.f5393a = ybVar;
    }

    public UserProfileUpdate<? extends C3876rf> withValue(String str) {
        return new UserProfileUpdate<>(new C3873rc(this.f5394b.mo40956a(), str, this.f5393a, this.f5394b.mo40958c(), new C3859qq(this.f5394b.mo40957b())));
    }

    public UserProfileUpdate<? extends C3876rf> withValueIfUndefined(String str) {
        return new UserProfileUpdate<>(new C3873rc(this.f5394b.mo40956a(), str, this.f5393a, this.f5394b.mo40958c(), new C3871ra(this.f5394b.mo40957b())));
    }

    public UserProfileUpdate<? extends C3876rf> withValueReset() {
        return new UserProfileUpdate<>(new C3868qz(0, this.f5394b.mo40956a(), this.f5394b.mo40958c(), this.f5394b.mo40957b()));
    }
}
