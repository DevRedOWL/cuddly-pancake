package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4614x1663cccd;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/OrderAction;", "Lio/realm/RealmObject;", "id", "", "type", "extra", "fields", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/Field;", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Ljava/lang/String;)V", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "getFields", "()Lio/realm/RealmList;", "setFields", "(Lio/realm/RealmList;)V", "getId", "setId", "getTitle", "setTitle", "getType", "setType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.OrderAction */
/* compiled from: OrderAction.kt */
public class OrderAction extends RealmObject implements C4614x1663cccd {
    @SerializedName("extra")
    private String extra;
    @SerializedName("fields")
    private RealmList<Field> fields;

    /* renamed from: id */
    private String f6688id;
    @SerializedName("title")
    private String title;
    @SerializedName("action")
    private String type;

    public OrderAction() {
        this((String) null, (String) null, (String) null, (RealmList) null, (String) null, 31, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$extra() {
        return this.extra;
    }

    public RealmList realmGet$fields() {
        return this.fields;
    }

    public String realmGet$id() {
        return this.f6688id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$type() {
        return this.type;
    }

    public void realmSet$extra(String str) {
        this.extra = str;
    }

    public void realmSet$fields(RealmList realmList) {
        this.fields = realmList;
    }

    public void realmSet$id(String str) {
        this.f6688id = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$type(String str) {
        this.type = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderAction(java.lang.String r4, java.lang.String r5, java.lang.String r6, p046io.realm.RealmList r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
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
            io.realm.RealmList r7 = (p046io.realm.RealmList) r7
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.OrderAction.<init>(java.lang.String, java.lang.String, java.lang.String, io.realm.RealmList, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getType() {
        return realmGet$type();
    }

    public final void setType(String str) {
        realmSet$type(str);
    }

    public final String getExtra() {
        return realmGet$extra();
    }

    public final void setExtra(String str) {
        realmSet$extra(str);
    }

    public final RealmList<Field> getFields() {
        return realmGet$fields();
    }

    public final void setFields(RealmList<Field> realmList) {
        realmSet$fields(realmList);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public OrderAction(String str, String str2, String str3, RealmList<Field> realmList, String str4) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$type(str2);
        realmSet$extra(str3);
        realmSet$fields(realmList);
        realmSet$title(str4);
    }
}
