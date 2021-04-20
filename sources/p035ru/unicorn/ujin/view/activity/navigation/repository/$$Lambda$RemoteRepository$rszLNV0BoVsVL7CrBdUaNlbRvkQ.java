package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$rszLNV0BoVsVL7CrBdUaNlbRvkQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$rszLNV0BoVsVL7CrBdUaNlbRvkQ implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$rszLNV0BoVsVL7CrBdUaNlbRvkQ INSTANCE = new $$Lambda$RemoteRepository$rszLNV0BoVsVL7CrBdUaNlbRvkQ();

    private /* synthetic */ $$Lambda$RemoteRepository$rszLNV0BoVsVL7CrBdUaNlbRvkQ() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
