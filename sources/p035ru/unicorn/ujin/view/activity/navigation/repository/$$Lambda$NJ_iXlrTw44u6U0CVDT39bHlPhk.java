package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.profile.User;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$NJ_iXlrTw44u6U0CVDT39bHlPhk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$NJ_iXlrTw44u6U0CVDT39bHlPhk implements Function {
    public static final /* synthetic */ $$Lambda$NJ_iXlrTw44u6U0CVDT39bHlPhk INSTANCE = new $$Lambda$NJ_iXlrTw44u6U0CVDT39bHlPhk();

    private /* synthetic */ $$Lambda$NJ_iXlrTw44u6U0CVDT39bHlPhk() {
    }

    public final Object apply(Object obj) {
        return ((User) obj).getToken();
    }
}
