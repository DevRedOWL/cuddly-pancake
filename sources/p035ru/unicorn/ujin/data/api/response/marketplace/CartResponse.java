package p035ru.unicorn.ujin.data.api.response.marketplace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.LinksData;
import p035ru.unicorn.ujin.data.realm.MetaData;
import p035ru.unicorn.ujin.data.realm.marketplace.CartItem;
import p035ru.unicorn.ujin.data.realm.marketplace.CartTotal;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B1\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "", "list", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/CartItem;", "total", "Lru/unicorn/ujin/data/realm/marketplace/CartTotal;", "links", "Lru/unicorn/ujin/data/realm/LinksData;", "meta", "Lru/unicorn/ujin/data/realm/MetaData;", "(Lio/realm/RealmList;Lru/unicorn/ujin/data/realm/marketplace/CartTotal;Lru/unicorn/ujin/data/realm/LinksData;Lru/unicorn/ujin/data/realm/MetaData;)V", "getLinks", "()Lru/unicorn/ujin/data/realm/LinksData;", "getList", "()Lio/realm/RealmList;", "getMeta", "()Lru/unicorn/ujin/data/realm/MetaData;", "getTotal", "()Lru/unicorn/ujin/data/realm/marketplace/CartTotal;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.CartResponse */
/* compiled from: CartResponse.kt */
public final class CartResponse {
    private final LinksData links;
    private final RealmList<CartItem> list;
    private final MetaData meta;
    private final CartTotal total;

    public static /* synthetic */ CartResponse copy$default(CartResponse cartResponse, RealmList<CartItem> realmList, CartTotal cartTotal, LinksData linksData, MetaData metaData, int i, Object obj) {
        if ((i & 1) != 0) {
            realmList = cartResponse.list;
        }
        if ((i & 2) != 0) {
            cartTotal = cartResponse.total;
        }
        if ((i & 4) != 0) {
            linksData = cartResponse.links;
        }
        if ((i & 8) != 0) {
            metaData = cartResponse.meta;
        }
        return cartResponse.copy(realmList, cartTotal, linksData, metaData);
    }

    public final RealmList<CartItem> component1() {
        return this.list;
    }

    public final CartTotal component2() {
        return this.total;
    }

    public final LinksData component3() {
        return this.links;
    }

    public final MetaData component4() {
        return this.meta;
    }

    public final CartResponse copy(RealmList<CartItem> realmList, CartTotal cartTotal, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(linksData, "links");
        Intrinsics.checkNotNullParameter(metaData, "meta");
        return new CartResponse(realmList, cartTotal, linksData, metaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartResponse)) {
            return false;
        }
        CartResponse cartResponse = (CartResponse) obj;
        return Intrinsics.areEqual((Object) this.list, (Object) cartResponse.list) && Intrinsics.areEqual((Object) this.total, (Object) cartResponse.total) && Intrinsics.areEqual((Object) this.links, (Object) cartResponse.links) && Intrinsics.areEqual((Object) this.meta, (Object) cartResponse.meta);
    }

    public int hashCode() {
        RealmList<CartItem> realmList = this.list;
        int i = 0;
        int hashCode = (realmList != null ? realmList.hashCode() : 0) * 31;
        CartTotal cartTotal = this.total;
        int hashCode2 = (hashCode + (cartTotal != null ? cartTotal.hashCode() : 0)) * 31;
        LinksData linksData = this.links;
        int hashCode3 = (hashCode2 + (linksData != null ? linksData.hashCode() : 0)) * 31;
        MetaData metaData = this.meta;
        if (metaData != null) {
            i = metaData.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "CartResponse(list=" + this.list + ", total=" + this.total + ", links=" + this.links + ", meta=" + this.meta + ")";
    }

    public CartResponse(RealmList<CartItem> realmList, CartTotal cartTotal, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(linksData, "links");
        Intrinsics.checkNotNullParameter(metaData, "meta");
        this.list = realmList;
        this.total = cartTotal;
        this.links = linksData;
        this.meta = metaData;
    }

    public final RealmList<CartItem> getList() {
        return this.list;
    }

    public final CartTotal getTotal() {
        return this.total;
    }

    public final LinksData getLinks() {
        return this.links;
    }

    public final MetaData getMeta() {
        return this.meta;
    }
}
