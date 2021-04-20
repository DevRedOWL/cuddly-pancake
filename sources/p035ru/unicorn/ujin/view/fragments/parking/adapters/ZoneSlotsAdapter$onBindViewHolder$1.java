package p035ru.unicorn.ujin.view.fragments.parking.adapters;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.parking.response.Zone;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.adapters.ZoneSlotsAdapter$onBindViewHolder$1 */
/* compiled from: ZoneSlotsAdapter.kt */
final class ZoneSlotsAdapter$onBindViewHolder$1 implements View.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ ZoneSlotsAdapter this$0;

    ZoneSlotsAdapter$onBindViewHolder$1(ZoneSlotsAdapter zoneSlotsAdapter, int i) {
        this.this$0 = zoneSlotsAdapter;
        this.$position = i;
    }

    public final void onClick(View view) {
        Function1<Zone, Unit> slotClick = this.this$0.getSlotClick();
        Object obj = this.this$0.slotList.get(this.$position);
        Intrinsics.checkNotNullExpressionValue(obj, "slotList[position]");
        slotClick.invoke(obj);
        DynamicBackgroundButton lastButton = this.this$0.getLastButton();
        if (lastButton != null) {
            lastButton.setType(DynamicBackgroundButton.Type.OUTLINED);
            this.this$0.setNotChoosen(lastButton);
        }
        ZoneSlotsAdapter zoneSlotsAdapter = this.this$0;
        if (view != null) {
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) view;
            zoneSlotsAdapter.setLastButton(dynamicBackgroundButton);
            this.this$0.setChoosen(dynamicBackgroundButton);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.customViews.DynamicBackgroundButton");
    }
}
