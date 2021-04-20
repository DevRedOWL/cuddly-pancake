package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$gFVR0INxuq32ob0g3TLguYnHl0Y  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$gFVR0INxuq32ob0g3TLguYnHl0Y implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$gFVR0INxuq32ob0g3TLguYnHl0Y INSTANCE = new $$Lambda$RemoteRepository$gFVR0INxuq32ob0g3TLguYnHl0Y();

    private /* synthetic */ $$Lambda$RemoteRepository$gFVR0INxuq32ob0g3TLguYnHl0Y() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
