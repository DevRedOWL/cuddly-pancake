package org.jetbrains.anko.coroutines.experimental;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.experimental.Continuation;
import kotlin.coroutines.experimental.intrinsics.IntrinsicsKt;
import kotlin.coroutines.experimental.jvm.internal.CoroutineImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.experimental.CoroutineScope;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo51343d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/experimental/CoroutineScope;", "invoke", "(Lkotlinx/coroutines/experimental/CoroutineScope;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 1, 5})
/* compiled from: bg.kt */
public final class BgKt$bg$1 extends CoroutineImpl implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function0 $block;

    /* renamed from: p$ */
    private CoroutineScope f6311p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BgKt$bg$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    public final Continuation<Unit> create(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        Intrinsics.checkParameterIsNotNull(coroutineScope, "$receiver");
        Intrinsics.checkParameterIsNotNull(continuation, "$continuation");
        BgKt$bg$1 bgKt$bg$1 = new BgKt$bg$1(this.$block, continuation);
        bgKt$bg$1.f6311p$ = coroutineScope;
        return bgKt$bg$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        Intrinsics.checkParameterIsNotNull(coroutineScope, "$receiver");
        Intrinsics.checkParameterIsNotNull(continuation, "$continuation");
        return create(coroutineScope, continuation).doResume(Unit.INSTANCE, (Throwable) null);
    }

    public final Object doResume(Object obj, Throwable th) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else if (th == null) {
            CoroutineScope coroutineScope = this.f6311p$;
            return this.$block.invoke();
        } else {
            throw th;
        }
    }
}
