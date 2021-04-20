package p035ru.unicorn.ujin.data.api.request.market;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/market/OrderedOffer;", "", "id", "", "quantity", "", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getQuantity", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.market.OrderedOffer */
/* compiled from: CreateOrderBody.kt */
public final class OrderedOffer {

    /* renamed from: id */
    private final String f6612id;
    private final int quantity;

    public static /* synthetic */ OrderedOffer copy$default(OrderedOffer orderedOffer, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = orderedOffer.f6612id;
        }
        if ((i2 & 2) != 0) {
            i = orderedOffer.quantity;
        }
        return orderedOffer.copy(str, i);
    }

    public final String component1() {
        return this.f6612id;
    }

    public final int component2() {
        return this.quantity;
    }

    public final OrderedOffer copy(String str, int i) {
        return new OrderedOffer(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderedOffer)) {
            return false;
        }
        OrderedOffer orderedOffer = (OrderedOffer) obj;
        return Intrinsics.areEqual((Object) this.f6612id, (Object) orderedOffer.f6612id) && this.quantity == orderedOffer.quantity;
    }

    public int hashCode() {
        String str = this.f6612id;
        return ((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.quantity).hashCode();
    }

    public String toString() {
        return "OrderedOffer(id=" + this.f6612id + ", quantity=" + this.quantity + ")";
    }

    public OrderedOffer(String str, int i) {
        this.f6612id = str;
        this.quantity = i;
    }

    public final String getId() {
        return this.f6612id;
    }

    public final int getQuantity() {
        return this.quantity;
    }
}
