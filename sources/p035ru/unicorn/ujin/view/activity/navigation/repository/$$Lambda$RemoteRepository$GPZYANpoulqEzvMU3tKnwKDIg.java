package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$GPZ--YANpoulqEzvMU3tKnwKDIg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$GPZYANpoulqEzvMU3tKnwKDIg implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$GPZYANpoulqEzvMU3tKnwKDIg INSTANCE = new $$Lambda$RemoteRepository$GPZYANpoulqEzvMU3tKnwKDIg();

    private /* synthetic */ $$Lambda$RemoteRepository$GPZYANpoulqEzvMU3tKnwKDIg() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
