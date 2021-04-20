package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import android.content.DialogInterface;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$makeTicketAction$2 */
/* compiled from: MorionServiceTicketFragment.kt */
final class MorionServiceTicketFragment$makeTicketAction$2 implements DialogInterface.OnClickListener {
    final /* synthetic */ int $actionId;
    final /* synthetic */ String $ticketId;
    final /* synthetic */ MorionServiceTicketFragment this$0;

    MorionServiceTicketFragment$makeTicketAction$2(MorionServiceTicketFragment morionServiceTicketFragment, int i, String str) {
        this.this$0 = morionServiceTicketFragment;
        this.$actionId = i;
        this.$ticketId = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((HelpDeskViewModel) this.this$0.getViewModell()).makeTicketAction(this.$actionId, this.$ticketId);
        HelpDeskViewModel helpDeskViewModel = (HelpDeskViewModel) this.this$0.getViewModell();
        Intrinsics.checkNotNullExpressionValue(helpDeskViewModel, "viewModell");
        helpDeskViewModel.getOnMakeTicketActionLiveData().observe(this.this$0, new Observer<Resource<KolyaSuccesModel>>(this) {
            final /* synthetic */ MorionServiceTicketFragment$makeTicketAction$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void onChanged(Resource<KolyaSuccesModel> resource) {
                this.this$0.this$0.onChangeTicketStatus(resource);
            }
        });
        dialogInterface.dismiss();
    }
}
