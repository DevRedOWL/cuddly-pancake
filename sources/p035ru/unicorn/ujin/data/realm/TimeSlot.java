package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/TimeSlot;", "Lio/realm/RealmObject;", "id", "", "state", "startTime", "endTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEndTime", "()Ljava/lang/String;", "setEndTime", "(Ljava/lang/String;)V", "getId", "setId", "getStartTime", "setStartTime", "getState", "setState", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.TimeSlot */
/* compiled from: TimeSlot.kt */
public class TimeSlot extends RealmObject implements ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface {
    @SerializedName("dt_end")
    private String endTime;
    @PrimaryKey

    /* renamed from: id */
    private String f6667id;
    @SerializedName("dt_start")
    private String startTime;
    private String state;

    public TimeSlot() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$endTime() {
        return this.endTime;
    }

    public String realmGet$id() {
        return this.f6667id;
    }

    public String realmGet$startTime() {
        return this.startTime;
    }

    public String realmGet$state() {
        return this.state;
    }

    public void realmSet$endTime(String str) {
        this.endTime = str;
    }

    public void realmSet$id(String str) {
        this.f6667id = str;
    }

    public void realmSet$startTime(String str) {
        this.startTime = str;
    }

    public void realmSet$state(String str) {
        this.state = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimeSlot(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
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

    public final String getState() {
        return realmGet$state();
    }

    public final void setState(String str) {
        realmSet$state(str);
    }

    public final String getStartTime() {
        return realmGet$startTime();
    }

    public final void setStartTime(String str) {
        realmSet$startTime(str);
    }

    public final String getEndTime() {
        return realmGet$endTime();
    }

    public final void setEndTime(String str) {
        realmSet$endTime(str);
    }

    public TimeSlot(String str, String str2, String str3, String str4) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$state(str2);
        realmSet$startTime(str3);
        realmSet$endTime(str4);
    }
}
