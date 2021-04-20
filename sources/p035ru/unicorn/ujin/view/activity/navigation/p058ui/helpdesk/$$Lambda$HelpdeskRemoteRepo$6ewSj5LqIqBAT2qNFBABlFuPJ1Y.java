package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$6ewSj5LqIqBAT2qNFBABlFuPJ1Y  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$6ewSj5LqIqBAT2qNFBABlFuPJ1Y implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$6ewSj5LqIqBAT2qNFBABlFuPJ1Y INSTANCE = new $$Lambda$HelpdeskRemoteRepo$6ewSj5LqIqBAT2qNFBABlFuPJ1Y();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$6ewSj5LqIqBAT2qNFBABlFuPJ1Y() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
