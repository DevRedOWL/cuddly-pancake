package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$RentaRepository$xK_JAFQ12jfj2x9QuF07b_jSrns  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RentaRepository$xK_JAFQ12jfj2x9QuF07b_jSrns implements Function {
    public static final /* synthetic */ $$Lambda$RentaRepository$xK_JAFQ12jfj2x9QuF07b_jSrns INSTANCE = new $$Lambda$RentaRepository$xK_JAFQ12jfj2x9QuF07b_jSrns();

    private /* synthetic */ $$Lambda$RentaRepository$xK_JAFQ12jfj2x9QuF07b_jSrns() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
