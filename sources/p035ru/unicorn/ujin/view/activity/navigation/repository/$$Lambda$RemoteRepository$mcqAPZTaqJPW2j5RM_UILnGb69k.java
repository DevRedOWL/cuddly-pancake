package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$mcqAPZTaqJPW2j5RM_UILnGb69k  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$mcqAPZTaqJPW2j5RM_UILnGb69k implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$mcqAPZTaqJPW2j5RM_UILnGb69k INSTANCE = new $$Lambda$RemoteRepository$mcqAPZTaqJPW2j5RM_UILnGb69k();

    private /* synthetic */ $$Lambda$RemoteRepository$mcqAPZTaqJPW2j5RM_UILnGb69k() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
