package p035ru.unicorn.ujin.market.order;

import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/data/realm/ContextBanner;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.order.OrderListFragment$onViewCreated$6 */
/* compiled from: OrderListFragment.kt */
final class OrderListFragment$onViewCreated$6<T> implements Observer<Resource<List<? extends ContextBanner>>> {
    final /* synthetic */ OrderListFragment this$0;

    OrderListFragment$onViewCreated$6(OrderListFragment orderListFragment) {
        this.this$0 = orderListFragment;
    }

    public final void onChanged(Resource<List<ContextBanner>> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.this$0.showData(resource);
    }
}
