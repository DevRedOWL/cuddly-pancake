package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p039ob.C3872rb;
import com.yandex.metrica.impl.p039ob.C4275xz;
import com.yandex.metrica.impl.p039ob.C4282yd;

public class NameAttribute extends StringAttribute {
    NameAttribute() {
        super("appmetrica_name", new C4275xz(100, "Name attribute"), new C4282yd(), new C3872rb());
    }
}
