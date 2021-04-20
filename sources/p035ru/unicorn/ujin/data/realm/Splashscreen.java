package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001bBY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Splashscreen;", "Lio/realm/RealmObject;", "id", "", "title", "complexId", "backgroundUrl", "foregroundUrl", "toolbarUrl", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundUrl", "()Ljava/lang/String;", "setBackgroundUrl", "(Ljava/lang/String;)V", "getComplexId", "setComplexId", "getForegroundUrl", "setForegroundUrl", "getId", "setId", "getTitle", "setTitle", "getToken", "setToken", "getToolbarUrl", "setToolbarUrl", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Splashscreen */
/* compiled from: Splashscreen.kt */
public class Splashscreen extends RealmObject implements ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface {
    @SerializedName("background_url")
    private String backgroundUrl;
    @SerializedName("complex_id")
    private String complexId;
    @SerializedName("foreground_url")
    private String foregroundUrl;
    @PrimaryKey

    /* renamed from: id */
    private String f6666id;
    private String title;
    private String token;
    @SerializedName("toolbar_url")
    private String toolbarUrl;

    public Splashscreen() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$backgroundUrl() {
        return this.backgroundUrl;
    }

    public String realmGet$complexId() {
        return this.complexId;
    }

    public String realmGet$foregroundUrl() {
        return this.foregroundUrl;
    }

    public String realmGet$id() {
        return this.f6666id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$token() {
        return this.token;
    }

    public String realmGet$toolbarUrl() {
        return this.toolbarUrl;
    }

    public void realmSet$backgroundUrl(String str) {
        this.backgroundUrl = str;
    }

    public void realmSet$complexId(String str) {
        this.complexId = str;
    }

    public void realmSet$foregroundUrl(String str) {
        this.foregroundUrl = str;
    }

    public void realmSet$id(String str) {
        this.f6666id = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$token(String str) {
        this.token = str;
    }

    public void realmSet$toolbarUrl(String str) {
        this.toolbarUrl = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Splashscreen(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
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
            java.lang.String r10 = (java.lang.String) r10
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.Splashscreen.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getComplexId() {
        return realmGet$complexId();
    }

    public final void setComplexId(String str) {
        realmSet$complexId(str);
    }

    public final String getBackgroundUrl() {
        return realmGet$backgroundUrl();
    }

    public final void setBackgroundUrl(String str) {
        realmSet$backgroundUrl(str);
    }

    public final String getForegroundUrl() {
        return realmGet$foregroundUrl();
    }

    public final void setForegroundUrl(String str) {
        realmSet$foregroundUrl(str);
    }

    public final String getToolbarUrl() {
        return realmGet$toolbarUrl();
    }

    public final void setToolbarUrl(String str) {
        realmSet$toolbarUrl(str);
    }

    public final String getToken() {
        return realmGet$token();
    }

    public final void setToken(String str) {
        realmSet$token(str);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Splashscreen$Fields;", "", "()V", "token", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.Splashscreen$Fields */
    /* compiled from: Splashscreen.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();
        public static final String token = "token";

        private Fields() {
        }
    }

    public Splashscreen(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$title(str2);
        realmSet$complexId(str3);
        realmSet$backgroundUrl(str4);
        realmSet$foregroundUrl(str5);
        realmSet$toolbarUrl(str6);
        realmSet$token(str7);
    }
}
