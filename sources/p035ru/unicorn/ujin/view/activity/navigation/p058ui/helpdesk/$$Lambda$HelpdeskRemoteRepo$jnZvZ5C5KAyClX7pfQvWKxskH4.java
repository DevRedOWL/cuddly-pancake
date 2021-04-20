package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.-$$Lambda$HelpdeskRemoteRepo$jnZvZ5C5KAyClX7pfQvWK-xskH4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HelpdeskRemoteRepo$jnZvZ5C5KAyClX7pfQvWKxskH4 implements Function {
    public static final /* synthetic */ $$Lambda$HelpdeskRemoteRepo$jnZvZ5C5KAyClX7pfQvWKxskH4 INSTANCE = new $$Lambda$HelpdeskRemoteRepo$jnZvZ5C5KAyClX7pfQvWKxskH4();

    private /* synthetic */ $$Lambda$HelpdeskRemoteRepo$jnZvZ5C5KAyClX7pfQvWKxskH4() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
