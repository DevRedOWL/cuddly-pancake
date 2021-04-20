package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import p046io.reactivex.Flowable;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "T", "", "it", "apply"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.FlowableKt$concatAll$1 */
/* compiled from: flowable.kt */
final class FlowableKt$concatAll$1<T, R> implements Function<T, Publisher<? extends R>> {
    public static final FlowableKt$concatAll$1 INSTANCE = new FlowableKt$concatAll$1();

    FlowableKt$concatAll$1() {
    }

    public final Flowable<T> apply(Flowable<T> flowable) {
        Intrinsics.checkParameterIsNotNull(flowable, "it");
        return flowable;
    }
}
