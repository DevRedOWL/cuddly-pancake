package p035ru.unicorn.ujin.view.fragments.parking;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.ParkingRemoteRepository$removeVehicle$1 */
/* compiled from: ParkingRemoteRepository.kt */
final class ParkingRemoteRepository$removeVehicle$1<T> implements Consumer<SimpleResponse> {
    final /* synthetic */ ParkingRemoteRepository this$0;

    ParkingRemoteRepository$removeVehicle$1(ParkingRemoteRepository parkingRemoteRepository) {
        this.this$0 = parkingRemoteRepository;
    }

    public final void accept(SimpleResponse simpleResponse) {
        this.this$0.getRemoveVehicleSubject().onNext(new UpdateEvent(simpleResponse.getError() == 0, simpleResponse.getMessage()));
    }
}
