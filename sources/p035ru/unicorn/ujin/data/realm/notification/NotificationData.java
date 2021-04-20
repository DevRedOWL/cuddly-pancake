package p035ru.unicorn.ujin.data.realm.notification;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4627x94d0fcd4;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013¨\u0006,"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/notification/NotificationData;", "Lio/realm/RealmObject;", "badge", "", "event", "", "chatid", "ticketId", "newsId", "marketId", "chatSound", "", "apartmentid", "clickAction", "objectTypeName", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApartmentid", "()Ljava/lang/String;", "setApartmentid", "(Ljava/lang/String;)V", "getBadge", "()Ljava/lang/Integer;", "setBadge", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getChatSound", "()Ljava/lang/Boolean;", "setChatSound", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getChatid", "setChatid", "getClickAction", "setClickAction", "getEvent", "setEvent", "getMarketId", "setMarketId", "getNewsId", "setNewsId", "getObjectTypeName", "setObjectTypeName", "getTicketId", "setTicketId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.notification.NotificationData */
/* compiled from: Notification.kt */
public class NotificationData extends RealmObject implements C4627x94d0fcd4 {
    private String apartmentid;
    private Integer badge;
    @SerializedName("chat_sound")
    private Boolean chatSound;
    private String chatid;
    @SerializedName("click_action")
    private String clickAction;
    private String event;
    @SerializedName("market_id")
    private String marketId;
    @SerializedName("news_id")
    private String newsId;
    @SerializedName("object_type_name")
    private String objectTypeName;
    @SerializedName("ticket_id")
    private String ticketId;

    public NotificationData() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$apartmentid() {
        return this.apartmentid;
    }

    public Integer realmGet$badge() {
        return this.badge;
    }

    public Boolean realmGet$chatSound() {
        return this.chatSound;
    }

    public String realmGet$chatid() {
        return this.chatid;
    }

    public String realmGet$clickAction() {
        return this.clickAction;
    }

    public String realmGet$event() {
        return this.event;
    }

    public String realmGet$marketId() {
        return this.marketId;
    }

    public String realmGet$newsId() {
        return this.newsId;
    }

    public String realmGet$objectTypeName() {
        return this.objectTypeName;
    }

    public String realmGet$ticketId() {
        return this.ticketId;
    }

    public void realmSet$apartmentid(String str) {
        this.apartmentid = str;
    }

    public void realmSet$badge(Integer num) {
        this.badge = num;
    }

    public void realmSet$chatSound(Boolean bool) {
        this.chatSound = bool;
    }

    public void realmSet$chatid(String str) {
        this.chatid = str;
    }

    public void realmSet$clickAction(String str) {
        this.clickAction = str;
    }

    public void realmSet$event(String str) {
        this.event = str;
    }

    public void realmSet$marketId(String str) {
        this.marketId = str;
    }

    public void realmSet$newsId(String str) {
        this.newsId = str;
    }

    public void realmSet$objectTypeName(String str) {
        this.objectTypeName = str;
    }

    public void realmSet$ticketId(String str) {
        this.ticketId = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NotificationData(java.lang.Integer r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r0 = r12
            r1 = r23
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000c
            r2 = r3
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x000d
        L_0x000c:
            r2 = r13
        L_0x000d:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0015
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0016
        L_0x0015:
            r4 = r14
        L_0x0016:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x001e
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0027
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0029
        L_0x0027:
            r6 = r16
        L_0x0029:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0031
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0033
        L_0x0031:
            r7 = r17
        L_0x0033:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x003b
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x003d
        L_0x003b:
            r8 = r18
        L_0x003d:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0045
            r9 = r3
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            goto L_0x0047
        L_0x0045:
            r9 = r19
        L_0x0047:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004f
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0051
        L_0x004f:
            r10 = r20
        L_0x0051:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0059
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x005b
        L_0x0059:
            r11 = r21
        L_0x005b:
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0063
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0065
        L_0x0063:
            r1 = r22
        L_0x0065:
            r13 = r12
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x0085
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.notification.NotificationData.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Integer getBadge() {
        return realmGet$badge();
    }

    public final void setBadge(Integer num) {
        realmSet$badge(num);
    }

    public final String getEvent() {
        return realmGet$event();
    }

    public final void setEvent(String str) {
        realmSet$event(str);
    }

    public final String getChatid() {
        return realmGet$chatid();
    }

    public final void setChatid(String str) {
        realmSet$chatid(str);
    }

    public final String getTicketId() {
        return realmGet$ticketId();
    }

    public final void setTicketId(String str) {
        realmSet$ticketId(str);
    }

    public final String getNewsId() {
        return realmGet$newsId();
    }

    public final void setNewsId(String str) {
        realmSet$newsId(str);
    }

    public final String getMarketId() {
        return realmGet$marketId();
    }

    public final void setMarketId(String str) {
        realmSet$marketId(str);
    }

    public final Boolean getChatSound() {
        return realmGet$chatSound();
    }

    public final void setChatSound(Boolean bool) {
        realmSet$chatSound(bool);
    }

    public final String getApartmentid() {
        return realmGet$apartmentid();
    }

    public final void setApartmentid(String str) {
        realmSet$apartmentid(str);
    }

    public final String getClickAction() {
        return realmGet$clickAction();
    }

    public final void setClickAction(String str) {
        realmSet$clickAction(str);
    }

    public final String getObjectTypeName() {
        return realmGet$objectTypeName();
    }

    public final void setObjectTypeName(String str) {
        realmSet$objectTypeName(str);
    }

    public NotificationData(Integer num, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$badge(num);
        realmSet$event(str);
        realmSet$chatid(str2);
        realmSet$ticketId(str3);
        realmSet$newsId(str4);
        realmSet$marketId(str5);
        realmSet$chatSound(bool);
        realmSet$apartmentid(str6);
        realmSet$clickAction(str7);
        realmSet$objectTypeName(str8);
    }
}
