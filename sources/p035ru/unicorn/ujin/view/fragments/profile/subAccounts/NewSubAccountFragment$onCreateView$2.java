package p035ru.unicorn.ujin.view.fragments.profile.subAccounts;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.subAccounts.NewSubAccountFragment$onCreateView$2 */
/* compiled from: NewSubAccountFragment.kt */
final class NewSubAccountFragment$onCreateView$2<T> implements Observer<UpdateEvent> {
    final /* synthetic */ NewSubAccountFragment this$0;

    NewSubAccountFragment$onCreateView$2(NewSubAccountFragment newSubAccountFragment) {
        this.this$0 = newSubAccountFragment;
    }

    public final void onChanged(UpdateEvent updateEvent) {
        this.this$0.handleAddEvent(updateEvent);
    }
}
