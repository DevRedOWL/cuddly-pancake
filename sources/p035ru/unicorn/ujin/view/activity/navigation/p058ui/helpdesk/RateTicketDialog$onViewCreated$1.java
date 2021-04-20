package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.widget.RatingBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, mo51343d2 = {"<anonymous>", "", "ratingBar", "Landroid/widget/RatingBar;", "kotlin.jvm.PlatformType", "rating", "", "fromUser", "", "onRatingChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.RateTicketDialog$onViewCreated$1 */
/* compiled from: RateTicketDialog.kt */
final class RateTicketDialog$onViewCreated$1 implements RatingBar.OnRatingBarChangeListener {
    final /* synthetic */ RateTicketDialog this$0;

    RateTicketDialog$onViewCreated$1(RateTicketDialog rateTicketDialog) {
        this.this$0 = rateTicketDialog;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.btnEvaluateTicket);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnEvaluateTicket");
        dynamicBackgroundButton.setEnabled(f > 0.0f);
    }
}
