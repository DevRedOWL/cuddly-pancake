package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$Sn-Td8C2zTLeFideGFuAGLMuvTU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$SnTd8C2zTLeFideGFuAGLMuvTU implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$SnTd8C2zTLeFideGFuAGLMuvTU INSTANCE = new $$Lambda$HelpdeskRemoteRepo$SnTd8C2zTLeFideGFuAGLMuvTU();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$SnTd8C2zTLeFideGFuAGLMuvTU() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
