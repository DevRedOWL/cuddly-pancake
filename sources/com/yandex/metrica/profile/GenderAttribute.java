package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p039ob.C3859qq;
import com.yandex.metrica.impl.p039ob.C3862qt;
import com.yandex.metrica.impl.p039ob.C3868qz;
import com.yandex.metrica.impl.p039ob.C3871ra;
import com.yandex.metrica.impl.p039ob.C3872rb;
import com.yandex.metrica.impl.p039ob.C3873rc;
import com.yandex.metrica.impl.p039ob.C3876rf;
import com.yandex.metrica.impl.p039ob.C4269xt;
import com.yandex.metrica.impl.p039ob.C4282yd;

public class GenderAttribute {

    /* renamed from: a */
    private final C3862qt f5391a = new C3862qt("appmetrica_gender", new C4282yd(), new C3872rb());

    GenderAttribute() {
    }

    public UserProfileUpdate<? extends C3876rf> withValue(Gender gender) {
        return new UserProfileUpdate<>(new C3873rc(this.f5391a.mo40956a(), gender.getStringValue(), new C4269xt(), this.f5391a.mo40958c(), new C3859qq(this.f5391a.mo40957b())));
    }

    public UserProfileUpdate<? extends C3876rf> withValueIfUndefined(Gender gender) {
        return new UserProfileUpdate<>(new C3873rc(this.f5391a.mo40956a(), gender.getStringValue(), new C4269xt(), this.f5391a.mo40958c(), new C3871ra(this.f5391a.mo40957b())));
    }

    public UserProfileUpdate<? extends C3876rf> withValueReset() {
        return new UserProfileUpdate<>(new C3868qz(0, this.f5391a.mo40956a(), this.f5391a.mo40958c(), this.f5391a.mo40957b()));
    }

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");
        
        private final String mStringValue;

        private Gender(String str) {
            this.mStringValue = str;
        }

        public String getStringValue() {
            return this.mStringValue;
        }
    }
}
