package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$srxomN7hPv6Ff9SBbFHss8lLUtM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$srxomN7hPv6Ff9SBbFHss8lLUtM implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$srxomN7hPv6Ff9SBbFHss8lLUtM INSTANCE = new $$Lambda$RemoteRepository$srxomN7hPv6Ff9SBbFHss8lLUtM();

    private /* synthetic */ $$Lambda$RemoteRepository$srxomN7hPv6Ff9SBbFHss8lLUtM() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
