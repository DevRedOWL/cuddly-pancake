package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$VpXsIrXQDEmIjmZEwgMyOLmr1B8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$VpXsIrXQDEmIjmZEwgMyOLmr1B8 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$VpXsIrXQDEmIjmZEwgMyOLmr1B8 INSTANCE = new $$Lambda$RemoteRepository$VpXsIrXQDEmIjmZEwgMyOLmr1B8();

    private /* synthetic */ $$Lambda$RemoteRepository$VpXsIrXQDEmIjmZEwgMyOLmr1B8() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
