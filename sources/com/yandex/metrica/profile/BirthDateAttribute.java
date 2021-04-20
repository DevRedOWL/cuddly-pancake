package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p039ob.C3857qo;
import com.yandex.metrica.impl.p039ob.C3859qq;
import com.yandex.metrica.impl.p039ob.C3862qt;
import com.yandex.metrica.impl.p039ob.C3868qz;
import com.yandex.metrica.impl.p039ob.C3871ra;
import com.yandex.metrica.impl.p039ob.C3872rb;
import com.yandex.metrica.impl.p039ob.C3873rc;
import com.yandex.metrica.impl.p039ob.C3876rf;
import com.yandex.metrica.impl.p039ob.C4269xt;
import com.yandex.metrica.impl.p039ob.C4282yd;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class BirthDateAttribute {

    /* renamed from: a */
    private final C3862qt f5388a = new C3862qt("appmetrica_birth_date", new C4282yd(), new C3872rb());

    BirthDateAttribute() {
    }

    public UserProfileUpdate<? extends C3876rf> withBirthDate(int i) {
        return mo41911a(m6264a(i), "yyyy", (C3857qo) new C3859qq(this.f5388a.mo40957b()));
    }

    public UserProfileUpdate<? extends C3876rf> withBirthDateIfUndefined(int i) {
        return mo41911a(m6264a(i), "yyyy", (C3857qo) new C3871ra(this.f5388a.mo40957b()));
    }

    public UserProfileUpdate<? extends C3876rf> withBirthDate(int i, int i2) {
        return mo41911a(m6265a(i, i2), "yyyy-MM", (C3857qo) new C3859qq(this.f5388a.mo40957b()));
    }

    public UserProfileUpdate<? extends C3876rf> withBirthDateIfUndefined(int i, int i2) {
        return mo41911a(m6265a(i, i2), "yyyy-MM", (C3857qo) new C3871ra(this.f5388a.mo40957b()));
    }

    public UserProfileUpdate<? extends C3876rf> withBirthDate(int i, int i2, int i3) {
        return mo41911a(m6266a(i, i2, i3), "yyyy-MM-dd", (C3857qo) new C3859qq(this.f5388a.mo40957b()));
    }

    public UserProfileUpdate<? extends C3876rf> withBirthDateIfUndefined(int i, int i2, int i3) {
        return mo41911a(m6266a(i, i2, i3), "yyyy-MM-dd", (C3857qo) new C3871ra(this.f5388a.mo40957b()));
    }

    public UserProfileUpdate<? extends C3876rf> withAge(int i) {
        return mo41911a(m6264a(Calendar.getInstance(Locale.US).get(1) - i), "yyyy", (C3857qo) new C3859qq(this.f5388a.mo40957b()));
    }

    public UserProfileUpdate<? extends C3876rf> withAgeIfUndefined(int i) {
        return mo41911a(m6264a(Calendar.getInstance(Locale.US).get(1) - i), "yyyy", (C3857qo) new C3871ra(this.f5388a.mo40957b()));
    }

    public UserProfileUpdate<? extends C3876rf> withBirthDate(Calendar calendar) {
        return mo41911a(calendar, "yyyy-MM-dd", (C3857qo) new C3859qq(this.f5388a.mo40957b()));
    }

    public UserProfileUpdate<? extends C3876rf> withBirthDateIfUndefined(Calendar calendar) {
        return mo41911a(calendar, "yyyy-MM-dd", (C3857qo) new C3871ra(this.f5388a.mo40957b()));
    }

    public UserProfileUpdate<? extends C3876rf> withValueReset() {
        return new UserProfileUpdate<>(new C3868qz(0, this.f5388a.mo40956a(), new C4282yd(), new C3872rb()));
    }

    /* renamed from: a */
    private Calendar m6264a(int i) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        return gregorianCalendar;
    }

    /* renamed from: a */
    private Calendar m6265a(int i, int i2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, 1);
        return gregorianCalendar;
    }

    /* renamed from: a */
    private Calendar m6266a(int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i);
        gregorianCalendar.set(2, i2 - 1);
        gregorianCalendar.set(5, i3);
        return gregorianCalendar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public UserProfileUpdate<? extends C3876rf> mo41911a(Calendar calendar, String str, C3857qo qoVar) {
        return new UserProfileUpdate<>(new C3873rc(this.f5388a.mo40956a(), new SimpleDateFormat(str).format(calendar.getTime()), new C4269xt(), new C4282yd(), qoVar));
    }
}
