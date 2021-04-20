package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$eYgtGeQR14wxyI-jzCB8AlPMz5A  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$eYgtGeQR14wxyIjzCB8AlPMz5A implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$eYgtGeQR14wxyIjzCB8AlPMz5A INSTANCE = new $$Lambda$RemoteRepository$eYgtGeQR14wxyIjzCB8AlPMz5A();

    private /* synthetic */ $$Lambda$RemoteRepository$eYgtGeQR14wxyIjzCB8AlPMz5A() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
