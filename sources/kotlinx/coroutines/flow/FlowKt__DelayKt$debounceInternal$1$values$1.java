package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", mo52053f = "Delay.kt", mo52054i = {0, 0}, mo52055l = {352}, mo52056m = "invokeSuspend", mo52057n = {"$this$produce", "$this$collect$iv"}, mo52058s = {"L$0", "L$1"})
/* compiled from: Delay.kt */
final class FlowKt__DelayKt$debounceInternal$1$values$1 extends SuspendLambda implements Function2<ProducerScope<? super Object>, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;

    /* renamed from: p$ */
    private ProducerScope f6216p$;
    final /* synthetic */ FlowKt__DelayKt$debounceInternal$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$debounceInternal$1$values$1(FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = flowKt__DelayKt$debounceInternal$1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.this$0, continuation);
        flowKt__DelayKt$debounceInternal$1$values$1.f6216p$ = (ProducerScope) obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = this.f6216p$;
            Flow flow = this.this$0.$this_debounceInternal;
            this.L$0 = producerScope;
            this.L$1 = flow;
            this.label = 1;
            if (flow.collect(new C4915xec8ab92d(producerScope), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            Flow flow2 = (Flow) this.L$1;
            ProducerScope producerScope2 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
