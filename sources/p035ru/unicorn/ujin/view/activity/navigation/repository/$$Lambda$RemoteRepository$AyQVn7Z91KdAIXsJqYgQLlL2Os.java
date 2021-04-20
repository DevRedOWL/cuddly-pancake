package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$AyQVn7Z91KdAIX-sJqYgQLlL2Os  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$AyQVn7Z91KdAIXsJqYgQLlL2Os implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$AyQVn7Z91KdAIXsJqYgQLlL2Os INSTANCE = new $$Lambda$RemoteRepository$AyQVn7Z91KdAIXsJqYgQLlL2Os();

    private /* synthetic */ $$Lambda$RemoteRepository$AyQVn7Z91KdAIXsJqYgQLlL2Os() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
