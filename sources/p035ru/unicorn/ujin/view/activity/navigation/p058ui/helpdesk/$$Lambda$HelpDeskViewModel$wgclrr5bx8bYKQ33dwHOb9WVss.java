package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpDeskViewModel$wgclrr5bx8bYKQ33dwHOb9W-Vss  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpDeskViewModel$wgclrr5bx8bYKQ33dwHOb9WVss implements Predicate {
    public static final /* synthetic */ $$Lambda$HelpDeskViewModel$wgclrr5bx8bYKQ33dwHOb9WVss INSTANCE = new $$Lambda$HelpDeskViewModel$wgclrr5bx8bYKQ33dwHOb9WVss();

    private /* synthetic */ $$Lambda$HelpDeskViewModel$wgclrr5bx8bYKQ33dwHOb9WVss() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
