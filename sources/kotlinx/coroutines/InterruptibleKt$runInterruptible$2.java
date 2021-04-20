package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo51343d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", mo52053f = "Interruptible.kt", mo52054i = {}, mo52055l = {}, mo52056m = "invokeSuspend", mo52057n = {}, mo52058s = {})
/* compiled from: Interruptible.kt */
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function0 $block;
    int label;

    /* renamed from: p$ */
    private CoroutineScope f6193p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InterruptibleKt$runInterruptible$2(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.$block, continuation);
        interruptibleKt$runInterruptible$2.f6193p$ = (CoroutineScope) obj;
        return interruptibleKt$runInterruptible$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((InterruptibleKt$runInterruptible$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return InterruptibleKt.runInterruptibleInExpectedContext(this.f6193p$.getCoroutineContext(), this.$block);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
