package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$pZyvvDCPJrbYNMuImVxj8k-d9pc  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$pZyvvDCPJrbYNMuImVxj8kd9pc implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$pZyvvDCPJrbYNMuImVxj8kd9pc INSTANCE = new $$Lambda$CounterRemoteRepo$pZyvvDCPJrbYNMuImVxj8kd9pc();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$pZyvvDCPJrbYNMuImVxj8kd9pc() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
