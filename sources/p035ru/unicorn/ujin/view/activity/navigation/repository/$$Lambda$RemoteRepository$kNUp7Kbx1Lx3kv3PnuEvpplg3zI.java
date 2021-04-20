package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$kNUp7Kbx1Lx3kv3PnuEvpplg3zI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$kNUp7Kbx1Lx3kv3PnuEvpplg3zI implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$kNUp7Kbx1Lx3kv3PnuEvpplg3zI INSTANCE = new $$Lambda$RemoteRepository$kNUp7Kbx1Lx3kv3PnuEvpplg3zI();

    private /* synthetic */ $$Lambda$RemoteRepository$kNUp7Kbx1Lx3kv3PnuEvpplg3zI() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
