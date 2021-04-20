package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$WFgaTvTJaGrue6RCXI83sR_WExc  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$WFgaTvTJaGrue6RCXI83sR_WExc implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$WFgaTvTJaGrue6RCXI83sR_WExc INSTANCE = new $$Lambda$CounterRemoteRepo$WFgaTvTJaGrue6RCXI83sR_WExc();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$WFgaTvTJaGrue6RCXI83sR_WExc() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
