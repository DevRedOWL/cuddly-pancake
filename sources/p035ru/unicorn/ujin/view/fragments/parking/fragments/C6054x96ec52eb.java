package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyParkingSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "vehicle", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "invoke", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingMySlotsFragment$handleParkingSlots$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingMySlotsFragment$handleParkingSlots$$inlined$apply$lambda$1 */
/* compiled from: ParkingMySlotsFragment.kt */
final class C6054x96ec52eb extends Lambda implements Function1<ParkingSlot, Unit> {
    final /* synthetic */ MyParkingSlotsEvent $event$inlined;
    final /* synthetic */ ParkingMySlotsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6054x96ec52eb(ParkingMySlotsFragment parkingMySlotsFragment, MyParkingSlotsEvent myParkingSlotsEvent) {
        super(1);
        this.this$0 = parkingMySlotsFragment;
        this.$event$inlined = myParkingSlotsEvent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ParkingSlot) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(ParkingSlot parkingSlot) {
        Intrinsics.checkNotNullParameter(parkingSlot, RemoteRepository.CAR);
        this.this$0.handleSlotClick(parkingSlot);
    }
}
