package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\b\u0016\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u0006#"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/MyBeacon;", "Lio/realm/RealmObject;", "bssid", "", "minor", "", "radius", "", "radiusOut", "level", "levelOut", "autoAction", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAutoAction", "()Ljava/lang/Integer;", "setAutoAction", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBssid", "()Ljava/lang/String;", "setBssid", "(Ljava/lang/String;)V", "getLevel", "setLevel", "getLevelOut", "setLevelOut", "getMinor", "setMinor", "getRadius", "()Ljava/lang/Double;", "setRadius", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getRadiusOut", "setRadiusOut", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.MyBeacon */
/* compiled from: MyBeacon.kt */
public class MyBeacon extends RealmObject implements ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface {
    @SerializedName("auto-action")
    private Integer autoAction;
    @SerializedName("bssid")
    private String bssid;
    @SerializedName("level")
    private Integer level;
    @SerializedName("level-out")
    private Integer levelOut;
    @SerializedName("minor")
    @PrimaryKey
    private Integer minor;
    @SerializedName("radius")
    private Double radius;
    @SerializedName("radius-out")
    private Double radiusOut;

    public MyBeacon() {
        this((String) null, (Integer) null, (Double) null, (Double) null, (Integer) null, (Integer) null, (Integer) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Integer realmGet$autoAction() {
        return this.autoAction;
    }

    public String realmGet$bssid() {
        return this.bssid;
    }

    public Integer realmGet$level() {
        return this.level;
    }

    public Integer realmGet$levelOut() {
        return this.levelOut;
    }

    public Integer realmGet$minor() {
        return this.minor;
    }

    public Double realmGet$radius() {
        return this.radius;
    }

    public Double realmGet$radiusOut() {
        return this.radiusOut;
    }

    public void realmSet$autoAction(Integer num) {
        this.autoAction = num;
    }

    public void realmSet$bssid(String str) {
        this.bssid = str;
    }

    public void realmSet$level(Integer num) {
        this.level = num;
    }

    public void realmSet$levelOut(Integer num) {
        this.levelOut = num;
    }

    public void realmSet$minor(Integer num) {
        this.minor = num;
    }

    public void realmSet$radius(Double d) {
        this.radius = d;
    }

    public void realmSet$radiusOut(Double d) {
        this.radiusOut = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MyBeacon(java.lang.String r6, java.lang.Integer r7, java.lang.Double r8, java.lang.Double r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0008
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000f
            r7 = r0
            java.lang.Integer r7 = (java.lang.Integer) r7
        L_0x000f:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0017
            r8 = r0
            java.lang.Double r8 = (java.lang.Double) r8
        L_0x0017:
            r1 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001f
            r9 = r0
            java.lang.Double r9 = (java.lang.Double) r9
        L_0x001f:
            r2 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0027
            r10 = r0
            java.lang.Integer r10 = (java.lang.Integer) r10
        L_0x0027:
            r3 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002f
            r11 = r0
            java.lang.Integer r11 = (java.lang.Integer) r11
        L_0x002f:
            r0 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0039
            r7 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
        L_0x0039:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r0
            r14 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            boolean r6 = r5 instanceof p046io.realm.internal.RealmObjectProxy
            if (r6 == 0) goto L_0x004f
            r6 = r5
            io.realm.internal.RealmObjectProxy r6 = (p046io.realm.internal.RealmObjectProxy) r6
            r6.realm$injectObjectContext()
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.MyBeacon.<init>(java.lang.String, java.lang.Integer, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getBssid() {
        return realmGet$bssid();
    }

    public final void setBssid(String str) {
        realmSet$bssid(str);
    }

    public final Integer getMinor() {
        return realmGet$minor();
    }

    public final void setMinor(Integer num) {
        realmSet$minor(num);
    }

    public final Double getRadius() {
        return realmGet$radius();
    }

    public final void setRadius(Double d) {
        realmSet$radius(d);
    }

    public final Double getRadiusOut() {
        return realmGet$radiusOut();
    }

    public final void setRadiusOut(Double d) {
        realmSet$radiusOut(d);
    }

    public final Integer getLevel() {
        return realmGet$level();
    }

    public final void setLevel(Integer num) {
        realmSet$level(num);
    }

    public final Integer getLevelOut() {
        return realmGet$levelOut();
    }

    public final void setLevelOut(Integer num) {
        realmSet$levelOut(num);
    }

    public final Integer getAutoAction() {
        return realmGet$autoAction();
    }

    public final void setAutoAction(Integer num) {
        realmSet$autoAction(num);
    }

    public MyBeacon(String str, Integer num, Double d, Double d2, Integer num2, Integer num3, Integer num4) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$bssid(str);
        realmSet$minor(num);
        realmSet$radius(d);
        realmSet$radiusOut(d2);
        realmSet$level(num2);
        realmSet$levelOut(num3);
        realmSet$autoAction(num4);
    }
}
