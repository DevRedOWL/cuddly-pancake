package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$1Ivrqyaiwei6FmLCPitFy8E_tI4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$1Ivrqyaiwei6FmLCPitFy8E_tI4 implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$1Ivrqyaiwei6FmLCPitFy8E_tI4 INSTANCE = new $$Lambda$RemoteRepository$1Ivrqyaiwei6FmLCPitFy8E_tI4();

    private /* synthetic */ $$Lambda$RemoteRepository$1Ivrqyaiwei6FmLCPitFy8E_tI4() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
