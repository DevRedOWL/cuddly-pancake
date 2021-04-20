package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentInfo;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.RentInfoFragment$onViewCreated$1 */
/* compiled from: RentInfoFragment.kt */
final class RentInfoFragment$onViewCreated$1<T> implements Observer<List<RentInfo>> {
    final /* synthetic */ RentInfoFragment this$0;

    RentInfoFragment$onViewCreated$1(RentInfoFragment rentInfoFragment) {
        this.this$0 = rentInfoFragment;
    }

    public final void onChanged(List<? extends RentInfo> list) {
        this.this$0.handleMyRentInfo(list);
    }
}
