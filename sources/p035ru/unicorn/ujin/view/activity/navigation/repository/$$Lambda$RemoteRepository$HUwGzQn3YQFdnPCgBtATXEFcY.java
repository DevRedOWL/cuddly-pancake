package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$HUwG-zQn3YQF-dnPCgBtATXEFcY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$HUwGzQn3YQFdnPCgBtATXEFcY implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$HUwGzQn3YQFdnPCgBtATXEFcY INSTANCE = new $$Lambda$RemoteRepository$HUwGzQn3YQFdnPCgBtATXEFcY();

    private /* synthetic */ $$Lambda$RemoteRepository$HUwGzQn3YQFdnPCgBtATXEFcY() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
