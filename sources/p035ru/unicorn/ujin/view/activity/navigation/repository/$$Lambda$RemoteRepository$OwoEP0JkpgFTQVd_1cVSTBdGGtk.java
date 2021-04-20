package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$OwoEP0JkpgFTQVd_1cVSTBdGGtk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$OwoEP0JkpgFTQVd_1cVSTBdGGtk implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$OwoEP0JkpgFTQVd_1cVSTBdGGtk INSTANCE = new $$Lambda$RemoteRepository$OwoEP0JkpgFTQVd_1cVSTBdGGtk();

    private /* synthetic */ $$Lambda$RemoteRepository$OwoEP0JkpgFTQVd_1cVSTBdGGtk() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
