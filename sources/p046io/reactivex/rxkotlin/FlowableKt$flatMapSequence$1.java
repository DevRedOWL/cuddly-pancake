package p046io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.reactivestreams.Publisher;
import p046io.reactivex.Flowable;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "R", "T", "", "it", "apply", "(Ljava/lang/Object;)Lio/reactivex/Flowable;"}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.FlowableKt$flatMapSequence$1 */
/* compiled from: flowable.kt */
public final class FlowableKt$flatMapSequence$1<T, R> implements Function<T, Publisher<? extends R>> {
    final /* synthetic */ Function1 $body;

    public FlowableKt$flatMapSequence$1(Function1 function1) {
        this.$body = function1;
    }

    public final Flowable<R> apply(T t) {
        Intrinsics.checkParameterIsNotNull(t, "it");
        return FlowableKt.toFlowable((Sequence) this.$body.invoke(t));
    }
}
