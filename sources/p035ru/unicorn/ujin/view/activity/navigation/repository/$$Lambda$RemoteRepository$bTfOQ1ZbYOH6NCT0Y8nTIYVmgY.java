package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$bTfOQ1ZbYOH6NCT0Y8nTI-YVmgY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$bTfOQ1ZbYOH6NCT0Y8nTIYVmgY implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$bTfOQ1ZbYOH6NCT0Y8nTIYVmgY INSTANCE = new $$Lambda$RemoteRepository$bTfOQ1ZbYOH6NCT0Y8nTIYVmgY();

    private /* synthetic */ $$Lambda$RemoteRepository$bTfOQ1ZbYOH6NCT0Y8nTIYVmgY() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
