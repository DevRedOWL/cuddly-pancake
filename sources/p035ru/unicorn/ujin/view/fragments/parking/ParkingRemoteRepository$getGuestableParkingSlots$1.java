package p035ru.unicorn.ujin.view.fragments.parking;

import java.util.ArrayList;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.parking.events.GuestZoneSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.GuestableSlotsData;
import p035ru.unicorn.ujin.view.fragments.parking.response.GuestableSlotsResponse;
import p035ru.unicorn.ujin.view.fragments.parking.response.OwnSlotsData;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;
import p035ru.unicorn.ujin.view.fragments.parking.response.ZoneInfo;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/view/fragments/parking/response/GuestableSlotsResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.ParkingRemoteRepository$getGuestableParkingSlots$1 */
/* compiled from: ParkingRemoteRepository.kt */
final class ParkingRemoteRepository$getGuestableParkingSlots$1<T> implements Consumer<GuestableSlotsResponse> {
    final /* synthetic */ ParkingRemoteRepository this$0;

    ParkingRemoteRepository$getGuestableParkingSlots$1(ParkingRemoteRepository parkingRemoteRepository) {
        this.this$0 = parkingRemoteRepository;
    }

    public final void accept(GuestableSlotsResponse guestableSlotsResponse) {
        OwnSlotsData rented;
        OwnSlotsData own;
        PublishSubject<GuestZoneSlotsEvent> guestZoneSlotsSubject = this.this$0.getGuestZoneSlotsSubject();
        Integer error = guestableSlotsResponse.getError();
        boolean z = error != null && error.intValue() == 0;
        String message = guestableSlotsResponse.getMessage();
        if (message == null) {
            message = "";
        }
        String str = message;
        GuestableSlotsData data = guestableSlotsResponse.getData();
        ArrayList<ZoneInfo> zoneList = data != null ? data.getZoneList() : null;
        GuestableSlotsData data2 = guestableSlotsResponse.getData();
        ArrayList<Zone> slotList = (data2 == null || (own = data2.getOwn()) == null) ? null : own.getSlotList();
        GuestableSlotsData data3 = guestableSlotsResponse.getData();
        guestZoneSlotsSubject.onNext(new GuestZoneSlotsEvent(z, str, zoneList, slotList, (data3 == null || (rented = data3.getRented()) == null) ? null : rented.getSlotList()));
    }
}
