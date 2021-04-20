package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/DividerField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "height", "", "(Ljava/lang/Integer;)V", "getHeight", "()Ljava/lang/Integer;", "setHeight", "Ljava/lang/Integer;", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.DividerField */
/* compiled from: DataEntryItem.kt */
public final class DividerField extends Field {
    private Integer height;

    public final Integer getHeight() {
        return this.height;
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/DividerField$JsonFields;", "", "()V", "fieldName", "", "getFieldName", "()Ljava/lang/String;", "height", "getHeight", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.DividerField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        private static final String fieldName = "divider";
        private static final String height = "height";

        private JsonFields() {
        }

        public final String getFieldName() {
            return fieldName;
        }

        public final String getHeight() {
            return height;
        }
    }

    public DividerField(Integer num) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        this.height = num;
    }
}
