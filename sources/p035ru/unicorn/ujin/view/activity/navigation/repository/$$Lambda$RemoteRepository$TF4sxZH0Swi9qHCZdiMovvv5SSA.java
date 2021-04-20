package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$TF4sxZH0Swi9qHCZdiMovvv5SSA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$TF4sxZH0Swi9qHCZdiMovvv5SSA implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$TF4sxZH0Swi9qHCZdiMovvv5SSA INSTANCE = new $$Lambda$RemoteRepository$TF4sxZH0Swi9qHCZdiMovvv5SSA();

    private /* synthetic */ $$Lambda$RemoteRepository$TF4sxZH0Swi9qHCZdiMovvv5SSA() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
