package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$09U70pNR1MK_Y3OQIvq-UGVhMAI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$09U70pNR1MK_Y3OQIvqUGVhMAI implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$09U70pNR1MK_Y3OQIvqUGVhMAI INSTANCE = new $$Lambda$RemoteRepository$09U70pNR1MK_Y3OQIvqUGVhMAI();

    private /* synthetic */ $$Lambda$RemoteRepository$09U70pNR1MK_Y3OQIvqUGVhMAI() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
