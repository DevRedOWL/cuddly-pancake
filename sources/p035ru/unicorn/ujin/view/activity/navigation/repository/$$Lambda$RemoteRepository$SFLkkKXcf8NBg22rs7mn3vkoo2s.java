package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$SFLkkKXcf8NBg22rs7mn3vkoo2s  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$SFLkkKXcf8NBg22rs7mn3vkoo2s implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$SFLkkKXcf8NBg22rs7mn3vkoo2s INSTANCE = new $$Lambda$RemoteRepository$SFLkkKXcf8NBg22rs7mn3vkoo2s();

    private /* synthetic */ $$Lambda$RemoteRepository$SFLkkKXcf8NBg22rs7mn3vkoo2s() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
