package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/ClickAction;", "", "type", "", "data", "Lru/unicorn/ujin/view/dialogs/dataEntry/ClickActionData;", "(Ljava/lang/String;Lru/unicorn/ujin/view/dialogs/dataEntry/ClickActionData;)V", "getData", "()Lru/unicorn/ujin/view/dialogs/dataEntry/ClickActionData;", "setData", "(Lru/unicorn/ujin/view/dialogs/dataEntry/ClickActionData;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "JsonFields", "Type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction */
/* compiled from: DataEntryItem.kt */
public final class ClickAction {
    private ClickActionData data;
    private String type;

    public ClickAction(String str, ClickActionData clickActionData) {
        this.type = str;
        this.data = clickActionData;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final ClickActionData getData() {
        return this.data;
    }

    public final void setData(ClickActionData clickActionData) {
        this.data = clickActionData;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/ClickAction$JsonFields;", "", "()V", "data", "", "type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String data = "data";
        public static final String type = "type";

        private JsonFields() {
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/ClickAction$Type;", "", "()V", "apiCall", "", "callPhone", "customClick", "openUrl", "openUrlAndCallback", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction$Type */
    /* compiled from: DataEntryItem.kt */
    public static final class Type {
        public static final Type INSTANCE = new Type();
        public static final String apiCall = "api_call";
        public static final String callPhone = "phone";
        public static final String customClick = "custom_click";
        public static final String openUrl = "url";
        public static final String openUrlAndCallback = "url_callback";

        private Type() {
        }
    }
}
