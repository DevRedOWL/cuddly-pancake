package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$-Yf9MR1gicKlK0KtKl1iWZ2AdGk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$Yf9MR1gicKlK0KtKl1iWZ2AdGk implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$Yf9MR1gicKlK0KtKl1iWZ2AdGk INSTANCE = new $$Lambda$CounterRemoteRepo$Yf9MR1gicKlK0KtKl1iWZ2AdGk();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$Yf9MR1gicKlK0KtKl1iWZ2AdGk() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData(), ((Resource) obj).getErrorCode());
    }
}
