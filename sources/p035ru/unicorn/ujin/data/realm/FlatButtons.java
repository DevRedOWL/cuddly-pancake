package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/FlatButtons;", "Lio/realm/RealmObject;", "callButtonText", "", "acceptanceButtonText", "(Ljava/lang/String;Ljava/lang/String;)V", "getAcceptanceButtonText", "()Ljava/lang/String;", "setAcceptanceButtonText", "(Ljava/lang/String;)V", "getCallButtonText", "setCallButtonText", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.FlatButtons */
/* compiled from: FlatButtons.kt */
public class FlatButtons extends RealmObject implements ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface {
    @SerializedName("acceptance")
    private String acceptanceButtonText;
    @SerializedName("call")
    private String callButtonText;

    public FlatButtons() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$acceptanceButtonText() {
        return this.acceptanceButtonText;
    }

    public String realmGet$callButtonText() {
        return this.callButtonText;
    }

    public void realmSet$acceptanceButtonText(String str) {
        this.acceptanceButtonText = str;
    }

    public void realmSet$callButtonText(String str) {
        this.callButtonText = str;
    }

    public final String getCallButtonText() {
        return realmGet$callButtonText();
    }

    public final void setCallButtonText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$callButtonText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlatButtons(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getAcceptanceButtonText() {
        return realmGet$acceptanceButtonText();
    }

    public final void setAcceptanceButtonText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$acceptanceButtonText(str);
    }

    public FlatButtons(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "callButtonText");
        Intrinsics.checkNotNullParameter(str2, "acceptanceButtonText");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$callButtonText(str);
        realmSet$acceptanceButtonText(str2);
    }
}
