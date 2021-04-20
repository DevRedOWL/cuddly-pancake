package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$WHeMIR5hTaT8dcwVhORcSy1QG3w  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$WHeMIR5hTaT8dcwVhORcSy1QG3w implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$WHeMIR5hTaT8dcwVhORcSy1QG3w INSTANCE = new $$Lambda$RemoteRepository$WHeMIR5hTaT8dcwVhORcSy1QG3w();

    private /* synthetic */ $$Lambda$RemoteRepository$WHeMIR5hTaT8dcwVhORcSy1QG3w() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
