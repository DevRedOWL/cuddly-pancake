package p035ru.unicorn.ujin.data.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/SubAccount;", "Lio/realm/RealmObject;", "name", "", "phone", "rules", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPhone", "setPhone", "getRules", "()I", "setRules", "(I)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.SubAccount */
/* compiled from: SubAccountsResponse.kt */
public class SubAccount extends RealmObject implements ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface {
    private String name;
    private String phone;
    private int rules;

    public SubAccount() {
        this((String) null, (String) null, 0, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$phone() {
        return this.phone;
    }

    public int realmGet$rules() {
        return this.rules;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$phone(String str) {
        this.phone = str;
    }

    public void realmSet$rules(int i) {
        this.rules = i;
    }

    public final String getName() {
        return realmGet$name();
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$name(str);
    }

    public final String getPhone() {
        return realmGet$phone();
    }

    public final void setPhone(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$phone(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubAccount(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final int getRules() {
        return realmGet$rules();
    }

    public final void setRules(int i) {
        realmSet$rules(i);
    }

    public SubAccount(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "phone");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$name(str);
        realmSet$phone(str2);
        realmSet$rules(i);
    }
}
