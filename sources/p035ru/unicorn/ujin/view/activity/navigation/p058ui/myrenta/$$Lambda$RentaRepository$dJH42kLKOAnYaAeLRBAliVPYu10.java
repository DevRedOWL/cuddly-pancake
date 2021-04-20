package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$RentaRepository$dJH42kLKOAnYaAeLRBAliVPYu10  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RentaRepository$dJH42kLKOAnYaAeLRBAliVPYu10 implements Function {
    public static final /* synthetic */ $$Lambda$RentaRepository$dJH42kLKOAnYaAeLRBAliVPYu10 INSTANCE = new $$Lambda$RentaRepository$dJH42kLKOAnYaAeLRBAliVPYu10();

    private /* synthetic */ $$Lambda$RentaRepository$dJH42kLKOAnYaAeLRBAliVPYu10() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
