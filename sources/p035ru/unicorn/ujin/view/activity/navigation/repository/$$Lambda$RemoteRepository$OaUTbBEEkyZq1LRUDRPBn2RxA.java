package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$OaUTb-BEEkyZq1LRUDR-PBn2RxA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$OaUTbBEEkyZq1LRUDRPBn2RxA implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$OaUTbBEEkyZq1LRUDRPBn2RxA INSTANCE = new $$Lambda$RemoteRepository$OaUTbBEEkyZq1LRUDRPBn2RxA();

    private /* synthetic */ $$Lambda$RemoteRepository$OaUTbBEEkyZq1LRUDRPBn2RxA() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
