package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import android.widget.EditText;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0002 !Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/EditField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "inputTypeString", "", "hint", "value", "defaultValue", "setupVehicleKeyboard", "Lkotlin/Function2;", "Landroid/widget/EditText;", "", "disableVehicleKeyboard", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getDefaultValue", "()Ljava/lang/String;", "setDefaultValue", "(Ljava/lang/String;)V", "getDisableVehicleKeyboard", "()Lkotlin/jvm/functions/Function1;", "setDisableVehicleKeyboard", "(Lkotlin/jvm/functions/Function1;)V", "getHint", "setHint", "getInputTypeString", "setInputTypeString", "getSetupVehicleKeyboard", "()Lkotlin/jvm/functions/Function2;", "setSetupVehicleKeyboard", "(Lkotlin/jvm/functions/Function2;)V", "getValue", "setValue", "InputType", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.EditField */
/* compiled from: DataEntryItem.kt */
public final class EditField extends Field {
    @SerializedName("default_value")
    private String defaultValue;
    private Function1<? super EditText, Unit> disableVehicleKeyboard;
    private String hint;
    private String inputTypeString;
    private Function2<? super EditText, ? super EditText, Unit> setupVehicleKeyboard;
    private String value;

    public final String getInputTypeString() {
        return this.inputTypeString;
    }

    public final void setInputTypeString(String str) {
        this.inputTypeString = str;
    }

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

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final void setDefaultValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.defaultValue = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditField(String str, String str2, String str3, String str4, Function2 function2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : function2, (i & 32) != 0 ? null : function1);
    }

    public final Function2<EditText, EditText, Unit> getSetupVehicleKeyboard() {
        return this.setupVehicleKeyboard;
    }

    public final void setSetupVehicleKeyboard(Function2<? super EditText, ? super EditText, Unit> function2) {
        this.setupVehicleKeyboard = function2;
    }

    public final Function1<EditText, Unit> getDisableVehicleKeyboard() {
        return this.disableVehicleKeyboard;
    }

    public final void setDisableVehicleKeyboard(Function1<? super EditText, Unit> function1) {
        this.disableVehicleKeyboard = function1;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/EditField$JsonFields;", "", "()V", "defaultValue", "", "fieldName", "hint", "type", "value", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.EditField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String defaultValue = "default_value";
        public static final String fieldName = "edit_text";
        public static final String hint = "hint";
        public static final String type = "type";
        public static final String value = "value";

        private JsonFields() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditField(String str, String str2, String str3, String str4, Function2<? super EditText, ? super EditText, Unit> function2, Function1<? super EditText, Unit> function1) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str4, "defaultValue");
        this.inputTypeString = str;
        this.hint = str2;
        this.value = str3;
        this.defaultValue = str4;
        this.setupVehicleKeyboard = function2;
        this.disableVehicleKeyboard = function1;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/EditField$InputType;", "", "()V", "multiline", "", "name", "password", "phone", "text", "vehicleNumber", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.EditField$InputType */
    /* compiled from: DataEntryItem.kt */
    public static final class InputType {
        public static final InputType INSTANCE = new InputType();
        public static final String multiline = "multiline";
        public static final String name = "name";
        public static final String password = "password";
        public static final String phone = "phone";
        public static final String text = "text";
        public static final String vehicleNumber = "vehicleNumber";

        private InputType() {
        }
    }
}
