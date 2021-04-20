package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, mo51343d2 = {"<anonymous>", "", "T", "C", "R", "Lkotlin/sequences/SequenceScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 4, 0})
@DebugMetadata(mo52052c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", mo52053f = "Sequences.kt", mo52054i = {0, 0, 0, 0}, mo52055l = {332}, mo52056m = "invokeSuspend", mo52057n = {"$this$sequence", "index", "element", "result"}, mo52058s = {"L$0", "I$0", "L$1", "L$3"})
/* compiled from: Sequences.kt */
final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 $iterator;
    final /* synthetic */ Sequence $source;
    final /* synthetic */ Function2 $transform;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* renamed from: p$ */
    private SequenceScope f6182p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequencesKt__SequencesKt$flatMapIndexed$1(Sequence sequence, Function2 function2, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$source = sequence;
        this.$transform = function2;
        this.$iterator = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, continuation);
        sequencesKt__SequencesKt$flatMapIndexed$1.f6182p$ = (SequenceScope) obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1;
        SequenceScope sequenceScope;
        Object obj2;
        Iterator it;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = this.f6182p$;
            it = this.$source.iterator();
            sequencesKt__SequencesKt$flatMapIndexed$1 = this;
            obj2 = coroutine_suspended;
            i = 0;
        } else if (i2 == 1) {
            Object obj3 = this.L$3;
            it = (Iterator) this.L$2;
            Object obj4 = this.L$1;
            int i3 = this.I$0;
            sequenceScope = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            sequencesKt__SequencesKt$flatMapIndexed$1 = this;
            int i4 = i3;
            obj2 = coroutine_suspended;
            i = i4;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            Object next = it.next();
            Function2 function2 = sequencesKt__SequencesKt$flatMapIndexed$1.$transform;
            int i5 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object invoke = function2.invoke(Boxing.boxInt(i), next);
            sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = sequenceScope;
            sequencesKt__SequencesKt$flatMapIndexed$1.I$0 = i5;
            sequencesKt__SequencesKt$flatMapIndexed$1.L$1 = next;
            sequencesKt__SequencesKt$flatMapIndexed$1.L$2 = it;
            sequencesKt__SequencesKt$flatMapIndexed$1.L$3 = invoke;
            sequencesKt__SequencesKt$flatMapIndexed$1.label = 1;
            if (sequenceScope.yieldAll((Iterator) sequencesKt__SequencesKt$flatMapIndexed$1.$iterator.invoke(invoke), (Continuation<? super Unit>) sequencesKt__SequencesKt$flatMapIndexed$1) == obj2) {
                return obj2;
            }
            i = i5;
        }
        return Unit.INSTANCE;
    }
}
