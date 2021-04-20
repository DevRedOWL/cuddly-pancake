package p035ru.unicorn.ujin.view.fragments.parking.adapters;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.adapters.MyParkingSlotsAdapter$onBindViewHolder$1 */
/* compiled from: MyParkingSlotsAdapter.kt */
final class MyParkingSlotsAdapter$onBindViewHolder$1 implements View.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ MyParkingSlotsAdapter this$0;

    MyParkingSlotsAdapter$onBindViewHolder$1(MyParkingSlotsAdapter myParkingSlotsAdapter, int i) {
        this.this$0 = myParkingSlotsAdapter;
        this.$position = i;
    }

    public final void onClick(View view) {
        Function1<ParkingSlot, Unit> onClickListener = this.this$0.getOnClickListener();
        ParkingSlot parkingSlot = this.this$0.getSlotList().get(this.$position);
        Intrinsics.checkNotNullExpressionValue(parkingSlot, "slotList[position]");
        onClickListener.invoke(parkingSlot);
    }
}
