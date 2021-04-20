package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import androidx.lifecycle.Observer;
import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "res", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceTicket;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.RentInfoFragment$handleMyRentInfo$3 */
/* compiled from: RentInfoFragment.kt */
final class RentInfoFragment$handleMyRentInfo$3<T> implements Observer<Resource<ServiceTicket>> {
    final /* synthetic */ RentInfoFragment this$0;

    RentInfoFragment$handleMyRentInfo$3(RentInfoFragment rentInfoFragment) {
        this.this$0 = rentInfoFragment;
    }

    public final void onChanged(Resource<ServiceTicket> resource) {
        RentInfoFragment rentInfoFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(resource, UriUtil.LOCAL_RESOURCE_SCHEME);
        rentInfoFragment.showServiceTicket(resource);
    }
}
