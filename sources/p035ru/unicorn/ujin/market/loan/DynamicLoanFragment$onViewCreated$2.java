package p035ru.unicorn.ujin.market.loan;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFormEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormEvent;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.loan.DynamicLoanFragment$onViewCreated$2 */
/* compiled from: DynamicLoanFragment.kt */
final class DynamicLoanFragment$onViewCreated$2<T> implements Observer<DynamicFormEvent> {
    final /* synthetic */ DynamicLoanFragment this$0;

    DynamicLoanFragment$onViewCreated$2(DynamicLoanFragment dynamicLoanFragment) {
        this.this$0 = dynamicLoanFragment;
    }

    public final void onChanged(DynamicFormEvent dynamicFormEvent) {
        DynamicLoanFragment dynamicLoanFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(dynamicFormEvent, "event");
        dynamicLoanFragment.handleEvent(dynamicFormEvent);
    }
}
