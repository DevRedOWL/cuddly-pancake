package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$RcC5i1rfsxCwQtIokTzdmXho-T8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$RcC5i1rfsxCwQtIokTzdmXhoT8 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$RcC5i1rfsxCwQtIokTzdmXhoT8 INSTANCE = new $$Lambda$RemoteRepository$RcC5i1rfsxCwQtIokTzdmXhoT8();

    private /* synthetic */ $$Lambda$RemoteRepository$RcC5i1rfsxCwQtIokTzdmXhoT8() {
    }

    public final Object apply(Object obj) {
        return Resource.success(0, "", ((Resource) obj).getData());
    }
}
