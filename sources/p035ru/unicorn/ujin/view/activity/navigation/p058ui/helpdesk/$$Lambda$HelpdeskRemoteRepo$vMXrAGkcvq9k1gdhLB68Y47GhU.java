package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$vMXrAGkcvq-9k1gdhLB68Y47GhU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$vMXrAGkcvq9k1gdhLB68Y47GhU implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$vMXrAGkcvq9k1gdhLB68Y47GhU INSTANCE = new $$Lambda$HelpdeskRemoteRepo$vMXrAGkcvq9k1gdhLB68Y47GhU();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$vMXrAGkcvq9k1gdhLB68Y47GhU() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
