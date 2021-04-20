package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpDeskViewModel$NBVpCQlXjAys2Jd3CN1X4II8XwQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpDeskViewModel$NBVpCQlXjAys2Jd3CN1X4II8XwQ implements Predicate {
    public static final /* synthetic */ $$Lambda$HelpDeskViewModel$NBVpCQlXjAys2Jd3CN1X4II8XwQ INSTANCE = new $$Lambda$HelpDeskViewModel$NBVpCQlXjAys2Jd3CN1X4II8XwQ();

    private /* synthetic */ $$Lambda$HelpDeskViewModel$NBVpCQlXjAys2Jd3CN1X4II8XwQ() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
