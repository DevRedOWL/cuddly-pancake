package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$CMabet9WIQ-GtgKlF3ZHPsaho-w  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$CMabet9WIQGtgKlF3ZHPsahow implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$CMabet9WIQGtgKlF3ZHPsahow INSTANCE = new $$Lambda$HelpdeskRemoteRepo$CMabet9WIQGtgKlF3ZHPsahow();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$CMabet9WIQGtgKlF3ZHPsahow() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
