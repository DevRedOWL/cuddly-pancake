package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$NUEXf3lTYly8YGFA-YRDIipeEXM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$NUEXf3lTYly8YGFAYRDIipeEXM implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$NUEXf3lTYly8YGFAYRDIipeEXM INSTANCE = new $$Lambda$CounterRemoteRepo$NUEXf3lTYly8YGFAYRDIipeEXM();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$NUEXf3lTYly8YGFAYRDIipeEXM() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
