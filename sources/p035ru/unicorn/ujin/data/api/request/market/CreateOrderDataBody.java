package p035ru.unicorn.ujin.data.api.request.market;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/market/CreateOrderDataBody;", "", "offers", "", "Lru/unicorn/ujin/data/api/request/market/OrderedOffer;", "consumer", "Lru/unicorn/ujin/data/api/request/market/Consumer;", "commentary", "", "(Ljava/util/List;Lru/unicorn/ujin/data/api/request/market/Consumer;Ljava/lang/String;)V", "getCommentary", "()Ljava/lang/String;", "getConsumer", "()Lru/unicorn/ujin/data/api/request/market/Consumer;", "getOffers", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.market.CreateOrderDataBody */
/* compiled from: CreateOrderBody.kt */
public final class CreateOrderDataBody {
    private final String commentary;
    private final Consumer consumer;
    private final List<OrderedOffer> offers;

    public static /* synthetic */ CreateOrderDataBody copy$default(CreateOrderDataBody createOrderDataBody, List<OrderedOffer> list, Consumer consumer2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = createOrderDataBody.offers;
        }
        if ((i & 2) != 0) {
            consumer2 = createOrderDataBody.consumer;
        }
        if ((i & 4) != 0) {
            str = createOrderDataBody.commentary;
        }
        return createOrderDataBody.copy(list, consumer2, str);
    }

    public final List<OrderedOffer> component1() {
        return this.offers;
    }

    public final Consumer component2() {
        return this.consumer;
    }

    public final String component3() {
        return this.commentary;
    }

    public final CreateOrderDataBody copy(List<OrderedOffer> list, Consumer consumer2, String str) {
        Intrinsics.checkNotNullParameter(list, "offers");
        Intrinsics.checkNotNullParameter(consumer2, "consumer");
        Intrinsics.checkNotNullParameter(str, "commentary");
        return new CreateOrderDataBody(list, consumer2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOrderDataBody)) {
            return false;
        }
        CreateOrderDataBody createOrderDataBody = (CreateOrderDataBody) obj;
        return Intrinsics.areEqual((Object) this.offers, (Object) createOrderDataBody.offers) && Intrinsics.areEqual((Object) this.consumer, (Object) createOrderDataBody.consumer) && Intrinsics.areEqual((Object) this.commentary, (Object) createOrderDataBody.commentary);
    }

    public int hashCode() {
        List<OrderedOffer> list = this.offers;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Consumer consumer2 = this.consumer;
        int hashCode2 = (hashCode + (consumer2 != null ? consumer2.hashCode() : 0)) * 31;
        String str = this.commentary;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CreateOrderDataBody(offers=" + this.offers + ", consumer=" + this.consumer + ", commentary=" + this.commentary + ")";
    }

    public CreateOrderDataBody(List<OrderedOffer> list, Consumer consumer2, String str) {
        Intrinsics.checkNotNullParameter(list, "offers");
        Intrinsics.checkNotNullParameter(consumer2, "consumer");
        Intrinsics.checkNotNullParameter(str, "commentary");
        this.offers = list;
        this.consumer = consumer2;
        this.commentary = str;
    }

    public final List<OrderedOffer> getOffers() {
        return this.offers;
    }

    public final Consumer getConsumer() {
        return this.consumer;
    }

    public final String getCommentary() {
        return this.commentary;
    }
}
