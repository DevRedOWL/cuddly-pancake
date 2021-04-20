package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$oG70BIA-ks3zEx6gRbkyK0KqlAw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$oG70BIAks3zEx6gRbkyK0KqlAw implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$oG70BIAks3zEx6gRbkyK0KqlAw INSTANCE = new $$Lambda$RemoteRepository$oG70BIAks3zEx6gRbkyK0KqlAw();

    private /* synthetic */ $$Lambda$RemoteRepository$oG70BIAks3zEx6gRbkyK0KqlAw() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
