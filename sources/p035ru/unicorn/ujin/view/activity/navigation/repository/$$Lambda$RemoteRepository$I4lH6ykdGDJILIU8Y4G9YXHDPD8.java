package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$I4lH6ykdGDJILIU8Y4G9YXHDPD8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$I4lH6ykdGDJILIU8Y4G9YXHDPD8 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$I4lH6ykdGDJILIU8Y4G9YXHDPD8 INSTANCE = new $$Lambda$RemoteRepository$I4lH6ykdGDJILIU8Y4G9YXHDPD8();

    private /* synthetic */ $$Lambda$RemoteRepository$I4lH6ykdGDJILIU8Y4G9YXHDPD8() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
