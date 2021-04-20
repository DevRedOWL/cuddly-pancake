package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H@"}, mo51343d2 = {"single", "", "T", "Lkotlinx/coroutines/flow/Flow;", "continuation", "Lkotlin/coroutines/Continuation;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", mo52053f = "Reduce.kt", mo52054i = {0, 0, 0}, mo52055l = {154}, mo52056m = "single", mo52057n = {"$this$single", "result", "$this$collect$iv"}, mo52058s = {"L$0", "L$1", "L$2"})
/* compiled from: Reduce.kt */
final class FlowKt__ReduceKt$single$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    FlowKt__ReduceKt$single$1(Continuation continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt.single((Flow) null, this);
    }
}
