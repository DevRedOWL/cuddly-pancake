package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, mo51343d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo51344k = 1, mo51345mv = {1, 4, 0})
/* compiled from: Collect.kt */
public final class FlowKt__ReduceKt$single$$inlined$collect$1 implements FlowCollector<T> {
    final /* synthetic */ Ref.ObjectRef $result$inlined;

    public FlowKt__ReduceKt$single$$inlined$collect$1(Ref.ObjectRef objectRef) {
        this.$result$inlined = objectRef;
    }

    public Object emit(Object obj, Continuation continuation) {
        if (this.$result$inlined.element == NullSurrogateKt.NULL) {
            this.$result$inlined.element = obj;
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Flow has more than one element".toString());
    }
}