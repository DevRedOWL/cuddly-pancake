package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$_t146lsPMnHpcSWa1Bo4HmUZRCM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$_t146lsPMnHpcSWa1Bo4HmUZRCM implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$_t146lsPMnHpcSWa1Bo4HmUZRCM INSTANCE = new $$Lambda$RemoteRepository$_t146lsPMnHpcSWa1Bo4HmUZRCM();

    private /* synthetic */ $$Lambda$RemoteRepository$_t146lsPMnHpcSWa1Bo4HmUZRCM() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
