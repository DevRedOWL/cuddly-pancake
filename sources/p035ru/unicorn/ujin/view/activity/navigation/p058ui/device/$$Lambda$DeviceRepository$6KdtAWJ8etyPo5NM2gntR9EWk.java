package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.SomeData;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.-$$Lambda$DeviceRepository$6Kd-tAWJ8e-tyPo5NM2gntR9EWk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DeviceRepository$6KdtAWJ8etyPo5NM2gntR9EWk implements Function {
    public static final /* synthetic */ $$Lambda$DeviceRepository$6KdtAWJ8etyPo5NM2gntR9EWk INSTANCE = new $$Lambda$DeviceRepository$6KdtAWJ8etyPo5NM2gntR9EWk();

    private /* synthetic */ $$Lambda$DeviceRepository$6KdtAWJ8etyPo5NM2gntR9EWk() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), new SomeData());
    }
}
