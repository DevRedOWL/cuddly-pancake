package p035ru.unicorn.ujin.view.adapters;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.adapters.TimeSlotsAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.TimeSlotsAdapter$ViewHolder$bind$1 */
/* compiled from: TimeSlotsAdapter.kt */
final class TimeSlotsAdapter$ViewHolder$bind$1 implements View.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ TimeSlotsAdapter.ViewHolder this$0;

    TimeSlotsAdapter$ViewHolder$bind$1(TimeSlotsAdapter.ViewHolder viewHolder, int i) {
        this.this$0 = viewHolder;
        this.$position = i;
    }

    public final void onClick(View view) {
        TimeSlotsAdapter timeSlotsAdapter = this.this$0.this$0;
        int i = this.$position;
        String string = TimeSlotsAdapter.access$getContext$p(this.this$0.this$0).getResources().getString(R.string.removeDateConfirmation);
        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…g.removeDateConfirmation)");
        String string2 = TimeSlotsAdapter.access$getContext$p(this.this$0.this$0).getResources().getString(R.string.confirm_cancel_acceptance);
        Intrinsics.checkNotNullExpressionValue(string2, "context.resources.getStr…onfirm_cancel_acceptance)");
        timeSlotsAdapter.showConfirmationDialog(i, string, string2);
    }
}
