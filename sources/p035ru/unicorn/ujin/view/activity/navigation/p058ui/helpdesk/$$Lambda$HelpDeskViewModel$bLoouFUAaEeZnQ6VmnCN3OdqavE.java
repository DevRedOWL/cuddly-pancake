package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpDeskViewModel$bLoouFUAaEeZnQ6VmnCN3OdqavE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpDeskViewModel$bLoouFUAaEeZnQ6VmnCN3OdqavE implements Function {
    public static final /* synthetic */ $$Lambda$HelpDeskViewModel$bLoouFUAaEeZnQ6VmnCN3OdqavE INSTANCE = new $$Lambda$HelpDeskViewModel$bLoouFUAaEeZnQ6VmnCN3OdqavE();

    private /* synthetic */ $$Lambda$HelpDeskViewModel$bLoouFUAaEeZnQ6VmnCN3OdqavE() {
    }

    public final Object apply(Object obj) {
        return ((ServiceMessages) ((Resource) obj).getData()).getMessageId();
    }
}
