package p033co.infinum.goldeneye.extensions;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "T", "run"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.AnyKt$async$1 */
/* compiled from: Any.kt */
final class AnyKt$async$1 implements Runnable {
    final /* synthetic */ Function1 $onResult;
    final /* synthetic */ Function0 $task;

    AnyKt$async$1(Function0 function0, Function1 function1) {
        this.$task = function0;
        this.$onResult = function1;
    }

    public final void run() {
        final Object invoke = this.$task.invoke();
        AnyKt.getMAIN_HANDLER().post(new Runnable(this) {
            final /* synthetic */ AnyKt$async$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                this.this$0.$onResult.invoke(invoke);
            }
        });
    }
}
