package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$PljeG_Mb2qW20dat3ilEEE13sx4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$PljeG_Mb2qW20dat3ilEEE13sx4 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$PljeG_Mb2qW20dat3ilEEE13sx4 INSTANCE = new $$Lambda$RemoteRepository$PljeG_Mb2qW20dat3ilEEE13sx4();

    private /* synthetic */ $$Lambda$RemoteRepository$PljeG_Mb2qW20dat3ilEEE13sx4() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
