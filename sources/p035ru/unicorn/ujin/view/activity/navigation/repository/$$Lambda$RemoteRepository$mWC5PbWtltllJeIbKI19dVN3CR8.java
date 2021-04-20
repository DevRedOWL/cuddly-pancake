package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$mWC5PbWtltllJeIbKI19dVN3CR8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$mWC5PbWtltllJeIbKI19dVN3CR8 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$mWC5PbWtltllJeIbKI19dVN3CR8 INSTANCE = new $$Lambda$RemoteRepository$mWC5PbWtltllJeIbKI19dVN3CR8();

    private /* synthetic */ $$Lambda$RemoteRepository$mWC5PbWtltllJeIbKI19dVN3CR8() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
