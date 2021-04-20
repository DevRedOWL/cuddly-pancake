package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\u001cB;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/SelectField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "title", "", "hint", "defaultValue", "selectValues", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/dialogs/dataEntry/SelectValue;", "apiValues", "Lru/unicorn/ujin/view/dialogs/dataEntry/ApiValues;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lru/unicorn/ujin/view/dialogs/dataEntry/ApiValues;)V", "getApiValues", "()Lru/unicorn/ujin/view/dialogs/dataEntry/ApiValues;", "setApiValues", "(Lru/unicorn/ujin/view/dialogs/dataEntry/ApiValues;)V", "getDefaultValue", "()Ljava/lang/String;", "setDefaultValue", "(Ljava/lang/String;)V", "getHint", "setHint", "getSelectValues", "()Ljava/util/ArrayList;", "setSelectValues", "(Ljava/util/ArrayList;)V", "getTitle", "setTitle", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.SelectField */
/* compiled from: DataEntryItem.kt */
public final class SelectField extends Field {
    private ApiValues apiValues;
    private String defaultValue;
    private String hint;
    private ArrayList<SelectValue> selectValues;
    private String title;

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getHint() {
        return this.hint;
    }

    public final void setHint(String str) {
        this.hint = str;
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

    public final ApiValues getApiValues() {
        return this.apiValues;
    }

    public final void setApiValues(ApiValues apiValues2) {
        this.apiValues = apiValues2;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/SelectField$JsonFields;", "", "()V", "defaultValue", "", "fieldName", "hint", "selectValues", "title", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.SelectField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String defaultValue = "default_value";
        public static final String fieldName = "_group";
        public static final String hint = "hint";
        public static final String selectValues = "radio_buttons";
        public static final String title = "title";

        private JsonFields() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectField(String str, String str2, String str3, ArrayList<SelectValue> arrayList, ApiValues apiValues2) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(arrayList, "selectValues");
        this.title = str;
        this.hint = str2;
        this.defaultValue = str3;
        this.selectValues = arrayList;
        this.apiValues = apiValues2;
    }
}
