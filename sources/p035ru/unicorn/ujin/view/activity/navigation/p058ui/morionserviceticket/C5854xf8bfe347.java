package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/MorionServiceTicketFragment$showActionButtons$2$1$1", "ru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/MorionServiceTicketFragment$$special$$inlined$let$lambda$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$showActionButtons$$inlined$apply$lambda$2 */
/* compiled from: MorionServiceTicketFragment.kt */
final class C5854xf8bfe347 implements View.OnClickListener {
    final /* synthetic */ String $id;
    final /* synthetic */ DynamicBackgroundButton $this_apply$inlined;
    final /* synthetic */ MorionServiceTicketFragment this$0;

    C5854xf8bfe347(String str, DynamicBackgroundButton dynamicBackgroundButton, MorionServiceTicketFragment morionServiceTicketFragment) {
        this.$id = str;
        this.$this_apply$inlined = dynamicBackgroundButton;
        this.this$0 = morionServiceTicketFragment;
    }

    public final void onClick(View view) {
        this.this$0.makeTicketAction(0, this.$id);
    }
}
