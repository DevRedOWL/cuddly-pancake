package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$oCSVGxYIA-3LL-kEpqQ07YaZII8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$oCSVGxYIA3LLkEpqQ07YaZII8 implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$oCSVGxYIA3LLkEpqQ07YaZII8 INSTANCE = new $$Lambda$HelpdeskRemoteRepo$oCSVGxYIA3LLkEpqQ07YaZII8();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$oCSVGxYIA3LLkEpqQ07YaZII8() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
