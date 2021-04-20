package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$gFRjTyRPQsSc1PV2LqDnRCU8GWI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$gFRjTyRPQsSc1PV2LqDnRCU8GWI implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$gFRjTyRPQsSc1PV2LqDnRCU8GWI INSTANCE = new $$Lambda$CounterRemoteRepo$gFRjTyRPQsSc1PV2LqDnRCU8GWI();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$gFRjTyRPQsSc1PV2LqDnRCU8GWI() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
