package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, mo51343d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", mo52053f = "Delay.kt", mo52054i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, mo52055l = {354, 358}, mo52056m = "invokeSuspend", mo52057n = {"$this$scopedFlow", "downstream", "values", "lastValue", "timeoutMillis", "$this$scopedFlow", "downstream", "values", "lastValue", "timeoutMillis"}, mo52058s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* compiled from: Delay.kt */
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_debounceInternal;
    final /* synthetic */ Function1 $timeoutMillisSelector;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* renamed from: p$ */
    private CoroutineScope f6215p$;
    private FlowCollector p$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$debounceInternal$1(Flow flow, Function1 function1, Continuation continuation) {
        super(3, continuation);
        this.$this_debounceInternal = flow;
        this.$timeoutMillisSelector = function1;
    }

    public final Continuation<Unit> create(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$this_debounceInternal, this.$timeoutMillisSelector, continuation);
        flowKt__DelayKt$debounceInternal$1.f6215p$ = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.p$0 = flowCollector;
        return flowKt__DelayKt$debounceInternal$1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((FlowKt__DelayKt$debounceInternal$1) create((CoroutineScope) obj, (FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:7|29|30|33|(4:35|(1:40)(1:39)|41|(2:43|44))|45|46|47|(6:49|50|51|52|53|54)(1:59)|60|61|66|(1:68)|69|(1:71)(2:72|73)|71) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:49|50|51|52|53|54) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015c, code lost:
        r4 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018f, code lost:
        r8 = r10;
        r19 = r11;
        r20 = r12;
        r4 = r13;
        r21 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0197, code lost:
        r8.handleBuilderException(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0138 A[SYNTHETIC, Splitter:B:49:0x0138] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r4 = 2
            r5 = 0
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x005a
            if (r2 == r7) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r2 = r1.L$5
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1 r2 = (kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1) r2
            java.lang.Object r2 = r1.L$4
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref.LongRef) r2
            java.lang.Object r2 = r1.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref.ObjectRef) r9
            java.lang.Object r10 = r1.L$1
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            kotlin.ResultKt.throwOnFailure(r24)
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r2
            r2 = r0
            r0 = r1
            goto L_0x01b3
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003e:
            java.lang.Object r2 = r1.L$4
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref.LongRef) r2
            java.lang.Object r9 = r1.L$3
            kotlin.jvm.internal.Ref$ObjectRef r9 = (kotlin.jvm.internal.Ref.ObjectRef) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r1.L$1
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
            kotlin.ResultKt.throwOnFailure(r24)
            r13 = r2
            r2 = r0
            r0 = r1
            goto L_0x00dc
        L_0x005a:
            kotlin.ResultKt.throwOnFailure(r24)
            kotlinx.coroutines.CoroutineScope r2 = r1.f6215p$
            kotlinx.coroutines.flow.FlowCollector r9 = r1.p$0
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r14 = 0
            r15 = 0
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 r11 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1
            r11.<init>(r1, r8)
            r16 = r11
            kotlin.jvm.functions.Function2 r16 = (kotlin.jvm.functions.Function2) r16
            r17 = 3
            r18 = 0
            r13 = r2
            kotlinx.coroutines.channels.ReceiveChannel r11 = kotlinx.coroutines.channels.ProduceKt.produce$default(r13, r14, r15, r16, r17, r18)
            r10.element = r11
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            r11.element = r8
            r12 = r2
            r2 = r0
            r0 = r1
            r22 = r11
            r11 = r9
            r9 = r22
        L_0x008b:
            T r13 = r9.element
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            if (r13 == r14) goto L_0x01ba
            kotlin.jvm.internal.Ref$LongRef r13 = new kotlin.jvm.internal.Ref$LongRef
            r13.<init>()
            r13.element = r5
            T r14 = r9.element
            if (r14 == 0) goto L_0x00de
            kotlin.jvm.functions.Function1 r14 = r0.$timeoutMillisSelector
            kotlinx.coroutines.internal.Symbol r15 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            T r3 = r9.element
            if (r3 != r15) goto L_0x00a5
            r3 = r8
        L_0x00a5:
            java.lang.Object r3 = r14.invoke(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            long r14 = r3.longValue()
            r13.element = r14
            long r14 = r13.element
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x00b9
            r3 = 1
            goto L_0x00ba
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            if (r3 == 0) goto L_0x00e6
            long r14 = r13.element
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00de
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            T r14 = r9.element
            if (r14 != r3) goto L_0x00c9
            r14 = r8
        L_0x00c9:
            r0.L$0 = r12
            r0.L$1 = r11
            r0.L$2 = r10
            r0.L$3 = r9
            r0.L$4 = r13
            r0.label = r7
            java.lang.Object r3 = r11.emit(r14, r0)
            if (r3 != r2) goto L_0x00dc
            return r2
        L_0x00dc:
            r9.element = r8
        L_0x00de:
            r3 = r0
            r14 = r11
            r15 = r12
            r0 = r13
            r12 = r2
            r2 = r9
            r13 = r10
            goto L_0x00f4
        L_0x00e6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Debounce timeout should not be negative"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00f4:
            boolean r9 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r9 == 0) goto L_0x011b
            T r9 = r2.element
            if (r9 == 0) goto L_0x0107
            long r9 = r0.element
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x0105
            goto L_0x0107
        L_0x0105:
            r9 = 0
            goto L_0x0108
        L_0x0107:
            r9 = 1
        L_0x0108:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0113
            goto L_0x011b
        L_0x0113:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x011b:
            r3.L$0 = r15
            r3.L$1 = r14
            r3.L$2 = r13
            r3.L$3 = r2
            r3.L$4 = r0
            r3.L$5 = r3
            r3.label = r4
            r11 = r3
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
            kotlinx.coroutines.selects.SelectBuilderImpl r10 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r10.<init>(r11)
            r9 = r10
            kotlinx.coroutines.selects.SelectBuilder r9 = (kotlinx.coroutines.selects.SelectBuilder) r9     // Catch:{ all -> 0x018e }
            T r4 = r2.element     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x0169
            long r5 = r0.element     // Catch:{ all -> 0x015f }
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$invokeSuspend$$inlined$select$lambda$1 r4 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$invokeSuspend$$inlined$select$lambda$1     // Catch:{ all -> 0x015f }
            r19 = 0
            r7 = r9
            r9 = r4
            r8 = r10
            r10 = r19
            r19 = r11
            r11 = r2
            r20 = r12
            r12 = r0
            r24 = r13
            r13 = r14
            r21 = r14
            r14 = r24
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x015b }
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4     // Catch:{ all -> 0x015b }
            r7.onTimeout(r5, r4)     // Catch:{ all -> 0x015b }
            r4 = r24
            goto L_0x0172
        L_0x015b:
            r0 = move-exception
            r4 = r24
            goto L_0x0197
        L_0x015f:
            r0 = move-exception
            r8 = r10
            r19 = r11
            r20 = r12
            r21 = r14
            r4 = r13
            goto L_0x0197
        L_0x0169:
            r7 = r9
            r8 = r10
            r19 = r11
            r20 = r12
            r21 = r14
            r4 = r13
        L_0x0172:
            T r5 = r4.element     // Catch:{ all -> 0x018c }
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5     // Catch:{ all -> 0x018c }
            kotlinx.coroutines.selects.SelectClause1 r5 = r5.getOnReceiveOrNull()     // Catch:{ all -> 0x018c }
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$invokeSuspend$$inlined$select$lambda$2 r6 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$invokeSuspend$$inlined$select$lambda$2     // Catch:{ all -> 0x018c }
            r10 = 0
            r9 = r6
            r11 = r2
            r12 = r0
            r13 = r21
            r14 = r4
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x018c }
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6     // Catch:{ all -> 0x018c }
            r7.invoke(r5, r6)     // Catch:{ all -> 0x018c }
            goto L_0x019a
        L_0x018c:
            r0 = move-exception
            goto L_0x0197
        L_0x018e:
            r0 = move-exception
            r8 = r10
            r19 = r11
            r20 = r12
            r4 = r13
            r21 = r14
        L_0x0197:
            r8.handleBuilderException(r0)
        L_0x019a:
            java.lang.Object r0 = r8.getResult()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r5) goto L_0x01a7
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r19)
        L_0x01a7:
            r5 = r20
            if (r0 != r5) goto L_0x01ac
            return r5
        L_0x01ac:
            r9 = r2
            r0 = r3
            r10 = r4
            r2 = r5
            r12 = r15
            r11 = r21
        L_0x01b3:
            r4 = 2
            r5 = 0
            r7 = 1
            r8 = 0
            goto L_0x008b
        L_0x01ba:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
