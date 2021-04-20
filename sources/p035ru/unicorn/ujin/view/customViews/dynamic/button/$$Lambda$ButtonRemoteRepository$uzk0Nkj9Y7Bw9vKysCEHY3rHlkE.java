package p035ru.unicorn.ujin.view.customViews.dynamic.button;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.button.-$$Lambda$ButtonRemoteRepository$uzk0Nkj9Y7Bw9vKysCEHY3rHlkE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ButtonRemoteRepository$uzk0Nkj9Y7Bw9vKysCEHY3rHlkE implements Function {
    public static final /* synthetic */ $$Lambda$ButtonRemoteRepository$uzk0Nkj9Y7Bw9vKysCEHY3rHlkE INSTANCE = new $$Lambda$ButtonRemoteRepository$uzk0Nkj9Y7Bw9vKysCEHY3rHlkE();

    private /* synthetic */ $$Lambda$ButtonRemoteRepository$uzk0Nkj9Y7Bw9vKysCEHY3rHlkE() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
