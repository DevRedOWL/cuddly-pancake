package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B6\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012'\u0010\u0004\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002R/\u0010\u0004\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo51343d2 = {"Lkotlinx/coroutines/InvokeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/Job;", "job", "handler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlinx/coroutines/Job;Lkotlin/jvm/functions/Function1;)V", "invoke", "kotlinx-coroutines-core"}, mo51344k = 1, mo51345mv = {1, 4, 0})
/* compiled from: JobSupport.kt */
final class InvokeOnCompletion extends JobNode<Job> {
    private final Function1<Throwable, Unit> handler;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public InvokeOnCompletion(Job job, Function1<? super Throwable, Unit> function1) {
        super(job);
        this.handler = function1;
    }

    public void invoke(Throwable th) {
        this.handler.invoke(th);
    }
}
