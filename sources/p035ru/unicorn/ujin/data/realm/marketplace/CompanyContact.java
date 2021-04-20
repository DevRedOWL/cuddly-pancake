package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import p046io.realm.C4610x1f8a05e0;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/CompanyContact;", "Lio/realm/RealmObject;", "type", "", "value", "details", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "setDetails", "(Ljava/lang/String;)V", "getType", "setType", "getValue", "setValue", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.CompanyContact */
/* compiled from: Company.kt */
public class CompanyContact extends RealmObject implements C4610x1f8a05e0 {
    private String details;
    private String type;
    private String value;

    public CompanyContact() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$details() {
        return this.details;
    }

    public String realmGet$type() {
        return this.type;
    }

    public String realmGet$value() {
        return this.value;
    }

    public void realmSet$details(String str) {
        this.details = str;
    }

    public void realmSet$type(String str) {
        this.type = str;
    }

    public void realmSet$value(String str) {
        this.value = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompanyContact(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getType() {
        return realmGet$type();
    }

    public final void setType(String str) {
        realmSet$type(str);
    }

    public final String getValue() {
        return realmGet$value();
    }

    public final void setValue(String str) {
        realmSet$value(str);
    }

    public final String getDetails() {
        return realmGet$details();
    }

    public final void setDetails(String str) {
        realmSet$details(str);
    }

    public CompanyContact(String str, String str2, String str3) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$type(str);
        realmSet$value(str2);
        realmSet$details(str3);
    }
}
