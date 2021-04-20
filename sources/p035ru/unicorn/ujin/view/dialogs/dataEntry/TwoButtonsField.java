package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/TwoButtonsField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "leftButton", "Lru/unicorn/ujin/view/dialogs/dataEntry/ButtonField;", "rightButton", "(Lru/unicorn/ujin/view/dialogs/dataEntry/ButtonField;Lru/unicorn/ujin/view/dialogs/dataEntry/ButtonField;)V", "getLeftButton", "()Lru/unicorn/ujin/view/dialogs/dataEntry/ButtonField;", "getRightButton", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.TwoButtonsField */
/* compiled from: DataEntryItem.kt */
public final class TwoButtonsField extends Field {
    private final ButtonField leftButton;
    private final ButtonField rightButton;

    public final ButtonField getLeftButton() {
        return this.leftButton;
    }

    public final ButtonField getRightButton() {
        return this.rightButton;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/TwoButtonsField$JsonFields;", "", "()V", "fieldName", "", "leftButton", "rightButton", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.TwoButtonsField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String fieldName = "two_buttons";
        public static final String leftButton = "left_button";
        public static final String rightButton = "right_button";

        private JsonFields() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TwoButtonsField(ButtonField buttonField, ButtonField buttonField2) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(buttonField, "leftButton");
        Intrinsics.checkNotNullParameter(buttonField2, "rightButton");
        this.leftButton = buttonField;
        this.rightButton = buttonField2;
    }
}
