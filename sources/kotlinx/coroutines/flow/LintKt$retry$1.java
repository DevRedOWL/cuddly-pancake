package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.flow.LintKt$retry$1", mo52053f = "Lint.kt", mo52054i = {}, mo52055l = {}, mo52056m = "invokeSuspend", mo52057n = {}, mo52058s = {})
/* compiled from: Lint.kt */
public final class LintKt$retry$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
    int label;
    private Throwable p$0;

    public LintKt$retry$1(Continuation continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LintKt$retry$1 lintKt$retry$1 = new LintKt$retry$1(continuation);
        lintKt$retry$1.p$0 = (Throwable) obj;
        return lintKt$retry$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LintKt$retry$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable th = this.p$0;
            return Boxing.boxBoolean(true);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
