package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$jVCS8oTu7X6uSoRakJEf-sCZUJo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$jVCS8oTu7X6uSoRakJEfsCZUJo implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$jVCS8oTu7X6uSoRakJEfsCZUJo INSTANCE = new $$Lambda$CounterRemoteRepo$jVCS8oTu7X6uSoRakJEfsCZUJo();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$jVCS8oTu7X6uSoRakJEfsCZUJo() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
