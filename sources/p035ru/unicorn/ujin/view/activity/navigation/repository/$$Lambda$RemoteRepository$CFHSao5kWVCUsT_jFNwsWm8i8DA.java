package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$CFHSao5kWVCUsT_jFNwsWm8i8DA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$CFHSao5kWVCUsT_jFNwsWm8i8DA implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$CFHSao5kWVCUsT_jFNwsWm8i8DA INSTANCE = new $$Lambda$RemoteRepository$CFHSao5kWVCUsT_jFNwsWm8i8DA();

    private /* synthetic */ $$Lambda$RemoteRepository$CFHSao5kWVCUsT_jFNwsWm8i8DA() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
