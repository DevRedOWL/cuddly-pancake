package p035ru.unicorn.ujin.view.fragments.parking.adapters;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.parking.response.Guest;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.adapters.ParkingGuestAdapter$onBindViewHolder$1 */
/* compiled from: ParkingGuestAdapter.kt */
final class ParkingGuestAdapter$onBindViewHolder$1 implements View.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ ParkingGuestAdapter this$0;

    ParkingGuestAdapter$onBindViewHolder$1(ParkingGuestAdapter parkingGuestAdapter, int i) {
        this.this$0 = parkingGuestAdapter;
        this.$position = i;
    }

    public final void onClick(View view) {
        Function1<Guest, Unit> onClickListener = this.this$0.getOnClickListener();
        Guest guest = this.this$0.getGuestList().get(this.$position);
        Intrinsics.checkNotNullExpressionValue(guest, "guestList[position]");
        onClickListener.invoke(guest);
    }
}
