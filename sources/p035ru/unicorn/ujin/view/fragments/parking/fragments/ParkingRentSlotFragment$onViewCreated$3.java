package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingRentSlotFragment$onViewCreated$3 */
/* compiled from: ParkingRentSlotFragment.kt */
final class ParkingRentSlotFragment$onViewCreated$3 implements View.OnClickListener {
    final /* synthetic */ ParkingRentSlotFragment this$0;

    ParkingRentSlotFragment$onViewCreated$3(ParkingRentSlotFragment parkingRentSlotFragment) {
        this.this$0 = parkingRentSlotFragment;
    }

    public final void onClick(View view) {
        Zone access$getZone$p = this.this$0.zone;
        if (access$getZone$p != null) {
            this.this$0.nextFragment(ParkingPlanFragment.Companion.newInstance(access$getZone$p), false, BaseActivity.FRAGMENT_PARKING_SLOT_PLAN);
        }
    }
}