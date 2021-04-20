package p035ru.unicorn.ujin.data.realm;

import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0012B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ContextBanner;", "Lio/realm/RealmObject;", "id", "", "layout", "Lru/unicorn/ujin/data/realm/Layout;", "type", "(Ljava/lang/String;Lru/unicorn/ujin/data/realm/Layout;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getLayout", "()Lru/unicorn/ujin/data/realm/Layout;", "setLayout", "(Lru/unicorn/ujin/data/realm/Layout;)V", "getType", "setType", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.ContextBanner */
/* compiled from: ContextBanner.kt */
public class ContextBanner extends RealmObject implements ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface {
    @PrimaryKey

    /* renamed from: id */
    private String f6646id;
    private Layout layout;
    private String type;

    public ContextBanner() {
        this((String) null, (Layout) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$id() {
        return this.f6646id;
    }

    public Layout realmGet$layout() {
        return this.layout;
    }

    public String realmGet$type() {
        return this.type;
    }

    public void realmSet$id(String str) {
        this.f6646id = str;
    }

    public void realmSet$layout(Layout layout2) {
        this.layout = layout2;
    }

    public void realmSet$type(String str) {
        this.type = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextBanner(String str, Layout layout2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : layout2, (i & 4) != 0 ? null : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final Layout getLayout() {
        return realmGet$layout();
    }

    public final void setLayout(Layout layout2) {
        realmSet$layout(layout2);
    }

    public final String getType() {
        return realmGet$type();
    }

    public final void setType(String str) {
        realmSet$type(str);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ContextBanner$Fields;", "", "()V", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.ContextBanner$Fields */
    /* compiled from: ContextBanner.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6647id = "id";

        private Fields() {
        }
    }

    public ContextBanner(String str, Layout layout2, String str2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$layout(layout2);
        realmSet$type(str2);
    }
}
