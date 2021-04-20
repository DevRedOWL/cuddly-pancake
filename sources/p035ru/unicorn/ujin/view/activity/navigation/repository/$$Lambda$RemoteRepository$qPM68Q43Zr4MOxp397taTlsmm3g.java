package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$qPM68Q43Zr4MOxp397taTlsmm3g  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$qPM68Q43Zr4MOxp397taTlsmm3g implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$qPM68Q43Zr4MOxp397taTlsmm3g INSTANCE = new $$Lambda$RemoteRepository$qPM68Q43Zr4MOxp397taTlsmm3g();

    private /* synthetic */ $$Lambda$RemoteRepository$qPM68Q43Zr4MOxp397taTlsmm3g() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
