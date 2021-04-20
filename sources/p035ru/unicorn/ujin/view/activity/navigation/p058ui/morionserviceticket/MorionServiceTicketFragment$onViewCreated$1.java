package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.databinding.FragmentMorionServiceTicketBinding;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.fragments.chats.ChatFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$onViewCreated$1 */
/* compiled from: MorionServiceTicketFragment.kt */
final class MorionServiceTicketFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ MorionServiceTicketFragment this$0;

    MorionServiceTicketFragment$onViewCreated$1(MorionServiceTicketFragment morionServiceTicketFragment) {
        this.this$0 = morionServiceTicketFragment;
    }

    public final void onClick(View view) {
        FragmentMorionServiceTicketBinding fragmentMorionServiceTicketBinding = (FragmentMorionServiceTicketBinding) this.this$0.getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentMorionServiceTicketBinding, "viewDataBinding");
        ServiceTicket ticket = fragmentMorionServiceTicketBinding.getTicket();
        if (ticket != null) {
            Integer valueOf = Integer.valueOf(ticket.getTicketStateId());
            boolean z = valueOf != null && valueOf.intValue() == 9;
            MorionServiceTicketFragment morionServiceTicketFragment = this.this$0;
            ChatFragment.Companion companion = ChatFragment.Companion;
            String chatId = ticket.getChatId();
            Intrinsics.checkNotNullExpressionValue(chatId, "it.chatId");
            String ticketId = ticket.getTicketId();
            Intrinsics.checkNotNullExpressionValue(ticketId, "it.ticketId");
            morionServiceTicketFragment.nextFragment(companion.newInstance(chatId, String.valueOf(MetricsFacade.Companion.getProfileLocalRepository().getUser().getId()) + "", ticketId, z, 0.0f, "", true), false, BaseActivity.FRAGMENT_CHAT);
        }
    }
}
