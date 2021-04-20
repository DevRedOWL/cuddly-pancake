package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$AfEXRXBsgUYTUuyZXtZEkk4Kio0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$AfEXRXBsgUYTUuyZXtZEkk4Kio0 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$AfEXRXBsgUYTUuyZXtZEkk4Kio0 INSTANCE = new $$Lambda$RemoteRepository$AfEXRXBsgUYTUuyZXtZEkk4Kio0();

    private /* synthetic */ $$Lambda$RemoteRepository$AfEXRXBsgUYTUuyZXtZEkk4Kio0() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
