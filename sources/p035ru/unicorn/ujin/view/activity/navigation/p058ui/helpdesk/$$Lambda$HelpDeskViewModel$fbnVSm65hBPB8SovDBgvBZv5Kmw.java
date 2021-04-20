package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.functions.Consumer;
import p046io.realm.RealmObject;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpDeskViewModel$fbnVSm65hBPB8SovDBgvBZv5Kmw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpDeskViewModel$fbnVSm65hBPB8SovDBgvBZv5Kmw implements Consumer {
    public static final /* synthetic */ $$Lambda$HelpDeskViewModel$fbnVSm65hBPB8SovDBgvBZv5Kmw INSTANCE = new $$Lambda$HelpDeskViewModel$fbnVSm65hBPB8SovDBgvBZv5Kmw();

    private /* synthetic */ $$Lambda$HelpDeskViewModel$fbnVSm65hBPB8SovDBgvBZv5Kmw() {
    }

    public final void accept(Object obj) {
        LocalRepository.getInstance().saveDataOrUpdate((List<? extends RealmObject>) (List) obj);
    }
}
