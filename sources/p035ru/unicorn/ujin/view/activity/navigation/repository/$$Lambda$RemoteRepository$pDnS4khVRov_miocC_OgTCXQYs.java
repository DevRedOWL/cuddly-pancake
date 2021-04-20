package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$p-DnS4khVRov_miocC_OgTCXQYs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$pDnS4khVRov_miocC_OgTCXQYs implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$pDnS4khVRov_miocC_OgTCXQYs INSTANCE = new $$Lambda$RemoteRepository$pDnS4khVRov_miocC_OgTCXQYs();

    private /* synthetic */ $$Lambda$RemoteRepository$pDnS4khVRov_miocC_OgTCXQYs() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
