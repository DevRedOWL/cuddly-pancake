package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import p046io.reactivex.functions.Function6;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0004\n\u0002\b\u0010\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u0006\"\u0004\b\u0005\u0010\u0007\"\u0004\b\u0006\u0010\u00012\u0006\u0010\b\u001a\u0002H\u00022\u0006\u0010\t\u001a\u0002H\u00032\u0006\u0010\n\u001a\u0002H\u00042\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u0002H\u00062\u0006\u0010\r\u001a\u0002H\u0007H\n¢\u0006\u0004\b\u000e\u0010\u000f"}, mo51343d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "t1", "t2", "t3", "t4", "t5", "t6", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.Flowables$zip$7 */
/* compiled from: Flowables.kt */
public final class Flowables$zip$7<T1, T2, T3, T4, T5, T6, R> implements Function6<T1, T2, T3, T4, T5, T6, R> {
    final /* synthetic */ kotlin.jvm.functions.Function6 $combineFunction;

    public Flowables$zip$7(kotlin.jvm.functions.Function6 function6) {
        this.$combineFunction = function6;
    }

    public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return this.$combineFunction.invoke(t1, t2, t3, t4, t5, t6);
    }
}
