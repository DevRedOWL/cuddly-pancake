package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$RkWXGxDbHVcw9KsTg5-LUiGoqgQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$RkWXGxDbHVcw9KsTg5LUiGoqgQ implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$RkWXGxDbHVcw9KsTg5LUiGoqgQ INSTANCE = new $$Lambda$HelpdeskRemoteRepo$RkWXGxDbHVcw9KsTg5LUiGoqgQ();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$RkWXGxDbHVcw9KsTg5LUiGoqgQ() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
