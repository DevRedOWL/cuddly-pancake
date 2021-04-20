package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$T8GMg09Cs0EUMoxHlGB9R5XhUgA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$T8GMg09Cs0EUMoxHlGB9R5XhUgA implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$T8GMg09Cs0EUMoxHlGB9R5XhUgA INSTANCE = new $$Lambda$RemoteRepository$T8GMg09Cs0EUMoxHlGB9R5XhUgA();

    private /* synthetic */ $$Lambda$RemoteRepository$T8GMg09Cs0EUMoxHlGB9R5XhUgA() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
