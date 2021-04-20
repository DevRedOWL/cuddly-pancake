package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$Xx5qnheX6gz0CG0aeKf09-kvadY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$Xx5qnheX6gz0CG0aeKf09kvadY implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$Xx5qnheX6gz0CG0aeKf09kvadY INSTANCE = new $$Lambda$RemoteRepository$Xx5qnheX6gz0CG0aeKf09kvadY();

    private /* synthetic */ $$Lambda$RemoteRepository$Xx5qnheX6gz0CG0aeKf09kvadY() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
