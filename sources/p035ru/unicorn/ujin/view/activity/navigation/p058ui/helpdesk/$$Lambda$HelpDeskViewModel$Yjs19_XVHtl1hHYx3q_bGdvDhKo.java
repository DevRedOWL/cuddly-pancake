package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpDeskViewModel$Yjs19_XVHtl1hHYx3q_bGdvDhKo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpDeskViewModel$Yjs19_XVHtl1hHYx3q_bGdvDhKo implements Predicate {
    public static final /* synthetic */ $$Lambda$HelpDeskViewModel$Yjs19_XVHtl1hHYx3q_bGdvDhKo INSTANCE = new $$Lambda$HelpDeskViewModel$Yjs19_XVHtl1hHYx3q_bGdvDhKo();

    private /* synthetic */ $$Lambda$HelpDeskViewModel$Yjs19_XVHtl1hHYx3q_bGdvDhKo() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
