package p035ru.unicorn.ujin.view.fragments.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.profile.adapters.RentObjectListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/profile/RentObjectListFragment$onViewCreated$1", "Lru/unicorn/ujin/view/fragments/profile/adapters/RentObjectListAdapter$OnObjectSelectedListener;", "onObjectSelected", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectListFragment$onViewCreated$1 */
/* compiled from: RentObjectListFragment.kt */
public final class RentObjectListFragment$onViewCreated$1 implements RentObjectListAdapter.OnObjectSelectedListener {
    final /* synthetic */ RentObjectListFragment this$0;

    RentObjectListFragment$onViewCreated$1(RentObjectListFragment rentObjectListFragment) {
        this.this$0 = rentObjectListFragment;
    }

    public void onObjectSelected(int i) {
        RentObjectListFragment rentObjectListFragment = this.this$0;
        rentObjectListFragment.selectedObject = RentObjectListFragment.access$getRentObjectListAdapter$p(rentObjectListFragment).getItem(i);
        if (this.this$0.selectedObject != null) {
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.btnRentObject);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnRentObject");
            dynamicBackgroundButton.setEnabled(true);
        }
    }
}
