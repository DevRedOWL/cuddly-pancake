package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$GpgJH0kMPQEPPJR59xJ2sR6pvEU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$GpgJH0kMPQEPPJR59xJ2sR6pvEU implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$GpgJH0kMPQEPPJR59xJ2sR6pvEU INSTANCE = new $$Lambda$RemoteRepository$GpgJH0kMPQEPPJR59xJ2sR6pvEU();

    private /* synthetic */ $$Lambda$RemoteRepository$GpgJH0kMPQEPPJR59xJ2sR6pvEU() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
