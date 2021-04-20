package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$LYSkd0WacZsX8vDzMBut-dtV3V0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$LYSkd0WacZsX8vDzMButdtV3V0 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$LYSkd0WacZsX8vDzMButdtV3V0 INSTANCE = new $$Lambda$RemoteRepository$LYSkd0WacZsX8vDzMButdtV3V0();

    private /* synthetic */ $$Lambda$RemoteRepository$LYSkd0WacZsX8vDzMButdtV3V0() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
