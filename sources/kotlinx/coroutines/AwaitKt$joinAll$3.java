package kotlinx.coroutines;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, mo51343d2 = {"joinAll", "", "", "Lkotlinx/coroutines/Job;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.AwaitKt", mo52053f = "Await.kt", mo52054i = {0, 0, 0, 0}, mo52055l = {67}, mo52056m = "joinAll", mo52057n = {"$this$joinAll", "$this$forEach$iv", "element$iv", "it"}, mo52058s = {"L$0", "L$1", "L$3", "L$4"})
/* compiled from: Await.kt */
final class AwaitKt$joinAll$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    AwaitKt$joinAll$3(Continuation continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AwaitKt.joinAll((Collection<? extends Job>) null, (Continuation<? super Unit>) this);
    }
}