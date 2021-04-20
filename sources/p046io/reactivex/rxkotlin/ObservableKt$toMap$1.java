package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo51343d2 = {"<anonymous>", "A", "", "B", "it", "Lkotlin/Pair;", "apply", "(Lkotlin/Pair;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.ObservableKt$toMap$1 */
/* compiled from: observable.kt */
final class ObservableKt$toMap$1<T, R> implements Function<T, K> {
    public static final ObservableKt$toMap$1 INSTANCE = new ObservableKt$toMap$1();

    ObservableKt$toMap$1() {
    }

    public final A apply(Pair<? extends A, ? extends B> pair) {
        Intrinsics.checkParameterIsNotNull(pair, "it");
        return pair.getFirst();
    }
}
