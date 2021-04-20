package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$sXorMTkrONk2dn6V0yYd0Pak-Ow  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$sXorMTkrONk2dn6V0yYd0PakOw implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$sXorMTkrONk2dn6V0yYd0PakOw INSTANCE = new $$Lambda$RemoteRepository$sXorMTkrONk2dn6V0yYd0PakOw();

    private /* synthetic */ $$Lambda$RemoteRepository$sXorMTkrONk2dn6V0yYd0PakOw() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
