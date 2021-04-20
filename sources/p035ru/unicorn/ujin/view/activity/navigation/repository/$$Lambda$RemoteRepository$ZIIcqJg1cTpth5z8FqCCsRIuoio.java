package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$ZIIcqJg1cTpth5z8FqCCsRIuoio  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$ZIIcqJg1cTpth5z8FqCCsRIuoio implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$ZIIcqJg1cTpth5z8FqCCsRIuoio INSTANCE = new $$Lambda$RemoteRepository$ZIIcqJg1cTpth5z8FqCCsRIuoio();

    private /* synthetic */ $$Lambda$RemoteRepository$ZIIcqJg1cTpth5z8FqCCsRIuoio() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
