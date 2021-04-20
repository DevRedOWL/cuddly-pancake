package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$RentaRepository$BITm2RyHzXwLCRiFRo6A042BBek  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RentaRepository$BITm2RyHzXwLCRiFRo6A042BBek implements Function {
    public static final /* synthetic */ $$Lambda$RentaRepository$BITm2RyHzXwLCRiFRo6A042BBek INSTANCE = new $$Lambda$RentaRepository$BITm2RyHzXwLCRiFRo6A042BBek();

    private /* synthetic */ $$Lambda$RentaRepository$BITm2RyHzXwLCRiFRo6A042BBek() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
