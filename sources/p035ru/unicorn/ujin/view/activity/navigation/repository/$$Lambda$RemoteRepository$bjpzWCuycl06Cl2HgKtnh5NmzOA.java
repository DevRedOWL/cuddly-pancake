package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$bjpzWCuycl06Cl2HgKtnh5NmzOA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$bjpzWCuycl06Cl2HgKtnh5NmzOA implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$bjpzWCuycl06Cl2HgKtnh5NmzOA INSTANCE = new $$Lambda$RemoteRepository$bjpzWCuycl06Cl2HgKtnh5NmzOA();

    private /* synthetic */ $$Lambda$RemoteRepository$bjpzWCuycl06Cl2HgKtnh5NmzOA() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
