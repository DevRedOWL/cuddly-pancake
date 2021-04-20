package p035ru.unicorn.ujin.data.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.data.repository.-$$Lambda$TestRemoteRepository$wDFpod84fhbZvpLcXYtXGa4QcuI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$TestRemoteRepository$wDFpod84fhbZvpLcXYtXGa4QcuI implements Function {
    public static final /* synthetic */ $$Lambda$TestRemoteRepository$wDFpod84fhbZvpLcXYtXGa4QcuI INSTANCE = new $$Lambda$TestRemoteRepository$wDFpod84fhbZvpLcXYtXGa4QcuI();

    private /* synthetic */ $$Lambda$TestRemoteRepository$wDFpod84fhbZvpLcXYtXGa4QcuI() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
