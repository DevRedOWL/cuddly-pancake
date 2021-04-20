package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$eXMBkKe3Y6o0-Trq9THI7kZTFCE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$eXMBkKe3Y6o0Trq9THI7kZTFCE implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$eXMBkKe3Y6o0Trq9THI7kZTFCE INSTANCE = new $$Lambda$HelpdeskRemoteRepo$eXMBkKe3Y6o0Trq9THI7kZTFCE();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$eXMBkKe3Y6o0Trq9THI7kZTFCE() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
