package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$RentaRepository$Kbqzghs7utyWK7QrcHl2ADnbYy8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RentaRepository$Kbqzghs7utyWK7QrcHl2ADnbYy8 implements Function {
    public static final /* synthetic */ $$Lambda$RentaRepository$Kbqzghs7utyWK7QrcHl2ADnbYy8 INSTANCE = new $$Lambda$RentaRepository$Kbqzghs7utyWK7QrcHl2ADnbYy8();

    private /* synthetic */ $$Lambda$RentaRepository$Kbqzghs7utyWK7QrcHl2ADnbYy8() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((RentData) ((Resource) obj).getData()).getRent());
    }
}
