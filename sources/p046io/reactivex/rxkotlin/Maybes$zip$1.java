package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import p046io.reactivex.functions.BiFunction;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0004\n\u0002\b\b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00012\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo51343d2 = {"<anonymous>", "R", "T", "U", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.Maybes$zip$1 */
/* compiled from: Maybes.kt */
public final class Maybes$zip$1<T1, T2, R> implements BiFunction<T, U, R> {
    final /* synthetic */ Function2 $zipper;

    public Maybes$zip$1(Function2 function2) {
        this.$zipper = function2;
    }

    public final R apply(T t, U u) {
        return this.$zipper.invoke(t, u);
    }
}
