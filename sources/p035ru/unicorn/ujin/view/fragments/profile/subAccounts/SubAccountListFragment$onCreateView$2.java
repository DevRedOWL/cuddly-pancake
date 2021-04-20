package p035ru.unicorn.ujin.view.fragments.profile.subAccounts;

import androidx.lifecycle.Observer;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/view/fragments/profile/subAccounts/SubAccountEvent;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment$onCreateView$2 */
/* compiled from: SubAccountListFragment.kt */
final class SubAccountListFragment$onCreateView$2<T> implements Observer<SubAccountEvent> {
    final /* synthetic */ SubAccountListFragment this$0;

    SubAccountListFragment$onCreateView$2(SubAccountListFragment subAccountListFragment) {
        this.this$0 = subAccountListFragment;
    }

    public final void onChanged(SubAccountEvent subAccountEvent) {
        this.this$0.handleSubAccountList(subAccountEvent);
    }
}
