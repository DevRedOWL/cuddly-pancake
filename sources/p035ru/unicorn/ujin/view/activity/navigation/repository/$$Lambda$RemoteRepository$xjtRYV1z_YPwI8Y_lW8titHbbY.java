package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$xjtRYV1z_YPwI8Y_lW8ti-tHbbY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$xjtRYV1z_YPwI8Y_lW8titHbbY implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$xjtRYV1z_YPwI8Y_lW8titHbbY INSTANCE = new $$Lambda$RemoteRepository$xjtRYV1z_YPwI8Y_lW8titHbbY();

    private /* synthetic */ $$Lambda$RemoteRepository$xjtRYV1z_YPwI8Y_lW8titHbbY() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
