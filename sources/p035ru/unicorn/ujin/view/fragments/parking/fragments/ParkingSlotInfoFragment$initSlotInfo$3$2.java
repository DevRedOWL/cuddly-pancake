package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingSlotInfoFragment$initSlotInfo$3$2 */
/* compiled from: ParkingSlotInfoFragment.kt */
final class ParkingSlotInfoFragment$initSlotInfo$3$2 extends Lambda implements Function1<ParkingSlot, Unit> {
    public static final ParkingSlotInfoFragment$initSlotInfo$3$2 INSTANCE = new ParkingSlotInfoFragment$initSlotInfo$3$2();

    ParkingSlotInfoFragment$initSlotInfo$3$2() {
        super(1);
    }

    public final void invoke(ParkingSlot parkingSlot) {
        Intrinsics.checkNotNullParameter(parkingSlot, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ParkingSlot) obj);
        return Unit.INSTANCE;
    }
}
