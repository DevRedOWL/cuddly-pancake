package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p039ob.C3863qu;
import com.yandex.metrica.impl.p039ob.C3864qv;
import com.yandex.metrica.impl.p039ob.C4268xs;
import com.yandex.metrica.impl.p039ob.C4275xz;

public class Attribute {
    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new C4275xz(200, "String attribute \"" + str + "\""), new C3863qu(), new C3864qv(new C4268xs(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C3863qu(), new C3864qv(new C4268xs(100)));
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C3863qu(), new C3864qv(new C4268xs(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C3863qu(), new C3864qv(new C4268xs(100)));
    }

    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }

    public static NameAttribute name() {
        return new NameAttribute();
    }
}
