package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$Lmf57GOkR15xLBkrv9CntyqwuMk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$Lmf57GOkR15xLBkrv9CntyqwuMk implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$Lmf57GOkR15xLBkrv9CntyqwuMk INSTANCE = new $$Lambda$HelpdeskRemoteRepo$Lmf57GOkR15xLBkrv9CntyqwuMk();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$Lmf57GOkR15xLBkrv9CntyqwuMk() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
