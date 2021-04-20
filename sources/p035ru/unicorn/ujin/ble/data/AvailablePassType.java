package p035ru.unicorn.ujin.ble.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/ble/data/AvailablePassType;", "Lio/realm/RealmObject;", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.data.AvailablePassType */
/* compiled from: BleData.kt */
public class AvailablePassType extends RealmObject implements ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxyInterface {
    @PrimaryKey
    private String type;

    public AvailablePassType() {
        this((String) null, 1, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$type() {
        return this.type;
    }

    public void realmSet$type(String str) {
        this.type = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvailablePassType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getType() {
        return realmGet$type();
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$type(str);
    }

    public AvailablePassType(String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$type(str);
    }
}
