package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.-$$Lambda$MainSmartViewModel$C413L9IsPu3jotpox_mnmxc4kyc  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MainSmartViewModel$C413L9IsPu3jotpox_mnmxc4kyc implements Predicate {
    public static final /* synthetic */ $$Lambda$MainSmartViewModel$C413L9IsPu3jotpox_mnmxc4kyc INSTANCE = new $$Lambda$MainSmartViewModel$C413L9IsPu3jotpox_mnmxc4kyc();

    private /* synthetic */ $$Lambda$MainSmartViewModel$C413L9IsPu3jotpox_mnmxc4kyc() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
