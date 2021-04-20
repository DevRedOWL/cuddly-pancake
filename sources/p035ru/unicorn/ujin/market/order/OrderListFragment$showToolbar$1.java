package p035ru.unicorn.ujin.market.order;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderListFragment$showToolbar$1 */
/* compiled from: OrderListFragment.kt */
final class OrderListFragment$showToolbar$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OrderListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderListFragment$showToolbar$1(OrderListFragment orderListFragment) {
        super(0);
        this.this$0 = orderListFragment;
    }

    public final void invoke() {
        this.this$0.onClearCartClicked();
    }
}
