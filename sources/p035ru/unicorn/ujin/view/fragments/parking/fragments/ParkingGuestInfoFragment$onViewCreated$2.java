package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.parking.ParkingViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingGuestInfoFragment$onViewCreated$2 */
/* compiled from: ParkingGuestInfoFragment.kt */
final class ParkingGuestInfoFragment$onViewCreated$2 implements View.OnClickListener {
    final /* synthetic */ ParkingGuestInfoFragment this$0;

    ParkingGuestInfoFragment$onViewCreated$2(ParkingGuestInfoFragment parkingGuestInfoFragment) {
        this.this$0 = parkingGuestInfoFragment;
    }

    public final void onClick(View view) {
        Integer id = ParkingGuestInfoFragment.access$getParkingSlot$p(this.this$0).getId();
        if (id != null) {
            int intValue = id.intValue();
            ParkingViewModel parkingViewModel = this.this$0.getParkingViewModel();
            String format = this.this$0.sdf.format(ParkingGuestInfoFragment.access$getCalendarStart$p(this.this$0).getTime());
            Intrinsics.checkNotNullExpressionValue(format, "sdf.format(calendarStart.time)");
            String format2 = this.this$0.sdf.format(ParkingGuestInfoFragment.access$getCalendarEnd$p(this.this$0).getTime());
            Intrinsics.checkNotNullExpressionValue(format2, "sdf.format(calendarEnd.time)");
            parkingViewModel.freeRent(format, format2, intValue);
        }
    }
}
