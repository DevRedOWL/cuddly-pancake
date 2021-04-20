package p035ru.unicorn.ujin.data.realm.notification;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4628x1a6dcade;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\b\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R \u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R \u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/notification/Notification;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/data/realm/notification/NotificationType;", "id", "", "event", "title", "body", "data", "Lru/unicorn/ujin/data/realm/notification/NotificationData;", "sentAt", "readAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/data/realm/notification/NotificationData;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "getData", "()Lru/unicorn/ujin/data/realm/notification/NotificationData;", "setData", "(Lru/unicorn/ujin/data/realm/notification/NotificationData;)V", "getEvent", "setEvent", "getId", "setId", "getReadAt", "setReadAt", "getSentAt", "setSentAt", "getTitle", "setTitle", "getType", "", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.notification.Notification */
/* compiled from: Notification.kt */
public class Notification extends RealmObject implements NotificationType, C4628x1a6dcade {
    private String body;
    private NotificationData data;
    private String event;
    @PrimaryKey

    /* renamed from: id */
    private String f6699id;
    @SerializedName("read_at")
    private String readAt;
    @SerializedName("sent_at")
    private String sentAt;
    private String title;

    public Notification() {
        this((String) null, (String) null, (String) null, (String) null, (NotificationData) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public int getType() {
        return 1;
    }

    public String realmGet$body() {
        return this.body;
    }

    public NotificationData realmGet$data() {
        return this.data;
    }

    public String realmGet$event() {
        return this.event;
    }

    public String realmGet$id() {
        return this.f6699id;
    }

    public String realmGet$readAt() {
        return this.readAt;
    }

    public String realmGet$sentAt() {
        return this.sentAt;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$body(String str) {
        this.body = str;
    }

    public void realmSet$data(NotificationData notificationData) {
        this.data = notificationData;
    }

    public void realmSet$event(String str) {
        this.event = str;
    }

    public void realmSet$id(String str) {
        this.f6699id = str;
    }

    public void realmSet$readAt(String str) {
        this.readAt = str;
    }

    public void realmSet$sentAt(String str) {
        this.sentAt = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Notification(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, p035ru.unicorn.ujin.data.realm.notification.NotificationData r10, java.lang.String r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
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
            java.lang.String r7 = (java.lang.String) r7
        L_0x000f:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0017
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L_0x0017:
            r1 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001f
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
        L_0x001f:
            r2 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0027
            r10 = r0
            ru.unicorn.ujin.data.realm.notification.NotificationData r10 = (p035ru.unicorn.ujin.data.realm.notification.NotificationData) r10
        L_0x0027:
            r3 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002f
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
        L_0x002f:
            r4 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0037
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
        L_0x0037:
            r0 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            boolean r6 = r5 instanceof p046io.realm.internal.RealmObjectProxy
            if (r6 == 0) goto L_0x004d
            r6 = r5
            io.realm.internal.RealmObjectProxy r6 = (p046io.realm.internal.RealmObjectProxy) r6
            r6.realm$injectObjectContext()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.notification.Notification.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.unicorn.ujin.data.realm.notification.NotificationData, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getEvent() {
        return realmGet$event();
    }

    public final void setEvent(String str) {
        realmSet$event(str);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getBody() {
        return realmGet$body();
    }

    public final void setBody(String str) {
        realmSet$body(str);
    }

    public final NotificationData getData() {
        return realmGet$data();
    }

    public final void setData(NotificationData notificationData) {
        realmSet$data(notificationData);
    }

    public final String getSentAt() {
        return realmGet$sentAt();
    }

    public final void setSentAt(String str) {
        realmSet$sentAt(str);
    }

    public final String getReadAt() {
        return realmGet$readAt();
    }

    public final void setReadAt(String str) {
        realmSet$readAt(str);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/notification/Notification$Fields;", "", "()V", "id", "", "readAt", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.notification.Notification$Fields */
    /* compiled from: Notification.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6700id = "id";
        public static final String readAt = "readAt";

        private Fields() {
        }
    }

    public Notification(String str, String str2, String str3, String str4, NotificationData notificationData, String str5, String str6) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$event(str2);
        realmSet$title(str3);
        realmSet$body(str4);
        realmSet$data(notificationData);
        realmSet$sentAt(str5);
        realmSet$readAt(str6);
    }
}
