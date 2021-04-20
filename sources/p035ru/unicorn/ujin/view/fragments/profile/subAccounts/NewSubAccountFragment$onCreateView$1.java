package p035ru.unicorn.ujin.view.fragments.profile.subAccounts;

import androidx.lifecycle.Observer;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "loading", "", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.NewSubAccountFragment$onCreateView$1 */
/* compiled from: NewSubAccountFragment.kt */
final class NewSubAccountFragment$onCreateView$1<T> implements Observer<Boolean> {
    final /* synthetic */ NewSubAccountFragment this$0;

    NewSubAccountFragment$onCreateView$1(NewSubAccountFragment newSubAccountFragment) {
        this.this$0 = newSubAccountFragment;
    }

    public final void onChanged(Boolean bool) {
        this.this$0.handleLoadingProcess(bool);
    }
}
