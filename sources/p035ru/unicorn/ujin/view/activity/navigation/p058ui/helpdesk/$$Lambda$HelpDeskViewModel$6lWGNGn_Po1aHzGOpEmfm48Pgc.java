package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpDeskViewModel$6lWGNGn_-Po1aHzGOpEmfm48Pgc  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpDeskViewModel$6lWGNGn_Po1aHzGOpEmfm48Pgc implements Function {
    public static final /* synthetic */ $$Lambda$HelpDeskViewModel$6lWGNGn_Po1aHzGOpEmfm48Pgc INSTANCE = new $$Lambda$HelpDeskViewModel$6lWGNGn_Po1aHzGOpEmfm48Pgc();

    private /* synthetic */ $$Lambda$HelpDeskViewModel$6lWGNGn_Po1aHzGOpEmfm48Pgc() {
    }

    public final Object apply(Object obj) {
        return ((RentTicketList) ((Resource) obj).getData()).getTicketsList();
    }
}
