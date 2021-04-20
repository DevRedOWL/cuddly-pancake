package p035ru.unicorn.ujin.view.customViews.dynamic;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DatePickerField;

@Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder$bind$1 */
/* compiled from: DatePickerViewHolder.kt */
final /* synthetic */ class DatePickerViewHolder$bind$1 extends MutablePropertyReference0Impl {
    DatePickerViewHolder$bind$1(DatePickerViewHolder datePickerViewHolder) {
        super(datePickerViewHolder, DatePickerViewHolder.class, DatePickerField.JsonFields.fieldName, "getCalendar()Ljava/util/Calendar;", 0);
    }

    public Object get() {
        return DatePickerViewHolder.access$getCalendar$p((DatePickerViewHolder) this.receiver);
    }

    public void set(Object obj) {
        ((DatePickerViewHolder) this.receiver).calendar = (Calendar) obj;
    }
}
