package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$RentaRepository$-dgEKc8W_Zcpf6Co22ruqk2CuR4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RentaRepository$dgEKc8W_Zcpf6Co22ruqk2CuR4 implements Function {
    public static final /* synthetic */ $$Lambda$RentaRepository$dgEKc8W_Zcpf6Co22ruqk2CuR4 INSTANCE = new $$Lambda$RentaRepository$dgEKc8W_Zcpf6Co22ruqk2CuR4();

    private /* synthetic */ $$Lambda$RentaRepository$dgEKc8W_Zcpf6Co22ruqk2CuR4() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
