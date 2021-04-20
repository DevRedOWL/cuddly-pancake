package p035ru.unicorn.ujin.data.api.response.marketplace;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/OrderData;", "", "id", "", "offers", "", "Lru/unicorn/ujin/data/api/response/marketplace/OfferData;", "total", "", "(ILjava/util/List;Ljava/lang/String;)V", "getId", "()I", "getOffers", "()Ljava/util/List;", "getTotal", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.OrderData */
/* compiled from: CreateOrderResponse.kt */
public final class OrderData {

    /* renamed from: id */
    private final int f6620id;
    private final List<OfferData> offers;
    private final String total;

    public static /* synthetic */ OrderData copy$default(OrderData orderData, int i, List<OfferData> list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = orderData.f6620id;
        }
        if ((i2 & 2) != 0) {
            list = orderData.offers;
        }
        if ((i2 & 4) != 0) {
            str = orderData.total;
        }
        return orderData.copy(i, list, str);
    }

    public final int component1() {
        return this.f6620id;
    }

    public final List<OfferData> component2() {
        return this.offers;
    }

    public final String component3() {
        return this.total;
    }

    public final OrderData copy(int i, List<OfferData> list, String str) {
        Intrinsics.checkNotNullParameter(list, "offers");
        Intrinsics.checkNotNullParameter(str, "total");
        return new OrderData(i, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderData)) {
            return false;
        }
        OrderData orderData = (OrderData) obj;
        return this.f6620id == orderData.f6620id && Intrinsics.areEqual((Object) this.offers, (Object) orderData.offers) && Intrinsics.areEqual((Object) this.total, (Object) orderData.total);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6620id).hashCode() * 31;
        List<OfferData> list = this.offers;
        int i = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.total;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "OrderData(id=" + this.f6620id + ", offers=" + this.offers + ", total=" + this.total + ")";
    }

    public OrderData(int i, List<OfferData> list, String str) {
        Intrinsics.checkNotNullParameter(list, "offers");
        Intrinsics.checkNotNullParameter(str, "total");
        this.f6620id = i;
        this.offers = list;
        this.total = str;
    }

    public final int getId() {
        return this.f6620id;
    }

    public final List<OfferData> getOffers() {
        return this.offers;
    }

    public final String getTotal() {
        return this.total;
    }
}
