package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.view.View;
import android.widget.RatingBar;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.RateTicketDialog$onViewCreated$3 */
/* compiled from: RateTicketDialog.kt */
final class RateTicketDialog$onViewCreated$3 implements View.OnClickListener {
    final /* synthetic */ RateTicketDialog this$0;

    RateTicketDialog$onViewCreated$3(RateTicketDialog rateTicketDialog) {
        this.this$0 = rateTicketDialog;
    }

    public final void onClick(View view) {
        UIHelper.hideKeyboard(this.this$0.getActivity(), view);
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.btnEvaluateTicket);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnEvaluateTicket");
        dynamicBackgroundButton.setEnabled(false);
        HelpDeskViewModel access$getHelpDeskViewModel$p = this.this$0.getHelpDeskViewModel();
        String access$getTicketId$p = RateTicketDialog.access$getTicketId$p(this.this$0);
        RatingBar ratingBar = (RatingBar) this.this$0._$_findCachedViewById(C5619R.C5622id.ratingBar);
        Intrinsics.checkNotNullExpressionValue(ratingBar, "ratingBar");
        int roundToInt = MathKt.roundToInt(ratingBar.getRating());
        TextInputEditText textInputEditText = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etComment);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etComment");
        access$getHelpDeskViewModel$p.evaluateTicket(access$getTicketId$p, roundToInt, String.valueOf(textInputEditText.getText()));
    }
}
