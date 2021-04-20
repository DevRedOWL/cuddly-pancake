package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import p046io.realm.C4619xb6e95a6e;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Property;", "Lio/realm/RealmObject;", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getValue", "setValue", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Property */
/* compiled from: Property.kt */
public class Property extends RealmObject implements C4619xb6e95a6e {
    private String name;
    private String value;

    public Property() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Property(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getName() {
        return realmGet$name();
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final String getValue() {
        return realmGet$value();
    }

    public final void setValue(String str) {
        realmSet$value(str);
    }

    public Property(String str, String str2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$name(str);
        realmSet$value(str2);
    }
}
