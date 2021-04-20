package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4606x7b1cbdad;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/CartTotal;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "price", "", "quantity", "", "oldPrice", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getOldPrice", "()Ljava/lang/String;", "setOldPrice", "(Ljava/lang/String;)V", "getPrice", "setPrice", "getQuantity", "()Ljava/lang/Integer;", "setQuantity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.CartTotal */
/* compiled from: CartItem.kt */
public class CartTotal extends RealmObject implements Diffable<CartTotal>, C4606x7b1cbdad {
    @SerializedName("old_price")
    private String oldPrice;
    private String price;
    private Integer quantity;

    public CartTotal() {
        this((String) null, (Integer) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$oldPrice() {
        return this.oldPrice;
    }

    public String realmGet$price() {
        return this.price;
    }

    public Integer realmGet$quantity() {
        return this.quantity;
    }

    public void realmSet$oldPrice(String str) {
        this.oldPrice = str;
    }

    public void realmSet$price(String str) {
        this.price = str;
    }

    public void realmSet$quantity(Integer num) {
        this.quantity = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CartTotal(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getPrice() {
        return realmGet$price();
    }

    public final void setPrice(String str) {
        realmSet$price(str);
    }

    public final Integer getQuantity() {
        return realmGet$quantity();
    }

    public final void setQuantity(Integer num) {
        realmSet$quantity(num);
    }

    public final String getOldPrice() {
        return realmGet$oldPrice();
    }

    public final void setOldPrice(String str) {
        realmSet$oldPrice(str);
    }

    public CartTotal(String str, Integer num, String str2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$price(str);
        realmSet$quantity(num);
        realmSet$oldPrice(str2);
    }

    public boolean areItemsTheSame(CartTotal cartTotal) {
        return Intrinsics.areEqual((Object) realmGet$quantity(), (Object) cartTotal != null ? cartTotal.realmGet$quantity() : null);
    }

    public boolean areContentsTheSame(CartTotal cartTotal) {
        return Intrinsics.areEqual((Object) realmGet$price(), (Object) cartTotal != null ? cartTotal.realmGet$price() : null);
    }
}
