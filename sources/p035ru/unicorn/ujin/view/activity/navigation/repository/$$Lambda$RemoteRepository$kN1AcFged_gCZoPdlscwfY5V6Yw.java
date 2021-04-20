package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$kN1AcFged_gCZoPdlscwfY5V6Yw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$kN1AcFged_gCZoPdlscwfY5V6Yw implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$kN1AcFged_gCZoPdlscwfY5V6Yw INSTANCE = new $$Lambda$RemoteRepository$kN1AcFged_gCZoPdlscwfY5V6Yw();

    private /* synthetic */ $$Lambda$RemoteRepository$kN1AcFged_gCZoPdlscwfY5V6Yw() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
