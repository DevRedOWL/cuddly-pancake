package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", mo52053f = "Migration.kt", mo52054i = {0}, mo52055l = {411}, mo52056m = "invokeSuspend", mo52057n = {"$this$onStart"}, mo52058s = {"L$0"})
/* compiled from: Migration.kt */
final class FlowKt__MigrationKt$delayFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $timeMillis;
    Object L$0;
    int label;

    /* renamed from: p$ */
    private FlowCollector f6228p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowKt__MigrationKt$delayFlow$1(long j, Continuation continuation) {
        super(2, continuation);
        this.$timeMillis = j;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowKt__MigrationKt$delayFlow$1 flowKt__MigrationKt$delayFlow$1 = new FlowKt__MigrationKt$delayFlow$1(this.$timeMillis, continuation);
        flowKt__MigrationKt$delayFlow$1.f6228p$ = (FlowCollector) obj;
        return flowKt__MigrationKt$delayFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__MigrationKt$delayFlow$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = this.f6228p$;
            long j = this.$timeMillis;
            this.L$0 = flowCollector;
            this.label = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
