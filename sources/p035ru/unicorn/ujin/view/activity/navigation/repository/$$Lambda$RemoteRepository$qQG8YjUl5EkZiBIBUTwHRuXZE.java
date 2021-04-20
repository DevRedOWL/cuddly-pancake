package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$--qQG8YjUl5EkZiBIBUTwHRuXZE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$qQG8YjUl5EkZiBIBUTwHRuXZE implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$qQG8YjUl5EkZiBIBUTwHRuXZE INSTANCE = new $$Lambda$RemoteRepository$qQG8YjUl5EkZiBIBUTwHRuXZE();

    private /* synthetic */ $$Lambda$RemoteRepository$qQG8YjUl5EkZiBIBUTwHRuXZE() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
