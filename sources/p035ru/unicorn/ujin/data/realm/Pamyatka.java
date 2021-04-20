package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Pamyatka;", "Lio/realm/RealmObject;", "pamyatkaUrl", "", "pamyatkaTitle", "(Ljava/lang/String;Ljava/lang/String;)V", "getPamyatkaTitle", "()Ljava/lang/String;", "setPamyatkaTitle", "(Ljava/lang/String;)V", "getPamyatkaUrl", "setPamyatkaUrl", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Pamyatka */
/* compiled from: Pamyatka.kt */
public class Pamyatka extends RealmObject implements ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface {
    @SerializedName("title")
    private String pamyatkaTitle;
    @SerializedName("url")
    private String pamyatkaUrl;

    public Pamyatka() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$pamyatkaTitle() {
        return this.pamyatkaTitle;
    }

    public String realmGet$pamyatkaUrl() {
        return this.pamyatkaUrl;
    }

    public void realmSet$pamyatkaTitle(String str) {
        this.pamyatkaTitle = str;
    }

    public void realmSet$pamyatkaUrl(String str) {
        this.pamyatkaUrl = str;
    }

    public final String getPamyatkaUrl() {
        return realmGet$pamyatkaUrl();
    }

    public final void setPamyatkaUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$pamyatkaUrl(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Pamyatka(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getPamyatkaTitle() {
        return realmGet$pamyatkaTitle();
    }

    public final void setPamyatkaTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$pamyatkaTitle(str);
    }

    public Pamyatka(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "pamyatkaUrl");
        Intrinsics.checkNotNullParameter(str2, "pamyatkaTitle");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$pamyatkaUrl(str);
        realmSet$pamyatkaTitle(str2);
    }
}
