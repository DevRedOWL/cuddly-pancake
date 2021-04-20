package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.refactor_1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceTicket;", "kotlin.jvm.PlatformType", "accept", "ru/unicorn/ujin/view/activity/navigation/ui/helpdesk/refactor_1/AppListFragment$ticketListSection$2$1$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppListFragment$ticketListSection$2$$special$$inlined$apply$lambda$2 */
/* compiled from: AppListFragment.kt */
final class C5844x22776709<T> implements Consumer<ServiceTicket> {
    final /* synthetic */ AppListFragment$ticketListSection$2 this$0;

    C5844x22776709(AppListFragment$ticketListSection$2 appListFragment$ticketListSection$2) {
        this.this$0 = appListFragment$ticketListSection$2;
    }

    public final void accept(ServiceTicket serviceTicket) {
        AppListFragment appListFragment = this.this$0.this$0;
        Intrinsics.checkNotNullExpressionValue(serviceTicket, "it");
        appListFragment.showRateTicketDialog(serviceTicket);
    }
}
