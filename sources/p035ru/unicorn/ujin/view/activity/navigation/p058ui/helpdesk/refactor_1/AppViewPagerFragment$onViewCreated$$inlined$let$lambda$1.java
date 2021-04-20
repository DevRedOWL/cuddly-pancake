package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.refactor_1;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceTicket;", "kotlin.jvm.PlatformType", "", "invoke", "ru/unicorn/ujin/view/activity/navigation/ui/helpdesk/refactor_1/AppViewPagerFragment$onViewCreated$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppViewPagerFragment$onViewCreated$$inlined$let$lambda$1 */
/* compiled from: AppViewPagerFragment.kt */
final class AppViewPagerFragment$onViewCreated$$inlined$let$lambda$1 extends Lambda implements Function1<List<ServiceTicket>, Unit> {
    final /* synthetic */ AppViewPagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppViewPagerFragment$onViewCreated$$inlined$let$lambda$1(AppViewPagerFragment appViewPagerFragment) {
        super(1);
        this.this$0 = appViewPagerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<ServiceTicket>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<ServiceTicket> list) {
        this.this$0.showServiceTickets();
    }
}
