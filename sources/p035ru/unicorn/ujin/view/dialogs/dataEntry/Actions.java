package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/Actions;", "", "click", "Lru/unicorn/ujin/view/dialogs/dataEntry/ClickAction;", "(Lru/unicorn/ujin/view/dialogs/dataEntry/ClickAction;)V", "getClick", "()Lru/unicorn/ujin/view/dialogs/dataEntry/ClickAction;", "setClick", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.Actions */
/* compiled from: DataEntryItem.kt */
public final class Actions {
    private ClickAction click;

    public Actions(ClickAction clickAction) {
        Intrinsics.checkNotNullParameter(clickAction, JsonFields.click);
        this.click = clickAction;
    }

    public final ClickAction getClick() {
        return this.click;
    }

    public final void setClick(ClickAction clickAction) {
        Intrinsics.checkNotNullParameter(clickAction, "<set-?>");
        this.click = clickAction;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/Actions$JsonFields;", "", "()V", "click", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.Actions$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String click = "click";

        private JsonFields() {
        }
    }
}
