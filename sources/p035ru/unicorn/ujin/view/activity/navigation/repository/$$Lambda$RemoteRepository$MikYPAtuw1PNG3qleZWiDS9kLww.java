package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$MikYPAtuw1PNG3qleZWiDS9kLww  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$MikYPAtuw1PNG3qleZWiDS9kLww implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$MikYPAtuw1PNG3qleZWiDS9kLww INSTANCE = new $$Lambda$RemoteRepository$MikYPAtuw1PNG3qleZWiDS9kLww();

    private /* synthetic */ $$Lambda$RemoteRepository$MikYPAtuw1PNG3qleZWiDS9kLww() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
