package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.-$$Lambda$DeviceViewModel$OR8NfPuQAi3DzPIL1UZxFNK-Pn8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DeviceViewModel$OR8NfPuQAi3DzPIL1UZxFNKPn8 implements Predicate {
    public static final /* synthetic */ $$Lambda$DeviceViewModel$OR8NfPuQAi3DzPIL1UZxFNKPn8 INSTANCE = new $$Lambda$DeviceViewModel$OR8NfPuQAi3DzPIL1UZxFNKPn8();

    private /* synthetic */ $$Lambda$DeviceViewModel$OR8NfPuQAi3DzPIL1UZxFNKPn8() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
