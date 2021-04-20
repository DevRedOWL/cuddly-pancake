package p035ru.unicorn.ujin.market.order;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.CartItem;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.data.realm.marketplace.CartTotal;
import p035ru.unicorn.ujin.market.order.OrderListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderListAdapter$ViewHolder$showRemoveMessage$1 */
/* compiled from: OrderListAdapter.kt */
final class OrderListAdapter$ViewHolder$showRemoveMessage$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ int $orderPosition;
    final /* synthetic */ int $position;
    final /* synthetic */ OrderListAdapter.ViewHolder this$0;

    OrderListAdapter$ViewHolder$showRemoveMessage$1(OrderListAdapter.ViewHolder viewHolder, int i, int i2) {
        this.this$0 = viewHolder;
        this.$orderPosition = i;
        this.$position = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Integer quantity;
        String id;
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        CartItem cartItem = (CartItem) this.this$0.this$0.getData().get(this.$orderPosition);
        CartOffer cartOffer = this.this$0.this$0.getMarketViewModel().getCartOffer(((CartOffer) OrderListAdapter.ViewHolder.access$getOfferListAdapter$p(this.this$0).getItem(this.$position)).getId());
        OrderListAdapter.ViewHolder viewHolder = this.this$0;
        Intrinsics.checkNotNullExpressionValue(cartItem, "cartItem");
        viewHolder.updateOrderData(cartOffer, cartItem, 0);
        if (!(cartOffer == null || (id = cartOffer.getId()) == null)) {
            this.this$0.this$0.getMarketViewModel().setCart(id, 0);
            OrderListAdapter.ViewHolder.access$getOfferListAdapter$p(this.this$0).removeItem(this.$position);
        }
        CartTotal total = this.this$0.this$0.getItemById(this.$orderPosition).getTotal();
        if (!(total == null || (quantity = total.getQuantity()) == null || Intrinsics.compare(quantity.intValue(), 1) != 0)) {
            this.this$0.this$0.removeItem(this.$orderPosition);
        }
        this.this$0.this$0.getOnOrderListener().onOrderChanged();
        dialogInterface.cancel();
    }
}
