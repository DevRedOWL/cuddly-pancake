package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.-$$Lambda$DeviceRepository$biKCRukS9Panqg6enEsiyXlmdrk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DeviceRepository$biKCRukS9Panqg6enEsiyXlmdrk implements Function {
    public static final /* synthetic */ $$Lambda$DeviceRepository$biKCRukS9Panqg6enEsiyXlmdrk INSTANCE = new $$Lambda$DeviceRepository$biKCRukS9Panqg6enEsiyXlmdrk();

    private /* synthetic */ $$Lambda$DeviceRepository$biKCRukS9Panqg6enEsiyXlmdrk() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
