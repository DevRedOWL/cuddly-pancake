package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$gc1-JkiTQpz_Lx6_e0FpUjenUb0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$gc1JkiTQpz_Lx6_e0FpUjenUb0 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$gc1JkiTQpz_Lx6_e0FpUjenUb0 INSTANCE = new $$Lambda$RemoteRepository$gc1JkiTQpz_Lx6_e0FpUjenUb0();

    private /* synthetic */ $$Lambda$RemoteRepository$gc1JkiTQpz_Lx6_e0FpUjenUb0() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
