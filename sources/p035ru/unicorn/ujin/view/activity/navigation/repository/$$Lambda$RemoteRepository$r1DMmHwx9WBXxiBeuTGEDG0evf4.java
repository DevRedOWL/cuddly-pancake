package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$r1DMmHwx9WBXxiBeuTGEDG0evf4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$r1DMmHwx9WBXxiBeuTGEDG0evf4 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$r1DMmHwx9WBXxiBeuTGEDG0evf4 INSTANCE = new $$Lambda$RemoteRepository$r1DMmHwx9WBXxiBeuTGEDG0evf4();

    private /* synthetic */ $$Lambda$RemoteRepository$r1DMmHwx9WBXxiBeuTGEDG0evf4() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
