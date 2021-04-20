package p035ru.unicorn.ujin.data.realm;

import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_RealmStringRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/RealmString;", "Lio/realm/RealmObject;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "setValue", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.RealmString */
/* compiled from: RealmString.kt */
public class RealmString extends RealmObject implements ru_unicorn_ujin_data_realm_RealmStringRealmProxyInterface {
    private String value;

    public RealmString() {
        this((String) null, 1, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealmString(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getValue() {
        return realmGet$value();
    }

    public final void setValue(String str) {
        realmSet$value(str);
    }

    public RealmString(String str) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$value(str);
    }
}
