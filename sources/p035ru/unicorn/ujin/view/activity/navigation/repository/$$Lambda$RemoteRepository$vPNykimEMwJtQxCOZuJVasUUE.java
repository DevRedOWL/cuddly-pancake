package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$vPNykimEMwJtQxCOZuJVa-s-UUE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$vPNykimEMwJtQxCOZuJVasUUE implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$vPNykimEMwJtQxCOZuJVasUUE INSTANCE = new $$Lambda$RemoteRepository$vPNykimEMwJtQxCOZuJVasUUE();

    private /* synthetic */ $$Lambda$RemoteRepository$vPNykimEMwJtQxCOZuJVasUUE() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
