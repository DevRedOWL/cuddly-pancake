package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.api.response.chats.FileUploadResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$aGcON1qcdkHYqLiCNNg9aIM4Cr4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$aGcON1qcdkHYqLiCNNg9aIM4Cr4 implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$aGcON1qcdkHYqLiCNNg9aIM4Cr4 INSTANCE = new $$Lambda$HelpdeskRemoteRepo$aGcON1qcdkHYqLiCNNg9aIM4Cr4();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$aGcON1qcdkHYqLiCNNg9aIM4Cr4() {
    }

    public final Object apply(Object obj) {
        return Resource.success(Integer.valueOf(((FileUploadResponse) obj).getError()), ((FileUploadResponse) obj).getMessage(), ((FileUploadResponse) obj).getData());
    }
}
