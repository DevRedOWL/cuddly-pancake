package p035ru.unicorn.ujin.view.activity;

import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/RegistrationActivityKt$makeLink$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivityKt$makeLink$clickableSpan$1 */
/* compiled from: RegistrationActivity.kt */
public final class RegistrationActivityKt$makeLink$clickableSpan$1 extends ClickableSpan {
    final /* synthetic */ View.OnClickListener $onClickListener;

    RegistrationActivityKt$makeLink$clickableSpan$1(View.OnClickListener onClickListener) {
        this.$onClickListener = onClickListener;
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        CharSequence text = ((TextView) view).getText();
        if (text != null) {
            Selection.setSelection((Spannable) text, 0);
            view.invalidate();
            this.$onClickListener.onClick(view);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.text.Spannable");
    }

    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        textPaint.setUnderlineText(false);
    }
}
