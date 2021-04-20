package p035ru.unicorn.ujin.data.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.data.repository.-$$Lambda$TestRemoteRepository$pgukQ2-AW5IIGy_22D4iRdGQIn4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$TestRemoteRepository$pgukQ2AW5IIGy_22D4iRdGQIn4 implements Function {
    public static final /* synthetic */ $$Lambda$TestRemoteRepository$pgukQ2AW5IIGy_22D4iRdGQIn4 INSTANCE = new $$Lambda$TestRemoteRepository$pgukQ2AW5IIGy_22D4iRdGQIn4();

    private /* synthetic */ $$Lambda$TestRemoteRepository$pgukQ2AW5IIGy_22D4iRdGQIn4() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
