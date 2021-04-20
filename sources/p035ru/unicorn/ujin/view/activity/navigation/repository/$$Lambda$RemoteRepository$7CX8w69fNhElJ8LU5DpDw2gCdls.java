package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$7CX8w69fNhElJ8LU5DpDw2gCdls  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$7CX8w69fNhElJ8LU5DpDw2gCdls implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$7CX8w69fNhElJ8LU5DpDw2gCdls INSTANCE = new $$Lambda$RemoteRepository$7CX8w69fNhElJ8LU5DpDw2gCdls();

    private /* synthetic */ $$Lambda$RemoteRepository$7CX8w69fNhElJ8LU5DpDw2gCdls() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
