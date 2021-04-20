package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$4pxwotQniKpN2Yey2UwUcrTwPNU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$4pxwotQniKpN2Yey2UwUcrTwPNU implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$4pxwotQniKpN2Yey2UwUcrTwPNU INSTANCE = new $$Lambda$RemoteRepository$4pxwotQniKpN2Yey2UwUcrTwPNU();

    private /* synthetic */ $$Lambda$RemoteRepository$4pxwotQniKpN2Yey2UwUcrTwPNU() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
