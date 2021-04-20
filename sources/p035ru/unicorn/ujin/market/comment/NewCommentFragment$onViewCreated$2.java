package p035ru.unicorn.ujin.market.comment;

import android.view.View;
import android.widget.RatingBar;
import androidx.lifecycle.Observer;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.market.model.MarketViewModel;
import p035ru.unicorn.ujin.viewModel.events.market.CreateCommentEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.comment.NewCommentFragment$onViewCreated$2 */
/* compiled from: NewCommentFragment.kt */
final class NewCommentFragment$onViewCreated$2 implements View.OnClickListener {
    final /* synthetic */ NewCommentFragment this$0;

    NewCommentFragment$onViewCreated$2(NewCommentFragment newCommentFragment) {
        this.this$0 = newCommentFragment;
    }

    public final void onClick(View view) {
        MarketViewModel marketViewModel = this.this$0.getMarketViewModel();
        String access$getThreadId$p = this.this$0.threadId;
        String access$getThreadType$p = this.this$0.threadType;
        TextInputEditText textInputEditText = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etName);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etName");
        String valueOf = String.valueOf(textInputEditText.getText());
        TextInputEditText textInputEditText2 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etComment);
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etComment");
        String valueOf2 = String.valueOf(textInputEditText2.getText());
        RatingBar ratingBar = (RatingBar) this.this$0._$_findCachedViewById(C5619R.C5622id.ratingBar);
        Intrinsics.checkNotNullExpressionValue(ratingBar, "ratingBar");
        marketViewModel.createComment(access$getThreadId$p, access$getThreadType$p, valueOf, valueOf2, MathKt.roundToInt(ratingBar.getRating()));
        this.this$0.getMarketViewModel().getCreateCommentLiveData().observe(this.this$0, new Observer<CreateCommentEvent>(this) {
            final /* synthetic */ NewCommentFragment$onViewCreated$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void onChanged(CreateCommentEvent createCommentEvent) {
                NewCommentFragment newCommentFragment = this.this$0.this$0;
                Intrinsics.checkNotNullExpressionValue(createCommentEvent, "event");
                newCommentFragment.handleEvent(createCommentEvent);
            }
        });
    }
}
