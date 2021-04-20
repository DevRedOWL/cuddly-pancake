package p035ru.unicorn.ujin.market.order;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/order/OrderListFragment$showData$1$1$1$3", "ru/unicorn/ujin/market/order/OrderListFragment$$special$$inlined$apply$lambda$2", "ru/unicorn/ujin/market/order/OrderListFragment$$special$$inlined$map$lambda$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderListFragment$showData$$inlined$let$lambda$2 */
/* compiled from: OrderListFragment.kt */
final class OrderListFragment$showData$$inlined$let$lambda$2 implements View.OnClickListener {
    final /* synthetic */ ContextBanner $banner$inlined;
    final /* synthetic */ Resource $resource$inlined;
    final /* synthetic */ OrderListFragment this$0;

    OrderListFragment$showData$$inlined$let$lambda$2(ContextBanner contextBanner, OrderListFragment orderListFragment, Resource resource) {
        this.$banner$inlined = contextBanner;
        this.this$0 = orderListFragment;
        this.$resource$inlined = resource;
    }

    public final void onClick(View view) {
        this.this$0.openLoanFragment(this.$banner$inlined);
    }
}
