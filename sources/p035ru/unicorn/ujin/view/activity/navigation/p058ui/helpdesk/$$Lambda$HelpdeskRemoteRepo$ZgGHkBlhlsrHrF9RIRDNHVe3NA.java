package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.api.response.chats.FileUploadResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$ZgGHkBlhl-srHrF9RIRDNHVe3NA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$ZgGHkBlhlsrHrF9RIRDNHVe3NA implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$ZgGHkBlhlsrHrF9RIRDNHVe3NA INSTANCE = new $$Lambda$HelpdeskRemoteRepo$ZgGHkBlhlsrHrF9RIRDNHVe3NA();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$ZgGHkBlhlsrHrF9RIRDNHVe3NA() {
    }

    public final Object apply(Object obj) {
        return Resource.success(Integer.valueOf(((FileUploadResponse) obj).getError()), ((FileUploadResponse) obj).getMessage(), ((FileUploadResponse) obj).getData());
    }
}
