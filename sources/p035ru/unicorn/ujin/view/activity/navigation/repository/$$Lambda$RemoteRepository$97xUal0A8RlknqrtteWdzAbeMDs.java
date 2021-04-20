package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$97xUal0A8RlknqrtteWdzAbeMDs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$97xUal0A8RlknqrtteWdzAbeMDs implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$97xUal0A8RlknqrtteWdzAbeMDs INSTANCE = new $$Lambda$RemoteRepository$97xUal0A8RlknqrtteWdzAbeMDs();

    private /* synthetic */ $$Lambda$RemoteRepository$97xUal0A8RlknqrtteWdzAbeMDs() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
