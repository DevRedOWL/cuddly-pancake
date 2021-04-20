package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_MetaRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Meta;", "Lio/realm/RealmObject;", "currentPage", "", "from", "lastPage", "path", "", "perPage", "to", "total", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCurrentPage", "()Ljava/lang/Integer;", "setCurrentPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFrom", "setFrom", "getLastPage", "setLastPage", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "getPerPage", "setPerPage", "getTo", "setTo", "getTotal", "setTotal", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Meta */
/* compiled from: Meta.kt */
public class Meta extends RealmObject implements ru_unicorn_ujin_data_realm_MetaRealmProxyInterface {
    @SerializedName("current_page")
    private Integer currentPage;
    private Integer from;
    @SerializedName("last_page")
    private Integer lastPage;
    private String path;
    @SerializedName("per_page")
    private Integer perPage;

    /* renamed from: to */
    private Integer f6658to;
    private Integer total;

    public Meta() {
        this((Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (Integer) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Integer realmGet$currentPage() {
        return this.currentPage;
    }

    public Integer realmGet$from() {
        return this.from;
    }

    public Integer realmGet$lastPage() {
        return this.lastPage;
    }

    public String realmGet$path() {
        return this.path;
    }

    public Integer realmGet$perPage() {
        return this.perPage;
    }

    public Integer realmGet$to() {
        return this.f6658to;
    }

    public Integer realmGet$total() {
        return this.total;
    }

    public void realmSet$currentPage(Integer num) {
        this.currentPage = num;
    }

    public void realmSet$from(Integer num) {
        this.from = num;
    }

    public void realmSet$lastPage(Integer num) {
        this.lastPage = num;
    }

    public void realmSet$path(String str) {
        this.path = str;
    }

    public void realmSet$perPage(Integer num) {
        this.perPage = num;
    }

    public void realmSet$to(Integer num) {
        this.f6658to = num;
    }

    public void realmSet$total(Integer num) {
        this.total = num;
    }

    public final Integer getCurrentPage() {
        return realmGet$currentPage();
    }

    public final void setCurrentPage(Integer num) {
        realmSet$currentPage(num);
    }

    public final Integer getFrom() {
        return realmGet$from();
    }

    public final void setFrom(Integer num) {
        realmSet$from(num);
    }

    public final Integer getLastPage() {
        return realmGet$lastPage();
    }

    public final void setLastPage(Integer num) {
        realmSet$lastPage(num);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Meta(java.lang.Integer r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.String r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r15 == 0) goto L_0x000b
            r15 = r0
            goto L_0x000c
        L_0x000b:
            r15 = r7
        L_0x000c:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x0012
            r1 = r0
            goto L_0x0013
        L_0x0012:
            r1 = r8
        L_0x0013:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0019
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r9
        L_0x001a:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0022
            r7 = 0
            r10 = r7
            java.lang.String r10 = (java.lang.String) r10
        L_0x0022:
            r3 = r10
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0029
            r4 = r0
            goto L_0x002a
        L_0x0029:
            r4 = r11
        L_0x002a:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x0030
            r5 = r0
            goto L_0x0031
        L_0x0030:
            r5 = r12
        L_0x0031:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0037
            r14 = r0
            goto L_0x0038
        L_0x0037:
            r14 = r13
        L_0x0038:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            boolean r7 = r6 instanceof p046io.realm.internal.RealmObjectProxy
            if (r7 == 0) goto L_0x004c
            r7 = r6
            io.realm.internal.RealmObjectProxy r7 = (p046io.realm.internal.RealmObjectProxy) r7
            r7.realm$injectObjectContext()
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.Meta.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getPath() {
        return realmGet$path();
    }

    public final void setPath(String str) {
        realmSet$path(str);
    }

    public final Integer getPerPage() {
        return realmGet$perPage();
    }

    public final void setPerPage(Integer num) {
        realmSet$perPage(num);
    }

    public final Integer getTo() {
        return realmGet$to();
    }

    public final void setTo(Integer num) {
        realmSet$to(num);
    }

    public final Integer getTotal() {
        return realmGet$total();
    }

    public final void setTotal(Integer num) {
        realmSet$total(num);
    }

    public Meta(Integer num, Integer num2, Integer num3, String str, Integer num4, Integer num5, Integer num6) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$currentPage(num);
        realmSet$from(num2);
        realmSet$lastPage(num3);
        realmSet$path(str);
        realmSet$perPage(num4);
        realmSet$to(num5);
        realmSet$total(num6);
    }
}
