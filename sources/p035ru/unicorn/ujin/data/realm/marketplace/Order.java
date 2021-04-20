package p035ru.unicorn.ujin.data.realm.marketplace;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0018B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Order;", "Lio/realm/RealmObject;", "companyId", "", "companyTitle", "companyDelivery", "amount", "", "oldAmount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "getAmount", "()D", "setAmount", "(D)V", "getCompanyDelivery", "()Ljava/lang/String;", "setCompanyDelivery", "(Ljava/lang/String;)V", "getCompanyId", "setCompanyId", "getCompanyTitle", "setCompanyTitle", "getOldAmount", "setOldAmount", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Order */
/* compiled from: Order.kt */
public class Order extends RealmObject implements ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface {
    private double amount;
    private String companyDelivery;
    @PrimaryKey
    private String companyId;
    private String companyTitle;
    private double oldAmount;

    public Order() {
        this((String) null, (String) null, (String) null, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 31, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public double realmGet$amount() {
        return this.amount;
    }

    public String realmGet$companyDelivery() {
        return this.companyDelivery;
    }

    public String realmGet$companyId() {
        return this.companyId;
    }

    public String realmGet$companyTitle() {
        return this.companyTitle;
    }

    public double realmGet$oldAmount() {
        return this.oldAmount;
    }

    public void realmSet$amount(double d) {
        this.amount = d;
    }

    public void realmSet$companyDelivery(String str) {
        this.companyDelivery = str;
    }

    public void realmSet$companyId(String str) {
        this.companyId = str;
    }

    public void realmSet$companyTitle(String str) {
        this.companyTitle = str;
    }

    public void realmSet$oldAmount(double d) {
        this.oldAmount = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Order(java.lang.String r6, java.lang.String r7, java.lang.String r8, double r9, double r11, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
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
            r0 = r8
            r7 = r13 & 8
            r1 = 0
            if (r7 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r9
        L_0x0021:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = r11
        L_0x0027:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r3
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r13)
            boolean r6 = r5 instanceof p046io.realm.internal.RealmObjectProxy
            if (r6 == 0) goto L_0x003a
            r6 = r5
            io.realm.internal.RealmObjectProxy r6 = (p046io.realm.internal.RealmObjectProxy) r6
            r6.realm$injectObjectContext()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.Order.<init>(java.lang.String, java.lang.String, java.lang.String, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getCompanyId() {
        return realmGet$companyId();
    }

    public final void setCompanyId(String str) {
        realmSet$companyId(str);
    }

    public final String getCompanyTitle() {
        return realmGet$companyTitle();
    }

    public final void setCompanyTitle(String str) {
        realmSet$companyTitle(str);
    }

    public final String getCompanyDelivery() {
        return realmGet$companyDelivery();
    }

    public final void setCompanyDelivery(String str) {
        realmSet$companyDelivery(str);
    }

    public final double getAmount() {
        return realmGet$amount();
    }

    public final void setAmount(double d) {
        realmSet$amount(d);
    }

    public final double getOldAmount() {
        return realmGet$oldAmount();
    }

    public final void setOldAmount(double d) {
        realmSet$oldAmount(d);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Order$Fields;", "", "()V", "companyId", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.Order$Fields */
    /* compiled from: Order.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();
        public static final String companyId = "companyId";

        private Fields() {
        }
    }

    public Order(String str, String str2, String str3, double d, double d2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$companyId(str);
        realmSet$companyTitle(str2);
        realmSet$companyDelivery(str3);
        realmSet$amount(d);
        realmSet$oldAmount(d2);
    }
}
