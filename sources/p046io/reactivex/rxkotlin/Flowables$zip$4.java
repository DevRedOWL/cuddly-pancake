package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.Triple;
import p046io.reactivex.functions.Function3;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00032\u0006\u0010\u0007\u001a\u0002H\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, mo51343d2 = {"<anonymous>", "Lkotlin/Triple;", "T1", "T2", "T3", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.Flowables$zip$4 */
/* compiled from: Flowables.kt */
final class Flowables$zip$4<T1, T2, T3, R> implements Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>> {
    public static final Flowables$zip$4 INSTANCE = new Flowables$zip$4();

    Flowables$zip$4() {
    }

    public final Triple<T1, T2, T3> apply(T1 t1, T2 t2, T3 t3) {
        return new Triple<>(t1, t2, t3);
    }
}
