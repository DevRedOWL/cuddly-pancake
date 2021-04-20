package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$RentaRepository$dxmtfBdrleccrvN4dxAhRGP-X9g  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RentaRepository$dxmtfBdrleccrvN4dxAhRGPX9g implements Function {
    public static final /* synthetic */ $$Lambda$RentaRepository$dxmtfBdrleccrvN4dxAhRGPX9g INSTANCE = new $$Lambda$RentaRepository$dxmtfBdrleccrvN4dxAhRGPX9g();

    private /* synthetic */ $$Lambda$RentaRepository$dxmtfBdrleccrvN4dxAhRGPX9g() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
