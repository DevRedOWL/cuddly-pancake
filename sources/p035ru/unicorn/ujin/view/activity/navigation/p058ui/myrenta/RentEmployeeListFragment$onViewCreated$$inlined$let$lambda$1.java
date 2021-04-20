package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.util.Pair;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "data", "Landroid/util/Pair;", "Lru/unicorn/ujin/view/activity/navigation/ui/myrentatype/talkingroom/Rent;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyList;", "onChanged", "ru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListFragment$onViewCreated$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListFragment$onViewCreated$$inlined$let$lambda$1 */
/* compiled from: RentEmployeeListFragment.kt */
final class RentEmployeeListFragment$onViewCreated$$inlined$let$lambda$1<T> implements Observer<Pair<Rent, CompanyList>> {
    final /* synthetic */ RentEmployeeListFragment this$0;

    RentEmployeeListFragment$onViewCreated$$inlined$let$lambda$1(RentEmployeeListFragment rentEmployeeListFragment) {
        this.this$0 = rentEmployeeListFragment;
    }

    public final void onChanged(Pair<Rent, CompanyList> pair) {
        this.this$0.showRenters(pair);
    }
}
