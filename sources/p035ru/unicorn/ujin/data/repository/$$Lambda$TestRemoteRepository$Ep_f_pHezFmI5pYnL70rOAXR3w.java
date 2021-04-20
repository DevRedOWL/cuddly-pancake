package p035ru.unicorn.ujin.data.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.data.repository.-$$Lambda$TestRemoteRepository$Ep_f_pHezFm-I5pYnL70rOAXR3w  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$TestRemoteRepository$Ep_f_pHezFmI5pYnL70rOAXR3w implements Function {
    public static final /* synthetic */ $$Lambda$TestRemoteRepository$Ep_f_pHezFmI5pYnL70rOAXR3w INSTANCE = new $$Lambda$TestRemoteRepository$Ep_f_pHezFmI5pYnL70rOAXR3w();

    private /* synthetic */ $$Lambda$TestRemoteRepository$Ep_f_pHezFmI5pYnL70rOAXR3w() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
