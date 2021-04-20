package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/TitleField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "text", "", "type", "align", "justify", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlign", "()Ljava/lang/String;", "setAlign", "(Ljava/lang/String;)V", "getJustify", "setJustify", "getText", "setText", "getType", "setType", "JsonFields", "Type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.TitleField */
/* compiled from: DataEntryItem.kt */
public final class TitleField extends Field {
    private String align;
    private String justify;
    private String text;
    private String type;

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getAlign() {
        return this.align;
    }

    public final void setAlign(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.align = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TitleField(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "primary" : str2, (i & 4) != 0 ? "start" : str3, (i & 8) != 0 ? "default" : str4);
    }

    public final String getJustify() {
        return this.justify;
    }

    public final void setJustify(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.justify = str;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/TitleField$JsonFields;", "", "()V", "align", "", "fieldName", "justify", "text", "type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.TitleField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String align = "align";
        public static final String fieldName = "title";
        public static final String justify = "justify";
        public static final String text = "text";
        public static final String type = "type";

        private JsonFields() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleField(String str, String str2, String str3, String str4) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(str3, "align");
        Intrinsics.checkNotNullParameter(str4, "justify");
        this.text = str;
        this.type = str2;
        this.align = str3;
        this.justify = str4;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/TitleField$Type;", "", "()V", "alignCenter", "", "alignEnd", "alignStart", "bold", "justifyDefault", "justifyFillWidth", "primary", "secondary", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.TitleField$Type */
    /* compiled from: DataEntryItem.kt */
    public static final class Type {
        public static final Type INSTANCE = new Type();
        public static final String alignCenter = "center";
        public static final String alignEnd = "end";
        public static final String alignStart = "start";
        public static final String bold = "bold";
        public static final String justifyDefault = "default";
        public static final String justifyFillWidth = "fill_width";
        public static final String primary = "primary";
        public static final String secondary = "secondary";

        private Type() {
        }
    }
}
