package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$YHmZlGjnFadK1Ff1FlCLZ8CTWfs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$YHmZlGjnFadK1Ff1FlCLZ8CTWfs implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$YHmZlGjnFadK1Ff1FlCLZ8CTWfs INSTANCE = new $$Lambda$HelpdeskRemoteRepo$YHmZlGjnFadK1Ff1FlCLZ8CTWfs();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$YHmZlGjnFadK1Ff1FlCLZ8CTWfs() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
