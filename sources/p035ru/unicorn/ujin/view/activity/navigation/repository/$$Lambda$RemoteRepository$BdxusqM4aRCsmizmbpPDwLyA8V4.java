package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$BdxusqM4aRCsmizmbpPDwLyA8V4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$BdxusqM4aRCsmizmbpPDwLyA8V4 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$BdxusqM4aRCsmizmbpPDwLyA8V4 INSTANCE = new $$Lambda$RemoteRepository$BdxusqM4aRCsmizmbpPDwLyA8V4();

    private /* synthetic */ $$Lambda$RemoteRepository$BdxusqM4aRCsmizmbpPDwLyA8V4() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
