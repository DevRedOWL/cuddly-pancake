package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$BYTti2iexNG5FeLwiT_4xyhyLEU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$BYTti2iexNG5FeLwiT_4xyhyLEU implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$BYTti2iexNG5FeLwiT_4xyhyLEU INSTANCE = new $$Lambda$RemoteRepository$BYTti2iexNG5FeLwiT_4xyhyLEU();

    private /* synthetic */ $$Lambda$RemoteRepository$BYTti2iexNG5FeLwiT_4xyhyLEU() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
