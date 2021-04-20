package p035ru.unicorn.ujin.view.fragments.parking;

import java.util.ArrayList;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.parking.events.MyVehiclesEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehiclesData;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehiclesResponse;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/view/fragments/parking/response/MyVehiclesResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.ParkingRemoteRepository$getMyVehicleList$1 */
/* compiled from: ParkingRemoteRepository.kt */
final class ParkingRemoteRepository$getMyVehicleList$1<T> implements Consumer<MyVehiclesResponse> {
    final /* synthetic */ ParkingRemoteRepository this$0;

    ParkingRemoteRepository$getMyVehicleList$1(ParkingRemoteRepository parkingRemoteRepository) {
        this.this$0 = parkingRemoteRepository;
    }

    public final void accept(MyVehiclesResponse myVehiclesResponse) {
        ArrayList<MyVehicle> arrayList;
        MyVehiclesData data;
        PublishSubject<MyVehiclesEvent> myVehicleListSubject = this.this$0.getMyVehicleListSubject();
        Integer error = myVehiclesResponse.getError();
        boolean z = error != null && error.intValue() == 0;
        String message = myVehiclesResponse.getMessage();
        if (message == null) {
            message = "";
        }
        if (myVehiclesResponse == null || (data = myVehiclesResponse.getData()) == null || (arrayList = data.getVehicleList()) == null) {
            arrayList = new ArrayList<>();
        }
        myVehicleListSubject.onNext(new MyVehiclesEvent(z, message, arrayList));
    }
}
