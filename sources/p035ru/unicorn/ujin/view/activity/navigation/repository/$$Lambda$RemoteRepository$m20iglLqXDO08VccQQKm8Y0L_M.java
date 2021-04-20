package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$m20iglLqXDO08VccQ-QKm8Y0L_M  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$m20iglLqXDO08VccQQKm8Y0L_M implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$m20iglLqXDO08VccQQKm8Y0L_M INSTANCE = new $$Lambda$RemoteRepository$m20iglLqXDO08VccQQKm8Y0L_M();

    private /* synthetic */ $$Lambda$RemoteRepository$m20iglLqXDO08VccQQKm8Y0L_M() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
