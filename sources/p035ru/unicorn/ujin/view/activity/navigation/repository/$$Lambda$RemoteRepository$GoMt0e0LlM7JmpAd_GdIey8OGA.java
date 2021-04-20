package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$G-oMt0e0LlM7JmpAd_GdIey8OGA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$GoMt0e0LlM7JmpAd_GdIey8OGA implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$GoMt0e0LlM7JmpAd_GdIey8OGA INSTANCE = new $$Lambda$RemoteRepository$GoMt0e0LlM7JmpAd_GdIey8OGA();

    private /* synthetic */ $$Lambda$RemoteRepository$GoMt0e0LlM7JmpAd_GdIey8OGA() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
