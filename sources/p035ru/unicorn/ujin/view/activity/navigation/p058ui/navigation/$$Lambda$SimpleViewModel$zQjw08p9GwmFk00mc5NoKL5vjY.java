package p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.navigation.-$$Lambda$SimpleViewModel$zQjw08p9GwmF-k00mc5NoKL5vjY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$SimpleViewModel$zQjw08p9GwmFk00mc5NoKL5vjY implements Predicate {
    public static final /* synthetic */ $$Lambda$SimpleViewModel$zQjw08p9GwmFk00mc5NoKL5vjY INSTANCE = new $$Lambda$SimpleViewModel$zQjw08p9GwmFk00mc5NoKL5vjY();

    private /* synthetic */ $$Lambda$SimpleViewModel$zQjw08p9GwmFk00mc5NoKL5vjY() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
