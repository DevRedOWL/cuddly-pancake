package p035ru.unicorn.ujin.view.fragments.parking;

import kotlin.Metadata;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.ParkingViewModel$freeRent$1 */
/* compiled from: ParkingViewModel.kt */
final class ParkingViewModel$freeRent$1<T> implements Consumer<Throwable> {
    final /* synthetic */ ParkingViewModel this$0;

    ParkingViewModel$freeRent$1(ParkingViewModel parkingViewModel) {
        this.this$0 = parkingViewModel;
    }

    public final void accept(Throwable th) {
        this.this$0.getFreeRentMutableLiveData().postValue(null);
    }
}
