package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\u0015B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/BankLoanTitleField;", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "logoUrl", "", "title", "text", "textColor", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getLogoUrl", "setLogoUrl", "getText", "setText", "getTextColor", "setTextColor", "getTitle", "setTitle", "JsonFields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.BankLoanTitleField */
/* compiled from: DataEntryItem.kt */
public final class BankLoanTitleField extends Field {
    private String description;
    private String logoUrl;
    private String text;
    private String textColor;
    private String title;

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final void setLogoUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logoUrl = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final void setTextColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.textColor = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/BankLoanTitleField$JsonFields;", "", "()V", "description", "", "fieldName", "logoUrl", "text", "textColor", "title", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.BankLoanTitleField$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String description = "description";
        public static final String fieldName = "bank_loan";
        public static final String logoUrl = "logo_url";
        public static final String text = "text";
        public static final String textColor = "text_color";
        public static final String title = "title";

        private JsonFields() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BankLoanTitleField(String str, String str2, String str3, String str4, String str5) {
        super((String) null, false, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "logoUrl");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "text");
        Intrinsics.checkNotNullParameter(str4, "textColor");
        Intrinsics.checkNotNullParameter(str5, "description");
        this.logoUrl = str;
        this.title = str2;
        this.text = str3;
        this.textColor = str4;
        this.description = str5;
    }
}
