package p035ru.unicorn.ujin.market.order;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.CartItem;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.market.order.OrderListAdapter;
import p035ru.unicorn.ujin.market.order.OrderedOfferListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, mo51343d2 = {"ru/unicorn/ujin/market/order/OrderListAdapter$ViewHolder$bind$2", "Lru/unicorn/ujin/market/order/OrderedOfferListAdapter$OnOfferSelectedListener;", "onOfferSelected", "", "position", "", "count", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderListAdapter$ViewHolder$bind$2 */
/* compiled from: OrderListAdapter.kt */
public final class OrderListAdapter$ViewHolder$bind$2 implements OrderedOfferListAdapter.OnOfferSelectedListener {
    final /* synthetic */ CartItem $cartItem;
    final /* synthetic */ int $orderPosition;
    final /* synthetic */ OrderListAdapter.ViewHolder this$0;

    OrderListAdapter$ViewHolder$bind$2(OrderListAdapter.ViewHolder viewHolder, CartItem cartItem, int i) {
        this.this$0 = viewHolder;
        this.$cartItem = cartItem;
        this.$orderPosition = i;
    }

    public void onOfferSelected(int i, int i2) {
        String id;
        String id2;
        CartOffer cartOffer = this.this$0.this$0.getMarketViewModel().getCartOffer(((CartOffer) OrderListAdapter.ViewHolder.access$getOfferListAdapter$p(this.this$0).getItem(i)).getId());
        if (i2 == 0) {
            OrderListAdapter.ViewHolder viewHolder = this.this$0;
            CartItem cartItem = this.$cartItem;
            Intrinsics.checkNotNullExpressionValue(cartItem, "cartItem");
            viewHolder.updateOrderData(cartOffer, cartItem, 1);
            if (!(cartOffer == null || (id2 = cartOffer.getId()) == null)) {
                this.this$0.this$0.setUpdatedPosition(Integer.valueOf(i));
                this.this$0.this$0.getMarketViewModel().setCart(id2, 1);
            }
            this.this$0.showRemoveMessage(this.$orderPosition, i);
            return;
        }
        OrderListAdapter.ViewHolder viewHolder2 = this.this$0;
        CartItem cartItem2 = this.$cartItem;
        Intrinsics.checkNotNullExpressionValue(cartItem2, "cartItem");
        viewHolder2.updateOrderData(cartOffer, cartItem2, i2);
        if (cartOffer != null && (id = cartOffer.getId()) != null) {
            this.this$0.this$0.setUpdatedPosition(Integer.valueOf(i));
            this.this$0.this$0.getMarketViewModel().setCart(id, i2);
        }
    }
}
