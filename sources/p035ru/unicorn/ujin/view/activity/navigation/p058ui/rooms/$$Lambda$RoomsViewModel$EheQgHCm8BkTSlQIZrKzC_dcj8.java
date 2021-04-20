package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.-$$Lambda$RoomsViewModel$Ehe-QgHCm8BkTSlQIZrKzC_dcj8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RoomsViewModel$EheQgHCm8BkTSlQIZrKzC_dcj8 implements Predicate {
    public static final /* synthetic */ $$Lambda$RoomsViewModel$EheQgHCm8BkTSlQIZrKzC_dcj8 INSTANCE = new $$Lambda$RoomsViewModel$EheQgHCm8BkTSlQIZrKzC_dcj8();

    private /* synthetic */ $$Lambda$RoomsViewModel$EheQgHCm8BkTSlQIZrKzC_dcj8() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
