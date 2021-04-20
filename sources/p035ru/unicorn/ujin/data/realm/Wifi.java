package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\r¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Wifi;", "Lio/realm/RealmObject;", "ssid", "", "bssid", "level", "", "levelIn", "levelOut", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBssid", "()Ljava/lang/String;", "setBssid", "(Ljava/lang/String;)V", "getLevel", "()Ljava/lang/Integer;", "setLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLevelIn", "setLevelIn", "getLevelOut", "setLevelOut", "getSsid", "setSsid", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Wifi */
/* compiled from: Wifi.kt */
public class Wifi extends RealmObject implements ru_unicorn_ujin_data_realm_WifiRealmProxyInterface {
    @SerializedName("bssid")
    @PrimaryKey
    private String bssid;
    @SerializedName("level")
    private Integer level;
    @SerializedName("level-in")
    private Integer levelIn;
    @SerializedName("level-out")
    private Integer levelOut;
    @SerializedName("ssid")
    private String ssid;

    public Wifi() {
        this((String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, 31, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$bssid() {
        return this.bssid;
    }

    public Integer realmGet$level() {
        return this.level;
    }

    public Integer realmGet$levelIn() {
        return this.levelIn;
    }

    public Integer realmGet$levelOut() {
        return this.levelOut;
    }

    public String realmGet$ssid() {
        return this.ssid;
    }

    public void realmSet$bssid(String str) {
        this.bssid = str;
    }

    public void realmSet$level(Integer num) {
        this.level = num;
    }

    public void realmSet$levelIn(Integer num) {
        this.levelIn = num;
    }

    public void realmSet$levelOut(Integer num) {
        this.levelOut = num;
    }

    public void realmSet$ssid(String str) {
        this.ssid = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Wifi(java.lang.String r4, java.lang.String r5, java.lang.Integer r6, java.lang.Integer r7, java.lang.Integer r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L_0x0008
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
        L_0x0008:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000f
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
        L_0x000f:
            r10 = r5
            r5 = r9 & 4
            r0 = 0
            if (r5 == 0) goto L_0x0019
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x0019:
            r1 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0022
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0022:
            r2 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x002b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x002b:
            r0 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            boolean r4 = r3 instanceof p046io.realm.internal.RealmObjectProxy
            if (r4 == 0) goto L_0x003f
            r4 = r3
            io.realm.internal.RealmObjectProxy r4 = (p046io.realm.internal.RealmObjectProxy) r4
            r4.realm$injectObjectContext()
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.Wifi.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getSsid() {
        return realmGet$ssid();
    }

    public final void setSsid(String str) {
        realmSet$ssid(str);
    }

    public final String getBssid() {
        return realmGet$bssid();
    }

    public final void setBssid(String str) {
        realmSet$bssid(str);
    }

    public final Integer getLevel() {
        return realmGet$level();
    }

    public final void setLevel(Integer num) {
        realmSet$level(num);
    }

    public final Integer getLevelIn() {
        return realmGet$levelIn();
    }

    public final void setLevelIn(Integer num) {
        realmSet$levelIn(num);
    }

    public final Integer getLevelOut() {
        return realmGet$levelOut();
    }

    public final void setLevelOut(Integer num) {
        realmSet$levelOut(num);
    }

    public Wifi(String str, String str2, Integer num, Integer num2, Integer num3) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$ssid(str);
        realmSet$bssid(str2);
        realmSet$level(num);
        realmSet$levelIn(num2);
        realmSet$levelOut(num3);
    }
}
