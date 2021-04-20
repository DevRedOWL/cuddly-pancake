package p035ru.unicorn.ujin.view.fragments.newSmartNav;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "rentInfo", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentType;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartNavFragment$makeAction$1 */
/* compiled from: NewSmartNavFragment.kt */
final class NewSmartNavFragment$makeAction$1<T> implements Observer<RentType> {
    final /* synthetic */ NewSmartNavFragment this$0;

    NewSmartNavFragment$makeAction$1(NewSmartNavFragment newSmartNavFragment) {
        this.this$0 = newSmartNavFragment;
    }

    public final void onChanged(RentType rentType) {
        Intrinsics.checkNotNullParameter(rentType, "rentInfo");
        this.this$0.showChoosenTypeFragment(rentType);
    }
}
