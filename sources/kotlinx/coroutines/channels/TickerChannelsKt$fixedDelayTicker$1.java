package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH@"}, mo51343d2 = {"fixedDelayTicker", "", "delayMillis", "", "initialDelayMillis", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "", "continuation", "Lkotlin/coroutines/Continuation;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.channels.TickerChannelsKt", mo52053f = "TickerChannels.kt", mo52054i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, mo52055l = {106, 108, 109}, mo52056m = "fixedDelayTicker", mo52057n = {"delayMillis", "initialDelayMillis", "channel", "delayMillis", "initialDelayMillis", "channel", "delayMillis", "initialDelayMillis", "channel"}, mo52058s = {"J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0"})
/* compiled from: TickerChannels.kt */
final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    TickerChannelsKt$fixedDelayTicker$1(Continuation continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TickerChannelsKt.fixedDelayTicker(0, 0, (SendChannel<? super Unit>) null, this);
    }
}
