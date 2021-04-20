package p035ru.unicorn.ujin.view.fragments.profile.vehicle;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.profile.vehicle.MyVehicleFragment$initData$2;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "kotlin.jvm.PlatformType", "onChanged", "ru/unicorn/ujin/view/fragments/profile/vehicle/MyVehicleFragment$initData$2$1$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.vehicle.MyVehicleFragment$initData$2$1$$special$$inlined$let$lambda$1 */
/* compiled from: MyVehicleFragment.kt */
final class MyVehicleFragment$initData$2$1$$special$$inlined$let$lambda$1<T> implements Observer<UpdateEvent> {
    final /* synthetic */ MyVehicleFragment$initData$2.C60651 this$0;

    MyVehicleFragment$initData$2$1$$special$$inlined$let$lambda$1(MyVehicleFragment$initData$2.C60651 r1) {
        this.this$0 = r1;
    }

    public final void onChanged(UpdateEvent updateEvent) {
        MyVehicleFragment myVehicleFragment = this.this$0.this$0.this$0;
        Intrinsics.checkNotNullExpressionValue(updateEvent, "event");
        myVehicleFragment.handleRemoveVehicle(updateEvent);
    }
}
