package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$tYBJ36KMpK8Q5bc_YzAQrtC_t8A  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$tYBJ36KMpK8Q5bc_YzAQrtC_t8A implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$tYBJ36KMpK8Q5bc_YzAQrtC_t8A INSTANCE = new $$Lambda$RemoteRepository$tYBJ36KMpK8Q5bc_YzAQrtC_t8A();

    private /* synthetic */ $$Lambda$RemoteRepository$tYBJ36KMpK8Q5bc_YzAQrtC_t8A() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
