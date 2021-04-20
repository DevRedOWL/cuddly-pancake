package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$xAmCiNXey_tw_OEq1qvG6CCwoPE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$xAmCiNXey_tw_OEq1qvG6CCwoPE implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$xAmCiNXey_tw_OEq1qvG6CCwoPE INSTANCE = new $$Lambda$RemoteRepository$xAmCiNXey_tw_OEq1qvG6CCwoPE();

    private /* synthetic */ $$Lambda$RemoteRepository$xAmCiNXey_tw_OEq1qvG6CCwoPE() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
