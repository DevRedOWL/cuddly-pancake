package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.-$$Lambda$CounterRemoteRepo$Ww6v1oXizsVGMC1D-BXUdbi-L4c  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CounterRemoteRepo$Ww6v1oXizsVGMC1DBXUdbiL4c implements Function {
    public static final /* synthetic */ $$Lambda$CounterRemoteRepo$Ww6v1oXizsVGMC1DBXUdbiL4c INSTANCE = new $$Lambda$CounterRemoteRepo$Ww6v1oXizsVGMC1DBXUdbiL4c();

    private /* synthetic */ $$Lambda$CounterRemoteRepo$Ww6v1oXizsVGMC1DBXUdbiL4c() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
