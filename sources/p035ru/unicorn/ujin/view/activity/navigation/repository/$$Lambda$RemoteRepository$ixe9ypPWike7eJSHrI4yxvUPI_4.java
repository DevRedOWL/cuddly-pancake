package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$ixe9ypPWike7eJSHrI4yxvUPI_4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$ixe9ypPWike7eJSHrI4yxvUPI_4 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$ixe9ypPWike7eJSHrI4yxvUPI_4 INSTANCE = new $$Lambda$RemoteRepository$ixe9ypPWike7eJSHrI4yxvUPI_4();

    private /* synthetic */ $$Lambda$RemoteRepository$ixe9ypPWike7eJSHrI4yxvUPI_4() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
