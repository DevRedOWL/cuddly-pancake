package p035ru.unicorn.ujin.market.comment;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo51343d2 = {"ru/unicorn/ujin/market/comment/NewCommentFragment$editTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.comment.NewCommentFragment$editTextWatcher$1 */
/* compiled from: NewCommentFragment.kt */
public final class NewCommentFragment$editTextWatcher$1 implements TextWatcher {
    final /* synthetic */ NewCommentFragment this$0;

    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    NewCommentFragment$editTextWatcher$1(NewCommentFragment newCommentFragment) {
        this.this$0 = newCommentFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004e, code lost:
        if (r3.getRating() > 0.0f) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            java.lang.String r3 = "s"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            ru.unicorn.ujin.market.comment.NewCommentFragment r2 = r1.this$0
            int r3 = p035ru.unicorn.C5619R.C5622id.btnSendComment
            android.view.View r2 = r2._$_findCachedViewById(r3)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r2 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r2
            java.lang.String r3 = "btnSendComment"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            ru.unicorn.ujin.market.comment.NewCommentFragment r3 = r1.this$0
            int r4 = p035ru.unicorn.C5619R.C5622id.etName
            android.view.View r3 = r3._$_findCachedViewById(r4)
            com.google.android.material.textfield.TextInputEditText r3 = (com.google.android.material.textfield.TextInputEditText) r3
            java.lang.String r4 = "etName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            android.text.Editable r3 = r3.getText()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0035
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = kotlin.text.StringsKt.isBlank(r3)
            if (r3 != 0) goto L_0x0035
            r3 = 1
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            if (r3 == 0) goto L_0x0051
            ru.unicorn.ujin.market.comment.NewCommentFragment r3 = r1.this$0
            int r0 = p035ru.unicorn.C5619R.C5622id.ratingBar
            android.view.View r3 = r3._$_findCachedViewById(r0)
            android.widget.RatingBar r3 = (android.widget.RatingBar) r3
            java.lang.String r0 = "ratingBar"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            float r3 = r3.getRating()
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            r2.setEnabled(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.comment.NewCommentFragment$editTextWatcher$1.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
