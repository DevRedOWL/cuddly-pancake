package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.content.DialogInterface;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingRentSlotFragment$showSuccessMessage$2 */
/* compiled from: ParkingRentSlotFragment.kt */
final class ParkingRentSlotFragment$showSuccessMessage$2 implements DialogInterface.OnCancelListener {
    final /* synthetic */ ParkingRentSlotFragment this$0;

    ParkingRentSlotFragment$showSuccessMessage$2(ParkingRentSlotFragment parkingRentSlotFragment) {
        this.this$0 = parkingRentSlotFragment;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.this$0.returnToParkingList();
    }
}
