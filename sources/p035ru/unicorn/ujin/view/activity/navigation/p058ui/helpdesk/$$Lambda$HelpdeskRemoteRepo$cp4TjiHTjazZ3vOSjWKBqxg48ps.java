package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$cp4TjiHTjazZ3vOSjWKBqxg48ps  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$cp4TjiHTjazZ3vOSjWKBqxg48ps implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$cp4TjiHTjazZ3vOSjWKBqxg48ps INSTANCE = new $$Lambda$HelpdeskRemoteRepo$cp4TjiHTjazZ3vOSjWKBqxg48ps();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$cp4TjiHTjazZ3vOSjWKBqxg48ps() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
