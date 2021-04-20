package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.-$$Lambda$AddHardwareViewModel$9H-2RaLTemb9-h8cuOtYKlF4llo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$AddHardwareViewModel$9H2RaLTemb9h8cuOtYKlF4llo implements Predicate {
    public static final /* synthetic */ $$Lambda$AddHardwareViewModel$9H2RaLTemb9h8cuOtYKlF4llo INSTANCE = new $$Lambda$AddHardwareViewModel$9H2RaLTemb9h8cuOtYKlF4llo();

    private /* synthetic */ $$Lambda$AddHardwareViewModel$9H2RaLTemb9h8cuOtYKlF4llo() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
