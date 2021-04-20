package p035ru.unicorn.ujin.market.loan;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFormEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b¨\u0006\n"}, mo51343d2 = {"<anonymous>", "", "liveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "", "handleAction", "", "invoke", "ru/unicorn/ujin/market/loan/DynamicLoanFragment$handleEvent$1$1$fieldList$1", "ru/unicorn/ujin/market/loan/DynamicLoanFragment$$special$$inlined$let$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.loan.DynamicLoanFragment$handleEvent$$inlined$apply$lambda$1 */
/* compiled from: DynamicLoanFragment.kt */
final class DynamicLoanFragment$handleEvent$$inlined$apply$lambda$1 extends Lambda implements Function2<SingleLiveEvent<Resource<Object>>, String, Unit> {
    final /* synthetic */ DynamicFormEvent $event$inlined;
    final /* synthetic */ RecyclerView $this_apply$inlined;
    final /* synthetic */ DynamicLoanFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DynamicLoanFragment$handleEvent$$inlined$apply$lambda$1(RecyclerView recyclerView, DynamicLoanFragment dynamicLoanFragment, DynamicFormEvent dynamicFormEvent) {
        super(2);
        this.$this_apply$inlined = recyclerView;
        this.this$0 = dynamicLoanFragment;
        this.$event$inlined = dynamicFormEvent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((SingleLiveEvent<Resource<Object>>) (SingleLiveEvent) obj, (String) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(SingleLiveEvent<Resource<Object>> singleLiveEvent, String str) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "liveData");
        Intrinsics.checkNotNullParameter(str, "handleAction");
        this.this$0.handleApiCallV1(singleLiveEvent, str);
    }
}
