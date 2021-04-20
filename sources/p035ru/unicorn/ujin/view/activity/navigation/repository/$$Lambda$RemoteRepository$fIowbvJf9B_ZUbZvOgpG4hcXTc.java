package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$fIowbvJ-f9B_ZUbZvOgpG4hcXTc  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$fIowbvJf9B_ZUbZvOgpG4hcXTc implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$fIowbvJf9B_ZUbZvOgpG4hcXTc INSTANCE = new $$Lambda$RemoteRepository$fIowbvJf9B_ZUbZvOgpG4hcXTc();

    private /* synthetic */ $$Lambda$RemoteRepository$fIowbvJf9B_ZUbZvOgpG4hcXTc() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
