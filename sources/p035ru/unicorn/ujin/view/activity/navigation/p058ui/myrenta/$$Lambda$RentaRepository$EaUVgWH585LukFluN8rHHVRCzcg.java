package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$RentaRepository$EaUVgWH585LukFluN8rHHVRCzcg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RentaRepository$EaUVgWH585LukFluN8rHHVRCzcg implements Function {
    public static final /* synthetic */ $$Lambda$RentaRepository$EaUVgWH585LukFluN8rHHVRCzcg INSTANCE = new $$Lambda$RentaRepository$EaUVgWH585LukFluN8rHHVRCzcg();

    private /* synthetic */ $$Lambda$RentaRepository$EaUVgWH585LukFluN8rHHVRCzcg() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
