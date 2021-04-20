package p035ru.unicorn.ujin.data.realm;

import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Feature;", "Lio/realm/RealmObject;", "id", "", "title", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getValue", "setValue", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Feature */
/* compiled from: ContextBanner.kt */
public class Feature extends RealmObject implements ru_unicorn_ujin_data_realm_FeatureRealmProxyInterface {

    /* renamed from: id */
    private String f6652id;
    private String title;
    private String value;

    public Feature() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$id() {
        return this.f6652id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$id(String str) {
        this.f6652id = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Feature(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
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

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getValue() {
        return realmGet$value();
    }

    public final void setValue(String str) {
        realmSet$value(str);
    }

    public Feature(String str, String str2, String str3) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$title(str2);
        realmSet$value(str3);
    }
}
