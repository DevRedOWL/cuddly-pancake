package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/customViews/dynamic/DatePickerViewHolder$bind$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder$bind$$inlined$apply$lambda$1 */
/* compiled from: DatePickerViewHolder.kt */
final class DatePickerViewHolder$bind$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ Field $item$inlined;
    final /* synthetic */ DatePickerViewHolder this$0;

    DatePickerViewHolder$bind$$inlined$apply$lambda$1(DatePickerViewHolder datePickerViewHolder, Field field) {
        this.this$0 = datePickerViewHolder;
        this.$item$inlined = field;
    }

    public final void onClick(View view) {
        this.this$0.showDatePickerDialog(this.$item$inlined.getName());
    }
}
