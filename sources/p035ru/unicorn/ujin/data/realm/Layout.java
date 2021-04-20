package p035ru.unicorn.ujin.data.realm;

import kotlin.Metadata;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Layout;", "Lio/realm/RealmObject;", "background", "", "bank", "Lru/unicorn/ujin/data/realm/Bank;", "features", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/Feature;", "title", "phone", "(Ljava/lang/String;Lru/unicorn/ujin/data/realm/Bank;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/String;)V", "getBackground", "()Ljava/lang/String;", "setBackground", "(Ljava/lang/String;)V", "getBank", "()Lru/unicorn/ujin/data/realm/Bank;", "setBank", "(Lru/unicorn/ujin/data/realm/Bank;)V", "getFeatures", "()Lio/realm/RealmList;", "setFeatures", "(Lio/realm/RealmList;)V", "getPhone", "setPhone", "getTitle", "setTitle", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Layout */
/* compiled from: ContextBanner.kt */
public class Layout extends RealmObject implements ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface {
    private String background;
    private Bank bank;
    private RealmList<Feature> features;
    private String phone;
    private String title;

    public Layout() {
        this((String) null, (Bank) null, (RealmList) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$background() {
        return this.background;
    }

    public Bank realmGet$bank() {
        return this.bank;
    }

    public RealmList realmGet$features() {
        return this.features;
    }

    public String realmGet$phone() {
        return this.phone;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$background(String str) {
        this.background = str;
    }

    public void realmSet$bank(Bank bank2) {
        this.bank = bank2;
    }

    public void realmSet$features(RealmList realmList) {
        this.features = realmList;
    }

    public void realmSet$phone(String str) {
        this.phone = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Layout(java.lang.String r4, p035ru.unicorn.ujin.data.realm.Bank r5, p046io.realm.RealmList r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
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
            ru.unicorn.ujin.data.realm.Bank r5 = (p035ru.unicorn.ujin.data.realm.Bank) r5
        L_0x000f:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0017
            r6 = r0
            io.realm.RealmList r6 = (p046io.realm.RealmList) r6
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.Layout.<init>(java.lang.String, ru.unicorn.ujin.data.realm.Bank, io.realm.RealmList, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getBackground() {
        return realmGet$background();
    }

    public final void setBackground(String str) {
        realmSet$background(str);
    }

    public final Bank getBank() {
        return realmGet$bank();
    }

    public final void setBank(Bank bank2) {
        realmSet$bank(bank2);
    }

    public final RealmList<Feature> getFeatures() {
        return realmGet$features();
    }

    public final void setFeatures(RealmList<Feature> realmList) {
        realmSet$features(realmList);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getPhone() {
        return realmGet$phone();
    }

    public final void setPhone(String str) {
        realmSet$phone(str);
    }

    public Layout(String str, Bank bank2, RealmList<Feature> realmList, String str2, String str3) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$background(str);
        realmSet$bank(bank2);
        realmSet$features(realmList);
        realmSet$title(str2);
        realmSet$phone(str3);
    }
}
