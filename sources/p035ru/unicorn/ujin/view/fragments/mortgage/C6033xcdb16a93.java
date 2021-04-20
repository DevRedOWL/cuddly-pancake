package p035ru.unicorn.ujin.view.fragments.mortgage;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.google.android.material.textfield.TextInputEditText;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, mo51343d2 = {"<anonymous>", "", "view", "Landroid/widget/DatePicker;", "year", "", "monthOfYear", "dayOfMonth", "onDateSet"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgageApplicationFragment$showDatePickerDialog$onDateSetListener$1 */
/* compiled from: MortgageApplicationFragment.kt */
final class C6033xcdb16a93 implements DatePickerDialog.OnDateSetListener {
    final /* synthetic */ MortgageApplicationFragment this$0;

    C6033xcdb16a93(MortgageApplicationFragment mortgageApplicationFragment) {
        this.this$0 = mortgageApplicationFragment;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.this$0.calendar.set(1, i);
        this.this$0.calendar.set(2, i2);
        this.this$0.calendar.set(5, i3);
        ((TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etBirthday)).setText(new SimpleDateFormat(DatePickerViewHolder.DATE_FORMAT, Locale.getDefault()).format(this.this$0.calendar.getTime()));
    }
}
