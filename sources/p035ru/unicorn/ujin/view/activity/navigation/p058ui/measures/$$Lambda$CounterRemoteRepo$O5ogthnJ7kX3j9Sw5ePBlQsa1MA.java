package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$O5ogthnJ7kX3j9Sw5ePBlQsa1MA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$O5ogthnJ7kX3j9Sw5ePBlQsa1MA implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$O5ogthnJ7kX3j9Sw5ePBlQsa1MA INSTANCE = new $$Lambda$CounterRemoteRepo$O5ogthnJ7kX3j9Sw5ePBlQsa1MA();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$O5ogthnJ7kX3j9Sw5ePBlQsa1MA() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
