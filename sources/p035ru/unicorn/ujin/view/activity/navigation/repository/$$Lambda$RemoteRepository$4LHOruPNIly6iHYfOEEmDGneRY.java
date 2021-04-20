package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$4LHOruPNIl-y6iHYfOEEmDGneRY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$4LHOruPNIly6iHYfOEEmDGneRY implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$4LHOruPNIly6iHYfOEEmDGneRY INSTANCE = new $$Lambda$RemoteRepository$4LHOruPNIly6iHYfOEEmDGneRY();

    private /* synthetic */ $$Lambda$RemoteRepository$4LHOruPNIly6iHYfOEEmDGneRY() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
