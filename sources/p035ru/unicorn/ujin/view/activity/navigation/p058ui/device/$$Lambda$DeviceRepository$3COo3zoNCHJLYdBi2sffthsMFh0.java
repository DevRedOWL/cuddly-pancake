package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.-$$Lambda$DeviceRepository$3COo3zoNCHJLYdBi2sffthsMFh0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DeviceRepository$3COo3zoNCHJLYdBi2sffthsMFh0 implements Function {
    public static final /* synthetic */ $$Lambda$DeviceRepository$3COo3zoNCHJLYdBi2sffthsMFh0 INSTANCE = new $$Lambda$DeviceRepository$3COo3zoNCHJLYdBi2sffthsMFh0();

    private /* synthetic */ $$Lambda$DeviceRepository$3COo3zoNCHJLYdBi2sffthsMFh0() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
