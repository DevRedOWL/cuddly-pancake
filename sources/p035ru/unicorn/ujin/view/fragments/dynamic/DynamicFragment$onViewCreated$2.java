package p035ru.unicorn.ujin.view.fragments.dynamic;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment$onViewCreated$2 */
/* compiled from: DynamicFragment.kt */
final class DynamicFragment$onViewCreated$2<T> implements Observer<DynamicFormEvent> {
    final /* synthetic */ DynamicFragment this$0;

    DynamicFragment$onViewCreated$2(DynamicFragment dynamicFragment) {
        this.this$0 = dynamicFragment;
    }

    public final void onChanged(DynamicFormEvent dynamicFormEvent) {
        DynamicFragment dynamicFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(dynamicFormEvent, "event");
        dynamicFragment.handleEvent(dynamicFormEvent);
    }
}
