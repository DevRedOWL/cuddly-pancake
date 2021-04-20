package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import p046io.reactivex.functions.BiFunction;

@Metadata(mo51341bv = {1, 0, 2}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.FlowableKt$sam$BiFunction$89d2d6b2 */
/* compiled from: flowable.kt */
final class FlowableKt$sam$BiFunction$89d2d6b2 implements BiFunction {
    private final /* synthetic */ Function2 function;

    FlowableKt$sam$BiFunction$89d2d6b2(Function2 function2) {
        this.function = function2;
    }

    public final /* synthetic */ R apply(T1 t1, T2 t2) {
        return this.function.invoke(t1, t2);
    }
}
