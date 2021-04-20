package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import androidx.lifecycle.Observer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "propertyObjects", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/activity/navigation/entity/IKeyValueData;", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.TicketPropertyListFragment$onViewCreated$1 */
/* compiled from: TicketPropertyListFragment.kt */
final class TicketPropertyListFragment$onViewCreated$1<T> implements Observer<ArrayList<IKeyValueData>> {
    final /* synthetic */ TicketPropertyListFragment this$0;

    TicketPropertyListFragment$onViewCreated$1(TicketPropertyListFragment ticketPropertyListFragment) {
        this.this$0 = ticketPropertyListFragment;
    }

    public final void onChanged(ArrayList<IKeyValueData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "propertyObjects");
        this.this$0.showPropertyObjects(arrayList);
    }
}
