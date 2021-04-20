package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$mL33RhBlx6vajtMpG-k3Mz_BwVY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$mL33RhBlx6vajtMpGk3Mz_BwVY implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$mL33RhBlx6vajtMpGk3Mz_BwVY INSTANCE = new $$Lambda$RemoteRepository$mL33RhBlx6vajtMpGk3Mz_BwVY();

    private /* synthetic */ $$Lambda$RemoteRepository$mL33RhBlx6vajtMpGk3Mz_BwVY() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
