package p035ru.unicorn.ujin.view.fragments.parking;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.parking.events.ParkingGuestsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.AvailableGuestData;
import p035ru.unicorn.ujin.view.fragments.parking.response.AvailableGuestsResponse;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/view/fragments/parking/response/AvailableGuestsResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.ParkingRemoteRepository$getParkingGuests$1 */
/* compiled from: ParkingRemoteRepository.kt */
final class ParkingRemoteRepository$getParkingGuests$1<T> implements Consumer<AvailableGuestsResponse> {
    final /* synthetic */ ParkingRemoteRepository this$0;

    ParkingRemoteRepository$getParkingGuests$1(ParkingRemoteRepository parkingRemoteRepository) {
        this.this$0 = parkingRemoteRepository;
    }

    public final void accept(AvailableGuestsResponse availableGuestsResponse) {
        PublishSubject<ParkingGuestsEvent> parkingGuestsSubject = this.this$0.getParkingGuestsSubject();
        Integer error = availableGuestsResponse.getError();
        boolean z = error != null && error.intValue() == 0;
        String message = availableGuestsResponse.getMessage();
        if (message == null) {
            message = "";
        }
        AvailableGuestData data = availableGuestsResponse.getData();
        parkingGuestsSubject.onNext(new ParkingGuestsEvent(z, message, data != null ? data.getItems() : null));
    }
}
