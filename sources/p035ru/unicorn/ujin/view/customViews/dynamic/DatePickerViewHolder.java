package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DatePickerField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001'B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0012\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R5\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0016\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006("}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/DatePickerViewHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "calendar", "Ljava/util/Calendar;", "dateFormat", "Ljava/text/SimpleDateFormat;", "defaultValue", "isRequired", "", "isValid", "()Z", "setValid", "(Z)V", "minValue", "onValueChangedListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "value", "", "getOnValueChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnValueChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "bind", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "isValueValid", "setTitle", "label", "showDatePickerDialog", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder */
/* compiled from: DatePickerViewHolder.kt */
public final class DatePickerViewHolder extends BaseViewHolder {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DATE_FORMAT = "dd.MM.yyyy";
    /* access modifiers changed from: private */
    public Calendar calendar;
    /* access modifiers changed from: private */
    public final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());
    private Calendar defaultValue;
    private boolean isRequired;
    private boolean isValid;
    private Calendar minValue;
    private Function1<? super String, Unit> onValueChangedListener = DatePickerViewHolder$onValueChangedListener$1.INSTANCE;
    private String value = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public static final /* synthetic */ Calendar access$getCalendar$p(DatePickerViewHolder datePickerViewHolder) {
        Calendar calendar2 = datePickerViewHolder.calendar;
        if (calendar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DatePickerField.JsonFields.fieldName);
        }
        return calendar2;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    public final Function1<String, Unit> getOnValueChangedListener() {
        return this.onValueChangedListener;
    }

    public final void setOnValueChangedListener(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onValueChangedListener = function1;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final void setValid(boolean z) {
        this.isValid = z;
    }

    public void bind(Field field) {
        Intrinsics.checkNotNullParameter(field, "item");
        if (this.calendar == null) {
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
            this.calendar = instance;
        }
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(C5619R.C5622id.dateText);
        textInputEditText.setFocusable(false);
        textInputEditText.setOnClickListener(new DatePickerViewHolder$bind$$inlined$apply$lambda$1(this, field));
        if (field instanceof DatePickerField) {
            DatePickerField datePickerField = (DatePickerField) field;
            this.isRequired = field.getRequired();
            setTitle(datePickerField.getHint());
            this.defaultValue = datePickerField.getDefaultValue();
            this.minValue = datePickerField.getMinValue();
            Calendar calendar2 = this.defaultValue;
            if (calendar2 != null) {
                Calendar calendar3 = this.calendar;
                if (calendar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DatePickerField.JsonFields.fieldName);
                }
                calendar3.set(1, calendar2.get(1));
                Calendar calendar4 = this.calendar;
                if (calendar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DatePickerField.JsonFields.fieldName);
                }
                calendar4.set(2, calendar2.get(2));
                Calendar calendar5 = this.calendar;
                if (calendar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DatePickerField.JsonFields.fieldName);
                }
                calendar5.set(5, calendar2.get(5));
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                ((TextInputEditText) view2.findViewById(C5619R.C5622id.dateText)).setText(this.dateFormat.format(calendar2.getTime()));
                Function1<String, Unit> onValueChanged = getOnValueChanged();
                String format = this.dateFormat.format(calendar2.getTime());
                Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(defaultCalendar.time)");
                onValueChanged.invoke(format);
                Function2<Boolean, String, Unit> setValidFlag = getSetValidFlag();
                String format2 = this.dateFormat.format(calendar2.getTime());
                if (format2 == null) {
                    format2 = "";
                }
                setValidFlag.invoke(Boolean.valueOf(isValueValid(format2)), field.getName());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showDatePickerDialog(String str) {
        DatePickerDialog.OnDateSetListener datePickerViewHolder$showDatePickerDialog$onDateSetListener$1 = new DatePickerViewHolder$showDatePickerDialog$onDateSetListener$1(this, str);
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        Context context = view.getContext();
        Calendar calendar2 = this.calendar;
        if (calendar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DatePickerField.JsonFields.fieldName);
        }
        int i = calendar2.get(1);
        Calendar calendar3 = this.calendar;
        if (calendar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DatePickerField.JsonFields.fieldName);
        }
        int i2 = calendar3.get(2);
        Calendar calendar4 = this.calendar;
        if (calendar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DatePickerField.JsonFields.fieldName);
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, R.style.YCalendar, datePickerViewHolder$showDatePickerDialog$onDateSetListener$1, i, i2, calendar4.get(5));
        Calendar calendar5 = this.minValue;
        if (calendar5 != null) {
            DatePicker datePicker = datePickerDialog.getDatePicker();
            Intrinsics.checkNotNullExpressionValue(datePicker, "datePickerDialog.datePicker");
            datePicker.setMinDate(calendar5.getTimeInMillis());
        }
        datePickerDialog.show();
    }

    private final void setTitle(String str) {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(C5619R.C5622id.dateLayout);
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "itemView.dateLayout");
        if (this.isRequired) {
            str = str + '*';
        }
        textInputLayout.setHint((CharSequence) str);
    }

    /* access modifiers changed from: private */
    public final boolean isValueValid(String str) {
        return !this.isRequired || (StringsKt.isBlank(str) ^ true);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/DatePickerViewHolder$Companion;", "", "()V", "DATE_FORMAT", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder$Companion */
    /* compiled from: DatePickerViewHolder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
