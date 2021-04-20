package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$YhyOanxRcH6mRXbUfGUKRPZ0l5U  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$YhyOanxRcH6mRXbUfGUKRPZ0l5U implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$YhyOanxRcH6mRXbUfGUKRPZ0l5U INSTANCE = new $$Lambda$RemoteRepository$YhyOanxRcH6mRXbUfGUKRPZ0l5U();

    private /* synthetic */ $$Lambda$RemoteRepository$YhyOanxRcH6mRXbUfGUKRPZ0l5U() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
