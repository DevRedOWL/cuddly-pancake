package p035ru.unicorn.ujin.market.company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.metrics.MetricsKeys;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "id", "", "title", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.company.CompanyListFragment$onViewCreated$1 */
/* compiled from: CompanyListFragment.kt */
final class CompanyListFragment$onViewCreated$1 extends Lambda implements Function2<String, String, Unit> {
    final /* synthetic */ CompanyListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompanyListFragment$onViewCreated$1(CompanyListFragment companyListFragment) {
        super(2);
        this.this$0 = companyListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(String str, String str2) {
        this.this$0.showOfferListFragment(str, "company", MetricsKeys.companyProducts.getValue());
    }
}
