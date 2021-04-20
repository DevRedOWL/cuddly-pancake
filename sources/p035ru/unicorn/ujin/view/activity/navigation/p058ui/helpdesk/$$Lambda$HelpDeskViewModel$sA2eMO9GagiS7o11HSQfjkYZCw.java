package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpDeskViewModel$sA2eM-O9GagiS7o11HSQfjkYZCw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpDeskViewModel$sA2eMO9GagiS7o11HSQfjkYZCw implements Function {
    public static final /* synthetic */ $$Lambda$HelpDeskViewModel$sA2eMO9GagiS7o11HSQfjkYZCw INSTANCE = new $$Lambda$HelpDeskViewModel$sA2eMO9GagiS7o11HSQfjkYZCw();

    private /* synthetic */ $$Lambda$HelpDeskViewModel$sA2eMO9GagiS7o11HSQfjkYZCw() {
    }

    public final Object apply(Object obj) {
        return ((ServiceTicketTypeList) ((Resource) obj).getData()).getServiceTicketTypes();
    }
}
