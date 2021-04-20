package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$OZ4n_NFSZIEqyI9zJpVxO0eASfg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$OZ4n_NFSZIEqyI9zJpVxO0eASfg implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$OZ4n_NFSZIEqyI9zJpVxO0eASfg INSTANCE = new $$Lambda$RemoteRepository$OZ4n_NFSZIEqyI9zJpVxO0eASfg();

    private /* synthetic */ $$Lambda$RemoteRepository$OZ4n_NFSZIEqyI9zJpVxO0eASfg() {
    }

    public final Object apply(Object obj) {
        return Resource.success(0, "Отправлено", ((Resource) obj).getData());
    }
}
