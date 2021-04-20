package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$CJAkWoHndPP6Dlaor-8tJFB6rBM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$CJAkWoHndPP6Dlaor8tJFB6rBM implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$CJAkWoHndPP6Dlaor8tJFB6rBM INSTANCE = new $$Lambda$RemoteRepository$CJAkWoHndPP6Dlaor8tJFB6rBM();

    private /* synthetic */ $$Lambda$RemoteRepository$CJAkWoHndPP6Dlaor8tJFB6rBM() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
