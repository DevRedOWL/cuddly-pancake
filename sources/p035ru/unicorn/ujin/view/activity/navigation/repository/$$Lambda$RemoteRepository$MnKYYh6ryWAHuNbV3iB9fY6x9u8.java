package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$MnKYYh6ryWAHuNbV3iB9fY6x9u8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$MnKYYh6ryWAHuNbV3iB9fY6x9u8 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$MnKYYh6ryWAHuNbV3iB9fY6x9u8 INSTANCE = new $$Lambda$RemoteRepository$MnKYYh6ryWAHuNbV3iB9fY6x9u8();

    private /* synthetic */ $$Lambda$RemoteRepository$MnKYYh6ryWAHuNbV3iB9fY6x9u8() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
