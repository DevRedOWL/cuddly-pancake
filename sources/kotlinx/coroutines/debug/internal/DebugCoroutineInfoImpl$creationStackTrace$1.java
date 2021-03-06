package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", mo52053f = "DebugCoroutineInfoImpl.kt", mo52054i = {0}, mo52055l = {75}, mo52056m = "invokeSuspend", mo52057n = {"$this$sequence"}, mo52058s = {"L$0"})
/* compiled from: DebugCoroutineInfoImpl.kt */
final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super StackTraceElement>, Continuation<? super Unit>, Object> {
    final /* synthetic */ StackTraceFrame $bottom;
    Object L$0;
    int label;

    /* renamed from: p$ */
    private SequenceScope f6212p$;
    final /* synthetic */ DebugCoroutineInfoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DebugCoroutineInfoImpl$creationStackTrace$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, StackTraceFrame stackTraceFrame, Continuation continuation) {
        super(2, continuation);
        this.this$0 = debugCoroutineInfoImpl;
        this.$bottom = stackTraceFrame;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.this$0, this.$bottom, continuation);
        debugCoroutineInfoImpl$creationStackTrace$1.f6212p$ = (SequenceScope) obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DebugCoroutineInfoImpl$creationStackTrace$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SequenceScope sequenceScope = this.f6212p$;
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = this.this$0;
            CoroutineStackFrame callerFrame = this.$bottom.getCallerFrame();
            this.L$0 = sequenceScope;
            this.label = 1;
            if (debugCoroutineInfoImpl.yieldFrames(sequenceScope, callerFrame, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
