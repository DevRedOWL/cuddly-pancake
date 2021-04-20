package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$hUC22_drSFKlX_iyZLDO3GuPyso  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$hUC22_drSFKlX_iyZLDO3GuPyso implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$hUC22_drSFKlX_iyZLDO3GuPyso INSTANCE = new $$Lambda$RemoteRepository$hUC22_drSFKlX_iyZLDO3GuPyso();

    private /* synthetic */ $$Lambda$RemoteRepository$hUC22_drSFKlX_iyZLDO3GuPyso() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
