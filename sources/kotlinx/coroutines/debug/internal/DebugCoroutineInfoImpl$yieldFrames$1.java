package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.sequences.SequenceScope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HP"}, mo51343d2 = {"yieldFrames", "", "Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;", "frame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", mo52053f = "DebugCoroutineInfoImpl.kt", mo52054i = {0, 0, 0, 0}, mo52055l = {80}, mo52056m = "yieldFrames", mo52057n = {"this", "$this$yieldFrames", "frame", "it"}, mo52058s = {"L$0", "L$1", "L$2", "L$3"})
/* compiled from: DebugCoroutineInfoImpl.kt */
final class DebugCoroutineInfoImpl$yieldFrames$1 extends RestrictedContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DebugCoroutineInfoImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DebugCoroutineInfoImpl$yieldFrames$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = debugCoroutineInfoImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.yieldFrames((SequenceScope<? super StackTraceElement>) null, (CoroutineStackFrame) null, this);
    }
}
