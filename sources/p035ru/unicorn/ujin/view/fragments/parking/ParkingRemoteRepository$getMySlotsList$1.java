package p035ru.unicorn.ujin.view.fragments.parking;

import java.util.ArrayList;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyParkingSlotsEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.MySlotsData;
import p035ru.unicorn.ujin.view.fragments.parking.response.MySlotsResponse;
import p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/view/fragments/parking/response/MySlotsResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.ParkingRemoteRepository$getMySlotsList$1 */
/* compiled from: ParkingRemoteRepository.kt */
final class ParkingRemoteRepository$getMySlotsList$1<T> implements Consumer<MySlotsResponse> {
    final /* synthetic */ ParkingRemoteRepository this$0;

    ParkingRemoteRepository$getMySlotsList$1(ParkingRemoteRepository parkingRemoteRepository) {
        this.this$0 = parkingRemoteRepository;
    }

    public final void accept(MySlotsResponse mySlotsResponse) {
        ArrayList<ParkingSlot> arrayList;
        MySlotsData data;
        PublishSubject<MyParkingSlotsEvent> mySlotsListSubject = this.this$0.getMySlotsListSubject();
        Integer error = mySlotsResponse.getError();
        boolean z = error != null && error.intValue() == 0;
        String message = mySlotsResponse.getMessage();
        if (message == null) {
            message = "";
        }
        if (mySlotsResponse == null || (data = mySlotsResponse.getData()) == null || (arrayList = data.getSlotList()) == null) {
            arrayList = new ArrayList<>();
        }
        mySlotsListSubject.onNext(new MyParkingSlotsEvent(z, message, arrayList));
    }
}
