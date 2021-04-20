package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import p046io.realm.C4615x596bcf10;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0018B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/OrderItem;", "Lio/realm/RealmObject;", "id", "", "offer", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "count", "", "companyId", "(Ljava/lang/String;Lru/unicorn/ujin/data/realm/marketplace/Offer;ILjava/lang/String;)V", "getCompanyId", "()Ljava/lang/String;", "setCompanyId", "(Ljava/lang/String;)V", "getCount", "()I", "setCount", "(I)V", "getId", "setId", "getOffer", "()Lru/unicorn/ujin/data/realm/marketplace/Offer;", "setOffer", "(Lru/unicorn/ujin/data/realm/marketplace/Offer;)V", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.OrderItem */
/* compiled from: OrderItem.kt */
public class OrderItem extends RealmObject implements C4615x596bcf10 {
    private String companyId;
    private int count;
    @PrimaryKey

    /* renamed from: id */
    private String f6689id;
    private Offer offer;

    public OrderItem() {
        this((String) null, (Offer) null, 0, (String) null, 15, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$companyId() {
        return this.companyId;
    }

    public int realmGet$count() {
        return this.count;
    }

    public String realmGet$id() {
        return this.f6689id;
    }

    public Offer realmGet$offer() {
        return this.offer;
    }

    public void realmSet$companyId(String str) {
        this.companyId = str;
    }

    public void realmSet$count(int i) {
        this.count = i;
    }

    public void realmSet$id(String str) {
        this.f6689id = str;
    }

    public void realmSet$offer(Offer offer2) {
        this.offer = offer2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderItem(String str, Offer offer2, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : offer2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final Offer getOffer() {
        return realmGet$offer();
    }

    public final void setOffer(Offer offer2) {
        realmSet$offer(offer2);
    }

    public final int getCount() {
        return realmGet$count();
    }

    public final void setCount(int i) {
        realmSet$count(i);
    }

    public final String getCompanyId() {
        return realmGet$companyId();
    }

    public final void setCompanyId(String str) {
        realmSet$companyId(str);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/OrderItem$Fields;", "", "()V", "companyId", "", "id", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.OrderItem$Fields */
    /* compiled from: OrderItem.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();
        public static final String companyId = "companyId";

        /* renamed from: id */
        public static final String f6690id = "id";

        private Fields() {
        }
    }

    public OrderItem(String str, Offer offer2, int i, String str2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$offer(offer2);
        realmSet$count(i);
        realmSet$companyId(str2);
    }
}
