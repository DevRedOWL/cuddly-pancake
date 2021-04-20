package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$XeMaCYHAySWYTsyhk-IjZuugIeI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$XeMaCYHAySWYTsyhkIjZuugIeI implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$XeMaCYHAySWYTsyhkIjZuugIeI INSTANCE = new $$Lambda$RemoteRepository$XeMaCYHAySWYTsyhkIjZuugIeI();

    private /* synthetic */ $$Lambda$RemoteRepository$XeMaCYHAySWYTsyhkIjZuugIeI() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
