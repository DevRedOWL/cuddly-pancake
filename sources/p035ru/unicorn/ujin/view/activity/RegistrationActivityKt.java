package p035ru.unicorn.ujin.view.activity;

import android.os.Build;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0002¨\u0006\n"}, mo51343d2 = {"makeLink", "", "Landroid/widget/TextView;", "link", "", "onClickListener", "Landroid/view/View$OnClickListener;", "removeUnderline", "underlineView", "value", "app_kortrosRelease"}, mo51344k = 2, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivityKt */
/* compiled from: RegistrationActivity.kt */
public final class RegistrationActivityKt {
    public static final void makeLink(TextView textView, String str, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(textView, "$this$makeLink");
        Intrinsics.checkNotNullParameter(str, "link");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        SpannableString spannableString = new SpannableString(textView.getText());
        int indexOf$default = StringsKt.indexOf$default((CharSequence) textView.getText().toString(), str, 0, false, 6, (Object) null);
        spannableString.setSpan(new RegistrationActivityKt$makeLink$clickableSpan$1(onClickListener), indexOf$default, str.length() + indexOf$default, 33);
        spannableString.setSpan(new ForegroundColorSpan(textView.getResources().getColor(R.color.textHypertextLink)), indexOf$default, str.length() + indexOf$default, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* access modifiers changed from: private */
    public static final void underlineView(TextView textView, String str) {
        SpannableString spannableString = new SpannableString(textView.getText());
        int indexOf$default = StringsKt.indexOf$default((CharSequence) textView.getText().toString(), str, 0, false, 6, (Object) null);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(textView.getResources().getColor(R.color.textHypertextLink));
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.underlineThickness = 2.0f;
        }
        UnderlineSpan underlineSpan = new UnderlineSpan();
        underlineSpan.updateDrawState(textPaint);
        spannableString.setSpan(underlineSpan, indexOf$default, str.length() + indexOf$default, 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    /* access modifiers changed from: private */
    public static final void removeUnderline(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        for (UnderlineSpan removeSpan : (UnderlineSpan[]) spannableString.getSpans(0, spannableString.length(), UnderlineSpan.class)) {
            spannableString.removeSpan(removeSpan);
        }
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }
}
