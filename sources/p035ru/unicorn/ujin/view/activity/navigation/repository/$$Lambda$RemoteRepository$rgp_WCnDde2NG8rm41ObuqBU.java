package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.repository.base.UserData;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$rg--p_WC-nDde2NG8rm41ObuqBU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$rgp_WCnDde2NG8rm41ObuqBU implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$rgp_WCnDde2NG8rm41ObuqBU INSTANCE = new $$Lambda$RemoteRepository$rgp_WCnDde2NG8rm41ObuqBU();

    private /* synthetic */ $$Lambda$RemoteRepository$rgp_WCnDde2NG8rm41ObuqBU() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((UserData) ((Resource) obj).getData()).getUser());
    }
}
