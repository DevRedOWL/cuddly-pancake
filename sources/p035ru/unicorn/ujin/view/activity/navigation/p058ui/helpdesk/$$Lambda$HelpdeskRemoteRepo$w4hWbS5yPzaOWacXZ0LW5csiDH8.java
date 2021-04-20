package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$w4hWbS5yPzaOWacXZ0LW5csiDH8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$w4hWbS5yPzaOWacXZ0LW5csiDH8 implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$w4hWbS5yPzaOWacXZ0LW5csiDH8 INSTANCE = new $$Lambda$HelpdeskRemoteRepo$w4hWbS5yPzaOWacXZ0LW5csiDH8();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$w4hWbS5yPzaOWacXZ0LW5csiDH8() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
