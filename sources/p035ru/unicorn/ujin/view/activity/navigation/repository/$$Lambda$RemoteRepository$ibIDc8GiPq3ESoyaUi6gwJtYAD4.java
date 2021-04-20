package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$ibIDc8GiPq3ESoyaUi6gwJtYAD4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$ibIDc8GiPq3ESoyaUi6gwJtYAD4 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$ibIDc8GiPq3ESoyaUi6gwJtYAD4 INSTANCE = new $$Lambda$RemoteRepository$ibIDc8GiPq3ESoyaUi6gwJtYAD4();

    private /* synthetic */ $$Lambda$RemoteRepository$ibIDc8GiPq3ESoyaUi6gwJtYAD4() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
