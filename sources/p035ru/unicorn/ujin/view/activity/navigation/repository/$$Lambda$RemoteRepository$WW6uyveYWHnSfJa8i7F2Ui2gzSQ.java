package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$WW6uyveYWHnSfJa8i7F2Ui2gzSQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$WW6uyveYWHnSfJa8i7F2Ui2gzSQ implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$WW6uyveYWHnSfJa8i7F2Ui2gzSQ INSTANCE = new $$Lambda$RemoteRepository$WW6uyveYWHnSfJa8i7F2Ui2gzSQ();

    private /* synthetic */ $$Lambda$RemoteRepository$WW6uyveYWHnSfJa8i7F2Ui2gzSQ() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
