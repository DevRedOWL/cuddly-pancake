package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpDeskViewModel$WPi8od0mrurTyjlv_I5_FnrqKZE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpDeskViewModel$WPi8od0mrurTyjlv_I5_FnrqKZE implements Predicate {
    public static final /* synthetic */ $$Lambda$HelpDeskViewModel$WPi8od0mrurTyjlv_I5_FnrqKZE INSTANCE = new $$Lambda$HelpDeskViewModel$WPi8od0mrurTyjlv_I5_FnrqKZE();

    private /* synthetic */ $$Lambda$HelpDeskViewModel$WPi8od0mrurTyjlv_I5_FnrqKZE() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
