package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$yG5KjNhm3ktxs88izrVE9UXXGWQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$yG5KjNhm3ktxs88izrVE9UXXGWQ implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$yG5KjNhm3ktxs88izrVE9UXXGWQ INSTANCE = new $$Lambda$RemoteRepository$yG5KjNhm3ktxs88izrVE9UXXGWQ();

    private /* synthetic */ $$Lambda$RemoteRepository$yG5KjNhm3ktxs88izrVE9UXXGWQ() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
