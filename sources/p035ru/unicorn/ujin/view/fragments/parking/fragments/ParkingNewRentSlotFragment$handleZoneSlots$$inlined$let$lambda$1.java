package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import android.view.View;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;
import p035ru.unicorn.ujin.view.fragments.parking.response.ZoneInfo;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\t"}, mo51343d2 = {"<anonymous>", "", "slot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "invoke", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewRentSlotFragment$handleZoneSlots$1$1$1$1$1$1", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewRentSlotFragment$$special$$inlined$apply$lambda$1", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewRentSlotFragment$$special$$inlined$let$lambda$1", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewRentSlotFragment$$special$$inlined$apply$lambda$2", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingNewRentSlotFragment$$special$$inlined$map$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingNewRentSlotFragment$handleZoneSlots$$inlined$let$lambda$1 */
/* compiled from: ParkingNewRentSlotFragment.kt */
final class ParkingNewRentSlotFragment$handleZoneSlots$$inlined$let$lambda$1 extends Lambda implements Function1<Zone, Unit> {
    final /* synthetic */ ArrayList $it$inlined;
    final /* synthetic */ View $this_apply$inlined;
    final /* synthetic */ ZoneInfo $zone$inlined;
    final /* synthetic */ ParkingNewRentSlotFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ParkingNewRentSlotFragment$handleZoneSlots$$inlined$let$lambda$1(ArrayList arrayList, View view, ZoneInfo zoneInfo, ParkingNewRentSlotFragment parkingNewRentSlotFragment) {
        super(1);
        this.$it$inlined = arrayList;
        this.$this_apply$inlined = view;
        this.$zone$inlined = zoneInfo;
        this.this$0 = parkingNewRentSlotFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Zone) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Zone zone) {
        Intrinsics.checkNotNullParameter(zone, "slot");
        this.this$0.handleSlotClick(zone, this.$zone$inlined.getZone());
    }
}
