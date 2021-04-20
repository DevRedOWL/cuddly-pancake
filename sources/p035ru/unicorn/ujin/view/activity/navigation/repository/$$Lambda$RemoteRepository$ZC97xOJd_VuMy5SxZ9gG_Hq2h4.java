package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$ZC97xOJd_V-uMy5SxZ9gG_Hq2h4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$ZC97xOJd_VuMy5SxZ9gG_Hq2h4 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$ZC97xOJd_VuMy5SxZ9gG_Hq2h4 INSTANCE = new $$Lambda$RemoteRepository$ZC97xOJd_VuMy5SxZ9gG_Hq2h4();

    private /* synthetic */ $$Lambda$RemoteRepository$ZC97xOJd_VuMy5SxZ9gG_Hq2h4() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
