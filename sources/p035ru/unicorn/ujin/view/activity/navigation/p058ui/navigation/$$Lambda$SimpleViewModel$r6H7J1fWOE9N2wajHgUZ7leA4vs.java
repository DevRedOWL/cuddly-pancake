package p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation;

import java.util.List;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.navigation.-$$Lambda$SimpleViewModel$r6H7J1fWOE9N2wajHgUZ7leA4vs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$SimpleViewModel$r6H7J1fWOE9N2wajHgUZ7leA4vs implements Function {
    public static final /* synthetic */ $$Lambda$SimpleViewModel$r6H7J1fWOE9N2wajHgUZ7leA4vs INSTANCE = new $$Lambda$SimpleViewModel$r6H7J1fWOE9N2wajHgUZ7leA4vs();

    private /* synthetic */ $$Lambda$SimpleViewModel$r6H7J1fWOE9N2wajHgUZ7leA4vs() {
    }

    public final Object apply(Object obj) {
        return Resource.success(0, "", (BMSInfo) ((List) obj).get(0));
    }
}
