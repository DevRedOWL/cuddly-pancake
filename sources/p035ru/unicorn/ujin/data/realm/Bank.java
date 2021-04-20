package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_BankRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Bank;", "Lio/realm/RealmObject;", "accentColor", "", "agreementUrl", "id", "title", "logo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccentColor", "()Ljava/lang/String;", "setAccentColor", "(Ljava/lang/String;)V", "getAgreementUrl", "setAgreementUrl", "getId", "setId", "getLogo", "setLogo", "getTitle", "setTitle", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Bank */
/* compiled from: ContextBanner.kt */
public class Bank extends RealmObject implements ru_unicorn_ujin_data_realm_BankRealmProxyInterface {
    @SerializedName("accent_color")
    private String accentColor;
    @SerializedName("agreement_url")
    private String agreementUrl;

    /* renamed from: id */
    private String f6632id;
    private String logo;
    private String title;

    public Bank() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$accentColor() {
        return this.accentColor;
    }

    public String realmGet$agreementUrl() {
        return this.agreementUrl;
    }

    public String realmGet$id() {
        return this.f6632id;
    }

    public String realmGet$logo() {
        return this.logo;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$accentColor(String str) {
        this.accentColor = str;
    }

    public void realmSet$agreementUrl(String str) {
        this.agreementUrl = str;
    }

    public void realmSet$id(String str) {
        this.f6632id = str;
    }

    public void realmSet$logo(String str) {
        this.logo = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Bank(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
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
            if (r5 == 0) goto L_0x0017
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L_0x0017:
            r1 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001f
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L_0x001f:
            r2 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0027
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L_0x0027:
            r0 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            boolean r4 = r3 instanceof p046io.realm.internal.RealmObjectProxy
            if (r4 == 0) goto L_0x003b
            r4 = r3
            io.realm.internal.RealmObjectProxy r4 = (p046io.realm.internal.RealmObjectProxy) r4
            r4.realm$injectObjectContext()
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.Bank.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getAccentColor() {
        return realmGet$accentColor();
    }

    public final void setAccentColor(String str) {
        realmSet$accentColor(str);
    }

    public final String getAgreementUrl() {
        return realmGet$agreementUrl();
    }

    public final void setAgreementUrl(String str) {
        realmSet$agreementUrl(str);
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

    public final String getLogo() {
        return realmGet$logo();
    }

    public final void setLogo(String str) {
        realmSet$logo(str);
    }

    public Bank(String str, String str2, String str3, String str4, String str5) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$accentColor(str);
        realmSet$agreementUrl(str2);
        realmSet$id(str3);
        realmSet$title(str4);
        realmSet$logo(str5);
    }
}
