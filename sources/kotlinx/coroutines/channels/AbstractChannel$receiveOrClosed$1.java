package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H@"}, mo51343d2 = {"receiveOrClosed", "", "E", "continuation", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/channels/ValueOrClosed;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.channels.AbstractChannel", mo52053f = "AbstractChannel.kt", mo52054i = {0, 0}, mo52055l = {624}, mo52056m = "receiveOrClosed-ZYPwvRU", mo52057n = {"this", "result"}, mo52058s = {"L$0", "L$1"})
/* compiled from: AbstractChannel.kt */
final class AbstractChannel$receiveOrClosed$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractChannel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AbstractChannel$receiveOrClosed$1(AbstractChannel abstractChannel, Continuation continuation) {
        super(continuation);
        this.this$0 = abstractChannel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m8271receiveOrClosedZYPwvRU(this);
    }
}
