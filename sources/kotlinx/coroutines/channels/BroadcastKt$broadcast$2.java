package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", mo52053f = "Broadcast.kt", mo52054i = {0, 1, 1}, mo52055l = {51, 52}, mo52056m = "invokeSuspend", mo52057n = {"$this$broadcast", "$this$broadcast", "e"}, mo52058s = {"L$0", "L$0", "L$1"})
/* compiled from: Broadcast.kt */
final class BroadcastKt$broadcast$2 extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel $this_broadcast;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* renamed from: p$ */
    private ProducerScope f6195p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BroadcastKt$broadcast$2(ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.$this_broadcast = receiveChannel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new BroadcastKt$broadcast$2(this.$this_broadcast, continuation);
        broadcastKt$broadcast$2.f6195p$ = (ProducerScope) obj;
        return broadcastKt$broadcast$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((BroadcastKt$broadcast$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r3) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            java.lang.Object r1 = r7.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.L$1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r6 = r4
            r4 = r0
            r0 = r6
            goto L_0x0044
        L_0x0020:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0028:
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlin.ResultKt.throwOnFailure(r8)
            r5 = r0
            r0 = r7
            goto L_0x0056
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.channels.ProducerScope r8 = r7.f6195p$
            kotlinx.coroutines.channels.ReceiveChannel r1 = r7.$this_broadcast
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            r4 = r0
            r0 = r8
            r8 = r7
        L_0x0044:
            r8.L$0 = r0
            r8.L$1 = r1
            r8.label = r3
            java.lang.Object r5 = r1.hasNext(r8)
            if (r5 != r4) goto L_0x0051
            return r4
        L_0x0051:
            r6 = r0
            r0 = r8
            r8 = r5
            r5 = r4
            r4 = r6
        L_0x0056:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0075
            java.lang.Object r8 = r1.next()
            r0.L$0 = r4
            r0.L$1 = r8
            r0.L$2 = r1
            r0.label = r2
            java.lang.Object r8 = r4.send(r8, r0)
            if (r8 != r5) goto L_0x0071
            return r5
        L_0x0071:
            r8 = r0
            r0 = r4
            r4 = r5
            goto L_0x0044
        L_0x0075:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastKt$broadcast$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
