package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewRentSlotFragment$showToolbar$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingNewRentSlotFragment$showToolbar$$inlined$apply$lambda$1 */
/* compiled from: ParkingNewRentSlotFragment.kt */
final class ParkingNewRentSlotFragment$showToolbar$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ TextView $this_apply;
    final /* synthetic */ ParkingNewRentSlotFragment this$0;

    ParkingNewRentSlotFragment$showToolbar$$inlined$apply$lambda$1(TextView textView, ParkingNewRentSlotFragment parkingNewRentSlotFragment) {
        this.$this_apply = textView;
        this.this$0 = parkingNewRentSlotFragment;
    }

    public final void onClick(View view) {
        Zone access$getSlot$p = this.this$0.slot;
        if (access$getSlot$p != null) {
            int access$getParkingType$p = this.this$0.parkingType;
            if (access$getParkingType$p == 0) {
                this.this$0.nextFragment(ParkingRentSlotFragment.Companion.newInstance(this.this$0.getCalendarStart(), this.this$0.getCalendarEnd(), access$getSlot$p, this.this$0.zone), false, BaseActivity.FRAGMENT_PARKING_RENT_SLOT);
            } else if (access$getParkingType$p == 1) {
                this.this$0.nextFragment(ParkingNewGuestFragment.Companion.newInstance(this.this$0.getCalendarStart(), this.this$0.getCalendarEnd(), access$getSlot$p), false, BaseActivity.FRAGMENT_PARKING_NEW_RENT_GUEST);
            }
        } else {
            TextView textView = this.$this_apply;
            ParkingNewRentSlotFragment parkingNewRentSlotFragment = this.this$0;
            parkingNewRentSlotFragment.showMessage(parkingNewRentSlotFragment.getString(R.string.parkingChooseParkingSlot));
        }
    }
}
