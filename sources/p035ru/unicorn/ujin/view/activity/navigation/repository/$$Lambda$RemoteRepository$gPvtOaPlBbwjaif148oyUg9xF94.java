package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$gPvtOaPlBbwjaif148oyUg9xF94  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$gPvtOaPlBbwjaif148oyUg9xF94 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$gPvtOaPlBbwjaif148oyUg9xF94 INSTANCE = new $$Lambda$RemoteRepository$gPvtOaPlBbwjaif148oyUg9xF94();

    private /* synthetic */ $$Lambda$RemoteRepository$gPvtOaPlBbwjaif148oyUg9xF94() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
