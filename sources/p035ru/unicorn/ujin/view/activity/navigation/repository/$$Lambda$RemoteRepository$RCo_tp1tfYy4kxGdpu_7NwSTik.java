package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.VideoObject;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$RCo_tp1tfYy4kxGdpu_7N-wSTik  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$RCo_tp1tfYy4kxGdpu_7NwSTik implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$RCo_tp1tfYy4kxGdpu_7NwSTik INSTANCE = new $$Lambda$RemoteRepository$RCo_tp1tfYy4kxGdpu_7NwSTik();

    private /* synthetic */ $$Lambda$RemoteRepository$RCo_tp1tfYy4kxGdpu_7NwSTik() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((VideoObject) ((Resource) obj).getData()).getVideoList());
    }
}
