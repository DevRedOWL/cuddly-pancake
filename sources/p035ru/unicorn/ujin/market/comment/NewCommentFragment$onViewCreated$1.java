package p035ru.unicorn.ujin.market.comment;

import android.widget.RatingBar;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, mo51343d2 = {"<anonymous>", "", "ratingBar", "Landroid/widget/RatingBar;", "kotlin.jvm.PlatformType", "rating", "", "fromUser", "", "onRatingChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.comment.NewCommentFragment$onViewCreated$1 */
/* compiled from: NewCommentFragment.kt */
final class NewCommentFragment$onViewCreated$1 implements RatingBar.OnRatingBarChangeListener {
    final /* synthetic */ NewCommentFragment this$0;

    NewCommentFragment$onViewCreated$1(NewCommentFragment newCommentFragment) {
        this.this$0 = newCommentFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if ((r4 != null && !kotlin.text.StringsKt.isBlank(r4)) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRatingChanged(android.widget.RatingBar r3, float r4, boolean r5) {
        /*
            r2 = this;
            ru.unicorn.ujin.market.comment.NewCommentFragment r3 = r2.this$0
            int r5 = p035ru.unicorn.C5619R.C5622id.btnSendComment
            android.view.View r3 = r3._$_findCachedViewById(r5)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r3 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r3
            java.lang.String r5 = "btnSendComment"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            r5 = 1
            r0 = 0
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0039
            ru.unicorn.ujin.market.comment.NewCommentFragment r4 = r2.this$0
            int r1 = p035ru.unicorn.C5619R.C5622id.etName
            android.view.View r4 = r4._$_findCachedViewById(r1)
            com.google.android.material.textfield.TextInputEditText r4 = (com.google.android.material.textfield.TextInputEditText) r4
            java.lang.String r1 = "etName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            android.text.Editable r4 = r4.getText()
            if (r4 == 0) goto L_0x0035
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 != 0) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            if (r4 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            r3.setEnabled(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.comment.NewCommentFragment$onViewCreated$1.onRatingChanged(android.widget.RatingBar, float, boolean):void");
    }
}
