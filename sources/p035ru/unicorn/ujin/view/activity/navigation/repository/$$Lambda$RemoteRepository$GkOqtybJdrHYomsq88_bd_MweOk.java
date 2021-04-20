package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$GkOqtybJdrHYomsq88_bd_MweOk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$GkOqtybJdrHYomsq88_bd_MweOk implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$GkOqtybJdrHYomsq88_bd_MweOk INSTANCE = new $$Lambda$RemoteRepository$GkOqtybJdrHYomsq88_bd_MweOk();

    private /* synthetic */ $$Lambda$RemoteRepository$GkOqtybJdrHYomsq88_bd_MweOk() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
