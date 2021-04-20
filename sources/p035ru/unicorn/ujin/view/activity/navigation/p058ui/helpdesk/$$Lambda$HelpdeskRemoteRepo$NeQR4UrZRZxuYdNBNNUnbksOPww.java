package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$NeQR4UrZRZxuYdNBNNUnbksOPww  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$NeQR4UrZRZxuYdNBNNUnbksOPww implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$NeQR4UrZRZxuYdNBNNUnbksOPww INSTANCE = new $$Lambda$HelpdeskRemoteRepo$NeQR4UrZRZxuYdNBNNUnbksOPww();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$NeQR4UrZRZxuYdNBNNUnbksOPww() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
