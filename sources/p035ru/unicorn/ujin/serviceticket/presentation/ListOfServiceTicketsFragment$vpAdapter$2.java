package p035ru.unicorn.ujin.serviceticket.presentation;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.serviceticket.presentation.ListOfServiceTicketsFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/serviceticket/presentation/ListOfServiceTicketsFragment$ServiceTicketViewPagerAdapter;", "Lru/unicorn/ujin/serviceticket/presentation/ListOfServiceTicketsFragment;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.serviceticket.presentation.ListOfServiceTicketsFragment$vpAdapter$2 */
/* compiled from: ListOfServiceTicketsFragment.kt */
final class ListOfServiceTicketsFragment$vpAdapter$2 extends Lambda implements Function0<ListOfServiceTicketsFragment.ServiceTicketViewPagerAdapter> {
    final /* synthetic */ ListOfServiceTicketsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListOfServiceTicketsFragment$vpAdapter$2(ListOfServiceTicketsFragment listOfServiceTicketsFragment) {
        super(0);
        this.this$0 = listOfServiceTicketsFragment;
    }

    public final ListOfServiceTicketsFragment.ServiceTicketViewPagerAdapter invoke() {
        ListOfServiceTicketsFragment listOfServiceTicketsFragment = this.this$0;
        FragmentManager childFragmentManager = listOfServiceTicketsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        return new ListOfServiceTicketsFragment.ServiceTicketViewPagerAdapter(listOfServiceTicketsFragment, childFragmentManager);
    }
}
