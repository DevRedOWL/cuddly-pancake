package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1", mo52053f = "Channels.common.kt", mo52054i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, mo52055l = {2196, 1395, 1395}, mo52056m = "invokeSuspend", mo52057n = {"$this$produce", "$this$consumeEach$iv", "$this$consume$iv$iv", "cause$iv$iv", "$this$consume$iv", "$this$produce", "$this$consumeEach$iv", "$this$consume$iv$iv", "cause$iv$iv", "$this$consume$iv", "e$iv", "it", "$this$produce", "$this$consumeEach$iv", "$this$consume$iv$iv", "cause$iv$iv", "$this$consume$iv", "e$iv", "it"}, mo52058s = {"L$0", "L$1", "L$3", "L$4", "L$5", "L$0", "L$1", "L$3", "L$4", "L$5", "L$7", "L$8", "L$0", "L$1", "L$3", "L$4", "L$5", "L$7", "L$8"})
/* compiled from: Channels.common.kt */
final class ChannelsKt__Channels_commonKt$map$1 extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel $this_map;
    final /* synthetic */ Function2 $transform;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* renamed from: p$ */
    private ProducerScope f6204p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChannelsKt__Channels_commonKt$map$1(ReceiveChannel receiveChannel, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$this_map = receiveChannel;
        this.$transform = function2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__Channels_commonKt$map$1 channelsKt__Channels_commonKt$map$1 = new ChannelsKt__Channels_commonKt$map$1(this.$this_map, this.$transform, continuation);
        channelsKt__Channels_commonKt$map$1.f6204p$ = (ProducerScope) obj;
        return channelsKt__Channels_commonKt$map$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__Channels_commonKt$map$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e9 A[Catch:{ all -> 0x0143 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0133 A[Catch:{ all -> 0x0143 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x00a9
            if (r2 == r5) goto L_0x0083
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r2 = r1.L$8
            java.lang.Object r2 = r1.L$7
            java.lang.Object r2 = r1.L$6
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r1.L$5
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r1.L$4
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r8 = r1.L$3
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r1.L$2
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1 r9 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1) r9
            java.lang.Object r10 = r1.L$1
            kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
            kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ all -> 0x0143 }
            r12 = r0
            r0 = r9
            r9 = r7
            r7 = r11
            r11 = r6
            r6 = r1
            goto L_0x0139
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            java.lang.Object r2 = r1.L$9
            kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
            java.lang.Object r6 = r1.L$8
            java.lang.Object r7 = r1.L$7
            java.lang.Object r8 = r1.L$6
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            java.lang.Object r9 = r1.L$5
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r10 = r1.L$4
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            java.lang.Object r11 = r1.L$3
            kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
            java.lang.Object r12 = r1.L$2
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1 r12 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1) r12
            java.lang.Object r13 = r1.L$1
            kotlinx.coroutines.channels.ReceiveChannel r13 = (kotlinx.coroutines.channels.ReceiveChannel) r13
            java.lang.Object r14 = r1.L$0
            kotlinx.coroutines.channels.ProducerScope r14 = (kotlinx.coroutines.channels.ProducerScope) r14
            kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ all -> 0x007e }
            r4 = r0
            r15 = r6
            r0 = r9
            r6 = r1
            r9 = r8
            r8 = r11
            r11 = r14
            r14 = r18
            r16 = r13
            r13 = r7
            r7 = r10
            r10 = r16
            goto L_0x0118
        L_0x007e:
            r0 = move-exception
            r2 = r0
            r8 = r11
            goto L_0x0145
        L_0x0083:
            java.lang.Object r2 = r1.L$6
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r1.L$5
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r1.L$4
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r8 = r1.L$3
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r1.L$2
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1 r9 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1) r9
            java.lang.Object r10 = r1.L$1
            kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
            kotlin.ResultKt.throwOnFailure(r18)     // Catch:{ all -> 0x0143 }
            r13 = r18
            r12 = r9
            r9 = r0
            r0 = r6
            r6 = r1
            goto L_0x00e1
        L_0x00a9:
            kotlin.ResultKt.throwOnFailure(r18)
            kotlinx.coroutines.channels.ProducerScope r2 = r1.f6204p$
            kotlinx.coroutines.channels.ReceiveChannel r8 = r1.$this_map
            r6 = 0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlinx.coroutines.channels.ChannelIterator r7 = r8.iterator()     // Catch:{ all -> 0x0143 }
            r12 = r0
            r0 = r1
            r9 = r6
            r10 = r8
            r11 = r10
            r6 = r0
            r16 = r7
            r7 = r2
            r2 = r16
        L_0x00c2:
            r6.L$0 = r7     // Catch:{ all -> 0x0143 }
            r6.L$1 = r10     // Catch:{ all -> 0x0143 }
            r6.L$2 = r0     // Catch:{ all -> 0x0143 }
            r6.L$3 = r8     // Catch:{ all -> 0x0143 }
            r6.L$4 = r9     // Catch:{ all -> 0x0143 }
            r6.L$5 = r11     // Catch:{ all -> 0x0143 }
            r6.L$6 = r2     // Catch:{ all -> 0x0143 }
            r6.label = r5     // Catch:{ all -> 0x0143 }
            java.lang.Object r13 = r2.hasNext(r0)     // Catch:{ all -> 0x0143 }
            if (r13 != r12) goto L_0x00d9
            return r12
        L_0x00d9:
            r16 = r12
            r12 = r0
            r0 = r11
            r11 = r7
            r7 = r9
            r9 = r16
        L_0x00e1:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x0143 }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x0143 }
            if (r13 == 0) goto L_0x013b
            java.lang.Object r13 = r2.next()     // Catch:{ all -> 0x0143 }
            kotlin.jvm.functions.Function2 r14 = r6.$transform     // Catch:{ all -> 0x0143 }
            r6.L$0 = r11     // Catch:{ all -> 0x0143 }
            r6.L$1 = r10     // Catch:{ all -> 0x0143 }
            r6.L$2 = r12     // Catch:{ all -> 0x0143 }
            r6.L$3 = r8     // Catch:{ all -> 0x0143 }
            r6.L$4 = r7     // Catch:{ all -> 0x0143 }
            r6.L$5 = r0     // Catch:{ all -> 0x0143 }
            r6.L$6 = r2     // Catch:{ all -> 0x0143 }
            r6.L$7 = r13     // Catch:{ all -> 0x0143 }
            r6.L$8 = r13     // Catch:{ all -> 0x0143 }
            r6.L$9 = r11     // Catch:{ all -> 0x0143 }
            r6.label = r4     // Catch:{ all -> 0x0143 }
            r15 = 6
            kotlin.jvm.internal.InlineMarker.mark((int) r15)     // Catch:{ all -> 0x0143 }
            java.lang.Object r14 = r14.invoke(r13, r6)     // Catch:{ all -> 0x0143 }
            r15 = 7
            kotlin.jvm.internal.InlineMarker.mark((int) r15)     // Catch:{ all -> 0x0143 }
            if (r14 != r9) goto L_0x0114
            return r9
        L_0x0114:
            r4 = r9
            r15 = r13
            r9 = r2
            r2 = r11
        L_0x0118:
            r6.L$0 = r11     // Catch:{ all -> 0x0143 }
            r6.L$1 = r10     // Catch:{ all -> 0x0143 }
            r6.L$2 = r12     // Catch:{ all -> 0x0143 }
            r6.L$3 = r8     // Catch:{ all -> 0x0143 }
            r6.L$4 = r7     // Catch:{ all -> 0x0143 }
            r6.L$5 = r0     // Catch:{ all -> 0x0143 }
            r6.L$6 = r9     // Catch:{ all -> 0x0143 }
            r6.L$7 = r13     // Catch:{ all -> 0x0143 }
            r6.L$8 = r15     // Catch:{ all -> 0x0143 }
            r6.label = r3     // Catch:{ all -> 0x0143 }
            java.lang.Object r2 = r2.send(r14, r6)     // Catch:{ all -> 0x0143 }
            if (r2 != r4) goto L_0x0133
            return r4
        L_0x0133:
            r2 = r9
            r9 = r7
            r7 = r11
            r11 = r0
            r0 = r12
            r12 = r4
        L_0x0139:
            r4 = 2
            goto L_0x00c2
        L_0x013b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0143 }
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0143:
            r0 = move-exception
            r2 = r0
        L_0x0145:
            throw r2     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r0 = move-exception
            r3 = r0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$map$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
