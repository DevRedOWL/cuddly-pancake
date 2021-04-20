package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$yQDNyNMdUgRRc6QbHwFRgVbiVHQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$yQDNyNMdUgRRc6QbHwFRgVbiVHQ implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$yQDNyNMdUgRRc6QbHwFRgVbiVHQ INSTANCE = new $$Lambda$RemoteRepository$yQDNyNMdUgRRc6QbHwFRgVbiVHQ();

    private /* synthetic */ $$Lambda$RemoteRepository$yQDNyNMdUgRRc6QbHwFRgVbiVHQ() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
