package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$Q4U9tXu0ymSJ1SoI19ppD1oFNlg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$Q4U9tXu0ymSJ1SoI19ppD1oFNlg implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$Q4U9tXu0ymSJ1SoI19ppD1oFNlg INSTANCE = new $$Lambda$RemoteRepository$Q4U9tXu0ymSJ1SoI19ppD1oFNlg();

    private /* synthetic */ $$Lambda$RemoteRepository$Q4U9tXu0ymSJ1SoI19ppD1oFNlg() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
