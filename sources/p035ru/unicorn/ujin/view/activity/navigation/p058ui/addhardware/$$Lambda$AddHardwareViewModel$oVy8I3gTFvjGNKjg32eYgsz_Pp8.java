package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.-$$Lambda$AddHardwareViewModel$oVy8I3gTFvjGNKjg32eYgsz_Pp8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$AddHardwareViewModel$oVy8I3gTFvjGNKjg32eYgsz_Pp8 implements Predicate {
    public static final /* synthetic */ $$Lambda$AddHardwareViewModel$oVy8I3gTFvjGNKjg32eYgsz_Pp8 INSTANCE = new $$Lambda$AddHardwareViewModel$oVy8I3gTFvjGNKjg32eYgsz_Pp8();

    private /* synthetic */ $$Lambda$AddHardwareViewModel$oVy8I3gTFvjGNKjg32eYgsz_Pp8() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
