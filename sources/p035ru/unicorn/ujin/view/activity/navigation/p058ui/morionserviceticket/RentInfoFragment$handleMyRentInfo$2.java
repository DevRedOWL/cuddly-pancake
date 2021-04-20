package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/view/activity/navigation/ui/myrentatype/talkingroom/Rent;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.RentInfoFragment$handleMyRentInfo$2 */
/* compiled from: RentInfoFragment.kt */
final class RentInfoFragment$handleMyRentInfo$2<T> implements Observer<Rent> {
    final /* synthetic */ RentInfoFragment this$0;

    RentInfoFragment$handleMyRentInfo$2(RentInfoFragment rentInfoFragment) {
        this.this$0 = rentInfoFragment;
    }

    public final void onChanged(Rent rent) {
        Intrinsics.checkNotNullParameter(rent, "data");
        this.this$0.showRentInfo(rent);
    }
}
