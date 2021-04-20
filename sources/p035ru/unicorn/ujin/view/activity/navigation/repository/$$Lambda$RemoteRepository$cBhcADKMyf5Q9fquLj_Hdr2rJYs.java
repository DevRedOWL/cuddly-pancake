package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$cBhcADKMyf5Q9fquLj_Hdr2rJYs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$cBhcADKMyf5Q9fquLj_Hdr2rJYs implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$cBhcADKMyf5Q9fquLj_Hdr2rJYs INSTANCE = new $$Lambda$RemoteRepository$cBhcADKMyf5Q9fquLj_Hdr2rJYs();

    private /* synthetic */ $$Lambda$RemoteRepository$cBhcADKMyf5Q9fquLj_Hdr2rJYs() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
