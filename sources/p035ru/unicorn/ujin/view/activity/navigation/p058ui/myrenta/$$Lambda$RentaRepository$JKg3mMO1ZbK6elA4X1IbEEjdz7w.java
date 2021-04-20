package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$RentaRepository$JKg3mMO1ZbK6elA4X1IbEEjdz7w  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RentaRepository$JKg3mMO1ZbK6elA4X1IbEEjdz7w implements Function {
    public static final /* synthetic */ $$Lambda$RentaRepository$JKg3mMO1ZbK6elA4X1IbEEjdz7w INSTANCE = new $$Lambda$RentaRepository$JKg3mMO1ZbK6elA4X1IbEEjdz7w();

    private /* synthetic */ $$Lambda$RentaRepository$JKg3mMO1ZbK6elA4X1IbEEjdz7w() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((RentTypeList) ((Resource) obj).getData()).getRents());
    }
}
