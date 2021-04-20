package p035ru.unicorn.ujin.market;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.metrics.MetricsKeys;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "position", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.MarketFragment$onViewCreated$3 */
/* compiled from: MarketFragment.kt */
final class MarketFragment$onViewCreated$3 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ MarketFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MarketFragment$onViewCreated$3(MarketFragment marketFragment) {
        super(1);
        this.this$0 = marketFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        Category item = MarketFragment.access$getCategoriesAdapter$p(this.this$0).getItem(i);
        this.this$0.showCategoryFragment(item.getId(), item.getTitle(), MetricsKeys.category.getValue());
    }
}
