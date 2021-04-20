package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.widget.CompoundButton;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingAddVehicleToSlotFragment$handleVehicleList$1$1$1", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingAddVehicleToSlotFragment$$special$$inlined$apply$lambda$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingAddVehicleToSlotFragment$handleVehicleList$$inlined$map$lambda$1 */
/* compiled from: ParkingAddVehicleToSlotFragment.kt */
final class C6052x2778715f implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ MyVehicle $vehicle$inlined;
    final /* synthetic */ ParkingAddVehicleToSlotFragment this$0;

    C6052x2778715f(MyVehicle myVehicle, ParkingAddVehicleToSlotFragment parkingAddVehicleToSlotFragment) {
        this.$vehicle$inlined = myVehicle;
        this.this$0 = parkingAddVehicleToSlotFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.this$0.setCheckedVehicle(this.$vehicle$inlined);
        ParkingAddVehicleToSlotFragment parkingAddVehicleToSlotFragment = this.this$0;
        MyVehicle myVehicle = this.$vehicle$inlined;
        Integer id = ParkingAddVehicleToSlotFragment.access$getParkingSlot$p(parkingAddVehicleToSlotFragment).getId();
        parkingAddVehicleToSlotFragment.handleSwitch(myVehicle, id != null ? id.intValue() : -1, z);
    }
}
