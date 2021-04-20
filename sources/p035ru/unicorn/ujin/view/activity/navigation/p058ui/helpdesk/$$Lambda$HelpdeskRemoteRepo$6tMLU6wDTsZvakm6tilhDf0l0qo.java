package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$6tMLU6wDTsZvakm6tilhDf0l0qo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$6tMLU6wDTsZvakm6tilhDf0l0qo implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$6tMLU6wDTsZvakm6tilhDf0l0qo INSTANCE = new $$Lambda$HelpdeskRemoteRepo$6tMLU6wDTsZvakm6tilhDf0l0qo();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$6tMLU6wDTsZvakm6tilhDf0l0qo() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
