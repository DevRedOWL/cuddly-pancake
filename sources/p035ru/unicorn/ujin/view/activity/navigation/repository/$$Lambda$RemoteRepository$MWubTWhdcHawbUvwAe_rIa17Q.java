package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$MWubT-Whd-cHawbUvwAe_rIa17Q  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$MWubTWhdcHawbUvwAe_rIa17Q implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$MWubTWhdcHawbUvwAe_rIa17Q INSTANCE = new $$Lambda$RemoteRepository$MWubTWhdcHawbUvwAe_rIa17Q();

    private /* synthetic */ $$Lambda$RemoteRepository$MWubTWhdcHawbUvwAe_rIa17Q() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
