package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$0EcaWInt3L_2TFjPDUqys1ufDZQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$0EcaWInt3L_2TFjPDUqys1ufDZQ implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$0EcaWInt3L_2TFjPDUqys1ufDZQ INSTANCE = new $$Lambda$RemoteRepository$0EcaWInt3L_2TFjPDUqys1ufDZQ();

    private /* synthetic */ $$Lambda$RemoteRepository$0EcaWInt3L_2TFjPDUqys1ufDZQ() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
