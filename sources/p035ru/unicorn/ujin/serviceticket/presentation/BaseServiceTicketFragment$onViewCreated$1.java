package p035ru.unicorn.ujin.serviceticket.presentation;

import androidx.lifecycle.Observer;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "showAddButton", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.serviceticket.presentation.BaseServiceTicketFragment$onViewCreated$1 */
/* compiled from: BaseServiceTicketFragment.kt */
final class BaseServiceTicketFragment$onViewCreated$1<T> implements Observer<Boolean> {
    final /* synthetic */ BaseServiceTicketFragment this$0;

    BaseServiceTicketFragment$onViewCreated$1(BaseServiceTicketFragment baseServiceTicketFragment) {
        this.this$0 = baseServiceTicketFragment;
    }

    public final void onChanged(Boolean bool) {
        this.this$0.onShowAddButton(bool);
    }
}
