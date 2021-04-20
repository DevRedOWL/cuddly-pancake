package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$C_gL2ct99MSnPBY3dbd4x6ytuVQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$C_gL2ct99MSnPBY3dbd4x6ytuVQ implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$C_gL2ct99MSnPBY3dbd4x6ytuVQ INSTANCE = new $$Lambda$RemoteRepository$C_gL2ct99MSnPBY3dbd4x6ytuVQ();

    private /* synthetic */ $$Lambda$RemoteRepository$C_gL2ct99MSnPBY3dbd4x6ytuVQ() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
