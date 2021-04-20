package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$T7PQAA53qzUytGX-FPJKkbOrENE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$T7PQAA53qzUytGXFPJKkbOrENE implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$T7PQAA53qzUytGXFPJKkbOrENE INSTANCE = new $$Lambda$RemoteRepository$T7PQAA53qzUytGXFPJKkbOrENE();

    private /* synthetic */ $$Lambda$RemoteRepository$T7PQAA53qzUytGXFPJKkbOrENE() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
