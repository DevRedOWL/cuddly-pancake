package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$9f1BwGcIyRj8E5M4OUJSe3zhBTE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$9f1BwGcIyRj8E5M4OUJSe3zhBTE implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$9f1BwGcIyRj8E5M4OUJSe3zhBTE INSTANCE = new $$Lambda$RemoteRepository$9f1BwGcIyRj8E5M4OUJSe3zhBTE();

    private /* synthetic */ $$Lambda$RemoteRepository$9f1BwGcIyRj8E5M4OUJSe3zhBTE() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
