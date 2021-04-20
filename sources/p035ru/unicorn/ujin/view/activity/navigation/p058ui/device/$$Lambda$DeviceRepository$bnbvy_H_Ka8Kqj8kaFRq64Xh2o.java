package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.-$$Lambda$DeviceRepository$bnbvy_-H_Ka8Kqj8kaFRq64Xh2o  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DeviceRepository$bnbvy_H_Ka8Kqj8kaFRq64Xh2o implements Function {
    public static final /* synthetic */ $$Lambda$DeviceRepository$bnbvy_H_Ka8Kqj8kaFRq64Xh2o INSTANCE = new $$Lambda$DeviceRepository$bnbvy_H_Ka8Kqj8kaFRq64Xh2o();

    private /* synthetic */ $$Lambda$DeviceRepository$bnbvy_H_Ka8Kqj8kaFRq64Xh2o() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
