package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4621xe45ce20d;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/RedeemedCodeDate;", "Lio/realm/RealmObject;", "date", "", "timezoneType", "timezone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getTimezone", "setTimezone", "getTimezoneType", "setTimezoneType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate */
/* compiled from: RedeemedCode.kt */
public class RedeemedCodeDate extends RealmObject implements C4621xe45ce20d {
    private String date;
    private String timezone;
    @SerializedName("timezone_type")
    private String timezoneType;

    public RedeemedCodeDate() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$date() {
        return this.date;
    }

    public String realmGet$timezone() {
        return this.timezone;
    }

    public String realmGet$timezoneType() {
        return this.timezoneType;
    }

    public void realmSet$date(String str) {
        this.date = str;
    }

    public void realmSet$timezone(String str) {
        this.timezone = str;
    }

    public void realmSet$timezoneType(String str) {
        this.timezoneType = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RedeemedCodeDate(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getDate() {
        return realmGet$date();
    }

    public final void setDate(String str) {
        realmSet$date(str);
    }

    public final String getTimezoneType() {
        return realmGet$timezoneType();
    }

    public final void setTimezoneType(String str) {
        realmSet$timezoneType(str);
    }

    public final String getTimezone() {
        return realmGet$timezone();
    }

    public final void setTimezone(String str) {
        realmSet$timezone(str);
    }

    public RedeemedCodeDate(String str, String str2, String str3) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$date(str);
        realmSet$timezoneType(str2);
        realmSet$timezone(str3);
    }
}
