package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceTicket;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$onViewCreated$3 */
/* compiled from: MorionServiceTicketFragment.kt */
final class MorionServiceTicketFragment$onViewCreated$3<T> implements Observer<Resource<ServiceTicket>> {
    final /* synthetic */ MorionServiceTicketFragment this$0;

    MorionServiceTicketFragment$onViewCreated$3(MorionServiceTicketFragment morionServiceTicketFragment) {
        this.this$0 = morionServiceTicketFragment;
    }

    public final void onChanged(Resource<ServiceTicket> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.this$0.showServiceTicket(resource);
    }
}
