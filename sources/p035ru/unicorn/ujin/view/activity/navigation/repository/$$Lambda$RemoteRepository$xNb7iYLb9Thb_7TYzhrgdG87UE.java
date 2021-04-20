package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$xNb7iYLb9Thb_7TYzhrg-dG87UE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$xNb7iYLb9Thb_7TYzhrgdG87UE implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$xNb7iYLb9Thb_7TYzhrgdG87UE INSTANCE = new $$Lambda$RemoteRepository$xNb7iYLb9Thb_7TYzhrgdG87UE();

    private /* synthetic */ $$Lambda$RemoteRepository$xNb7iYLb9Thb_7TYzhrgdG87UE() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
