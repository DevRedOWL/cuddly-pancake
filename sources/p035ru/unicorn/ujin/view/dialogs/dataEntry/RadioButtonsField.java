package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/RadioButtonsField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "title", "", "defaultValue", "selectValues", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/dialogs/dataEntry/SelectValue;", "type", "style", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getDefaultValue", "()Ljava/lang/String;", "setDefaultValue", "(Ljava/lang/String;)V", "getSelectValues", "()Ljava/util/ArrayList;", "setSelectValues", "(Ljava/util/ArrayList;)V", "getStyle", "setStyle", "getTitle", "setTitle", "getType", "setType", "JsonFields", "Style", "Type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField */
/* compiled from: DataEntryItem.kt */
public final class RadioButtonsField extends Field {
    private String defaultValue;
    private ArrayList<SelectValue> selectValues;
    private String style;
    private String title;
    private String type;

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final void setDefaultValue(String str) {
        this.defaultValue = str;
    }

    public final ArrayList<SelectValue> getSelectValues() {
        return this.selectValues;
    }

    public final void setSelectValues(ArrayList<SelectValue> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.selectValues = arrayList;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getStyle() {
        return this.style;
    }

    public final void setStyle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.style = str;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/RadioButtonsField$JsonFields;", "", "()V", "defaultValue", "", "getDefaultValue", "()Ljava/lang/String;", "fieldName", "getFieldName", "selectValues", "getSelectValues", "style", "getStyle", "title", "getTitle", "type", "getType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        private static final String defaultValue = "default_value";
        private static final String fieldName = "radio_group";
        private static final String selectValues = SelectField.JsonFields.selectValues;
        private static final String style = ButtonField.JsonFields.style;
        private static final String title = "title";
        private static final String type = "type";

        private JsonFields() {
        }

        public final String getFieldName() {
            return fieldName;
        }

        public final String getTitle() {
            return title;
        }

        public final String getDefaultValue() {
            return defaultValue;
        }

        public final String getSelectValues() {
            return selectValues;
        }

        public final String getType() {
            return type;
        }

        public final String getStyle() {
            return style;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonsField(String str, String str2, ArrayList<SelectValue> arrayList, String str3, String str4) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(arrayList, "selectValues");
        Intrinsics.checkNotNullParameter(str3, "type");
        Intrinsics.checkNotNullParameter(str4, ButtonField.JsonFields.style);
        this.title = str;
        this.defaultValue = str2;
        this.selectValues = arrayList;
        this.type = str3;
        this.style = str4;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/RadioButtonsField$Type;", "", "()V", "default", "", "getDefault", "()Ljava/lang/String;", "rtl", "getRtl", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$Type */
    /* compiled from: DataEntryItem.kt */
    public static final class Type {
        public static final Type INSTANCE = new Type();

        /* renamed from: default  reason: not valid java name */
        private static final String f7027default = "default";
        private static final String rtl = "rtl";

        private Type() {
        }

        public final String getDefault() {
            return f7027default;
        }

        public final String getRtl() {
            return rtl;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/RadioButtonsField$Style;", "", "()V", "default", "", "getDefault", "()Ljava/lang/String;", "underlined", "getUnderlined", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.RadioButtonsField$Style */
    /* compiled from: DataEntryItem.kt */
    public static final class Style {
        public static final Style INSTANCE = new Style();

        /* renamed from: default  reason: not valid java name */
        private static final String f7026default = "default";
        private static final String underlined = "underlined";

        private Style() {
        }

        public final String getDefault() {
            return f7026default;
        }

        public final String getUnderlined() {
            return underlined;
        }
    }
}
