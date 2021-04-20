package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$Cjw-K_36vLQqGS1TrbyaUEBnGFk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$CjwK_36vLQqGS1TrbyaUEBnGFk implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$CjwK_36vLQqGS1TrbyaUEBnGFk INSTANCE = new $$Lambda$CounterRemoteRepo$CjwK_36vLQqGS1TrbyaUEBnGFk();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$CjwK_36vLQqGS1TrbyaUEBnGFk() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
