package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/view/activity/navigation/entity/IKeyValueData;", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.TicketPropertyListFragment$initSections$1 */
/* compiled from: TicketPropertyListFragment.kt */
final class TicketPropertyListFragment$initSections$1<T> implements Consumer<IKeyValueData> {
    final /* synthetic */ TicketPropertyListFragment this$0;

    TicketPropertyListFragment$initSections$1(TicketPropertyListFragment ticketPropertyListFragment) {
        this.this$0 = ticketPropertyListFragment;
    }

    public final void accept(IKeyValueData iKeyValueData) {
        Intrinsics.checkNotNullParameter(iKeyValueData, "data");
        this.this$0.onObjectClick(iKeyValueData);
    }
}
