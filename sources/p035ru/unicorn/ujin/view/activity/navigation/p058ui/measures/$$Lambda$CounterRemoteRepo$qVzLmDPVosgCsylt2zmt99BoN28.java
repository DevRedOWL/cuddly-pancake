package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$qVzLmDPVosgCsylt2zmt99BoN28  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$qVzLmDPVosgCsylt2zmt99BoN28 implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$qVzLmDPVosgCsylt2zmt99BoN28 INSTANCE = new $$Lambda$CounterRemoteRepo$qVzLmDPVosgCsylt2zmt99BoN28();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$qVzLmDPVosgCsylt2zmt99BoN28() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
