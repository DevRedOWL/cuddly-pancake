package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$mu45E5OTThwTQBXTqFwe3VV4h2Q  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$mu45E5OTThwTQBXTqFwe3VV4h2Q implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$mu45E5OTThwTQBXTqFwe3VV4h2Q INSTANCE = new $$Lambda$RemoteRepository$mu45E5OTThwTQBXTqFwe3VV4h2Q();

    private /* synthetic */ $$Lambda$RemoteRepository$mu45E5OTThwTQBXTqFwe3VV4h2Q() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
