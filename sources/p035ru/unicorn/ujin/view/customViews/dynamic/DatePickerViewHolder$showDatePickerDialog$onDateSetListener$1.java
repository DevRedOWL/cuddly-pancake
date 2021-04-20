package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.app.DatePickerDialog;
import android.view.View;
import android.widget.DatePicker;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, mo51343d2 = {"<anonymous>", "", "view", "Landroid/widget/DatePicker;", "year", "", "monthOfYear", "dayOfMonth", "onDateSet"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder$showDatePickerDialog$onDateSetListener$1 */
/* compiled from: DatePickerViewHolder.kt */
final class DatePickerViewHolder$showDatePickerDialog$onDateSetListener$1 implements DatePickerDialog.OnDateSetListener {
    final /* synthetic */ String $name;
    final /* synthetic */ DatePickerViewHolder this$0;

    DatePickerViewHolder$showDatePickerDialog$onDateSetListener$1(DatePickerViewHolder datePickerViewHolder, String str) {
        this.this$0 = datePickerViewHolder;
        this.$name = str;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        DatePickerViewHolder.access$getCalendar$p(this.this$0).set(1, i);
        DatePickerViewHolder.access$getCalendar$p(this.this$0).set(2, i2);
        DatePickerViewHolder.access$getCalendar$p(this.this$0).set(5, i3);
        View view = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ((TextInputEditText) view.findViewById(C5619R.C5622id.dateText)).setText(this.this$0.dateFormat.format(DatePickerViewHolder.access$getCalendar$p(this.this$0).getTime()));
        Function1<String, Unit> onValueChanged = this.this$0.getOnValueChanged();
        String format = this.this$0.dateFormat.format(DatePickerViewHolder.access$getCalendar$p(this.this$0).getTime());
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(calendar.time)");
        onValueChanged.invoke(format);
        Function2<Boolean, String, Unit> setValidFlag = this.this$0.getSetValidFlag();
        DatePickerViewHolder datePickerViewHolder = this.this$0;
        String format2 = datePickerViewHolder.dateFormat.format(DatePickerViewHolder.access$getCalendar$p(this.this$0).getTime());
        if (format2 == null) {
            format2 = "";
        }
        setValidFlag.invoke(Boolean.valueOf(datePickerViewHolder.isValueValid(format2)), this.$name);
    }
}
