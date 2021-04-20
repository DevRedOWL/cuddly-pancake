package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/Contact;", "", "type", "", "data", "map", "Lru/unicorn/ujin/view/dialogs/dataEntry/MapPoint;", "(Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/dialogs/dataEntry/MapPoint;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getMap", "()Lru/unicorn/ujin/view/dialogs/dataEntry/MapPoint;", "setMap", "(Lru/unicorn/ujin/view/dialogs/dataEntry/MapPoint;)V", "getType", "setType", "JsonFields", "Type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.Contact */
/* compiled from: DataEntryItem.kt */
public final class Contact {
    private String data;
    private MapPoint map;
    private String type;

    public Contact(String str, String str2, MapPoint mapPoint) {
        this.type = str;
        this.data = str2;
        this.map = mapPoint;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final String getData() {
        return this.data;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final MapPoint getMap() {
        return this.map;
    }

    public final void setMap(MapPoint mapPoint) {
        this.map = mapPoint;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/Contact$JsonFields;", "", "()V", "data", "", "map", "type", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.Contact$JsonFields */
    /* compiled from: DataEntryItem.kt */
    public static final class JsonFields {
        public static final JsonFields INSTANCE = new JsonFields();
        public static final String data = "data";
        public static final String map = "map";
        public static final String type = "type";

        private JsonFields() {
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/Contact$Type;", "", "()V", "address", "", "email", "other", "phone", "url", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.Contact$Type */
    /* compiled from: DataEntryItem.kt */
    public static final class Type {
        public static final Type INSTANCE = new Type();
        public static final String address = "address";
        public static final String email = "email";
        public static final String other = "other";
        public static final String phone = "phone";
        public static final String url = "url";

        private Type() {
        }
    }
}
