package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$pt-2fkV0J63RngP2gmbc_rUxJRI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$pt2fkV0J63RngP2gmbc_rUxJRI implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$pt2fkV0J63RngP2gmbc_rUxJRI INSTANCE = new $$Lambda$RemoteRepository$pt2fkV0J63RngP2gmbc_rUxJRI();

    private /* synthetic */ $$Lambda$RemoteRepository$pt2fkV0J63RngP2gmbc_rUxJRI() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
