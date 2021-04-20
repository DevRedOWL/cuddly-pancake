package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$JONhEcHIOg3iSQrYqlofGRG0mP8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$JONhEcHIOg3iSQrYqlofGRG0mP8 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$JONhEcHIOg3iSQrYqlofGRG0mP8 INSTANCE = new $$Lambda$RemoteRepository$JONhEcHIOg3iSQrYqlofGRG0mP8();

    private /* synthetic */ $$Lambda$RemoteRepository$JONhEcHIOg3iSQrYqlofGRG0mP8() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
