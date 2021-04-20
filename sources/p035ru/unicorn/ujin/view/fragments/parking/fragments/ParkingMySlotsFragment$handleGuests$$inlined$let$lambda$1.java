package p035ru.unicorn.ujin.view.fragments.parking.fragments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.fragments.parking.events.ParkingGuestsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.Guest;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "guest", "Lru/unicorn/ujin/view/fragments/parking/response/Guest;", "invoke", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingMySlotsFragment$handleGuests$1$1$1", "ru/unicorn/ujin/view/fragments/parking/fragments/ParkingMySlotsFragment$$special$$inlined$apply$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.fragments.ParkingMySlotsFragment$handleGuests$$inlined$let$lambda$1 */
/* compiled from: ParkingMySlotsFragment.kt */
final class ParkingMySlotsFragment$handleGuests$$inlined$let$lambda$1 extends Lambda implements Function1<Guest, Unit> {
    final /* synthetic */ ParkingGuestsEvent $event$inlined;
    final /* synthetic */ ParkingMySlotsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ParkingMySlotsFragment$handleGuests$$inlined$let$lambda$1(ParkingMySlotsFragment parkingMySlotsFragment, ParkingGuestsEvent parkingGuestsEvent) {
        super(1);
        this.this$0 = parkingMySlotsFragment;
        this.$event$inlined = parkingGuestsEvent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Guest) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Guest guest) {
        Intrinsics.checkNotNullParameter(guest, RemoteRepository.GUEST);
        this.this$0.handleGuestClick(guest);
    }
}
