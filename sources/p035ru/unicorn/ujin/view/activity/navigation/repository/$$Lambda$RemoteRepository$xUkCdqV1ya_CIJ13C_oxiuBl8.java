package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$xU-kCdqV1ya_CIJ1-3C_oxiuBl8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$xUkCdqV1ya_CIJ13C_oxiuBl8 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$xUkCdqV1ya_CIJ13C_oxiuBl8 INSTANCE = new $$Lambda$RemoteRepository$xUkCdqV1ya_CIJ13C_oxiuBl8();

    private /* synthetic */ $$Lambda$RemoteRepository$xUkCdqV1ya_CIJ13C_oxiuBl8() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
