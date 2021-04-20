package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$xowt3KabStbvvQf0AUj7HA10T-Y  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$xowt3KabStbvvQf0AUj7HA10TY implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$xowt3KabStbvvQf0AUj7HA10TY INSTANCE = new $$Lambda$RemoteRepository$xowt3KabStbvvQf0AUj7HA10TY();

    private /* synthetic */ $$Lambda$RemoteRepository$xowt3KabStbvvQf0AUj7HA10TY() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
