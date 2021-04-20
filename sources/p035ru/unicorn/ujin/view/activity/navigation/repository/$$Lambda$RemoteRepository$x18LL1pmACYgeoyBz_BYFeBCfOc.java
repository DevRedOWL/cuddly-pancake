package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$x18LL1pmACYgeoyBz_BYFeBCfOc  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$x18LL1pmACYgeoyBz_BYFeBCfOc implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$x18LL1pmACYgeoyBz_BYFeBCfOc INSTANCE = new $$Lambda$RemoteRepository$x18LL1pmACYgeoyBz_BYFeBCfOc();

    private /* synthetic */ $$Lambda$RemoteRepository$x18LL1pmACYgeoyBz_BYFeBCfOc() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
