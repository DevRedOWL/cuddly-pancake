package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.Completable;
import p046io.reactivex.CompletableSource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "apply"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.CompletableKt$mergeAllCompletables$1 */
/* compiled from: completable.kt */
final class CompletableKt$mergeAllCompletables$1<T, R> implements Function<Completable, CompletableSource> {
    public static final CompletableKt$mergeAllCompletables$1 INSTANCE = new CompletableKt$mergeAllCompletables$1();

    CompletableKt$mergeAllCompletables$1() {
    }

    public final Completable apply(Completable completable) {
        Intrinsics.checkParameterIsNotNull(completable, "it");
        return completable;
    }
}
