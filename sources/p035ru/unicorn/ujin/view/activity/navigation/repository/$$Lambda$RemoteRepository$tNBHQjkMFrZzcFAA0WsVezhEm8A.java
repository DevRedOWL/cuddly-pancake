package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$tNBHQjkMFrZzcFAA0WsVezhEm8A  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$tNBHQjkMFrZzcFAA0WsVezhEm8A implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$tNBHQjkMFrZzcFAA0WsVezhEm8A INSTANCE = new $$Lambda$RemoteRepository$tNBHQjkMFrZzcFAA0WsVezhEm8A();

    private /* synthetic */ $$Lambda$RemoteRepository$tNBHQjkMFrZzcFAA0WsVezhEm8A() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
