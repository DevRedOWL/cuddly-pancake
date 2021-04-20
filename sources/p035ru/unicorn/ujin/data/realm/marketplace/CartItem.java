package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4604x82066130;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/CartItem;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "company", "Lru/unicorn/ujin/data/realm/marketplace/CartCompany;", "offers", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/CartOffer;", "total", "Lru/unicorn/ujin/data/realm/marketplace/CartTotal;", "(Lru/unicorn/ujin/data/realm/marketplace/CartCompany;Lio/realm/RealmList;Lru/unicorn/ujin/data/realm/marketplace/CartTotal;)V", "getCompany", "()Lru/unicorn/ujin/data/realm/marketplace/CartCompany;", "setCompany", "(Lru/unicorn/ujin/data/realm/marketplace/CartCompany;)V", "getOffers", "()Lio/realm/RealmList;", "setOffers", "(Lio/realm/RealmList;)V", "getTotal", "()Lru/unicorn/ujin/data/realm/marketplace/CartTotal;", "setTotal", "(Lru/unicorn/ujin/data/realm/marketplace/CartTotal;)V", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.CartItem */
/* compiled from: CartItem.kt */
public class CartItem extends RealmObject implements Diffable<CartItem>, C4604x82066130 {
    private CartCompany company;
    private RealmList<CartOffer> offers;
    private CartTotal total;

    public CartItem() {
        this((CartCompany) null, (RealmList) null, (CartTotal) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public CartCompany realmGet$company() {
        return this.company;
    }

    public RealmList realmGet$offers() {
        return this.offers;
    }

    public CartTotal realmGet$total() {
        return this.total;
    }

    public void realmSet$company(CartCompany cartCompany) {
        this.company = cartCompany;
    }

    public void realmSet$offers(RealmList realmList) {
        this.offers = realmList;
    }

    public void realmSet$total(CartTotal cartTotal) {
        this.total = cartTotal;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CartItem(CartCompany cartCompany, RealmList realmList, CartTotal cartTotal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cartCompany, (i & 2) != 0 ? null : realmList, (i & 4) != 0 ? null : cartTotal);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final CartCompany getCompany() {
        return realmGet$company();
    }

    public final void setCompany(CartCompany cartCompany) {
        realmSet$company(cartCompany);
    }

    public final RealmList<CartOffer> getOffers() {
        return realmGet$offers();
    }

    public final void setOffers(RealmList<CartOffer> realmList) {
        realmSet$offers(realmList);
    }

    public final CartTotal getTotal() {
        return realmGet$total();
    }

    public final void setTotal(CartTotal cartTotal) {
        realmSet$total(cartTotal);
    }

    public CartItem(CartCompany cartCompany, RealmList<CartOffer> realmList, CartTotal cartTotal) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$company(cartCompany);
        realmSet$offers(realmList);
        realmSet$total(cartTotal);
    }

    public boolean areItemsTheSame(CartItem cartItem) {
        CartCompany realmGet$company;
        CartCompany realmGet$company2 = realmGet$company();
        String str = null;
        String id = realmGet$company2 != null ? realmGet$company2.getId() : null;
        if (!(cartItem == null || (realmGet$company = cartItem.realmGet$company()) == null)) {
            str = realmGet$company.getId();
        }
        return Intrinsics.areEqual((Object) id, (Object) str);
    }

    public boolean areContentsTheSame(CartItem cartItem) {
        CartTotal realmGet$total;
        CartTotal realmGet$total2 = realmGet$total();
        Integer num = null;
        Integer quantity = realmGet$total2 != null ? realmGet$total2.getQuantity() : null;
        if (!(cartItem == null || (realmGet$total = cartItem.realmGet$total()) == null)) {
            num = realmGet$total.getQuantity();
        }
        return Intrinsics.areEqual((Object) quantity, (Object) num);
    }
}
