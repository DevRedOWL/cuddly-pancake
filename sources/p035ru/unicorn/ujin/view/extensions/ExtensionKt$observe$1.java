package p035ru.unicorn.ujin.view.extensions;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "T", "event", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Object;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.extensions.ExtensionKt$observe$1 */
/* compiled from: extension.kt */
final class ExtensionKt$observe$1<T> implements Observer<T> {
    final /* synthetic */ Function1 $eventCallBack;

    ExtensionKt$observe$1(Function1 function1) {
        this.$eventCallBack = function1;
    }

    public final void onChanged(T t) {
        if (t != null) {
            this.$eventCallBack.invoke(t);
        }
    }
}
