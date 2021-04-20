package p046io.reactivex.rxkotlin;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(mo51341bv = {1, 0, 2}, mo51344k = 3, mo51345mv = {1, 1, 8})
/* renamed from: io.reactivex.rxkotlin.CompletableKt$sam$Callable$d0cf4346 */
/* compiled from: completable.kt */
final class CompletableKt$sam$Callable$d0cf4346 implements Callable {
    private final /* synthetic */ Function0 function;

    CompletableKt$sam$Callable$d0cf4346(Function0 function0) {
        this.function = function0;
    }

    public final /* synthetic */ V call() {
        return this.function.invoke();
    }
}
