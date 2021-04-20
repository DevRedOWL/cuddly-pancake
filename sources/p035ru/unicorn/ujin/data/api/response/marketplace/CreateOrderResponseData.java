package p035ru.unicorn.ujin.data.api.response.marketplace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.LinksData;
import p035ru.unicorn.ujin.data.realm.MetaData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/CreateOrderResponseData;", "", "order", "Lru/unicorn/ujin/data/api/response/marketplace/OrderData;", "payment", "Lru/unicorn/ujin/data/api/response/marketplace/PaymentData;", "links", "Lru/unicorn/ujin/data/realm/LinksData;", "meta", "Lru/unicorn/ujin/data/realm/MetaData;", "(Lru/unicorn/ujin/data/api/response/marketplace/OrderData;Lru/unicorn/ujin/data/api/response/marketplace/PaymentData;Lru/unicorn/ujin/data/realm/LinksData;Lru/unicorn/ujin/data/realm/MetaData;)V", "getLinks", "()Lru/unicorn/ujin/data/realm/LinksData;", "getMeta", "()Lru/unicorn/ujin/data/realm/MetaData;", "getOrder", "()Lru/unicorn/ujin/data/api/response/marketplace/OrderData;", "getPayment", "()Lru/unicorn/ujin/data/api/response/marketplace/PaymentData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.CreateOrderResponseData */
/* compiled from: CreateOrderResponse.kt */
public final class CreateOrderResponseData {
    private final LinksData links;
    private final MetaData meta;
    private final OrderData order;
    private final PaymentData payment;

    public static /* synthetic */ CreateOrderResponseData copy$default(CreateOrderResponseData createOrderResponseData, OrderData orderData, PaymentData paymentData, LinksData linksData, MetaData metaData, int i, Object obj) {
        if ((i & 1) != 0) {
            orderData = createOrderResponseData.order;
        }
        if ((i & 2) != 0) {
            paymentData = createOrderResponseData.payment;
        }
        if ((i & 4) != 0) {
            linksData = createOrderResponseData.links;
        }
        if ((i & 8) != 0) {
            metaData = createOrderResponseData.meta;
        }
        return createOrderResponseData.copy(orderData, paymentData, linksData, metaData);
    }

    public final OrderData component1() {
        return this.order;
    }

    public final PaymentData component2() {
        return this.payment;
    }

    public final LinksData component3() {
        return this.links;
    }

    public final MetaData component4() {
        return this.meta;
    }

    public final CreateOrderResponseData copy(OrderData orderData, PaymentData paymentData, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(orderData, "order");
        Intrinsics.checkNotNullParameter(paymentData, "payment");
        Intrinsics.checkNotNullParameter(linksData, "links");
        Intrinsics.checkNotNullParameter(metaData, "meta");
        return new CreateOrderResponseData(orderData, paymentData, linksData, metaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderResponseData)) {
            return false;
        }
        CreateOrderResponseData createOrderResponseData = (CreateOrderResponseData) obj;
        return Intrinsics.areEqual((Object) this.order, (Object) createOrderResponseData.order) && Intrinsics.areEqual((Object) this.payment, (Object) createOrderResponseData.payment) && Intrinsics.areEqual((Object) this.links, (Object) createOrderResponseData.links) && Intrinsics.areEqual((Object) this.meta, (Object) createOrderResponseData.meta);
    }

    public int hashCode() {
        OrderData orderData = this.order;
        int i = 0;
        int hashCode = (orderData != null ? orderData.hashCode() : 0) * 31;
        PaymentData paymentData = this.payment;
        int hashCode2 = (hashCode + (paymentData != null ? paymentData.hashCode() : 0)) * 31;
        LinksData linksData = this.links;
        int hashCode3 = (hashCode2 + (linksData != null ? linksData.hashCode() : 0)) * 31;
        MetaData metaData = this.meta;
        if (metaData != null) {
            i = metaData.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "CreateOrderResponseData(order=" + this.order + ", payment=" + this.payment + ", links=" + this.links + ", meta=" + this.meta + ")";
    }

    public CreateOrderResponseData(OrderData orderData, PaymentData paymentData, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(orderData, "order");
        Intrinsics.checkNotNullParameter(paymentData, "payment");
        Intrinsics.checkNotNullParameter(linksData, "links");
        Intrinsics.checkNotNullParameter(metaData, "meta");
        this.order = orderData;
        this.payment = paymentData;
        this.links = linksData;
        this.meta = metaData;
    }

    public final OrderData getOrder() {
        return this.order;
    }

    public final PaymentData getPayment() {
        return this.payment;
    }

    public final LinksData getLinks() {
        return this.links;
    }

    public final MetaData getMeta() {
        return this.meta;
    }
}
