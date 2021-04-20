package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 2}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.SubscribersKt$sam$Consumer$2b2a3ebc */
/* compiled from: subscribers.kt */
final class SubscribersKt$sam$Consumer$2b2a3ebc implements Consumer {
    private final /* synthetic */ Function1 function;

    SubscribersKt$sam$Consumer$2b2a3ebc(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ void accept(T t) {
        Intrinsics.checkExpressionValueIsNotNull(this.function.invoke(t), "invoke(...)");
    }
}
