package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import com.google.gson.annotations.SerializedName;
import java.util.Calendar;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/DatePickerField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "hint", "", "value", "defaultValue", "Ljava/util/Calendar;", "minValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;)V", "getDefaultValue", "()Ljava/util/Calendar;", "setDefaultValue", "(Ljava/util/Calendar;)V", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "getMinValue", "setMinValue", "getValue", "setValue", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.DatePickerField */
/* compiled from: DataEntryItem.kt */
public final class DatePickerField extends Field {
    @SerializedName("default_value")
    private Calendar defaultValue;
    private String hint;
    @SerializedName("min_value")
    private Calendar minValue;
    private String value;

    public final String getHint() {
        return this.hint;
    }

    public final void setHint(String str) {
        this.hint = str;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public final Calendar getDefaultValue() {
        return this.defaultValue;
    }

    public final void setDefaultValue(Calendar calendar) {
        this.defaultValue = calendar;
    }

    public final Calendar getMinValue() {
        return this.minValue;
    }

    public final void setMinValue(Calendar calendar) {
        this.minValue = calendar;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/DatePickerField$JsonFields;", "", "()V", "defaultValue", "", "fieldName", "hint", "minValue", "value", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.DatePickerField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String defaultValue = "default_value";
        public static final String fieldName = "calendar";
        public static final String hint = "hint";
        public static final String minValue = "min_value";
        public static final String value = "value";

        private JsonFields() {
        }
    }

    public DatePickerField(String str, String str2, Calendar calendar, Calendar calendar2) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        this.hint = str;
        this.value = str2;
        this.defaultValue = calendar;
        this.minValue = calendar2;
    }
}
