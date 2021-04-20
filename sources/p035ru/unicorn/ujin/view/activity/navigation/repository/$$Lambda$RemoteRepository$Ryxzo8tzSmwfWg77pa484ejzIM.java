package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$Ryxzo8tzSmwfWg77pa-484ejzIM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$Ryxzo8tzSmwfWg77pa484ejzIM implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$Ryxzo8tzSmwfWg77pa484ejzIM INSTANCE = new $$Lambda$RemoteRepository$Ryxzo8tzSmwfWg77pa484ejzIM();

    private /* synthetic */ $$Lambda$RemoteRepository$Ryxzo8tzSmwfWg77pa484ejzIM() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
