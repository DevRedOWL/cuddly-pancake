package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/entity/KolyaSuccesModel;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.ReturnTicketFragment$returnTicket$1 */
/* compiled from: ReturnTicketFragment.kt */
final class ReturnTicketFragment$returnTicket$1<T> implements Observer<Resource<KolyaSuccesModel>> {
    final /* synthetic */ ReturnTicketFragment this$0;

    ReturnTicketFragment$returnTicket$1(ReturnTicketFragment returnTicketFragment) {
        this.this$0 = returnTicketFragment;
    }

    public final void onChanged(Resource<KolyaSuccesModel> resource) {
        this.this$0.onChangeTicketStatus(resource);
    }
}
