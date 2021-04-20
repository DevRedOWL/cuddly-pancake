package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$IRtNngTQKBjJlIkzlHsh8GiFmng  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$IRtNngTQKBjJlIkzlHsh8GiFmng implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$IRtNngTQKBjJlIkzlHsh8GiFmng INSTANCE = new $$Lambda$RemoteRepository$IRtNngTQKBjJlIkzlHsh8GiFmng();

    private /* synthetic */ $$Lambda$RemoteRepository$IRtNngTQKBjJlIkzlHsh8GiFmng() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
