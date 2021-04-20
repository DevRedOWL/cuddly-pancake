package p035ru.unicorn.ujin.market.order;

import kotlin.Metadata;
import p035ru.unicorn.ujin.market.order.OrderListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, mo51343d2 = {"ru/unicorn/ujin/market/order/OrderListFragment$onViewCreated$1", "Lru/unicorn/ujin/market/order/OrderListAdapter$OnOrderListener;", "onOrderChanged", "", "onShowOrderForm", "companyId", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderListFragment$onViewCreated$1 */
/* compiled from: OrderListFragment.kt */
public final class OrderListFragment$onViewCreated$1 implements OrderListAdapter.OnOrderListener {
    final /* synthetic */ OrderListFragment this$0;

    OrderListFragment$onViewCreated$1(OrderListFragment orderListFragment) {
        this.this$0 = orderListFragment;
    }

    public void onOrderChanged() {
        this.this$0.updateTotalData();
    }

    public void onShowOrderForm(String str) {
        this.this$0.showOrderFormFragment(str, "company");
    }
}
