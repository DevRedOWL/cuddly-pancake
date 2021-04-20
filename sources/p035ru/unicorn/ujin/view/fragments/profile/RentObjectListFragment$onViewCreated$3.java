package p035ru.unicorn.ujin.view.fragments.profile;

import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\n¢\u0006\u0002\b\n"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/core/widget/NestedScrollView;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "scrollY", "<anonymous parameter 3>", "oldScrollY", "onScrollChange"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.RentObjectListFragment$onViewCreated$3 */
/* compiled from: RentObjectListFragment.kt */
final class RentObjectListFragment$onViewCreated$3 implements NestedScrollView.OnScrollChangeListener {
    final /* synthetic */ RentObjectListFragment this$0;

    RentObjectListFragment$onViewCreated$3(RentObjectListFragment rentObjectListFragment) {
        this.this$0 = rentObjectListFragment;
    }

    public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        if (i2 > i4 && this.this$0.currentPage < this.this$0.lastPage && !this.this$0.isLoaded) {
            RentObjectListFragment rentObjectListFragment = this.this$0;
            rentObjectListFragment.currentPage = rentObjectListFragment.currentPage + 1;
            this.this$0.loadRentObjectList();
        }
    }
}
