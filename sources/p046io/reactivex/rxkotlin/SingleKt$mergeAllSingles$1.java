package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.Single;
import p046io.reactivex.SingleSource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/Single;", "T", "", "it", "apply"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.SingleKt$mergeAllSingles$1 */
/* compiled from: single.kt */
final class SingleKt$mergeAllSingles$1<T, R> implements Function<T, SingleSource<? extends R>> {
    public static final SingleKt$mergeAllSingles$1 INSTANCE = new SingleKt$mergeAllSingles$1();

    SingleKt$mergeAllSingles$1() {
    }

    public final Single<T> apply(Single<T> single) {
        Intrinsics.checkParameterIsNotNull(single, "it");
        return single;
    }
}
