package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, mo51343d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "count", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", mo52053f = "SharingStarted.kt", mo52054i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, mo52055l = {179, 181, 183, 184, 186}, mo52056m = "invokeSuspend", mo52057n = {"$this$transformLatest", "count", "$this$transformLatest", "count", "$this$transformLatest", "count", "$this$transformLatest", "count", "$this$transformLatest", "count"}, mo52058s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
/* compiled from: SharingStarted.kt */
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements Function3<FlowCollector<? super SharingCommand>, Integer, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    int label;

    /* renamed from: p$ */
    private FlowCollector f6259p$;
    private int p$0;
    final /* synthetic */ StartedWhileSubscribed this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, Continuation continuation) {
        super(3, continuation);
        this.this$0 = startedWhileSubscribed;
    }

    public final Continuation<Unit> create(FlowCollector<? super SharingCommand> flowCollector, int i, Continuation<? super Unit> continuation) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, continuation);
        startedWhileSubscribed$command$1.f6259p$ = flowCollector;
        startedWhileSubscribed$command$1.p$0 = i;
        return startedWhileSubscribed$command$1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((StartedWhileSubscribed$command$1) create((FlowCollector) obj, ((Number) obj2).intValue(), (Continuation) obj3)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 == r6) goto L_0x0042
            if (r1 == r5) goto L_0x0037
            if (r1 == r4) goto L_0x002c
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            goto L_0x0042
        L_0x0018:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0020:
            int r1 = r10.I$0
            java.lang.Object r3 = r10.L$0
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r3
            goto L_0x00a5
        L_0x002c:
            int r1 = r10.I$0
            java.lang.Object r4 = r10.L$0
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r4
            goto L_0x0092
        L_0x0037:
            int r1 = r10.I$0
            java.lang.Object r5 = r10.L$0
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r5
            goto L_0x0077
        L_0x0042:
            int r0 = r10.I$0
            java.lang.Object r0 = r10.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00b4
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlinx.coroutines.flow.FlowCollector r11 = r10.f6259p$
            int r1 = r10.p$0
            if (r1 <= 0) goto L_0x0064
            kotlinx.coroutines.flow.SharingCommand r2 = kotlinx.coroutines.flow.SharingCommand.START
            r10.L$0 = r11
            r10.I$0 = r1
            r10.label = r6
            java.lang.Object r11 = r11.emit(r2, r10)
            if (r11 != r0) goto L_0x00b4
            return r0
        L_0x0064:
            kotlinx.coroutines.flow.StartedWhileSubscribed r6 = r10.this$0
            long r6 = r6.stopTimeout
            r10.L$0 = r11
            r10.I$0 = r1
            r10.label = r5
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.delay(r6, r10)
            if (r5 != r0) goto L_0x0077
            return r0
        L_0x0077:
            kotlinx.coroutines.flow.StartedWhileSubscribed r5 = r10.this$0
            long r5 = r5.replayExpiration
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00a5
            kotlinx.coroutines.flow.SharingCommand r5 = kotlinx.coroutines.flow.SharingCommand.STOP
            r10.L$0 = r11
            r10.I$0 = r1
            r10.label = r4
            java.lang.Object r4 = r11.emit(r5, r10)
            if (r4 != r0) goto L_0x0092
            return r0
        L_0x0092:
            kotlinx.coroutines.flow.StartedWhileSubscribed r4 = r10.this$0
            long r4 = r4.replayExpiration
            r10.L$0 = r11
            r10.I$0 = r1
            r10.label = r3
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r4, r10)
            if (r3 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            kotlinx.coroutines.flow.SharingCommand r3 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r10.L$0 = r11
            r10.I$0 = r1
            r10.label = r2
            java.lang.Object r11 = r11.emit(r3, r10)
            if (r11 != r0) goto L_0x00b4
            return r0
        L_0x00b4:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
