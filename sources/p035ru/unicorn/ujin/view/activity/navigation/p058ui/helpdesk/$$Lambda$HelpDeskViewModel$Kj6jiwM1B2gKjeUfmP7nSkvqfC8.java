package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.api.response.chats.FileUploadData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpDeskViewModel$Kj6jiwM1B2gKjeUfmP7nSkvqfC8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpDeskViewModel$Kj6jiwM1B2gKjeUfmP7nSkvqfC8 implements Function {
    public static final /* synthetic */ $$Lambda$HelpDeskViewModel$Kj6jiwM1B2gKjeUfmP7nSkvqfC8 INSTANCE = new $$Lambda$HelpDeskViewModel$Kj6jiwM1B2gKjeUfmP7nSkvqfC8();

    private /* synthetic */ $$Lambda$HelpDeskViewModel$Kj6jiwM1B2gKjeUfmP7nSkvqfC8() {
    }

    public final Object apply(Object obj) {
        return ((FileUploadData) ((Resource) obj).getData()).getId();
    }
}
