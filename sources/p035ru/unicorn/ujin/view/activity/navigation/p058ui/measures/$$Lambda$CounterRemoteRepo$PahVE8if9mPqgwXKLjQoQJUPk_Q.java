package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$PahVE8if9mPqgwXKLjQoQJUPk_Q  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$PahVE8if9mPqgwXKLjQoQJUPk_Q implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$PahVE8if9mPqgwXKLjQoQJUPk_Q INSTANCE = new $$Lambda$CounterRemoteRepo$PahVE8if9mPqgwXKLjQoQJUPk_Q();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$PahVE8if9mPqgwXKLjQoQJUPk_Q() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData(), ((Resource) obj).getErrorCode());
    }
}
