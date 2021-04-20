package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$B55i6oTELu25bQWKVTD70_6rV24  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$B55i6oTELu25bQWKVTD70_6rV24 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$B55i6oTELu25bQWKVTD70_6rV24 INSTANCE = new $$Lambda$RemoteRepository$B55i6oTELu25bQWKVTD70_6rV24();

    private /* synthetic */ $$Lambda$RemoteRepository$B55i6oTELu25bQWKVTD70_6rV24() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
