package p035ru.unicorn.ujin.view.fragments.parking;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.view.fragments.parking.events.AttachVehicleEvent;
import p035ru.unicorn.ujin.view.fragments.parking.response.MyVehicle;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.ParkingRemoteRepository$detachVehicle$1 */
/* compiled from: ParkingRemoteRepository.kt */
final class ParkingRemoteRepository$detachVehicle$1<T> implements Consumer<SimpleResponse> {
    final /* synthetic */ boolean $startFlag;
    final /* synthetic */ MyVehicle $vehicle;
    final /* synthetic */ ParkingRemoteRepository this$0;

    ParkingRemoteRepository$detachVehicle$1(ParkingRemoteRepository parkingRemoteRepository, boolean z, MyVehicle myVehicle) {
        this.this$0 = parkingRemoteRepository;
        this.$startFlag = z;
        this.$vehicle = myVehicle;
    }

    public final void accept(SimpleResponse simpleResponse) {
        this.this$0.getDetachVehicleSubject().onNext(new AttachVehicleEvent(simpleResponse.getError() == 0, simpleResponse.getMessage(), this.$startFlag, this.$vehicle));
    }
}
