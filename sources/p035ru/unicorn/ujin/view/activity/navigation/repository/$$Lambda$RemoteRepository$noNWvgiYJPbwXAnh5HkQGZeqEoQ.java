package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$noNWvgiYJPbwXAnh5HkQGZeqEoQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$noNWvgiYJPbwXAnh5HkQGZeqEoQ implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$noNWvgiYJPbwXAnh5HkQGZeqEoQ INSTANCE = new $$Lambda$RemoteRepository$noNWvgiYJPbwXAnh5HkQGZeqEoQ();

    private /* synthetic */ $$Lambda$RemoteRepository$noNWvgiYJPbwXAnh5HkQGZeqEoQ() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
