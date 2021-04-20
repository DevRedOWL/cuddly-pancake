package p035ru.unicorn.ujin.view.fragments.profile;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.fragments.profile.adapters.MyRentObjectListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/profile/RentObjectListFragment$onViewCreated$5", "Lru/unicorn/ujin/view/fragments/profile/adapters/MyRentObjectListAdapter$OnObjectSelectedListener;", "onObjectSelected", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectListFragment$onViewCreated$5 */
/* compiled from: RentObjectListFragment.kt */
public final class RentObjectListFragment$onViewCreated$5 implements MyRentObjectListAdapter.OnObjectSelectedListener {
    final /* synthetic */ RentObjectListFragment this$0;

    RentObjectListFragment$onViewCreated$5(RentObjectListFragment rentObjectListFragment) {
        this.this$0 = rentObjectListFragment;
    }

    public void onObjectSelected(int i) {
        RentInfo item = RentObjectListFragment.access$getMyRentObjectListAdapter$p(this.this$0).getItem(i);
        if (item != null) {
            this.this$0.showMyObjectRentedMessage(item);
        }
    }
}
