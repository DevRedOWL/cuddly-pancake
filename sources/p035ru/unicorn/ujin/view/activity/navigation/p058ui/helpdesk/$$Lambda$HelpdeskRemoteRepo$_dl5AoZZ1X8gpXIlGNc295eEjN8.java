package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$_dl5AoZZ1X8gpXIlGNc295eEjN8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$_dl5AoZZ1X8gpXIlGNc295eEjN8 implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$_dl5AoZZ1X8gpXIlGNc295eEjN8 INSTANCE = new $$Lambda$HelpdeskRemoteRepo$_dl5AoZZ1X8gpXIlGNc295eEjN8();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$_dl5AoZZ1X8gpXIlGNc295eEjN8() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((ServiceTicketObject) ((Resource) obj).getData()).getServiceTicket());
    }
}
