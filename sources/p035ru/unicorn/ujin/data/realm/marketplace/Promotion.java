package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4618xa0424aae;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001bBY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Promotion;", "Lio/realm/RealmObject;", "id", "", "text", "companyId", "startedAt", "finishedAt", "createdAt", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyId", "()Ljava/lang/String;", "setCompanyId", "(Ljava/lang/String;)V", "getCreatedAt", "setCreatedAt", "getFinishedAt", "setFinishedAt", "getId", "setId", "getStartedAt", "setStartedAt", "getText", "setText", "getUpdatedAt", "setUpdatedAt", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Promotion */
/* compiled from: Promotion.kt */
public class Promotion extends RealmObject implements C4618xa0424aae {
    @SerializedName("company_id")
    private String companyId;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("finished_at")
    private String finishedAt;
    @PrimaryKey

    /* renamed from: id */
    private String f6692id;
    @SerializedName("started_at")
    private String startedAt;
    private String text;
    @SerializedName("updated_at")
    private String updatedAt;

    public Promotion() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$companyId() {
        return this.companyId;
    }

    public String realmGet$createdAt() {
        return this.createdAt;
    }

    public String realmGet$finishedAt() {
        return this.finishedAt;
    }

    public String realmGet$id() {
        return this.f6692id;
    }

    public String realmGet$startedAt() {
        return this.startedAt;
    }

    public String realmGet$text() {
        return this.text;
    }

    public String realmGet$updatedAt() {
        return this.updatedAt;
    }

    public void realmSet$companyId(String str) {
        this.companyId = str;
    }

    public void realmSet$createdAt(String str) {
        this.createdAt = str;
    }

    public void realmSet$finishedAt(String str) {
        this.finishedAt = str;
    }

    public void realmSet$id(String str) {
        this.f6692id = str;
    }

    public void realmSet$startedAt(String str) {
        this.startedAt = str;
    }

    public void realmSet$text(String str) {
        this.text = str;
    }

    public void realmSet$updatedAt(String str) {
        this.updatedAt = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Promotion(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.Promotion.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getText() {
        return realmGet$text();
    }

    public final void setText(String str) {
        realmSet$text(str);
    }

    public final String getCompanyId() {
        return realmGet$companyId();
    }

    public final void setCompanyId(String str) {
        realmSet$companyId(str);
    }

    public final String getStartedAt() {
        return realmGet$startedAt();
    }

    public final void setStartedAt(String str) {
        realmSet$startedAt(str);
    }

    public final String getFinishedAt() {
        return realmGet$finishedAt();
    }

    public final void setFinishedAt(String str) {
        realmSet$finishedAt(str);
    }

    public final String getCreatedAt() {
        return realmGet$createdAt();
    }

    public final void setCreatedAt(String str) {
        realmSet$createdAt(str);
    }

    public final String getUpdatedAt() {
        return realmGet$updatedAt();
    }

    public final void setUpdatedAt(String str) {
        realmSet$updatedAt(str);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Promotion$Fields;", "", "()V", "companyId", "", "id", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.Promotion$Fields */
    /* compiled from: Promotion.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();
        public static final String companyId = "companyId";

        /* renamed from: id */
        public static final String f6693id = "id";

        private Fields() {
        }
    }

    public Promotion(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$text(str2);
        realmSet$companyId(str3);
        realmSet$startedAt(str4);
        realmSet$finishedAt(str5);
        realmSet$createdAt(str6);
        realmSet$updatedAt(str7);
    }
}
