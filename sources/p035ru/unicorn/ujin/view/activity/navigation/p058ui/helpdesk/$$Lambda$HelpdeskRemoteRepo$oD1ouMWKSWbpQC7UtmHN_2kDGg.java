package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$oD1ouMWKSWbpQC7U-tmHN_2kDGg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$oD1ouMWKSWbpQC7UtmHN_2kDGg implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$oD1ouMWKSWbpQC7UtmHN_2kDGg INSTANCE = new $$Lambda$HelpdeskRemoteRepo$oD1ouMWKSWbpQC7UtmHN_2kDGg();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$oD1ouMWKSWbpQC7UtmHN_2kDGg() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
