package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/CreateTicket;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.RateTicketDialog$onViewCreated$2 */
/* compiled from: RateTicketDialog.kt */
final class RateTicketDialog$onViewCreated$2<T> implements Observer<Resource<CreateTicket>> {
    final /* synthetic */ RateTicketDialog this$0;

    RateTicketDialog$onViewCreated$2(RateTicketDialog rateTicketDialog) {
        this.this$0 = rateTicketDialog;
    }

    public final void onChanged(Resource<CreateTicket> resource) {
        this.this$0.handleEvaluateTicket(resource);
    }
}
