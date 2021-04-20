package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$dt6kKxDIjKz3YrKV5gbn1Tt4E54  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$dt6kKxDIjKz3YrKV5gbn1Tt4E54 implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$dt6kKxDIjKz3YrKV5gbn1Tt4E54 INSTANCE = new $$Lambda$CounterRemoteRepo$dt6kKxDIjKz3YrKV5gbn1Tt4E54();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$dt6kKxDIjKz3YrKV5gbn1Tt4E54() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
