package p035ru.unicorn.ujin.view.dialogs;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, mo51343d2 = {"makeLink", "", "Landroid/widget/TextView;", "link", "", "onClickListener", "Landroid/view/View$OnClickListener;", "app_kortrosRelease"}, mo51344k = 2, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.ConfirmTermsDialogKt */
/* compiled from: ConfirmTermsDialog.kt */
public final class ConfirmTermsDialogKt {
    /* access modifiers changed from: private */
    public static final void makeLink(TextView textView, String str, View.OnClickListener onClickListener) {
        SpannableString spannableString = new SpannableString(textView.getText());
        int indexOf$default = StringsKt.indexOf$default((CharSequence) textView.getText().toString(), str, 0, false, 6, (Object) null);
        spannableString.setSpan(new ConfirmTermsDialogKt$makeLink$clickableSpan$1(onClickListener), indexOf$default, str.length() + indexOf$default, 33);
        spannableString.setSpan(new ForegroundColorSpan(textView.getResources().getColor(R.color.textHypertextLink)), indexOf$default, str.length() + indexOf$default, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }
}
