package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$MGyMI9BcP_WRkA_69uhY8lov8YQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$MGyMI9BcP_WRkA_69uhY8lov8YQ implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$MGyMI9BcP_WRkA_69uhY8lov8YQ INSTANCE = new $$Lambda$RemoteRepository$MGyMI9BcP_WRkA_69uhY8lov8YQ();

    private /* synthetic */ $$Lambda$RemoteRepository$MGyMI9BcP_WRkA_69uhY8lov8YQ() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
