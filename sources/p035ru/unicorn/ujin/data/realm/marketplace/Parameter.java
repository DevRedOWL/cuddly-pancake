package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4616x3c8a39e8;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Parameter;", "Lio/realm/RealmObject;", "name", "", "unit", "value", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getUnit", "setUnit", "getValue", "setValue", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Parameter */
/* compiled from: Parameter.kt */
public class Parameter extends RealmObject implements C4616x3c8a39e8 {
    @SerializedName("param_name")
    private String name;
    @SerializedName("param_unit")
    private String unit;
    @SerializedName("param_value")
    private String value;

    public Parameter() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$unit() {
        return this.unit;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$unit(String str) {
        this.unit = str;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Parameter(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
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

    public final String getUnit() {
        return realmGet$unit();
    }

    public final void setUnit(String str) {
        realmSet$unit(str);
    }

    public final String getValue() {
        return realmGet$value();
    }

    public final void setValue(String str) {
        realmSet$value(str);
    }

    public Parameter(String str, String str2, String str3) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$name(str);
        realmSet$unit(str2);
        realmSet$value(str3);
    }
}
